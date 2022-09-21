package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Terminate request; value of command field is 'terminate'.
		The `terminate` request is sent from the client to the debug adapter in order to shut down the debuggee gracefully. Clients should only call this request if the capability `supportsTerminateRequest` is true.
		Typically a debug adapter implements `terminate` by sending a software signal which the debuggee intercepts in order to clean things up properly before terminating itself.
		Please note that this request does not directly affect the state of the debug session: if the debuggee decides to veto the graceful shutdown for any reason by not terminating itself, then the debug session just continues.
		Clients can surface the `terminate` request as an explicit command or they can integrate it into a two stage Stop command that first sends `terminate` to request a graceful shutdown, and if that fails uses `disconnect` for a forceful shutdown.
	*/
trait TerminateRequest
  extends StObject
     with Request {
  
  // command: 'terminate';
  @JSName("arguments")
  var arguments_TerminateRequest: js.UndefOr[TerminateArguments] = js.undefined
}
object TerminateRequest {
  
  inline def apply(command: String, seq: Double, `type`: request | response | event | String): TerminateRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateRequest]
  }
  
  extension [Self <: TerminateRequest](x: Self) {
    
    inline def setArguments(value: TerminateArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
  }
}
