package typings
package winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpacityAnimation extends IPropertyAnimation {
  var finalOpacity: scala.Double
  var initialOpacity: scala.Double
}

object IOpacityAnimation {
  @scala.inline
  def apply(
    control1: winrtLib.WindowsNs.FoundationNs.Point,
    control2: winrtLib.WindowsNs.FoundationNs.Point,
    delay: scala.Double,
    duration: scala.Double,
    finalOpacity: scala.Double,
    initialOpacity: scala.Double,
    `type`: PropertyAnimationType
  ): IOpacityAnimation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("control1")(control1)
    __obj.updateDynamic("control2")(control2)
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("finalOpacity")(finalOpacity)
    __obj.updateDynamic("initialOpacity")(initialOpacity)
    __obj.asInstanceOf[IOpacityAnimation]
  }
}

