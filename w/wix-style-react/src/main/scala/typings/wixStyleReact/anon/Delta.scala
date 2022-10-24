package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delta extends StObject {
  
  var delta: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[js.Function1[/* t */ Any, Double]] = js.undefined
  
  var immediate: js.UndefOr[Boolean] = js.undefined
  
  var prop: js.UndefOr[String] = js.undefined
}
object Delta {
  
  inline def apply(): Delta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delta]
  }
  
  extension [Self <: Delta](x: Self) {
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: /* t */ Any => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    
    inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
    
    inline def setProp(value: String): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
  }
}
