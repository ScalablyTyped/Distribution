package typings
package winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes properties of animations that are common to all animation effects. */
trait IPropertyAnimation extends js.Object {
  /** Gets the location of the first control point for the cubic Bézier curve that describes how this property of this object should animate over time. */
  var control1: winrtDashUwpLib.WindowsNs.FoundationNs.Point
  /** Gets the location of the second control point for the cubic Bézier curve that describes how this property of this object should animate over time. */
  var control2: winrtDashUwpLib.WindowsNs.FoundationNs.Point
  /** Gets the amount of time between when the animation is instructed to begin and when that animation actually begins to draw. */
  var delay: scala.Double
  /** Gets the amount of time over which the animation should be performed. This does not include the delay. */
  var duration: scala.Double
  /** Gets the type of animation represented by this object. */
  var `type`: PropertyAnimationType
}

object IPropertyAnimation {
  @scala.inline
  def apply(
    control1: winrtDashUwpLib.WindowsNs.FoundationNs.Point,
    control2: winrtDashUwpLib.WindowsNs.FoundationNs.Point,
    delay: scala.Double,
    duration: scala.Double,
    `type`: PropertyAnimationType
  ): IPropertyAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1, control2 = control2, delay = delay, duration = duration)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IPropertyAnimation]
  }
}

