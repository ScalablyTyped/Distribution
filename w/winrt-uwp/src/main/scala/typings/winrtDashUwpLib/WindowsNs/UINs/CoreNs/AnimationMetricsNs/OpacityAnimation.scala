package typings
package winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods that enable you to retrieve the parameters of an opacity (fade in or fade out) animation. */
@JSGlobal("Windows.UI.Core.AnimationMetrics.OpacityAnimation")
@js.native
abstract class OpacityAnimation () extends js.Object {
  /** Gets the location of the first control point for the cubic Bézier curve that describes how the opacity should animate over time. */
  var control1: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /** Gets the location of the second control point for the cubic Bézier curve that describes how the opacity should animate over time. */
  var control2: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /** Gets the amount of time between when the opacity animation is instructed to begin and when that animation actually begins to draw. */
  var delay: scala.Double = js.native
  /** Gets the amount of time over which the opacity animation should be performed. This does not include the delay. */
  var duration: scala.Double = js.native
  /** Gets the object's final opacity. */
  var finalOpacity: scala.Double = js.native
  /** Gets the object's initial opacity. */
  var initialOpacity: scala.Double = js.native
  /** Gets the type of animation represented by this object. */
  var `type`: PropertyAnimationType = js.native
}

