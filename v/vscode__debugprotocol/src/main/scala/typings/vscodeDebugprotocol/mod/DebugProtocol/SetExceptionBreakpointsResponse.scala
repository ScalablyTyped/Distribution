package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.`0`
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Response to `setExceptionBreakpoints` request.
		The response contains an array of `Breakpoint` objects with information about each exception breakpoint or filter. The `Breakpoint` objects are in the same order as the elements of the `filters`, `filterOptions`, `exceptionOptions` arrays given as arguments. If both `filters` and `filterOptions` are given, the returned array must start with `filters` information first, followed by `filterOptions` information.
		The `verified` property of a `Breakpoint` object signals whether the exception breakpoint or filter could be successfully created and whether the condition or hit count expressions are valid. In case of an error the `message` property explains the problem. The `id` property can be used to introduce a unique ID for the exception breakpoint or filter so that it can be updated subsequently by sending breakpoint events.
		For backward compatibility both the `breakpoints` array and the enclosing `body` are optional. If these elements are missing a client is not able to show problems for individual exception breakpoints or filters.
	*/
trait SetExceptionBreakpointsResponse
  extends StObject
     with Response {
  
  @JSName("body")
  var body_SetExceptionBreakpointsResponse: js.UndefOr[`0`] = js.undefined
}
object SetExceptionBreakpointsResponse {
  
  inline def apply(
    command: String,
    request_seq: Double,
    seq: Double,
    success: Boolean,
    `type`: request | response | event | String
  ): SetExceptionBreakpointsResponse = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], request_seq = request_seq.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetExceptionBreakpointsResponse]
  }
  
  extension [Self <: SetExceptionBreakpointsResponse](x: Self) {
    
    inline def setBody(value: `0`): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
