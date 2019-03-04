package typings
package winrtLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnimationDescription extends js.Object {
  var animations: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IPropertyAnimation]
  var delayLimit: scala.Double
  var staggerDelay: scala.Double
  var staggerDelayFactor: scala.Double
  var zOrder: scala.Double
}

object IAnimationDescription {
  @scala.inline
  def apply(
    animations: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IPropertyAnimation],
    delayLimit: scala.Double,
    staggerDelay: scala.Double,
    staggerDelayFactor: scala.Double,
    zOrder: scala.Double
  ): IAnimationDescription = {
    val __obj = js.Dynamic.literal(animations = animations, delayLimit = delayLimit, staggerDelay = staggerDelay, staggerDelayFactor = staggerDelayFactor, zOrder = zOrder)
  
    __obj.asInstanceOf[IAnimationDescription]
  }
}

