package typings.yaireoTagify.mod

import typings.std.HTMLDivElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Suggestions dropdown item selected (by mouse / keyboard/ touch).
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait DropDownSelectEventData[T /* <: BaseTagData */]
  extends StObject
     with EventData[T] {
  
  var data: T
  
  var elm: HTMLDivElement
  
  var event: MouseEvent | js.Object
}
object DropDownSelectEventData {
  
  inline def apply[T /* <: BaseTagData */](data: T, elm: HTMLDivElement, event: MouseEvent | js.Object, tagify: Tagify[T]): DropDownSelectEventData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], elm = elm.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownSelectEventData[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropDownSelectEventData[?], T /* <: BaseTagData */] (val x: Self & DropDownSelectEventData[T]) extends AnyVal {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setElm(value: HTMLDivElement): Self = StObject.set(x, "elm", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: MouseEvent | js.Object): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
