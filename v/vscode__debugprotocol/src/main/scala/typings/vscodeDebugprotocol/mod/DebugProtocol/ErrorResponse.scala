package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.Error
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** On error (whenever `success` is false), the body can provide more details. */
trait ErrorResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_ErrorResponse: Error
}
object ErrorResponse {
  
  inline def apply(
    body: Error,
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): ErrorResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
  
  extension [Self <: ErrorResponse](x: Self) {
    
    inline def setBody(value: Error): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
