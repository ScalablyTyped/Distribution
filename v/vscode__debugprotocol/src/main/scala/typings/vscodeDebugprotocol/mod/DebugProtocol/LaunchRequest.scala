package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Launch request; value of command field is 'launch'.
		This launch request is sent from the client to the debug adapter to start the debuggee with or without debugging (if `noDebug` is true).
		Since launching is debugger/runtime specific, the arguments for this request are not part of this specification.
	*/
trait LaunchRequest
  extends StObject
     with Request {
  
  // command: 'launch';
  @JSName("arguments")
  var arguments_LaunchRequest: LaunchRequestArguments
}
object LaunchRequest {
  
  inline def apply(
    arguments: LaunchRequestArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): LaunchRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: LaunchRequestArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
