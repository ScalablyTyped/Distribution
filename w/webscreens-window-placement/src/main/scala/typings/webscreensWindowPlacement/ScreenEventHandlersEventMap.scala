package typings.webscreensWindowPlacement

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenEventHandlersEventMap extends StObject {
  
  var change: Event
}
object ScreenEventHandlersEventMap {
  
  inline def apply(change: Event): ScreenEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenEventHandlersEventMap]
  }
  
  extension [Self <: ScreenEventHandlersEventMap](x: Self) {
    
    inline def setChange(value: Event): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
