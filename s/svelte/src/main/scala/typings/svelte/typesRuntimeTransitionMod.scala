package typings.svelte

import typings.std.Element
import typings.svelte.anon.CrossfadeParamsfallbackno
import typings.svelte.anon.CrossfadeParamskeyany
import typings.svelte.anon.SVGElementgetTotalLengthn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeTransitionMod {
  
  @JSImport("svelte/types/runtime/transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def blur(node: Element): TransitionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("blur")(node.asInstanceOf[js.Any]).asInstanceOf[TransitionConfig]
  inline def blur(node: Element, hasDelayDurationEasingAmountOpacity: BlurParams): TransitionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("blur")(node.asInstanceOf[js.Any], hasDelayDurationEasingAmountOpacity.asInstanceOf[js.Any])).asInstanceOf[TransitionConfig]
  
  inline def crossfade(hasFallbackDefaults: CrossfadeParamsfallbackno): js.Tuple2[
    js.Function2[
      /* node */ Element, 
      /* params */ CrossfadeParamskeyany, 
      js.Function0[TransitionConfig]
    ], 
    js.Function2[
      /* node */ Element, 
      /* params */ CrossfadeParamskeyany, 
      js.Function0[TransitionConfig]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("crossfade")(hasFallbackDefaults.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.Function2[
      /* node */ Element, 
      /* params */ CrossfadeParamskeyany, 
      js.Function0[TransitionConfig]
    ], 
    js.Function2[
      /* node */ Element, 
      /* params */ CrossfadeParamskeyany, 
      js.Function0[TransitionConfig]
    ]
  ]]
  
  inline def draw(node: SVGElementgetTotalLengthn): TransitionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("draw")(node.asInstanceOf[js.Any]).asInstanceOf[TransitionConfig]
  inline def draw(node: SVGElementgetTotalLengthn, hasDelaySpeedDurationEasing: DrawParams): TransitionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("draw")(node.asInstanceOf[js.Any], hasDelaySpeedDurationEasing.asInstanceOf[js.Any])).asInstanceOf[TransitionConfig]
  
  inline def fade(node: Element): TransitionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fade")(node.asInstanceOf[js.Any]).asInstanceOf[TransitionConfig]
  inline def fade(node: Element, hasDelayDurationEasing: FadeParams): TransitionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("fade")(node.asInstanceOf[js.Any], hasDelayDurationEasing.asInstanceOf[js.Any])).asInstanceOf[TransitionConfig]
  
  inline def fly(node: Element): TransitionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fly")(node.asInstanceOf[js.Any]).asInstanceOf[TransitionConfig]
  inline def fly(node: Element, hasDelayDurationEasingXYOpacity: FlyParams): TransitionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("fly")(node.asInstanceOf[js.Any], hasDelayDurationEasingXYOpacity.asInstanceOf[js.Any])).asInstanceOf[TransitionConfig]
  
  inline def scale(node: Element): TransitionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("scale")(node.asInstanceOf[js.Any]).asInstanceOf[TransitionConfig]
  inline def scale(node: Element, hasDelayDurationEasingStartOpacity: ScaleParams): TransitionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(node.asInstanceOf[js.Any], hasDelayDurationEasingStartOpacity.asInstanceOf[js.Any])).asInstanceOf[TransitionConfig]
  
  inline def slide(node: Element): TransitionConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("slide")(node.asInstanceOf[js.Any]).asInstanceOf[TransitionConfig]
  inline def slide(node: Element, hasDelayDurationEasing: SlideParams): TransitionConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("slide")(node.asInstanceOf[js.Any], hasDelayDurationEasing.asInstanceOf[js.Any])).asInstanceOf[TransitionConfig]
  
  trait BlurParams extends StObject {
    
    var amount: js.UndefOr[Double] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[EasingFunction] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object BlurParams {
    
    inline def apply(): BlurParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlurParams]
    }
    
    extension [Self <: BlurParams](x: Self) {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait CrossfadeParams extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double | (js.Function1[/* len */ Double, Double])] = js.undefined
    
    var easing: js.UndefOr[EasingFunction] = js.undefined
  }
  object CrossfadeParams {
    
    inline def apply(): CrossfadeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossfadeParams]
    }
    
    extension [Self <: CrossfadeParams](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double | (js.Function1[/* len */ Double, Double])): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationFunction1(value: /* len */ Double => Double): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  trait DrawParams extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double | (js.Function1[/* len */ Double, Double])] = js.undefined
    
    var easing: js.UndefOr[EasingFunction] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
  }
  object DrawParams {
    
    inline def apply(): DrawParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawParams]
    }
    
    extension [Self <: DrawParams](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double | (js.Function1[/* len */ Double, Double])): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationFunction1(value: /* len */ Double => Double): Self = StObject.set(x, "duration", js.Any.fromFunction1(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  type EasingFunction = js.Function1[/* t */ Double, Double]
  
  trait FadeParams extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[EasingFunction] = js.undefined
  }
  object FadeParams {
    
    inline def apply(): FadeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FadeParams]
    }
    
    extension [Self <: FadeParams](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  trait FlyParams extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[EasingFunction] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object FlyParams {
    
    inline def apply(): FlyParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlyParams]
    }
    
    extension [Self <: FlyParams](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ScaleParams extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[EasingFunction] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
  }
  object ScaleParams {
    
    inline def apply(): ScaleParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleParams]
    }
    
    extension [Self <: ScaleParams](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait SlideParams extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[EasingFunction] = js.undefined
  }
  object SlideParams {
    
    inline def apply(): SlideParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideParams]
    }
    
    extension [Self <: SlideParams](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: /* t */ Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  trait TransitionConfig extends StObject {
    
    var css: js.UndefOr[js.Function2[/* t */ Double, /* u */ Double, String]] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[EasingFunction] = js.undefined
    
    var tick: js.UndefOr[js.Function2[/* t */ Double, /* u */ Double, Unit]] = js.undefined
  }
  object TransitionConfig {
    
    inline def apply(): TransitionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionConfig]
    }
    
    extension [Self <: TransitionConfig](x: Self) {
      
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
}
