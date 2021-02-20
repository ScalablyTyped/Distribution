package typings.webAnimationsJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEffectReadOnly extends StObject {
  
  def getComputedTiming(): ComputedTimingProperties = js.native
  
  val timing: Double = js.native
}
object AnimationEffectReadOnly {
  
  @scala.inline
  def apply(getComputedTiming: () => ComputedTimingProperties, timing: Double): AnimationEffectReadOnly = {
    val __obj = js.Dynamic.literal(getComputedTiming = js.Any.fromFunction0(getComputedTiming), timing = timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEffectReadOnly]
  }
  
  @scala.inline
  implicit class AnimationEffectReadOnlyMutableBuilder[Self <: AnimationEffectReadOnly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetComputedTiming(value: () => ComputedTimingProperties): Self = StObject.set(x, "getComputedTiming", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTiming(value: Double): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
  }
}
