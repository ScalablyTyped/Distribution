package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** StackTrace request; value of command field is 'stackTrace'.
		The request returns a stacktrace from the current execution state of a given thread.
		A client can request all stack frames by omitting the startFrame and levels arguments. For performance-conscious clients and if the corresponding capability `supportsDelayedStackTraceLoading` is true, stack frames can be retrieved in a piecemeal way with the startFrame and levels arguments. The response of the stackTrace request may contain a totalFrames property that hints at the total number of frames in the stack. If a client needs this total number upfront, it can issue a request for a single (first) frame and depending on the value of totalFrames decide how to proceed. In any case a client should be prepared to receive fewer frames than requested, which is an indication that the end of the stack has been reached.
	*/
trait StackTraceRequest
  extends StObject
     with Request {
  
  // command: 'stackTrace';
  @JSName("arguments")
  var arguments_StackTraceRequest: StackTraceArguments
}
object StackTraceRequest {
  
  inline def apply(
    arguments: StackTraceArguments,
    command: String,
    seq: Double,
    `type`: request | response | event | String
  ): StackTraceRequest = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTraceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackTraceRequest] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: StackTraceArguments): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
  }
}
