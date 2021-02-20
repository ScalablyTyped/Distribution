package typings.xstream

import org.scalablytyped.runtime.Shortcut
import typings.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tweenMod extends Shortcut {
  
  @JSImport("xstream/extra/tween", JSImport.Default)
  @js.native
  val default: TweenFactory = js.native
  
  type Ease = js.Function3[/* x */ Double, /* from */ Double, /* to */ Double, Double]
  
  @js.native
  trait Easings extends StObject {
    
    def easeIn(x: Double, from: Double, to: Double): Double = js.native
    
    def easeInOut(x: Double, from: Double, to: Double): Double = js.native
    @JSName("easeInOut")
    var easeInOut_Original: Ease = js.native
    
    @JSName("easeIn")
    var easeIn_Original: Ease = js.native
    
    def easeOut(x: Double, from: Double, to: Double): Double = js.native
    @JSName("easeOut")
    var easeOut_Original: Ease = js.native
  }
  
  type NumericFunction = js.Function1[/* input */ Double, Double]
  
  @js.native
  trait TweenConfig extends StObject {
    
    var duration: Double = js.native
    
    var ease: js.UndefOr[Ease] = js.native
    
    var from: Double = js.native
    
    var interval: js.UndefOr[Double] = js.native
    
    var to: Double = js.native
  }
  object TweenConfig {
    
    @scala.inline
    def apply(duration: Double, from: Double, to: Double): TweenConfig = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[TweenConfig]
    }
    
    @scala.inline
    implicit class TweenConfigMutableBuilder[Self <: TweenConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEase(value: (/* x */ Double, /* from */ Double, /* to */ Double) => Double): Self = StObject.set(x, "ease", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
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
