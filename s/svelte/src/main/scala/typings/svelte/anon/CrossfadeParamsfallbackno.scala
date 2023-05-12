package typings.svelte.anon

import typings.std.Element
import typings.svelte.typesRuntimeTransitionMod.CrossfadeParams
import typings.svelte.typesRuntimeTransitionMod.EasingFunction
import typings.svelte.typesRuntimeTransitionMod.TransitionConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined svelte.svelte/types/runtime/transition.CrossfadeParams & {  fallback :(node : std.Element, params : svelte.svelte/types/runtime/transition.CrossfadeParams, intro : boolean): svelte.svelte/types/runtime/transition.TransitionConfig | undefined} */
trait CrossfadeParamsfallbackno extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double | (js.Function1[/* len */ Double, Double])] = js.undefined
  
  var easing: js.UndefOr[EasingFunction] = js.undefined
  
  var fallback: js.UndefOr[
    js.Function3[
      /* node */ Element, 
      /* params */ CrossfadeParams, 
      /* intro */ Boolean, 
      TransitionConfig
    ]
  ] = js.undefined
}
object CrossfadeParamsfallbackno {
  
  inline def apply(): CrossfadeParamsfallbackno = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossfadeParamsfallbackno]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossfadeParamsfallbackno] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double | (js.Function1[/* len */ Double, Double])): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationFunction1(value: /* len */ Double => Double): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    
    inline def setFallback(value: (/* node */ Element, /* params */ CrossfadeParams, /* intro */ Boolean) => TransitionConfig): Self = StObject.set(x, "fallback", js.Any.fromFunction3(value))
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
  }
}
