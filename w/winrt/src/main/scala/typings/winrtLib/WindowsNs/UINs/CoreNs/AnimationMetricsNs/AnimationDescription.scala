package typings
package winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationDescription")
@js.native
class AnimationDescription protected () extends IAnimationDescription {
  def this(effect: AnimationEffect, target: AnimationEffectTarget) = this()
  /* CompleteClass */
  override var animations: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IPropertyAnimation] = js.native
  /* CompleteClass */
  override var delayLimit: scala.Double = js.native
  /* CompleteClass */
  override var staggerDelay: scala.Double = js.native
  /* CompleteClass */
  override var staggerDelayFactor: scala.Double = js.native
  /* CompleteClass */
  override var zOrder: scala.Double = js.native
}

