package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.`ease-in-out`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`ease-in`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`ease-out`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`step-end`
import typings.wechatMiniprogram.wechatMiniprogramStrings.`step-start`
import typings.wechatMiniprogram.wechatMiniprogramStrings.ease
import typings.wechatMiniprogram.wechatMiniprogramStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepOption extends js.Object {
  /** 动画延迟时间，单位 ms */
  var delay: js.UndefOr[Double] = js.native
  /** 动画持续时间，单位 ms */
  var duration: js.UndefOr[Double] = js.native
  /** 动画的效果
    *
    * 可选值：
    * - 'linear': 动画从头到尾的速度是相同的;
    * - 'ease': 动画以低速开始，然后加快，在结束前变慢;
    * - 'ease-in': 动画以低速开始;
    * - 'ease-in-out': 动画以低速开始和结束;
    * - 'ease-out': 动画以低速结束;
    * - 'step-start': 动画第一帧就跳至结束状态直到结束;
    * - 'step-end': 动画一直保持开始状态，最后一帧跳到结束状态; */
  var timingFunction: js.UndefOr[
    linear | ease | `ease-in` | `ease-in-out` | `ease-out` | `step-start` | `step-end`
  ] = js.native
  var transformOrigin: js.UndefOr[String] = js.native
}

object StepOption {
  @scala.inline
  def apply(): StepOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOption]
  }
  @scala.inline
  implicit class StepOptionOps[Self <: StepOption] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setTimingFunction(value: linear | ease | `ease-in` | `ease-in-out` | `ease-out` | `step-start` | `step-end`): Self = this.set("timingFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingFunction: Self = this.set("timingFunction", js.undefined)
    @scala.inline
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
  }
  
}

