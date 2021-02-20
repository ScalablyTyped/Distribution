package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event[TEvent /* <: EventObject */] extends StObject {
  
  var event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any = js.native
}
object Event {
  
  @scala.inline
  def apply[TEvent /* <: EventObject */](
    event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
  ): Event[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[TEvent]]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event[_], TEvent /* <: EventObject */] (val x: Self with Event[TEvent]) extends AnyVal {
    
    @scala.inline
    def setEvent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
