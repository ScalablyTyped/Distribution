package typings.winrt.Windows.UI.Core.AnimationMetrics

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimationDescription extends js.Object {
  var animations: IVectorView[IPropertyAnimation] = js.native
  var delayLimit: Double = js.native
  var staggerDelay: Double = js.native
  var staggerDelayFactor: Double = js.native
  var zOrder: Double = js.native
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
  @scala.inline
  implicit class IAnimationDescriptionOps[Self <: IAnimationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimations(value: IVectorView[IPropertyAnimation]): Self = this.set("animations", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelayLimit(value: Double): Self = this.set("delayLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaggerDelay(value: Double): Self = this.set("staggerDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaggerDelayFactor(value: Double): Self = this.set("staggerDelayFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setZOrder(value: Double): Self = this.set("zOrder", value.asInstanceOf[js.Any])
  }
  
}

