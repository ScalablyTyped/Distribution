package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.Areas
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'invalidated' event type.
		This event signals that some state in the debug adapter has changed and requires that the client needs to re-render the data snapshot previously requested.
		Debug adapters do not have to emit this event for runtime changes like stopped or thread events because in that case the client refetches the new state anyway. But the event can be used for example to refresh the UI after rendering formatting has changed in the debug adapter.
		This event should only be sent if the corresponding capability `supportsInvalidatedEvent` is true.
	*/
trait InvalidatedEvent
  extends StObject
     with Event {
  
  // event: 'invalidated';
  @JSName("body")
  var body_InvalidatedEvent: Areas
}
object InvalidatedEvent {
  
  inline def apply(body: Areas, event: String, seq: Double, `type`: request | response | event | String): InvalidatedEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InvalidatedEvent] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Areas): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
