package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'module' event type.
		The event indicates that some information about a module has changed.
	*/
trait ModuleEvent
  extends StObject
     with Event {
  
  // event: 'module';
  @JSName("body")
  var body_ModuleEvent: typings.vscodeDebugprotocol.anon.Module
}
object ModuleEvent {
  
  inline def apply(
    body: typings.vscodeDebugprotocol.anon.Module,
    event: String,
    seq: Double,
    `type`: request | response | event | String
  ): ModuleEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleEvent]
  }
  
  extension [Self <: ModuleEvent](x: Self) {
    
    inline def setBody(value: typings.vscodeDebugprotocol.anon.Module): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
