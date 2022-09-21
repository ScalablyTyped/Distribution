package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ExceptionInfo request; value of command field is 'exceptionInfo'.
		Retrieves the details of the exception that caused this event to be raised.
		Clients should only call this request if the corresponding capability `supportsExceptionInfoRequest` is true.
	*/
trait ExceptionInfoRequest
  extends StObject
     with Request {
  
  // command: 'exceptionInfo';
  @JSName("arguments")
  var arguments_ExceptionInfoRequest: ExceptionInfoArguments
}
object ExceptionInfoRequest {
  
  inline def apply(
    arguments: ExceptionInfoArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): ExceptionInfoRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionInfoRequest]
  }
  
  extension [Self <: ExceptionInfoRequest](x: Self) {
    
    inline def setArguments(value: ExceptionInfoArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
