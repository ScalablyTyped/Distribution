package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationOptions extends StObject {
  
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
  implicit class AnimationOptionsMutableBuilder[Self <: AnimationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingFunction(value: EasingFunction): Self = StObject.set(x, "easingFunction", value.asInstanceOf[js.Any])
  }
}
