package typings.vegaTypings.anon

import typings.vegaTypings.onEventsMod.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends js.Object {
  
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
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventsVarargs(value: EventListener*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: typings.vegaTypings.onEventsMod.Events | js.Array[EventListener]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
  }
}
