package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SetDataBreakpoints request; value of command field is 'setDataBreakpoints'.
		Replaces all existing data breakpoints with new data breakpoints.
		To clear all data breakpoints, specify an empty array.
		When a data breakpoint is hit, a `stopped` event (with reason `data breakpoint`) is generated.
		Clients should only call this request if the corresponding capability `supportsDataBreakpoints` is true.
	*/
trait SetDataBreakpointsRequest
  extends StObject
     with Request {
  
  // command: 'setDataBreakpoints';
  @JSName("arguments")
  var arguments_SetDataBreakpointsRequest: SetDataBreakpointsArguments
}
object SetDataBreakpointsRequest {
  
  inline def apply(
    arguments: SetDataBreakpointsArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): SetDataBreakpointsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDataBreakpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetDataBreakpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: SetDataBreakpointsArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
