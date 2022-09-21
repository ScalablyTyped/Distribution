package typings.timeoutAbortController

import typings.std.AbortController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timeout-abort-controller", "TimeoutController")
  @js.native
  open class TimeoutController protected ()
    extends StObject
       with AbortController {
    /**
      * @constructor
      * @param {number} ms milliseconds
      */
    def this(ms: Double) = this()
    
    var _ms: Double = js.native
    
    var _timer: Any = js.native
    
    /**
      * Clears the timer
      */
    def clear(): Unit = js.native
    
    /**
      * Resets the timer
      */
    def reset(): Unit = js.native
  }
}
