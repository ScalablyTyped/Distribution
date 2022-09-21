package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Evaluate request; value of command field is 'evaluate'.
		Evaluates the given expression in the context of the topmost stack frame.
		The expression has access to any variables and arguments that are in scope.
	*/
trait EvaluateRequest
  extends StObject
     with Request {
  
  // command: 'evaluate';
  @JSName("arguments")
  var arguments_EvaluateRequest: EvaluateArguments
}
object EvaluateRequest {
  
  inline def apply(
    arguments: EvaluateArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): EvaluateRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateRequest]
  }
  
  extension [Self <: EvaluateRequest](x: Self) {
    
    inline def setArguments(value: EvaluateArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
