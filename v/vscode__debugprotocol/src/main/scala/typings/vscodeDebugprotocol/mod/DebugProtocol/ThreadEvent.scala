package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.Reason
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'thread' event type.
		The event indicates that a thread has started or exited.
	*/
trait ThreadEvent
  extends StObject
     with Event {
  
  // event: 'thread';
  @JSName("body")
  var body_ThreadEvent: Reason
}
object ThreadEvent {
  
  inline def apply(body: Reason, event: String, seq: Double, `type`: request | response | event | String): ThreadEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadEvent]
  }
  
  extension [Self <: ThreadEvent](x: Self) {
    
    inline def setBody(value: Reason): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
