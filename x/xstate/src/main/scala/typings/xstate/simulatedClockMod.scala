package typings.xstate

import typings.xstate.interpreterMod.Clock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simulatedClockMod {
  
  @JSImport("xstate/lib/SimulatedClock", "SimulatedClock")
  @js.native
  class SimulatedClock () extends Clock {
    
    var _id: js.Any = js.native
    
    var _now: js.Any = js.native
    
    def clearTimeout(id: Double): Unit = js.native
    
    var flushTimeouts: js.Any = js.native
    
    var getId: js.Any = js.native
    
    def increment(ms: Double): Unit = js.native
    
    def now(): Double = js.native
    
    def set(ms: Double): Unit = js.native
    
    def start(speed: Double): Unit = js.native
    
    var timeouts: js.Any = js.native
  }
}
