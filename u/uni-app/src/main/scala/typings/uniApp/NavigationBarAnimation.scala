package typings.uniApp

import typings.uniApp.uniAppStrings.easeIn
import typings.uniApp.uniAppStrings.easeInOut
import typings.uniApp.uniAppStrings.easeOut
import typings.uniApp.uniAppStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarAnimation extends js.Object {
  /**
    * 动画变化时间，默认0，单位：毫秒
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 动画变化方式，默认 linear
    * - linear: 动画从头到尾的速度是相同的
    * - easeIn: 动画以低速开始
    * - easeOut: 动画以低速结束
    * - easeInOut: 动画以低速开始和结束
    */
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.undefined
}

object NavigationBarAnimation {
  @scala.inline
  def apply(duration: Int | Double = null, timingFunc: linear | easeIn | easeOut | easeInOut = null): NavigationBarAnimation = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (timingFunc != null) __obj.updateDynamic("timingFunc")(timingFunc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarAnimation]
  }
}

