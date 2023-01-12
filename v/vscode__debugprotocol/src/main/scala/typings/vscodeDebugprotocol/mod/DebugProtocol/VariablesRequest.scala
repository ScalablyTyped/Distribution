package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Variables request; value of command field is 'variables'.
		Retrieves all child variables for the given variable reference.
		A filter can be used to limit the fetched children to either named or indexed children.
	*/
trait VariablesRequest
  extends StObject
     with Request {
  
  // command: 'variables';
  @JSName("arguments")
  var arguments_VariablesRequest: VariablesArguments
}
object VariablesRequest {
  
  inline def apply(
    arguments: VariablesArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): VariablesRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariablesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariablesRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: VariablesArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
