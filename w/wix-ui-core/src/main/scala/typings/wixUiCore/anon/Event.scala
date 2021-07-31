package typings.wixUiCore.anon

import typings.react.mod.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: SyntheticEvent[typings.std.Element, typings.std.Event]
  
  var page: Double
}
object Event {
  
  @scala.inline
  def apply(event: SyntheticEvent[typings.std.Element, typings.std.Event], page: Double): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: SyntheticEvent[typings.std.Element, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
