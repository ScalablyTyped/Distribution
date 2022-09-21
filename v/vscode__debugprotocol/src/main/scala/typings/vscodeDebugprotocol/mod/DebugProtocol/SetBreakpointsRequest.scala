package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SetBreakpoints request; value of command field is 'setBreakpoints'.
		Sets multiple breakpoints for a single source and clears all previous breakpoints in that source.
		To clear all breakpoint for a source, specify an empty array.
		When a breakpoint is hit, a `stopped` event (with reason `breakpoint`) is generated.
	*/
trait SetBreakpointsRequest
  extends StObject
     with Request {
  
  // command: 'setBreakpoints';
  @JSName("arguments")
  var arguments_SetBreakpointsRequest: SetBreakpointsArguments
}
object SetBreakpointsRequest {
  
  inline def apply(
    arguments: SetBreakpointsArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): SetBreakpointsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetBreakpointsRequest]
  }
  
  extension [Self <: SetBreakpointsRequest](x: Self) {
    
    inline def setArguments(value: SetBreakpointsArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
