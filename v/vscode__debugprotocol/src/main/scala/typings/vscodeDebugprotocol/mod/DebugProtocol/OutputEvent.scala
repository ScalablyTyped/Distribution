package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.Category
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'output' event type.
		The event indicates that the target has produced some output.
	*/
trait OutputEvent
  extends StObject
     with Event {
  
  // event: 'output';
  @JSName("body")
  var body_OutputEvent: Category
}
object OutputEvent {
  
  inline def apply(body: Category, event: String, seq: Double, `type`: request | response | event | String): OutputEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputEvent] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Category): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
