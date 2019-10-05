package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAnimationOptions extends js.Object {
  /** 动画持续时间，单位 ms，默认值 0 */
  var delay: js.UndefOr[Double] = js.undefined
  /** 动画持续时间，单位ms，默认值 400 */
  var duration: js.UndefOr[Double] = js.undefined
  /** 定义动画的效果，默认值"linear"，有效值："linear","ease","ease-in","ease-in-out","ease-out","step-start","step-end" */
  var timingFunction: js.UndefOr[TimingFunction] = js.undefined
  /** 设置transform-origin，默认为"50% 50% 0" */
  var transformOrigin: js.UndefOr[String] = js.undefined
}

object CreateAnimationOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    duration: Int | Double = null,
    timingFunction: TimingFunction = null,
    transformOrigin: String = null
  ): CreateAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction)
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin)
    __obj.asInstanceOf[CreateAnimationOptions]
  }
}

