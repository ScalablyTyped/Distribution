package typings.svelte

import typings.std.Element
import typings.svelte.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeAnimateMod {
  
  @JSImport("svelte/types/runtime/animate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flip(node: Element, param1: From): AnimationConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("flip")(node.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[AnimationConfig]
  inline def flip(node: Element, param1: From, params: FlipParams): AnimationConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("flip")(node.asInstanceOf[js.Any], param1.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[AnimationConfig]
  
  trait AnimationConfig extends StObject {
    
    var css: js.UndefOr[js.Function2[/* t */ Double, /* u */ Double, String]] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
    
    var tick: js.UndefOr[js.Function2[/* t */ Double, /* u */ Double, Unit]] = js.undefined
  }
  object AnimationConfig {
    
    inline def apply(): AnimationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimationConfig]
    }
    
    extension [Self <: AnimationConfig](x: Self) {
      
      inline def setCss(value: (/* t */ Double, /* u */ Double) => String): Self = StObject.set(x, "css", js.Any.fromFunction2(value))
      
      inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setTick(value: (/* t */ Double, /* u */ Double) => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction2(value))
      
      inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    }
  }
  
  trait FlipParams extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double | (js.Function1[/* len */ Double, Double])] = js.undefined
    
    var easing: js.UndefOr[js.Function1[/* t */ Double, Double]] = js.undefined
  }
  object FlipParams {
    
    inline def apply(): FlipParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlipParams]
    }
    
    extension [Self <: FlipParams](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double | (js.Function1[/* len */ Double, Double])): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationFunction1(value: /* len */ Double => Double): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
}
