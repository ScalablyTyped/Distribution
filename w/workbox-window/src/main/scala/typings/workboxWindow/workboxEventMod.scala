package typings.workboxWindow

import typings.std.Event
import typings.workboxWindow.workboxMod.Workbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workboxEventMod {
  
  trait WorkboxEvent extends StObject {
    
    val originalEvent: Event
    
    val target: Workbox
    
    val `type`: String
  }
  object WorkboxEvent {
    
    inline def apply(originalEvent: Event, target: Workbox, `type`: String): WorkboxEvent = {
      val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkboxEvent]
    }
    
    extension [Self <: WorkboxEvent](x: Self) {
      
      inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Workbox): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
