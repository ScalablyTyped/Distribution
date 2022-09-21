package typings.webscreensWindowPlacement

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenDetailsEventHandlersEventMap extends StObject {
  
  var currentscreenchange: Event
  
  var screenschange: Event
}
object ScreenDetailsEventHandlersEventMap {
  
  inline def apply(currentscreenchange: Event, screenschange: Event): ScreenDetailsEventHandlersEventMap = {
    val __obj = js.Dynamic.literal(currentscreenchange = currentscreenchange.asInstanceOf[js.Any], screenschange = screenschange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenDetailsEventHandlersEventMap]
  }
  
  extension [Self <: ScreenDetailsEventHandlersEventMap](x: Self) {
    
    inline def setCurrentscreenchange(value: Event): Self = StObject.set(x, "currentscreenchange", value.asInstanceOf[js.Any])
    
    inline def setScreenschange(value: Event): Self = StObject.set(x, "screenschange", value.asInstanceOf[js.Any])
  }
}
