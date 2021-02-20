package typings.vegaTypings.anon

import typings.vegaTypings.onEventsMod.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends StObject {
  
  var events: typings.vegaTypings.onEventsMod.Events | js.Array[EventListener] = js.native
  
  var force: js.UndefOr[Boolean] = js.native
}
object Events {
  
  @scala.inline
  def apply(events: typings.vegaTypings.onEventsMod.Events | js.Array[EventListener]): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: typings.vegaTypings.onEventsMod.Events | js.Array[EventListener]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: EventListener*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
