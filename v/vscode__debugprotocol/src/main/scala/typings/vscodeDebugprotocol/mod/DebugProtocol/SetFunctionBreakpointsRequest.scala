package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SetFunctionBreakpoints request; value of command field is 'setFunctionBreakpoints'.
		Replaces all existing function breakpoints with new function breakpoints.
		To clear all function breakpoints, specify an empty array.
		When a function breakpoint is hit, a `stopped` event (with reason `function breakpoint`) is generated.
		Clients should only call this request if the corresponding capability `supportsFunctionBreakpoints` is true.
	*/
trait SetFunctionBreakpointsRequest
  extends StObject
     with Request {
  
  // command: 'setFunctionBreakpoints';
  @JSName("arguments")
  var arguments_SetFunctionBreakpointsRequest: SetFunctionBreakpointsArguments
}
object SetFunctionBreakpointsRequest {
  
  inline def apply(
    arguments: SetFunctionBreakpointsArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): SetFunctionBreakpointsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFunctionBreakpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetFunctionBreakpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: SetFunctionBreakpointsArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
