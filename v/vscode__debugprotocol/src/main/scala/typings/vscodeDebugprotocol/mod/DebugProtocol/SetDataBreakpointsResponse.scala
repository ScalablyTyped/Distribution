package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.BreakpointsArray
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response to `setDataBreakpoints` request.
		Returned is information about each breakpoint created by this request.
	*/
trait SetDataBreakpointsResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_SetDataBreakpointsResponse: BreakpointsArray
}
object SetDataBreakpointsResponse {
  
  inline def apply(
    body: BreakpointsArray,
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): SetDataBreakpointsResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDataBreakpointsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetDataBreakpointsResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: BreakpointsArray): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
