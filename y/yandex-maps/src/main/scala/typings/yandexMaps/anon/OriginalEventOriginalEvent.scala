package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginalEventOriginalEvent[OriginalEvent] extends StObject {
  
  var originalEvent: OriginalEvent = js.native
}
object OriginalEventOriginalEvent {
  
  @scala.inline
  def apply[OriginalEvent](originalEvent: OriginalEvent): OriginalEventOriginalEvent[OriginalEvent] = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalEventOriginalEvent[OriginalEvent]]
  }
  
  @scala.inline
  implicit class OriginalEventOriginalEventMutableBuilder[Self <: OriginalEventOriginalEvent[_], OriginalEvent] (val x: Self with OriginalEventOriginalEvent[OriginalEvent]) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: OriginalEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
