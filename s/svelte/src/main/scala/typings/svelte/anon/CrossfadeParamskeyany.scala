package typings.svelte.anon

import typings.svelte.typesRuntimeTransitionMod.EasingFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined svelte.svelte/types/runtime/transition.CrossfadeParams & {  key :any} */
trait CrossfadeParamskeyany extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double | (js.Function1[/* len */ Double, Double])] = js.undefined
  
  var easing: js.UndefOr[EasingFunction] = js.undefined
  
  var key: Any
}
object CrossfadeParamskeyany {
  
  inline def apply(key: Any): CrossfadeParamskeyany = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossfadeParamskeyany]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossfadeParamskeyany] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double | (js.Function1[/* len */ Double, Double])): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationFunction1(value: /* len */ Double => Double): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
