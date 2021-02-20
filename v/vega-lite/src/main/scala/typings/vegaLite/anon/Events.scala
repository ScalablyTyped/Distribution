package typings.vegaLite.anon

import typings.vegaTypings.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Events extends StObject {
  
  var events: js.Array[Stream] = js.native
  
  var force: Boolean = js.native
  
  var update: String = js.native
}
object Events {
  
  @scala.inline
  def apply(events: js.Array[Stream], force: Boolean, update: String): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit class EventsMutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Array[Stream]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: Stream*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}
