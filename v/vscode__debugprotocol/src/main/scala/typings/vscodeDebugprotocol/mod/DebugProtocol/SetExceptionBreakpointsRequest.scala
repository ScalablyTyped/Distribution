package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SetExceptionBreakpoints request; value of command field is 'setExceptionBreakpoints'.
		The request configures the debugger's response to thrown exceptions.
		If an exception is configured to break, a `stopped` event is fired (with reason `exception`).
		Clients should only call this request if the corresponding capability `exceptionBreakpointFilters` returns one or more filters.
	*/
trait SetExceptionBreakpointsRequest
  extends StObject
     with Request {
  
  // command: 'setExceptionBreakpoints';
  @JSName("arguments")
  var arguments_SetExceptionBreakpointsRequest: SetExceptionBreakpointsArguments
}
object SetExceptionBreakpointsRequest {
  
  inline def apply(
    arguments: SetExceptionBreakpointsArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): SetExceptionBreakpointsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetExceptionBreakpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetExceptionBreakpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: SetExceptionBreakpointsArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
