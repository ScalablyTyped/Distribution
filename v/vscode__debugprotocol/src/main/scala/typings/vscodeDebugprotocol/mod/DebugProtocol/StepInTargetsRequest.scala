package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** StepInTargets request; value of command field is 'stepInTargets'.
		This request retrieves the possible stepIn targets for the specified stack frame.
		These targets can be used in the `stepIn` request.
		Clients should only call this request if the corresponding capability `supportsStepInTargetsRequest` is true.
	*/
trait StepInTargetsRequest
  extends StObject
     with Request {
  
  // command: 'stepInTargets';
  @JSName("arguments")
  var arguments_StepInTargetsRequest: StepInTargetsArguments
}
object StepInTargetsRequest {
  
  inline def apply(
    arguments: StepInTargetsArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): StepInTargetsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepInTargetsRequest]
  }
  
  extension [Self <: StepInTargetsRequest](x: Self) {
    
    inline def setArguments(value: StepInTargetsArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
