package typings.uniApp

import typings.uniApp.uniAppStrings.easeIn
import typings.uniApp.uniAppStrings.easeInOut
import typings.uniApp.uniAppStrings.easeOut
import typings.uniApp.uniAppStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationBarAnimation extends js.Object {
  /**
    * 动画变化时间，默认0，单位：毫秒
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * 动画变化方式，默认 linear
    * - linear: 动画从头到尾的速度是相同的
    * - easeIn: 动画以低速开始
    * - easeOut: 动画以低速结束
    * - easeInOut: 动画以低速开始和结束
    */
  var timingFunc: js.UndefOr[linear | easeIn | easeOut | easeInOut] = js.native
}

object NavigationBarAnimation {
  @scala.inline
  def apply(): NavigationBarAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBarAnimation]
  }
  @scala.inline
  implicit class NavigationBarAnimationOps[Self <: NavigationBarAnimation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setTimingFunc(value: linear | easeIn | easeOut | easeInOut): Self = this.set("timingFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingFunc: Self = this.set("timingFunc", js.undefined)
  }
  
}

