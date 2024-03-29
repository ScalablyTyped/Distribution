package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.Scopes
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response to `scopes` request. */
trait ScopesResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_ScopesResponse: Scopes
}
object ScopesResponse {
  
  inline def apply(
    body: Scopes,
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): ScopesResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScopesResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Scopes): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
