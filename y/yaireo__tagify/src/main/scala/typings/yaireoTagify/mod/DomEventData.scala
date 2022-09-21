package typings.yaireoTagify.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event data for events triggered by DOM events.
  * @template T Type of the tag data. See the Tagify class for more details.
  * @template E Type of the original event wrapped by this event.
  */
trait DomEventData[T /* <: BaseTagData */, E /* <: Event */]
  extends StObject
     with EventData[T] {
  
  var event: E
}
object DomEventData {
  
  inline def apply[T /* <: BaseTagData */, E /* <: Event */](event: E, tagify: Tagify[T]): DomEventData[T, E] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEventData[T, E]]
  }
  
  extension [Self <: DomEventData[?, ?], T /* <: BaseTagData */, E /* <: Event */](x: Self & (DomEventData[T, E])) {
    
    inline def setEvent(value: E): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
