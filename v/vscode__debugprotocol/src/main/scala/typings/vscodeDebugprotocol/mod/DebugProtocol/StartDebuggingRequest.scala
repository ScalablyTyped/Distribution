package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** StartDebugging request; value of command field is 'startDebugging'.
		This request is sent from the debug adapter to the client to start a new debug session of the same type as the caller.
		This request should only be sent if the corresponding client capability `supportsStartDebuggingRequest` is true.
		A client implementation of `startDebugging` should start a new debug session (of the same type as the caller) in the same way that the caller's session was started. If the client supports hierarchical debug sessions, the newly created session can be treated as a child of the caller session.
	*/
trait StartDebuggingRequest
  extends StObject
     with Request {
  
  // command: 'startDebugging';
  @JSName("arguments")
  var arguments_StartDebuggingRequest: StartDebuggingRequestArguments
}
object StartDebuggingRequest {
  
  inline def apply(
    arguments: StartDebuggingRequestArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): StartDebuggingRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDebuggingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartDebuggingRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: StartDebuggingRequestArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
