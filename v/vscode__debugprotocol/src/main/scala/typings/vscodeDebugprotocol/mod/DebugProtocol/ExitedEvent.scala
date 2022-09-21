package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.anon.ExitCode
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'exited' event type.
		The event indicates that the debuggee has exited and returns its exit code.
	*/
trait ExitedEvent
  extends StObject
     with Event {
  
  // event: 'exited';
  @JSName("body")
  var body_ExitedEvent: ExitCode
}
object ExitedEvent {
  
  inline def apply(body: ExitCode, event: String, seq: Double, `type`: request | response | event | String): ExitedEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitedEvent]
  }
  
  extension [Self <: ExitedEvent](x: Self) {
    
    inline def setBody(value: ExitCode): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
