package typings.yaireoTagify.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tag is now in "edit mode".
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait EditStartEventData[T /* <: BaseTagData */]
  extends StObject
     with TagEventData[T] {
  
  @JSName("data")
  var data_EditStartEventData: T
  
  @JSName("index")
  var index_EditStartEventData: Double
  
  var isValid: Boolean
}
object EditStartEventData {
  
  inline def apply[T /* <: BaseTagData */](data: T, index: Double, isValid: Boolean, tag: HTMLElement, tagify: Tagify[T]): EditStartEventData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditStartEventData[T]]
  }
  
  extension [Self <: EditStartEventData[?], T /* <: BaseTagData */](x: Self & EditStartEventData[T]) {
    
    inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
  }
}
