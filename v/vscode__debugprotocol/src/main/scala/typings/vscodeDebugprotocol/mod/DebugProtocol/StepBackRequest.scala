package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** StepBack request; value of command field is 'stepBack'.
		The request executes one backward step (in the given granularity) for the specified thread and allows all other threads to run backward freely by resuming them.
		If the debug adapter supports single thread execution (see capability `supportsSingleThreadExecutionRequests`), setting the `singleThread` argument to true prevents other suspended threads from resuming.
		The debug adapter first sends the response and then a `stopped` event (with reason `step`) after the step has completed.
		Clients should only call this request if the corresponding capability `supportsStepBack` is true.
	*/
trait StepBackRequest
  extends StObject
     with Request {
  
  // command: 'stepBack';
  @JSName("arguments")
  var arguments_StepBackRequest: StepBackArguments
}
object StepBackRequest {
  
  inline def apply(
    arguments: StepBackArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): StepBackRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepBackRequest]
  }
  
  extension [Self <: StepBackRequest](x: Self) {
    
    inline def setArguments(value: StepBackArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
