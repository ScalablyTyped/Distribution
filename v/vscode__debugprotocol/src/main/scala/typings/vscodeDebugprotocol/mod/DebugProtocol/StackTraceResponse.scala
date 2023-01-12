package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.StackFrames
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response to `stackTrace` request. */
trait StackTraceResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_StackTraceResponse: StackFrames
}
object StackTraceResponse {
  
  inline def apply(
    body: StackFrames,
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): StackTraceResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTraceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackTraceResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: StackFrames): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
