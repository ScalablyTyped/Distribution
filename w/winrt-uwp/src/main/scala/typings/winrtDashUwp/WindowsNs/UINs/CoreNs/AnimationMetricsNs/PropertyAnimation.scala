package typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods that enable you to retrieve animation property values that are common to all property animation types . */
@JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimation")
@js.native
abstract class PropertyAnimation () extends js.Object {
  /** Gets the location of the first control point for the cubic Bézier curve that describes how this property of this object should animate over time. */
  var control1: Point = js.native
  /** Gets the location of the second control point for the cubic Bézier curve that describes how this property of this object should animate over time. */
  var control2: Point = js.native
  /** Gets the amount of time between when the animation is instructed to begin and when that animation actually begins to draw. */
  var delay: Double = js.native
  /** Gets the amount of time over which the animation should be performed. This does not include the delay. */
  var duration: Double = js.native
  /** Gets the type of animation represented by this object. */
  var `type`: PropertyAnimationType = js.native
}

