package typings.yaireoTagify.mod

import typings.std.Event
import typings.std.HTMLElement
import typings.yaireoTagify.anon.NewValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Typing inside an edited tag.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait EditInputEventData[T /* <: BaseTagData */]
  extends StObject
     with TagEventData[T] {
  
  @JSName("data")
  var data_EditInputEventData: T & NewValue
  
  var event: Event
  
  @JSName("index")
  var index_EditInputEventData: Double
}
object EditInputEventData {
  
  inline def apply[T /* <: BaseTagData */](data: T & NewValue, event: Event, index: Double, tag: HTMLElement, tagify: Tagify[T]): EditInputEventData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditInputEventData[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditInputEventData[?], T /* <: BaseTagData */] (val x: Self & EditInputEventData[T]) extends AnyVal {
    
    inline def setData(value: T & NewValue): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
