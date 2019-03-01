package typings
package winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyAnimation extends js.Object {
  var control1: winrtLib.WindowsNs.FoundationNs.Point
  var control2: winrtLib.WindowsNs.FoundationNs.Point
  var delay: scala.Double
  var duration: scala.Double
  var `type`: PropertyAnimationType
}

object IPropertyAnimation {
  @scala.inline
  def apply(
    control1: winrtLib.WindowsNs.FoundationNs.Point,
    control2: winrtLib.WindowsNs.FoundationNs.Point,
    delay: scala.Double,
    duration: scala.Double,
    `type`: PropertyAnimationType
  ): IPropertyAnimation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("control1")(control1)
    __obj.updateDynamic("control2")(control2)
    __obj.updateDynamic("delay")(delay)
    __obj.updateDynamic("duration")(duration)
    __obj.asInstanceOf[IPropertyAnimation]
  }
}

