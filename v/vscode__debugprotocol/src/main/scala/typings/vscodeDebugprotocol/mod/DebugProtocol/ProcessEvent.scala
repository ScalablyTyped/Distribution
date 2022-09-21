package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.IsLocalProcess
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'process' event type.
		The event indicates that the debugger has begun debugging a new process. Either one that it has launched, or one that it has attached to.
	*/
trait ProcessEvent
  extends StObject
     with Event {
  
  // event: 'process';
  @JSName("body")
  var body_ProcessEvent: IsLocalProcess
}
object ProcessEvent {
  
  inline def apply(body: IsLocalProcess, event: String, seq: Double, `type`: request | response | event | String): ProcessEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessEvent]
  }
  
  extension [Self <: ProcessEvent](x: Self) {
    
    inline def setBody(value: IsLocalProcess): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
