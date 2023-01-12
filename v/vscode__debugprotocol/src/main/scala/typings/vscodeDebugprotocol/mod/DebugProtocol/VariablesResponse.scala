package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.Variables
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response to `variables` request. */
trait VariablesResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_VariablesResponse: Variables
}
object VariablesResponse {
  
  inline def apply(
    body: Variables,
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): VariablesResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariablesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariablesResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Variables): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
