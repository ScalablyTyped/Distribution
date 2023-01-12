package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base event data common to all events.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait EventData[T /* <: BaseTagData */] extends StObject {
  
  /**
    * The tagify instance which triggered the event.
    */
  var tagify: Tagify[T]
}
object EventData {
  
  inline def apply[T /* <: BaseTagData */](tagify: Tagify[T]): EventData[T] = {
    val __obj = js.Dynamic.literal(tagify = tagify.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventData[?], T /* <: BaseTagData */] (val x: Self & EventData[T]) extends AnyVal {
    
    inline def setTagify(value: Tagify[T]): Self = StObject.set(x, "tagify", value.asInstanceOf[js.Any])
  }
}
