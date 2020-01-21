package typings.weappApi.mod.wx

import typings.weappApi.weappApiStrings.easeIn
import typings.weappApi.weappApiStrings.easeInOut
import typings.weappApi.weappApiStrings.easeOut
import typings.weappApi.weappApiStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarColorAnimationOptions extends js.Object {
  //  动画变化时间，单位 ms，默认0
  var animation: js.UndefOr[Double] = js.undefined
  //  动画变化方式.动画从头到尾的速度是相同的,动画以低速开始,动画以低速结束,动画以低速开始和结束
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.undefined
}

object NavigationBarColorAnimationOptions {
  @scala.inline
  def apply(animation: Int | Double = null, timingFunc: linear | easeIn | easeOut | easeInOut = null): NavigationBarColorAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (timingFunc != null) __obj.updateDynamic("timingFunc")(timingFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarColorAnimationOptions]
  }
}

