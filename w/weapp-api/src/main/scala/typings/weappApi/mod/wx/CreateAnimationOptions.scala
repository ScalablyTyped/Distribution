package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 动画
@js.native
trait CreateAnimationOptions extends js.Object {
  /** 动画持续时间，单位 ms，默认值 0 */
  var delay: js.UndefOr[Double] = js.native
  /** 动画持续时间，单位ms，默认值 400 */
  var duration: js.UndefOr[Double] = js.native
  /** 定义动画的效果，默认值"linear"，有效值："linear","ease","ease-in","ease-in-out","ease-out","step-start","step-end" */
  var timingFunction: js.UndefOr[TimingFunction] = js.native
  /** 设置transform-origin，默认为"50% 50% 0" */
  var transformOrigin: js.UndefOr[String] = js.native
}

object CreateAnimationOptions {
  @scala.inline
  def apply(): CreateAnimationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAnimationOptions]
  }
  @scala.inline
  implicit class CreateAnimationOptionsOps[Self <: CreateAnimationOptions] (val x: Self) extends AnyVal {
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
    def setTimingFunction(value: TimingFunction): Self = this.set("timingFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimingFunction: Self = this.set("timingFunction", js.undefined)
    @scala.inline
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
  }
  
}

