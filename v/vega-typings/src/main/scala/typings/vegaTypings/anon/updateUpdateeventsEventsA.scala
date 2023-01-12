package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecOnEventsMod.EventListener
import typings.vegaTypings.typesSpecOnEventsMod.Events
import typings.vegaTypings.typesSpecOnEventsMod.OnEvent
import typings.vegaTypings.typesSpecOnEventsMod.Update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  update :vega-typings.vega-typings/types/spec/on-events.Update} & {  events :vega-typings.vega-typings/types/spec/on-events.Events | std.Array<vega-typings.vega-typings/types/spec/on-events.EventListener>,   force :boolean | undefined} */
trait updateUpdateeventsEventsA
  extends StObject
     with OnEvent {
  
  var events: Events | js.Array[EventListener]
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var update: Update
}
object updateUpdateeventsEventsA {
  
  inline def apply(events: Events | js.Array[EventListener], update: Update): updateUpdateeventsEventsA = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[updateUpdateeventsEventsA]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: updateUpdateeventsEventsA] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: Events | js.Array[EventListener]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: EventListener*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setUpdate(value: Update): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
