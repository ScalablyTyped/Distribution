package typings.xstate

import typings.xstate.interpreterMod.Clock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simulatedClockMod {
  
  @JSImport("xstate/lib/SimulatedClock", "SimulatedClock")
  @js.native
  open class SimulatedClock ()
    extends StObject
       with Clock {
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _now: Any = js.native
    
    /* CompleteClass */
    override def clearTimeout(id: Any): Unit = js.native
    def clearTimeout(id: Double): Unit = js.native
    
    /* private */ var flushTimeouts: Any = js.native
    
    /* private */ var getId: Any = js.native
    
    def increment(ms: Double): Unit = js.native
    
    def now(): Double = js.native
    
    def set(ms: Double): Unit = js.native
    
    /* CompleteClass */
    override def setTimeout(fn: js.Function1[/* repeated */ Any, Unit], timeout: Double): Any = js.native
    
    def start(speed: Double): Unit = js.native
    
    /* private */ var timeouts: Any = js.native
  }
}
