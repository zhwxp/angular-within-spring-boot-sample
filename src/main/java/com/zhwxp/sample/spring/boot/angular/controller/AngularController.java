package com.zhwxp.sample.spring.boot.angular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AngularController {

    @RequestMapping(value = "/**/{path:[^.]*}")
    public String index() {
        return "/index.html";
    }

}
