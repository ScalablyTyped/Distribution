package typings.weixinApp.wx

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
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    timingFunction: TimingFunction = null,
    transformOrigin: String = null
  ): CreateAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnimationOptions]
  }
}

