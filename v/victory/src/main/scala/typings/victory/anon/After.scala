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
  
  inline def apply(): After = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[After]
  }
  
  extension [Self <: After](x: Self) {
    
    inline def setAfter(value: /* datum */ js.Any => AnimationStyle): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: /* datum */ js.Any => AnimationStyle): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
