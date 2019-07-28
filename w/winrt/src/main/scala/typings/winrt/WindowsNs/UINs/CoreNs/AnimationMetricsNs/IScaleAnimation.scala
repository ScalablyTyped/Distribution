package typings.winrt.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScaleAnimation extends IPropertyAnimation {
  var finalScaleX: Double
  var finalScaleY: Double
  var initialScaleX: Double
  var initialScaleY: Double
  var normalizedOrigin: Point
}

object IScaleAnimation {
  @scala.inline
  def apply(
    control1: Point,
    control2: Point,
    delay: Double,
    duration: Double,
    finalScaleX: Double,
    finalScaleY: Double,
    initialScaleX: Double,
    initialScaleY: Double,
    normalizedOrigin: Point,
    `type`: PropertyAnimationType
  ): IScaleAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1, control2 = control2, delay = delay, duration = duration, finalScaleX = finalScaleX, finalScaleY = finalScaleY, initialScaleX = initialScaleX, initialScaleY = initialScaleY, normalizedOrigin = normalizedOrigin)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IScaleAnimation]
  }
}

