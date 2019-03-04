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
    val __obj = js.Dynamic.literal(control1 = control1, control2 = control2, delay = delay, duration = duration)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPropertyAnimation]
  }
}

