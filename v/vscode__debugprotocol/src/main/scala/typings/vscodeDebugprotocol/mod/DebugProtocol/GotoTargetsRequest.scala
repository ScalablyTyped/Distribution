package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** GotoTargets request; value of command field is 'gotoTargets'.
		This request retrieves the possible goto targets for the specified source location.
		These targets can be used in the `goto` request.
		Clients should only call this request if the corresponding capability `supportsGotoTargetsRequest` is true.
	*/
trait GotoTargetsRequest
  extends StObject
     with Request {
  
  // command: 'gotoTargets';
  @JSName("arguments")
  var arguments_GotoTargetsRequest: GotoTargetsArguments
}
object GotoTargetsRequest {
  
  inline def apply(
    arguments: GotoTargetsArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): GotoTargetsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotoTargetsRequest]
  }
  
  extension [Self <: GotoTargetsRequest](x: Self) {
    
    inline def setArguments(value: GotoTargetsArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
