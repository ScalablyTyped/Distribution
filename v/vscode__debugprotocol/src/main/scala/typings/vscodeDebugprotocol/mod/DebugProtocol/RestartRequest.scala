package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Restart request; value of command field is 'restart'.
		Restarts a debug session. Clients should only call this request if the corresponding capability `supportsRestartRequest` is true.
		If the capability is missing or has the value false, a typical client emulates `restart` by terminating the debug adapter first and then launching it anew.
	*/
trait RestartRequest
  extends StObject
     with Request {
  
  // command: 'restart';
  @JSName("arguments")
  var arguments_RestartRequest: js.UndefOr[RestartArguments] = js.undefined
}
object RestartRequest {
  
  inline def apply(command: String, seq: Double, `type`: request | response | event | String): RestartRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestartRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestartRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: RestartArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
  }
}
