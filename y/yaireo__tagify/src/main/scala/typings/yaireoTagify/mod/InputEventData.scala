package typings.yaireoTagify.mod

import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input event, when a tag is being typed / edited.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait InputEventData[T /* <: BaseTagData */]
  extends StObject
     with EventData[T] {
  
  var inputElm: HTMLInputElement | HTMLTextAreaElement
  
  var value: String
}
object InputEventData {
  
  inline def apply[T /* <: BaseTagData */](inputElm: HTMLInputElement | HTMLTextAreaElement, tagify: Tagify[T], value: String): InputEventData[T] = {
    val __obj = js.Dynamic.literal(inputElm = inputElm.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEventData[T]]
  }
  
  extension [Self <: InputEventData[?], T /* <: BaseTagData */](x: Self & InputEventData[T]) {
    
    inline def setInputElm(value: HTMLInputElement | HTMLTextAreaElement): Self = StObject.set(x, "inputElm", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
