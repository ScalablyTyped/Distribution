package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'breakpoint' event type.
		The event indicates that some information about a breakpoint has changed.
	*/
trait BreakpointEvent
  extends StObject
     with Event {
  
  // event: 'breakpoint';
  @JSName("body")
  var body_BreakpointEvent: typings.vscodeDebugprotocol.anon.Breakpoint
}
object BreakpointEvent {
  
  inline def apply(
    body: typings.vscodeDebugprotocol.anon.Breakpoint,
    event: String,
    seq: Double,
    `type`: request | response | event | String
  ): BreakpointEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreakpointEvent] (val x: Self) extends AnyVal {
    
    inline def setBody(value: typings.vscodeDebugprotocol.anon.Breakpoint): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
