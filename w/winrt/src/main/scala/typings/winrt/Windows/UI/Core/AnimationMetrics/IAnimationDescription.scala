package typings.winrt.Windows.UI.Core.AnimationMetrics

import typings.winrt.Windows.Foundation.Collections.IVectorView
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
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], delayLimit = delayLimit.asInstanceOf[js.Any], staggerDelay = staggerDelay.asInstanceOf[js.Any], staggerDelayFactor = staggerDelayFactor.asInstanceOf[js.Any], zOrder = zOrder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IAnimationDescription]
  }
}

