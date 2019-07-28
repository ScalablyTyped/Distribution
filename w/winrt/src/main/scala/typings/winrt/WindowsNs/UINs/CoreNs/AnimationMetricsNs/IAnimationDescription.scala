package typings.winrt.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimationDescription extends js.Object {
  var animations: IVectorView[IPropertyAnimation]
  var delayLimit: Double
  var staggerDelay: Double
  var staggerDelayFactor: Double
  var zOrder: Double
}

object IAnimationDescription {
  @scala.inline
  def apply(
    animations: IVectorView[IPropertyAnimation],
    delayLimit: Double,
    staggerDelay: Double,
    staggerDelayFactor: Double,
    zOrder: Double
  ): IAnimationDescription = {
    val __obj = js.Dynamic.literal(animations = animations, delayLimit = delayLimit, staggerDelay = staggerDelay, staggerDelayFactor = staggerDelayFactor, zOrder = zOrder)
  
    __obj.asInstanceOf[IAnimationDescription]
  }
}

