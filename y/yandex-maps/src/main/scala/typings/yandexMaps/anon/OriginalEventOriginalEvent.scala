package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalEventOriginalEvent[OriginalEvent] extends StObject {
  
  var originalEvent: OriginalEvent
}
object OriginalEventOriginalEvent {
  
  inline def apply[OriginalEvent](originalEvent: OriginalEvent): OriginalEventOriginalEvent[OriginalEvent] = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventOriginalEvent[OriginalEvent]]
  }
  
  extension [Self <: OriginalEventOriginalEvent[?], OriginalEvent](x: Self & OriginalEventOriginalEvent[OriginalEvent]) {
    
    inline def setOriginalEvent(value: OriginalEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
