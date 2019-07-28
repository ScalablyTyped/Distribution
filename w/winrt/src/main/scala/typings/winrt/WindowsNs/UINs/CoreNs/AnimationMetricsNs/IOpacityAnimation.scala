package typings.winrt.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpacityAnimation extends IPropertyAnimation {
  var finalOpacity: Double
  var initialOpacity: Double
}

object IOpacityAnimation {
  @scala.inline
  def apply(
    control1: Point,
    control2: Point,
    delay: Double,
    duration: Double,
    finalOpacity: Double,
    initialOpacity: Double,
    `type`: PropertyAnimationType
  ): IOpacityAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1, control2 = control2, delay = delay, duration = duration, finalOpacity = finalOpacity, initialOpacity = initialOpacity)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IOpacityAnimation]
  }
}

