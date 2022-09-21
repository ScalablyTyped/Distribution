package typings.vscodeDebugprotocol.anon

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.`data breakpoint`
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.`function breakpoint`
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.`instruction breakpoint`
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.breakpoint
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.entry
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.exception
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.goto
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.pause
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllThreadsStopped extends StObject {
  
  /** If `allThreadsStopped` is true, a debug adapter can announce that all threads have stopped.
  				- The client should use this information to enable that all threads can be expanded to access their stacktraces.
  				- If the attribute is missing or false, only the thread with the given threadId can be expanded.
  			*/
  var allThreadsStopped: js.UndefOr[Boolean] = js.undefined
  
  /** The full reason for the event, e.g. 'Paused on exception'. This string is shown in the UI as is and can be translated. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Ids of the breakpoints that triggered the event. In most cases there is only a single breakpoint but here are some examples for multiple breakpoints:
  				- Different types of breakpoints map to the same location.
  				- Multiple source breakpoints get collapsed to the same instruction by the compiler/runtime.
  				- Multiple function breakpoints with different function names map to the same location.
  			*/
  var hitBreakpointIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** A value of true hints to the client that this event should not change the focus. */
  var preserveFocusHint: js.UndefOr[Boolean] = js.undefined
  
  /** The reason for the event.
  				For backward compatibility this string is shown in the UI if the `description` attribute is missing (but it must not be translated).
  				Values: 'step', 'breakpoint', 'exception', 'pause', 'entry', 'goto', 'function breakpoint', 'data breakpoint', 'instruction breakpoint', etc.
  			*/
  var reason: step | breakpoint | exception | pause | entry | goto | (`function breakpoint`) | (`data breakpoint`) | (`instruction breakpoint`) | String
  
  /** Additional information. E.g. if reason is `exception`, text contains the exception name. This string is shown in the UI. */
  var text: js.UndefOr[String] = js.undefined
  
  /** The thread which was stopped. */
  var threadId: js.UndefOr[Double] = js.undefined
}
object AllThreadsStopped {
  
  inline def apply(
    reason: step | breakpoint | exception | pause | entry | goto | (`function breakpoint`) | (`data breakpoint`) | (`instruction breakpoint`) | String
  ): AllThreadsStopped = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllThreadsStopped]
  }
  
  extension [Self <: AllThreadsStopped](x: Self) {
    
    inline def setAllThreadsStopped(value: Boolean): Self = StObject.set(x, "allThreadsStopped", value.asInstanceOf[js.Any])
    
    inline def setAllThreadsStoppedUndefined: Self = StObject.set(x, "allThreadsStopped", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHitBreakpointIds(value: js.Array[Double]): Self = StObject.set(x, "hitBreakpointIds", value.asInstanceOf[js.Any])
    
    inline def setHitBreakpointIdsUndefined: Self = StObject.set(x, "hitBreakpointIds", js.undefined)
    
    inline def setHitBreakpointIdsVarargs(value: Double*): Self = StObject.set(x, "hitBreakpointIds", js.Array(value*))
    
    inline def setPreserveFocusHint(value: Boolean): Self = StObject.set(x, "preserveFocusHint", value.asInstanceOf[js.Any])
    
    inline def setPreserveFocusHintUndefined: Self = StObject.set(x, "preserveFocusHint", js.undefined)
    
    inline def setReason(
      value: step | breakpoint | exception | pause | entry | goto | (`function breakpoint`) | (`data breakpoint`) | (`instruction breakpoint`) | String
    ): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setThreadId(value: Double): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    inline def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
  }
}
