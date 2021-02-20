package typings.tweezerJs

import typings.tweezerJs.tweezerJsStrings.done
import typings.tweezerJs.tweezerJsStrings.tick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tweezer.js", JSImport.Namespace)
  @js.native
  class ^ protected () extends Tweezer {
    def this(opts: Options) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var duration: js.UndefOr[Double] = js.native
    
    var easing: js.UndefOr[
        js.Function4[
          /* currentTime */ Double, 
          /* beginningTime */ Double, 
          /* changeInValue */ Double, 
          /* duration */ Double, 
          Double
        ]
      ] = js.native
    
    var end: Double = js.native
    
    var start: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(end: Double, start: Double): Options = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(
        value: (/* currentTime */ Double, /* beginningTime */ Double, /* changeInValue */ Double, /* duration */ Double) => Double
      ): Self = StObject.set(x, "easing", js.Any.fromFunction4(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Tweezer extends StObject {
    
    def begin(): this.type = js.native
    
    @JSName("on")
    def on_done(name: done, handler: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_tick(name: tick, handler: js.Function1[/* v */ Double, Unit]): this.type = js.native
    
    def stop(): this.type = js.native
  }
}
