package typings.tweezerJs

import typings.tweezerJs.tweezerJsStrings.done
import typings.tweezerJs.tweezerJsStrings.tick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tweezer.js", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Tweezer {
    def this(opts: Options) = this()
  }
  
  trait Options extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[
        js.Function4[
          /* currentTime */ Double, 
          /* beginningTime */ Double, 
          /* changeInValue */ Double, 
          /* duration */ Double, 
          Double
        ]
      ] = js.undefined
    
    var end: Double
    
    var start: Double
  }
  object Options {
    
    inline def apply(end: Double, start: Double): Options = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(
        value: (/* currentTime */ Double, /* beginningTime */ Double, /* changeInValue */ Double, /* duration */ Double) => Double
      ): Self = StObject.set(x, "easing", js.Any.fromFunction4(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
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
