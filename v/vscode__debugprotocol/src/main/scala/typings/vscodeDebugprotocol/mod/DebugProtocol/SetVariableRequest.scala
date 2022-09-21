package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SetVariable request; value of command field is 'setVariable'.
		Set the variable with the given name in the variable container to a new value. Clients should only call this request if the corresponding capability `supportsSetVariable` is true.
		If a debug adapter implements both `setVariable` and `setExpression`, a client will only use `setExpression` if the variable has an `evaluateName` property.
	*/
trait SetVariableRequest
  extends StObject
     with Request {
  
  // command: 'setVariable';
  @JSName("arguments")
  var arguments_SetVariableRequest: SetVariableArguments
}
object SetVariableRequest {
  
  inline def apply(
    arguments: SetVariableArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): SetVariableRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetVariableRequest]
  }
  
  extension [Self <: SetVariableRequest](x: Self) {
    
    inline def setArguments(value: SetVariableArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
