package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'capabilities' event type.
		The event indicates that one or more capabilities have changed.
		Since the capabilities are dependent on the client and its UI, it might not be possible to change that at random times (or too late).
		Consequently this event has a hint characteristic: a client can only be expected to make a 'best effort' in honouring individual capabilities but there are no guarantees.
		Only changed capabilities need to be included, all other capabilities keep their values.
	*/
trait CapabilitiesEvent
  extends StObject
     with Event {
  
  // event: 'capabilities';
  @JSName("body")
  var body_CapabilitiesEvent: typings.vscodeDebugprotocol.anon.Capabilities
}
object CapabilitiesEvent {
  
  inline def apply(
    body: typings.vscodeDebugprotocol.anon.Capabilities,
    event: String,
    seq: Double,
    `type`: request | response | event | String
  ): CapabilitiesEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilitiesEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilitiesEvent] (val x: Self) extends AnyVal {
    
    inline def setBody(value: typings.vscodeDebugprotocol.anon.Capabilities): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
