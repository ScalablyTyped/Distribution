package typings.tweenFunctions

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tween-functions", JSImport.Namespace)
  @js.native
  val ^ : TweenFunctions = js.native
  
  type TweenFunction = js.Function4[/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double, Double]
  
  type TweenFunctionBack = js.Function5[
    /* time */ Double, 
    /* start */ Double, 
    /* end */ Double, 
    /* duration */ Double, 
    /* overshoot */ js.UndefOr[Double], 
    Double
  ]
  
  trait TweenFunctions extends StObject {
    
    def easeInBack(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    def easeInBack(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double,
      /** Overshoot parameter. Defaults to 1.70158 - Penner’s Magic Number (10% overshoot) */
    overshoot: Double
    ): Double
    @JSName("easeInBack")
    var easeInBack_Original: TweenFunctionBack
    
    def easeInBounce(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInBounce")
    var easeInBounce_Original: TweenFunction
    
    def easeInCirc(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInCirc")
    var easeInCirc_Original: TweenFunction
    
    def easeInCubic(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInCubic")
    var easeInCubic_Original: TweenFunction
    
    def easeInElastic(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInElastic")
    var easeInElastic_Original: TweenFunction
    
    def easeInExpo(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInExpo")
    var easeInExpo_Original: TweenFunction
    
    def easeInOutBack(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    def easeInOutBack(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double,
      /** Overshoot parameter. Defaults to 1.70158 - Penner’s Magic Number (10% overshoot) */
    overshoot: Double
    ): Double
    @JSName("easeInOutBack")
    var easeInOutBack_Original: TweenFunctionBack
    
    def easeInOutBounce(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInOutBounce")
    var easeInOutBounce_Original: TweenFunction
    
    def easeInOutCirc(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInOutCirc")
    var easeInOutCirc_Original: TweenFunction
    
    def easeInOutCubic(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInOutCubic")
    var easeInOutCubic_Original: TweenFunction
    
    def easeInOutElastic(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInOutElastic")
    var easeInOutElastic_Original: TweenFunction
    
    def easeInOutExpo(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInOutExpo")
    var easeInOutExpo_Original: TweenFunction
    
    def easeInOutQuad(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInOutQuad")
    var easeInOutQuad_Original: TweenFunction
    
    def easeInOutQuart(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInOutQuart")
    var easeInOutQuart_Original: TweenFunction
    
    def easeInOutQuint(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInOutQuint")
    var easeInOutQuint_Original: TweenFunction
    
    def easeInOutSine(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInOutSine")
    var easeInOutSine_Original: TweenFunction
    
    def easeInQuad(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInQuad")
    var easeInQuad_Original: TweenFunction
    
    def easeInQuart(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInQuart")
    var easeInQuart_Original: TweenFunction
    
    def easeInQuint(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInQuint")
    var easeInQuint_Original: TweenFunction
    
    def easeInSine(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeInSine")
    var easeInSine_Original: TweenFunction
    
    def easeOutBack(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    def easeOutBack(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double,
      /** Overshoot parameter. Defaults to 1.70158 - Penner’s Magic Number (10% overshoot) */
    overshoot: Double
    ): Double
    @JSName("easeOutBack")
    var easeOutBack_Original: TweenFunctionBack
    
    def easeOutBounce(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeOutBounce")
    var easeOutBounce_Original: TweenFunction
    
    def easeOutCirc(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeOutCirc")
    var easeOutCirc_Original: TweenFunction
    
    def easeOutCubic(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeOutCubic")
    var easeOutCubic_Original: TweenFunction
    
    def easeOutElastic(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeOutElastic")
    var easeOutElastic_Original: TweenFunction
    
    def easeOutExpo(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeOutExpo")
    var easeOutExpo_Original: TweenFunction
    
    def easeOutQuad(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeOutQuad")
    var easeOutQuad_Original: TweenFunction
    
    def easeOutQuart(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeOutQuart")
    var easeOutQuart_Original: TweenFunction
    
    def easeOutQuint(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeOutQuint")
    var easeOutQuint_Original: TweenFunction
    
    def easeOutSine(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("easeOutSine")
    var easeOutSine_Original: TweenFunction
    
    def linear(
      /** Current elapsed time */
    time: Double,
      /** Beginning value */
    start: Double,
      /** Final value */
    end: Double,
      /** Total duration of the animation */
    duration: Double
    ): Double
    @JSName("linear")
    var linear_Original: TweenFunction
  }
  object TweenFunctions {
    
    inline def apply(
      easeInBack: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double, /* overshoot */ js.UndefOr[Double]) => Double,
      easeInBounce: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInCirc: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInCubic: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInElastic: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInExpo: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInOutBack: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double, /* overshoot */ js.UndefOr[Double]) => Double,
      easeInOutBounce: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInOutCirc: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInOutCubic: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInOutElastic: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInOutExpo: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInOutQuad: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInOutQuart: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInOutQuint: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInOutSine: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInQuad: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInQuart: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInQuint: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeInSine: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeOutBack: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double, /* overshoot */ js.UndefOr[Double]) => Double,
      easeOutBounce: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeOutCirc: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeOutCubic: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeOutElastic: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeOutExpo: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeOutQuad: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeOutQuart: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeOutQuint: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      easeOutSine: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double,
      linear: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double
    ): TweenFunctions = {
      val __obj = js.Dynamic.literal(easeInBack = js.Any.fromFunction5(easeInBack), easeInBounce = js.Any.fromFunction4(easeInBounce), easeInCirc = js.Any.fromFunction4(easeInCirc), easeInCubic = js.Any.fromFunction4(easeInCubic), easeInElastic = js.Any.fromFunction4(easeInElastic), easeInExpo = js.Any.fromFunction4(easeInExpo), easeInOutBack = js.Any.fromFunction5(easeInOutBack), easeInOutBounce = js.Any.fromFunction4(easeInOutBounce), easeInOutCirc = js.Any.fromFunction4(easeInOutCirc), easeInOutCubic = js.Any.fromFunction4(easeInOutCubic), easeInOutElastic = js.Any.fromFunction4(easeInOutElastic), easeInOutExpo = js.Any.fromFunction4(easeInOutExpo), easeInOutQuad = js.Any.fromFunction4(easeInOutQuad), easeInOutQuart = js.Any.fromFunction4(easeInOutQuart), easeInOutQuint = js.Any.fromFunction4(easeInOutQuint), easeInOutSine = js.Any.fromFunction4(easeInOutSine), easeInQuad = js.Any.fromFunction4(easeInQuad), easeInQuart = js.Any.fromFunction4(easeInQuart), easeInQuint = js.Any.fromFunction4(easeInQuint), easeInSine = js.Any.fromFunction4(easeInSine), easeOutBack = js.Any.fromFunction5(easeOutBack), easeOutBounce = js.Any.fromFunction4(easeOutBounce), easeOutCirc = js.Any.fromFunction4(easeOutCirc), easeOutCubic = js.Any.fromFunction4(easeOutCubic), easeOutElastic = js.Any.fromFunction4(easeOutElastic), easeOutExpo = js.Any.fromFunction4(easeOutExpo), easeOutQuad = js.Any.fromFunction4(easeOutQuad), easeOutQuart = js.Any.fromFunction4(easeOutQuart), easeOutQuint = js.Any.fromFunction4(easeOutQuint), easeOutSine = js.Any.fromFunction4(easeOutSine), linear = js.Any.fromFunction4(linear))
      __obj.asInstanceOf[TweenFunctions]
    }
    
    extension [Self <: TweenFunctions](x: Self) {
      
      inline def setEaseInBack(
        value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double, /* overshoot */ js.UndefOr[Double]) => Double
      ): Self = StObject.set(x, "easeInBack", js.Any.fromFunction5(value))
      
      inline def setEaseInBounce(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInBounce", js.Any.fromFunction4(value))
      
      inline def setEaseInCirc(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInCirc", js.Any.fromFunction4(value))
      
      inline def setEaseInCubic(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInCubic", js.Any.fromFunction4(value))
      
      inline def setEaseInElastic(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInElastic", js.Any.fromFunction4(value))
      
      inline def setEaseInExpo(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInExpo", js.Any.fromFunction4(value))
      
      inline def setEaseInOutBack(
        value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double, /* overshoot */ js.UndefOr[Double]) => Double
      ): Self = StObject.set(x, "easeInOutBack", js.Any.fromFunction5(value))
      
      inline def setEaseInOutBounce(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInOutBounce", js.Any.fromFunction4(value))
      
      inline def setEaseInOutCirc(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInOutCirc", js.Any.fromFunction4(value))
      
      inline def setEaseInOutCubic(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInOutCubic", js.Any.fromFunction4(value))
      
      inline def setEaseInOutElastic(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInOutElastic", js.Any.fromFunction4(value))
      
      inline def setEaseInOutExpo(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInOutExpo", js.Any.fromFunction4(value))
      
      inline def setEaseInOutQuad(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInOutQuad", js.Any.fromFunction4(value))
      
      inline def setEaseInOutQuart(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInOutQuart", js.Any.fromFunction4(value))
      
      inline def setEaseInOutQuint(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInOutQuint", js.Any.fromFunction4(value))
      
      inline def setEaseInOutSine(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInOutSine", js.Any.fromFunction4(value))
      
      inline def setEaseInQuad(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInQuad", js.Any.fromFunction4(value))
      
      inline def setEaseInQuart(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInQuart", js.Any.fromFunction4(value))
      
      inline def setEaseInQuint(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInQuint", js.Any.fromFunction4(value))
      
      inline def setEaseInSine(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeInSine", js.Any.fromFunction4(value))
      
      inline def setEaseOutBack(
        value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double, /* overshoot */ js.UndefOr[Double]) => Double
      ): Self = StObject.set(x, "easeOutBack", js.Any.fromFunction5(value))
      
      inline def setEaseOutBounce(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeOutBounce", js.Any.fromFunction4(value))
      
      inline def setEaseOutCirc(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeOutCirc", js.Any.fromFunction4(value))
      
      inline def setEaseOutCubic(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeOutCubic", js.Any.fromFunction4(value))
      
      inline def setEaseOutElastic(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeOutElastic", js.Any.fromFunction4(value))
      
      inline def setEaseOutExpo(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeOutExpo", js.Any.fromFunction4(value))
      
      inline def setEaseOutQuad(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeOutQuad", js.Any.fromFunction4(value))
      
      inline def setEaseOutQuart(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeOutQuart", js.Any.fromFunction4(value))
      
      inline def setEaseOutQuint(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeOutQuint", js.Any.fromFunction4(value))
      
      inline def setEaseOutSine(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "easeOutSine", js.Any.fromFunction4(value))
      
      inline def setLinear(value: (/* time */ Double, /* start */ Double, /* end */ Double, /* duration */ Double) => Double): Self = StObject.set(x, "linear", js.Any.fromFunction4(value))
    }
  }
  
  type _To = TweenFunctions
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TweenFunctions = ^
}
