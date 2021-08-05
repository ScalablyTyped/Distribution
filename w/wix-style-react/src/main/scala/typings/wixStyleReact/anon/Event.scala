package typings.wixStyleReact.anon

import typings.react.mod.SyntheticEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: SyntheticEvent[Element, typings.std.Event]
  
  var page: Double
}
object Event {
  
  inline def apply(event: SyntheticEvent[Element, typings.std.Event], page: Double): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEvent(value: SyntheticEvent[Element, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
  }
}
