package typings.victory.anon

import typings.victory.mod.AnimationStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait After extends StObject {
  
  var after: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.undefined
  
  var before: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
}
object After {
  
  @scala.inline
  def apply(): After = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[After]
  }
  
  @scala.inline
  implicit class AfterMutableBuilder[Self <: After] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: /* datum */ js.Any => AnimationStyle): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    @scala.inline
    def setBefore(value: /* datum */ js.Any => AnimationStyle): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
