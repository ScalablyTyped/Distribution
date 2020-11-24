package typings.winrtUwp.Windows.UI.Core.AnimationMetrics

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Exposes a collection of individual animation effects that are performed on a specific target to make up a complete Windows opacity, scaling, or translation animation. */
@js.native
trait AnimationDescription extends js.Object {
  
  /** Gets the collection of animations that are associated with the AnimationDescription object. */
  var animations: IVectorView[IPropertyAnimation] = js.native
  
  /** Gets the maximum cumulative delay time for the animation to be applied to the collection of objects in a target. */
  var delayLimit: Double = js.native
  
  /** Gets the amount of time between the application of the animation effect to each object in a target that contains multiple objects. The StaggerDelay, together with the StaggerDelayFactor and DelayLimit, is one of the three elements used to control the relative timing of the animation effects. */
  var staggerDelay: Double = js.native
  
  /** Gets a multiplier that is applied to each occurrence of the stagger delay, increasing or decreasing the previous delay instance by that amount. */
  var staggerDelayFactor: Double = js.native
  
  /** Gets the z-order position of an AnimationDescription object relative to other AnimationDescription objects in the same animation effect. AnimationDescription objects with a higher z-order cover transitions with a lower z-order. */
  var zorder: Double = js.native
}
object AnimationDescription {
  
  @scala.inline
  def apply(
    animations: IVectorView[IPropertyAnimation],
    delayLimit: Double,
    staggerDelay: Double,
    staggerDelayFactor: Double,
    zorder: Double
  ): AnimationDescription = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], delayLimit = delayLimit.asInstanceOf[js.Any], staggerDelay = staggerDelay.asInstanceOf[js.Any], staggerDelayFactor = staggerDelayFactor.asInstanceOf[js.Any], zorder = zorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDescription]
  }
  
  @scala.inline
  implicit class AnimationDescriptionOps[Self <: AnimationDescription] (val x: Self) extends AnyVal {
    
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
    def setZorder(value: Double): Self = this.set("zorder", value.asInstanceOf[js.Any])
  }
}
