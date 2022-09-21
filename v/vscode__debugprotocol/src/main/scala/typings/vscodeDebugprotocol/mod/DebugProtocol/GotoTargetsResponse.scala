package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.TargetsArray
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response to `gotoTargets` request. */
trait GotoTargetsResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_GotoTargetsResponse: TargetsArray
}
object GotoTargetsResponse {
  
  inline def apply(
    body: TargetsArray,
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): GotoTargetsResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GotoTargetsResponse]
  }
  
  extension [Self <: GotoTargetsResponse](x: Self) {
    
    inline def setBody(value: TargetsArray): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
