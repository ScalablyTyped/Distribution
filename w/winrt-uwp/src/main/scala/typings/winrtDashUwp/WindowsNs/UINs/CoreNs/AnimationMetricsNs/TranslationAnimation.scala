package typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods that enable you to retrieve the parameters for a translation (move to a new location) animation. */
@JSGlobal("Windows.UI.Core.AnimationMetrics.TranslationAnimation")
@js.native
abstract class TranslationAnimation () extends js.Object {
  /** Gets the location of the first control point for the cubic Bézier curve that describes how the translation should animate over time. */
  var control1: Point = js.native
  /** Gets the location of the second control point for the cubic Bézier curve that describes how the translation should animate over time. */
  var control2: Point = js.native
  /** Gets the amount of time between when the translation animation is instructed to begin and when that animation actually begins to draw. */
  var delay: Double = js.native
  /** Gets the amount of time over which the translation animation should be performed. This does not include the delay. */
  var duration: Double = js.native
  /** Gets the type of animation represented by this object. */
  var `type`: PropertyAnimationType = js.native
}

