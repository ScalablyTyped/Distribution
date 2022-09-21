package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ReverseContinue request; value of command field is 'reverseContinue'.
		The request resumes backward execution of all threads. If the debug adapter supports single thread execution (see capability `supportsSingleThreadExecutionRequests`), setting the `singleThread` argument to true resumes only the specified thread. If not all threads were resumed, the `allThreadsContinued` attribute of the response should be set to false.
		Clients should only call this request if the corresponding capability `supportsStepBack` is true.
	*/
trait ReverseContinueRequest
  extends StObject
     with Request {
  
  // command: 'reverseContinue';
  @JSName("arguments")
  var arguments_ReverseContinueRequest: ReverseContinueArguments
}
object ReverseContinueRequest {
  
  inline def apply(
    arguments: ReverseContinueArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): ReverseContinueRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReverseContinueRequest]
  }
  
  extension [Self <: ReverseContinueRequest](x: Self) {
    
    inline def setArguments(value: ReverseContinueArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
