package typings.uniApp

import typings.uniApp.uniAppStrings.`ease-in-out`
import typings.uniApp.uniAppStrings.`ease-in`
import typings.uniApp.uniAppStrings.`ease-out`
import typings.uniApp.uniAppStrings.`step-end`
import typings.uniApp.uniAppStrings.`step-start`
import typings.uniApp.uniAppStrings.ease
import typings.uniApp.uniAppStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAnimationOptions extends js.Object {
  /**
    * 动画延迟时间，单位 ms
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * 动画持续时间，单位ms
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 定义动画的效果
    * - linear: 动画从头到尾的速度是相同的
    * - ease: 动画以低速开始，然后加快，在结束前变慢
    * - ease-in: 动画以低速开始
    * - ease-in-out: 动画以低速开始和结束
    * - ease-out: 动画以低速结束
    * - step-start: 动画第一帧就跳至结束状态直到结束
    * - step-end: 动画一直保持开始状态，最后一帧跳到结束状态
    */
  var timingFunction: js.UndefOr[
    linear | ease | `ease-in` | `ease-in-out` | `ease-out` | `step-start` | `step-end`
  ] = js.undefined
  /**
    * 设置transform-origin
    */
  var transformOrigin: js.UndefOr[String] = js.undefined
}

object CreateAnimationOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    duration: Int | Double = null,
    timingFunction: linear | ease | `ease-in` | `ease-in-out` | `ease-out` | `step-start` | `step-end` = null,
    transformOrigin: String = null
  ): CreateAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (timingFunction != null) __obj.updateDynamic("timingFunction")(timingFunction.asInstanceOf[js.Any])
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnimationOptions]
  }
}

