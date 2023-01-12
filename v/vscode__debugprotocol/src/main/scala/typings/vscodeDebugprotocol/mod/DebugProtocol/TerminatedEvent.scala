package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.Restart
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'terminated' event type.
		The event indicates that debugging of the debuggee has terminated. This does **not** mean that the debuggee itself has exited.
	*/
trait TerminatedEvent
  extends StObject
     with Event {
  
  // event: 'terminated';
  @JSName("body")
  var body_TerminatedEvent: js.UndefOr[Restart] = js.undefined
}
object TerminatedEvent {
  
  inline def apply(event: String, seq: Double, `type`: request | response | event | String): TerminatedEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminatedEvent] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Restart): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
