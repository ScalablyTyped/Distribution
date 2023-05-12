package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input event, when the tagify `mode` setting is set to `mix`. Occurs when
  * a tag is being typed / edited.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait InputEventDataMix[T /* <: BaseTagData */]
  extends StObject
     with EventData[T]
     with InputEventData[T] {
  
  var textContent: String
}
object InputEventDataMix {
  
  inline def apply[T /* <: BaseTagData */](tagify: Tagify[T], textContent: String): InputEventDataMix[T] = {
    val __obj = js.Dynamic.literal(tagify = tagify.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEventDataMix[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputEventDataMix[?], T /* <: BaseTagData */] (val x: Self & InputEventDataMix[T]) extends AnyVal {
    
    inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
  }
}
