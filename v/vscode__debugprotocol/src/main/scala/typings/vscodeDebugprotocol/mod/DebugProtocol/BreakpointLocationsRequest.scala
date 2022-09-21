package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** BreakpointLocations request; value of command field is 'breakpointLocations'.
		The `breakpointLocations` request returns all possible locations for source breakpoints in a given range.
		Clients should only call this request if the corresponding capability `supportsBreakpointLocationsRequest` is true.
	*/
trait BreakpointLocationsRequest
  extends StObject
     with Request {
  
  // command: 'breakpointLocations';
  @JSName("arguments")
  var arguments_BreakpointLocationsRequest: js.UndefOr[BreakpointLocationsArguments] = js.undefined
}
object BreakpointLocationsRequest {
  
  inline def apply(command: String, seq: Double, `type`: request | response | event | String): BreakpointLocationsRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointLocationsRequest]
  }
  
  extension [Self <: BreakpointLocationsRequest](x: Self) {
    
    inline def setArguments(value: BreakpointLocationsArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
  }
}
