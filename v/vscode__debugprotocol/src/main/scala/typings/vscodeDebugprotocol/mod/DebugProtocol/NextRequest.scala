package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Next request; value of command field is 'next'.
		The request executes one step (in the given granularity) for the specified thread and allows all other threads to run freely by resuming them.
		If the debug adapter supports single thread execution (see capability `supportsSingleThreadExecutionRequests`), setting the `singleThread` argument to true prevents other suspended threads from resuming.
		The debug adapter first sends the response and then a `stopped` event (with reason `step`) after the step has completed.
	*/
trait NextRequest
  extends StObject
     with Request {
  
  // command: 'next';
  @JSName("arguments")
  var arguments_NextRequest: NextArguments
}
object NextRequest {
  
  inline def apply(
    arguments: NextArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): NextRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NextRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: NextArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
