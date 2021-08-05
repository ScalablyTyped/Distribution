package typings.xstate

import typings.xstate.interpreterMod.Clock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simulatedClockMod {
  
  @JSImport("xstate/lib/SimulatedClock", "SimulatedClock")
  @js.native
  class SimulatedClock ()
    extends StObject
       with Clock {
    
    /* private */ var _id: js.Any = js.native
    
    /* private */ var _now: js.Any = js.native
    
    /* CompleteClass */
    override def clearTimeout(id: js.Any): Unit = js.native
    def clearTimeout(id: Double): Unit = js.native
    
    /* private */ var flushTimeouts: js.Any = js.native
    
    /* private */ var getId: js.Any = js.native
    
    def increment(ms: Double): Unit = js.native
    
    def now(): Double = js.native
    
    def set(ms: Double): Unit = js.native
    
    /* CompleteClass */
    override def setTimeout(fn: js.Function1[/* repeated */ js.Any, Unit], timeout: Double): js.Any = js.native
    
    def start(speed: Double): Unit = js.native
    
    /* private */ var timeouts: js.Any = js.native
  }
}
