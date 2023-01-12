package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.cancelled
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response for a request. */
trait Response
  extends StObject
     with ProtocolMessage {
  
  /** Contains request result if success is true and error details if success is false. */
  var body: js.UndefOr[Any] = js.undefined
  
  /** The command requested. */
  var command: String
  
  /** Contains the raw error in short form if `success` is false.
  			This raw error might be interpreted by the client and is not shown in the UI.
  			Some predefined values exist.
  			Values: 
  			'cancelled': request was cancelled.
  			etc.
  		*/
  var message: js.UndefOr[cancelled | String] = js.undefined
  
  // type: 'response';
  /** Sequence number of the corresponding request. */
  var request_seq: Double
  
  /** Outcome of the request.
  			If true, the request was successful and the `body` attribute may contain the result of the request.
  			If the value is false, the attribute `message` contains the error in short form and the `body` may contain additional information (see `ErrorResponse.body.error`).
  		*/
  var success: Boolean
}
object Response {
  
  inline def apply(
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): Response = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: cancelled | String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRequest_seq(value: Double): Self = StObject.set(x, "request_seq", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
