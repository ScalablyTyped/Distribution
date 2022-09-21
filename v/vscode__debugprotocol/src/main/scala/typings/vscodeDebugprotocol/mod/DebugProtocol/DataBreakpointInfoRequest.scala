package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** DataBreakpointInfo request; value of command field is 'dataBreakpointInfo'.
		Obtains information on a possible data breakpoint that could be set on an expression or variable.
		Clients should only call this request if the corresponding capability `supportsDataBreakpoints` is true.
	*/
trait DataBreakpointInfoRequest
  extends StObject
     with Request {
  
  // command: 'dataBreakpointInfo';
  @JSName("arguments")
  var arguments_DataBreakpointInfoRequest: DataBreakpointInfoArguments
}
object DataBreakpointInfoRequest {
  
  inline def apply(
    arguments: DataBreakpointInfoArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): DataBreakpointInfoRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBreakpointInfoRequest]
  }
  
  extension [Self <: DataBreakpointInfoRequest](x: Self) {
    
    inline def setArguments(value: DataBreakpointInfoArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
