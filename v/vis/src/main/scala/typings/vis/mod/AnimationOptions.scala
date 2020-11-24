package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationOptions extends js.Object {
  
  /**
    * The duration (in milliseconds).
    */
  var duration: Double = js.native
  
  /**
    * The easing function.
    *
    * Available are:
    * linear, easeInQuad, easeOutQuad, easeInOutQuad, easeInCubic,
    * easeOutCubic, easeInOutCubic, easeInQuart, easeOutQuart, easeInOutQuart,
    * easeInQuint, easeOutQuint, easeInOutQuint.
    */
  var easingFunction: EasingFunction = js.native
}
object AnimationOptions {
  
  @scala.inline
  def apply(duration: Double, easingFunction: EasingFunction): AnimationOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], easingFunction = easingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationOptions]
  }
  
  @scala.inline
  implicit class AnimationOptionsOps[Self <: AnimationOptions] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingFunction(value: EasingFunction): Self = this.set("easingFunction", value.asInstanceOf[js.Any])
  }
}
