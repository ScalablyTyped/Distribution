package typings.xstream

import org.scalablytyped.runtime.Shortcut
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tweenMod extends Shortcut {
  
  @JSImport("xstream/extra/tween", JSImport.Default)
  @js.native
  val default: TweenFactory = js.native
  
  type Ease = js.Function3[/* x */ Double, /* from */ Double, /* to */ Double, Double]
  
  trait Easings extends StObject {
    
    def easeIn(x: Double, from: Double, to: Double): Double
    
    def easeInOut(x: Double, from: Double, to: Double): Double
    @JSName("easeInOut")
    var easeInOut_Original: Ease
    
    @JSName("easeIn")
    var easeIn_Original: Ease
    
    def easeOut(x: Double, from: Double, to: Double): Double
    @JSName("easeOut")
    var easeOut_Original: Ease
  }
  object Easings {
    
    inline def apply(
      easeIn: (/* x */ Double, /* from */ Double, /* to */ Double) => Double,
      easeInOut: (/* x */ Double, /* from */ Double, /* to */ Double) => Double,
      easeOut: (/* x */ Double, /* from */ Double, /* to */ Double) => Double
    ): Easings = {
      val __obj = js.Dynamic.literal(easeIn = js.Any.fromFunction3(easeIn), easeInOut = js.Any.fromFunction3(easeInOut), easeOut = js.Any.fromFunction3(easeOut))
      __obj.asInstanceOf[Easings]
    }
    
    extension [Self <: Easings](x: Self) {
      
      inline def setEaseIn(value: (/* x */ Double, /* from */ Double, /* to */ Double) => Double): Self = StObject.set(x, "easeIn", js.Any.fromFunction3(value))
      
      inline def setEaseInOut(value: (/* x */ Double, /* from */ Double, /* to */ Double) => Double): Self = StObject.set(x, "easeInOut", js.Any.fromFunction3(value))
      
      inline def setEaseOut(value: (/* x */ Double, /* from */ Double, /* to */ Double) => Double): Self = StObject.set(x, "easeOut", js.Any.fromFunction3(value))
    }
  }
  
  type NumericFunction = js.Function1[/* input */ Double, Double]
  
  trait TweenConfig extends StObject {
    
    var duration: Double
    
    var ease: js.UndefOr[Ease] = js.undefined
    
    var from: Double
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var to: Double
  }
  object TweenConfig {
    
    inline def apply(duration: Double, from: Double, to: Double): TweenConfig = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenConfig]
    }
    
    extension [Self <: TweenConfig](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEase(value: (/* x */ Double, /* from */ Double, /* to */ Double) => Double): Self = StObject.set(x, "ease", js.Any.fromFunction3(value))
      
      inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TweenFactory extends StObject {
    
    def apply(config: TweenConfig): Stream[Double] = js.native
    
    var back: Easings = js.native
    
    var bounce: Easings = js.native
    
    var circular: Easings = js.native
    
    var elastic: Easings = js.native
    
    var exponential: Easings = js.native
    
    var linear: typings.xstream.anon.Ease = js.native
    
    var power2: Easings = js.native
    
    var power3: Easings = js.native
    
    var power4: Easings = js.native
    
    var sine: Easings = js.native
  }
  
  type _To = TweenFactory
  
  /* This means you don't have to write `default`, but can instead just say `tweenMod.foo` */
  override def _to: TweenFactory = default
}
