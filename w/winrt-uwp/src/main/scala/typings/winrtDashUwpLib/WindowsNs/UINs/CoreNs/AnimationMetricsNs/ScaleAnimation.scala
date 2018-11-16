package typings
package winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods that enable you to retrieve the parameters for a scaling (growing or shrinking) animation. */
@JSGlobal("Windows.UI.Core.AnimationMetrics.ScaleAnimation")
@js.native
abstract class ScaleAnimation () extends js.Object {
  /** Gets the location of the first control point for the cubic Bézier curve that describes how the scale should animate over time. */
  var control1: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /** Gets the location of the second control point for the cubic Bézier curve that describes how the scale should animate over time. */
  var control2: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /** Gets the amount of time between when the scale animation is instructed to begin and when that animation actually begins to draw. */
  var delay: scala.Double = js.native
  /** Gets the amount of time over which the scale animation should be performed. This does not include the delay. */
  var duration: scala.Double = js.native
  /** Gets the final horizontal scale factor for the object. */
  var finalScaleX: scala.Double = js.native
  /** Gets the final vertical scale factor for the object. */
  var finalScaleY: scala.Double = js.native
  /** Gets the initial horizontal scale factor for the object. */
  var initialScaleX: scala.Double = js.native
  /** Gets the initial vertical scale factor for the object. */
  var initialScaleY: scala.Double = js.native
  /** Gets the center point for the scaling animation, expressed as a point relative to the object's normal size. */
  var normalizedOrigin: winrtDashUwpLib.WindowsNs.FoundationNs.Point = js.native
  /** Gets the type of animation represented by this object. */
  var `type`: PropertyAnimationType = js.native
}

