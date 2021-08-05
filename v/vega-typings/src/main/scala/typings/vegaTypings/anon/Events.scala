package typings.vegaTypings.anon

import typings.vegaTypings.onEventsMod.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var events: typings.vegaTypings.onEventsMod.Events | js.Array[EventListener]
  
  var force: js.UndefOr[Boolean] = js.undefined
}
object Events {
  
  inline def apply(events: typings.vegaTypings.onEventsMod.Events | js.Array[EventListener]): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  extension [Self <: Events](x: Self) {
    
    inline def setEvents(value: typings.vegaTypings.onEventsMod.Events | js.Array[EventListener]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: EventListener*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
