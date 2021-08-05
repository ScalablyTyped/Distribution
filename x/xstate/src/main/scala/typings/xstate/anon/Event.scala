package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event[TEvent /* <: EventObject */] extends StObject {
  
  var event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
}
object Event {
  
  inline def apply[TEvent /* <: EventObject */](
    event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
  ): Event[TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[TEvent]]
  }
  
  extension [Self <: Event[?], TEvent /* <: EventObject */](x: Self & Event[TEvent]) {
    
    inline def setEvent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
    ): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
