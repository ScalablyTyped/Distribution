package typings.vscodeDebugprotocol.mod.DebugProtocol

import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.event
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.request
import typings.vscodeDebugprotocol.vscodeDebugprotocolStrings.response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event message for 'loadedSource' event type.
		The event indicates that some source has been added, changed, or removed from the set of all loaded sources.
	*/
trait LoadedSourceEvent
  extends StObject
     with Event {
  
  // event: 'loadedSource';
  @JSName("body")
  var body_LoadedSourceEvent: typings.vscodeDebugprotocol.anon.Source
}
object LoadedSourceEvent {
  
  inline def apply(
    body: typings.vscodeDebugprotocol.anon.Source,
    event: String,
    seq: Double,
    `type`: request | response | event | String
  ): LoadedSourceEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadedSourceEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoadedSourceEvent] (val x: Self) extends AnyVal {
    
    inline def setBody(value: typings.vscodeDebugprotocol.anon.Source): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
