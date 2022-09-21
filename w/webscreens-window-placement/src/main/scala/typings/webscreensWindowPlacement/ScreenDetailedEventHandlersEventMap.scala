package typings.webscreensWindowPlacement

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenDetailedEventHandlersEventMap extends StObject {
  
  var change: Event
}
object ScreenDetailedEventHandlersEventMap {
  
  inline def apply(change: Event): ScreenDetailedEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenDetailedEventHandlersEventMap]
  }
  
  extension [Self <: ScreenDetailedEventHandlersEventMap](x: Self) {
    
    inline def setChange(value: Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
