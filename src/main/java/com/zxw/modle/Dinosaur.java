package com.zxw.modle;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Dinosaur {
    public BufferedImage image;                         //主图片
    private BufferedImage image1, image2, image3;       //跑步图片
    public int x, y;                                    //坐标
    private int jumpValue = 0;                          //跳跃的增变量
    private boolean jumpState = false;                  //跳跃状态
    private int stepTimer = 0;                          //踏步计时器
    private final int JUMP_HIGHT = 100;                 //跳起最大高度
    private final int LOWER_Y = 120;                    //落地最低坐标
    private final int FREASH = FreshThread.FREASH;      //刷新时间

    public Dinosaur() {
        x = 50;
        y = LOWER_Y;
        try {
            image1 = ImageIO.read(new File(""));
            image1 = ImageIO.read(new File(""));
            image1 = ImageIO.read(new File(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void step() {
        //每过250毫秒，更换一张图片
        //因为共有3张图片，所以除以3取余，轮流展示这3张
        int tmp = stepTimer / 250 % 3;
        switch (tmp) {
            case 1:
                image = image1;
                break;
            case 2:
                image = image2;
                break;
            default:
                image = image3;
        }
        stepTimer += FREASH;        //计时器递增
    }

    private void jump(){
        
    }
}
