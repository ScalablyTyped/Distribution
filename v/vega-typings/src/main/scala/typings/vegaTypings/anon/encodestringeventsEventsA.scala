package typings.vegaTypings.anon

import typings.vegaTypings.onEventsMod.EventListener
import typings.vegaTypings.onEventsMod.Events
import typings.vegaTypings.onEventsMod.OnEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  encode :string} & {  events :vega-typings.vega-typings/types/spec/on-events.Events | std.Array<vega-typings.vega-typings/types/spec/on-events.EventListener>,   force :boolean | undefined} */
trait encodestringeventsEventsA
  extends StObject
     with OnEvent {
  
  var encode: String
  
  var events: Events | js.Array[EventListener]
  
  var force: js.UndefOr[Boolean] = js.undefined
}
object encodestringeventsEventsA {
  
  inline def apply(encode: String, events: Events | js.Array[EventListener]): encodestringeventsEventsA = {
    val __obj = js.Dynamic.literal(encode = encode.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[encodestringeventsEventsA]
  }
  
  extension [Self <: encodestringeventsEventsA](x: Self) {
    
    inline def setEncode(value: String): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: Events | js.Array[EventListener]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: EventListener*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
