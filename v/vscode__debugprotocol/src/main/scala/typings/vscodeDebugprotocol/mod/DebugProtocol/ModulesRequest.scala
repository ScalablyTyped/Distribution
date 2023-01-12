package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Modules request; value of command field is 'modules'.
		Modules can be retrieved from the debug adapter with this request which can either return all modules or a range of modules to support paging.
		Clients should only call this request if the corresponding capability `supportsModulesRequest` is true.
	*/
trait ModulesRequest
  extends StObject
     with Request {
  
  // command: 'modules';
  @JSName("arguments")
  var arguments_ModulesRequest: ModulesArguments
}
object ModulesRequest {
  
  inline def apply(
    arguments: ModulesArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): ModulesRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModulesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModulesRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: ModulesArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
