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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginalEventOriginalEvent[?], OriginalEvent] (val x: Self & OriginalEventOriginalEvent[OriginalEvent]) extends AnyVal {
    
    inline def setOriginalEvent(value: OriginalEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
