package typings.winrt.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationDescription")
@js.native
class AnimationDescription protected () extends IAnimationDescription {
  def this(effect: AnimationEffect, target: AnimationEffectTarget) = this()
  /* CompleteClass */
  override var animations: IVectorView[IPropertyAnimation] = js.native
  /* CompleteClass */
  override var delayLimit: Double = js.native
  /* CompleteClass */
  override var staggerDelay: Double = js.native
  /* CompleteClass */
  override var staggerDelayFactor: Double = js.native
  /* CompleteClass */
  override var zOrder: Double = js.native
}

