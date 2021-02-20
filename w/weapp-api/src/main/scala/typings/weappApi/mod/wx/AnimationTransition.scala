package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationTransition extends StObject {
  
  var delay: Double = js.native
  
  var duration: Double = js.native
  
  var timingFunction: TimingFunction = js.native
}
object AnimationTransition {
  
  @scala.inline
  def apply(delay: Double, duration: Double, timingFunction: TimingFunction): AnimationTransition = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timingFunction = timingFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTransition]
  }
  
  @scala.inline
  implicit class AnimationTransitionMutableBuilder[Self <: AnimationTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingFunction(value: TimingFunction): Self = StObject.set(x, "timingFunction", value.asInstanceOf[js.Any])
  }
}
