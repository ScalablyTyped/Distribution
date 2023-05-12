package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Cancel request; value of command field is 'cancel'.
		The `cancel` request is used by the client in two situations:
		- to indicate that it is no longer interested in the result produced by a specific request issued earlier
		- to cancel a progress sequence. Clients should only call this request if the corresponding capability `supportsCancelRequest` is true.
		This request has a hint characteristic: a debug adapter can only be expected to make a 'best effort' in honoring this request but there are no guarantees.
		The `cancel` request may return an error if it could not cancel an operation but a client should refrain from presenting this error to end users.
		The request that got cancelled still needs to send a response back. This can either be a normal result (`success` attribute true) or an error response (`success` attribute false and the `message` set to `cancelled`).
		Returning partial results from a cancelled request is possible but please note that a client has no generic way for detecting that a response is partial or not.
		The progress that got cancelled still needs to send a `progressEnd` event back.
		 A client should not assume that progress just got cancelled after sending the `cancel` request.
	*/
trait CancelRequest
  extends StObject
     with Request {
  
  // command: 'cancel';
  @JSName("arguments")
  var arguments_CancelRequest: js.UndefOr[CancelArguments] = js.undefined
}
object CancelRequest {
  
  inline def apply(command: String, seq: Double, `type`: request | response | event | String): CancelRequest = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: CancelArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
  }
}
