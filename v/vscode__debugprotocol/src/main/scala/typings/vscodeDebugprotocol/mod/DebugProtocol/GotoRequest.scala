package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Goto request; value of command field is 'goto'.
		The request sets the location where the debuggee will continue to run.
		This makes it possible to skip the execution of code or to execute code again.
		The code between the current location and the goto target is not executed but skipped.
		The debug adapter first sends the response and then a `stopped` event with reason `goto`.
		Clients should only call this request if the corresponding capability `supportsGotoTargetsRequest` is true (because only then goto targets exist that can be passed as arguments).
	*/
trait GotoRequest
  extends StObject
     with Request {
  
  // command: 'goto';
  @JSName("arguments")
  var arguments_GotoRequest: GotoArguments
}
object GotoRequest {
  
  inline def apply(
    arguments: GotoArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): GotoRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotoRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GotoRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: GotoArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
