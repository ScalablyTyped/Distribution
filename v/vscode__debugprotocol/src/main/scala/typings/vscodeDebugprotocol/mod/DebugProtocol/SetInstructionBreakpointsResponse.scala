package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.BreakpointsArray
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response to `setInstructionBreakpoints` request */
trait SetInstructionBreakpointsResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_SetInstructionBreakpointsResponse: BreakpointsArray
}
object SetInstructionBreakpointsResponse {
  
  inline def apply(
    body: BreakpointsArray,
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): SetInstructionBreakpointsResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstructionBreakpointsResponse]
  }
  
  extension [Self <: SetInstructionBreakpointsResponse](x: Self) {
    
    inline def setBody(value: BreakpointsArray): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
