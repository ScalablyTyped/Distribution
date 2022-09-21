package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SetInstructionBreakpoints request; value of command field is 'setInstructionBreakpoints'.
		Replaces all existing instruction breakpoints. Typically, instruction breakpoints would be set from a disassembly window. 
		To clear all instruction breakpoints, specify an empty array.
		When an instruction breakpoint is hit, a `stopped` event (with reason `instruction breakpoint`) is generated.
		Clients should only call this request if the corresponding capability `supportsInstructionBreakpoints` is true.
	*/
trait SetInstructionBreakpointsRequest
  extends StObject
     with Request {
  
  // command: 'setInstructionBreakpoints';
  @JSName("arguments")
  var arguments_SetInstructionBreakpointsRequest: SetInstructionBreakpointsArguments
}
object SetInstructionBreakpointsRequest {
  
  inline def apply(
    arguments: SetInstructionBreakpointsArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): SetInstructionBreakpointsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstructionBreakpointsRequest]
  }
  
  extension [Self <: SetInstructionBreakpointsRequest](x: Self) {
    
    inline def setArguments(value: SetInstructionBreakpointsArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
