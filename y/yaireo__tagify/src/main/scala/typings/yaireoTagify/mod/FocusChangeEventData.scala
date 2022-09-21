package typings.yaireoTagify.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event data for when the element receives or loses focus.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait FocusChangeEventData[T /* <: BaseTagData */]
  extends StObject
     with EventData[T] {
  
  var relatedTarget: Element
}
object FocusChangeEventData {
  
  inline def apply[T /* <: BaseTagData */](relatedTarget: Element, tagify: Tagify[T]): FocusChangeEventData[T] = {
    val __obj = js.Dynamic.literal(relatedTarget = relatedTarget.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusChangeEventData[T]]
  }
  
  extension [Self <: FocusChangeEventData[?], T /* <: BaseTagData */](x: Self & FocusChangeEventData[T]) {
    
    inline def setRelatedTarget(value: Element): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
  }
}
