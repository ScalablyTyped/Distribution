package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tells the percentage scrolled. (`event.detail.percentage`).
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait DropDownScrollEventData[T /* <: BaseTagData */]
  extends StObject
     with EventData[T] {
  
  var percentage: Double
}
object DropDownScrollEventData {
  
  inline def apply[T /* <: BaseTagData */](percentage: Double, tagify: Tagify[T]): DropDownScrollEventData[T] = {
    val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropDownScrollEventData[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DropDownScrollEventData[?], T /* <: BaseTagData */] (val x: Self & DropDownScrollEventData[T]) extends AnyVal {
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
  }
}
