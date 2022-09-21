package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** StepIn request; value of command field is 'stepIn'.
		The request resumes the given thread to step into a function/method and allows all other threads to run freely by resuming them.
		If the debug adapter supports single thread execution (see capability `supportsSingleThreadExecutionRequests`), setting the `singleThread` argument to true prevents other suspended threads from resuming.
		If the request cannot step into a target, `stepIn` behaves like the `next` request.
		The debug adapter first sends the response and then a `stopped` event (with reason `step`) after the step has completed.
		If there are multiple function/method calls (or other targets) on the source line,
		the argument `targetId` can be used to control into which target the `stepIn` should occur.
		The list of possible targets for a given source line can be retrieved via the `stepInTargets` request.
	*/
trait StepInRequest
  extends StObject
     with Request {
  
  // command: 'stepIn';
  @JSName("arguments")
  var arguments_StepInRequest: StepInArguments
}
object StepInRequest {
  
  inline def apply(
    arguments: StepInArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): StepInRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepInRequest]
  }
  
  extension [Self <: StepInRequest](x: Self) {
    
    inline def setArguments(value: StepInArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
