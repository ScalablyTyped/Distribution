package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.ProgressId
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'progressEnd' event type.
		The event signals the end of the progress reporting with a final message.
		This event should only be sent if the corresponding capability `supportsProgressReporting` is true.
	*/
trait ProgressEndEvent
  extends StObject
     with Event {
  
  // event: 'progressEnd';
  @JSName("body")
  var body_ProgressEndEvent: ProgressId
}
object ProgressEndEvent {
  
  inline def apply(body: ProgressId, event: String, seq: Double, `type`: request | response | event | String): ProgressEndEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressEndEvent]
  }
  
  extension [Self <: ProgressEndEvent](x: Self) {
    
    inline def setBody(value: ProgressId): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
