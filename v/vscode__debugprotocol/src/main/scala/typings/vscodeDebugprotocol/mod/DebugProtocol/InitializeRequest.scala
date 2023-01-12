package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Initialize request; value of command field is 'initialize'.
		The `initialize` request is sent as the first request from the client to the debug adapter in order to configure it with client capabilities and to retrieve capabilities from the debug adapter.
		Until the debug adapter has responded with an `initialize` response, the client must not send any additional requests or events to the debug adapter.
		In addition the debug adapter is not allowed to send any requests or events to the client until it has responded with an `initialize` response.
		The `initialize` request may only be sent once.
	*/
trait InitializeRequest
  extends StObject
     with Request {
  
  // command: 'initialize';
  @JSName("arguments")
  var arguments_InitializeRequest: InitializeRequestArguments
}
object InitializeRequest {
  
  inline def apply(
    arguments: InitializeRequestArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): InitializeRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitializeRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: InitializeRequestArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
