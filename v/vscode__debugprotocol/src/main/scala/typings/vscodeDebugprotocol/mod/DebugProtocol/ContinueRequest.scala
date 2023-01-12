package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Continue request; value of command field is 'continue'.
		The request resumes execution of all threads. If the debug adapter supports single thread execution (see capability `supportsSingleThreadExecutionRequests`), setting the `singleThread` argument to true resumes only the specified thread. If not all threads were resumed, the `allThreadsContinued` attribute of the response should be set to false.
	*/
trait ContinueRequest
  extends StObject
     with Request {
  
  // command: 'continue';
  @JSName("arguments")
  var arguments_ContinueRequest: ContinueArguments
}
object ContinueRequest {
  
  inline def apply(
    arguments: ContinueArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): ContinueRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinueRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: ContinueArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
