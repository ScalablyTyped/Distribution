package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** TerminateThreads request; value of command field is 'terminateThreads'.
		The request terminates the threads with the given ids.
		Clients should only call this request if the corresponding capability `supportsTerminateThreadsRequest` is true.
	*/
trait TerminateThreadsRequest
  extends StObject
     with Request {
  
  // command: 'terminateThreads';
  @JSName("arguments")
  var arguments_TerminateThreadsRequest: TerminateThreadsArguments
}
object TerminateThreadsRequest {
  
  inline def apply(
    arguments: TerminateThreadsArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): TerminateThreadsRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateThreadsRequest]
  }
  
  extension [Self <: TerminateThreadsRequest](x: Self) {
    
    inline def setArguments(value: TerminateThreadsArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
