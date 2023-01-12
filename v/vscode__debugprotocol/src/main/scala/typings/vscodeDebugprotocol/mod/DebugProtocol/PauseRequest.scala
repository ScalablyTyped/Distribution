package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Pause request; value of command field is 'pause'.
		The request suspends the debuggee.
		The debug adapter first sends the response and then a `stopped` event (with reason `pause`) after the thread has been paused successfully.
	*/
trait PauseRequest
  extends StObject
     with Request {
  
  // command: 'pause';
  @JSName("arguments")
  var arguments_PauseRequest: PauseArguments
}
object PauseRequest {
  
  inline def apply(
    arguments: PauseArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): PauseRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PauseRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: PauseArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
