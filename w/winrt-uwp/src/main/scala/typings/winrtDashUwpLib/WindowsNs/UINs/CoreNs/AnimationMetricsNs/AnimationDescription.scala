package typings
package winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes a collection of individual animation effects that are performed on a specific target to make up a complete Windows opacity, scaling, or translation animation. */
@JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationDescription")
@js.native
class AnimationDescription protected () extends js.Object {
  /**
    * Creates an AnimationDescription object with a specific animation and target.
    * @param effect The animation effect to apply to the target.
    * @param target The target of the animation effect.
    */
  def this(effect: AnimationEffect, target: AnimationEffectTarget) = this()
  /** Gets the collection of animations that are associated with the AnimationDescription object. */
  var animations: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IPropertyAnimation] = js.native
  /** Gets the maximum cumulative delay time for the animation to be applied to the collection of objects in a target. */
  var delayLimit: scala.Double = js.native
  /** Gets the amount of time between the application of the animation effect to each object in a target that contains multiple objects. The StaggerDelay, together with the StaggerDelayFactor and DelayLimit, is one of the three elements used to control the relative timing of the animation effects. */
  var staggerDelay: scala.Double = js.native
  /** Gets a multiplier that is applied to each occurrence of the stagger delay, increasing or decreasing the previous delay instance by that amount. */
  var staggerDelayFactor: scala.Double = js.native
  /** Gets the z-order position of an AnimationDescription object relative to other AnimationDescription objects in the same animation effect. AnimationDescription objects with a higher z-order cover transitions with a lower z-order. */
  var zorder: scala.Double = js.native
}

