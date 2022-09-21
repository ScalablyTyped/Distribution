package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.Content
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response to `source` request. */
trait SourceResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_SourceResponse: Content
}
object SourceResponse {
  
  inline def apply(
    body: Content,
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): SourceResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceResponse]
  }
  
  extension [Self <: SourceResponse](x: Self) {
    
    inline def setBody(value: Content): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
