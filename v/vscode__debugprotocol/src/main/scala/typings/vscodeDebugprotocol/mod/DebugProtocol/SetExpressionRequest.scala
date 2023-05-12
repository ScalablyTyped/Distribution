package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SetExpression request; value of command field is 'setExpression'.
		Evaluates the given `value` expression and assigns it to the `expression` which must be a modifiable l-value.
		The expressions have access to any variables and arguments that are in scope of the specified frame.
		Clients should only call this request if the corresponding capability `supportsSetExpression` is true.
		If a debug adapter implements both `setExpression` and `setVariable`, a client uses `setExpression` if the variable has an `evaluateName` property.
	*/
trait SetExpressionRequest
  extends StObject
     with Request {
  
  // command: 'setExpression';
  @JSName("arguments")
  var arguments_SetExpressionRequest: SetExpressionArguments
}
object SetExpressionRequest {
  
  inline def apply(
    arguments: SetExpressionArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): SetExpressionRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetExpressionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetExpressionRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: SetExpressionArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
