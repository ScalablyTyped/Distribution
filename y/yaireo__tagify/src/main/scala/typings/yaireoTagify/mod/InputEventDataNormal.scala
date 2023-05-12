package typings.yaireoTagify.mod

import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input event, when the tagify `mode` setting is set to anything other than
  * `mix`. Occurs when a tag is being typed / edited.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait InputEventDataNormal[T /* <: BaseTagData */]
  extends StObject
     with EventData[T]
     with InputEventData[T] {
  
  /**
    * The input or textarea element with the tagify widget.
    */
  var inputElm: HTMLInputElement | HTMLTextAreaElement
  
  /**
    * "true" if validation has passed, a string with the validation error
    * when validation has failed. The validation error is either one of the
    * built-in error codes or the value as returned by the custom
    * {@link TagifySettings.validate} function. The built-in error codes
    * are currently as follows:
    * - "not allowed"
    * - "already exists"
    * - "pattern mismatch"
    * - "number of tags exceeded"
    * - "empty"
    */
  var isValid: Boolean | String
  
  var value: String
}
object InputEventDataNormal {
  
  inline def apply[T /* <: BaseTagData */](
    inputElm: HTMLInputElement | HTMLTextAreaElement,
    isValid: Boolean | String,
    tagify: Tagify[T],
    value: String
  ): InputEventDataNormal[T] = {
    val __obj = js.Dynamic.literal(inputElm = inputElm.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEventDataNormal[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputEventDataNormal[?], T /* <: BaseTagData */] (val x: Self & InputEventDataNormal[T]) extends AnyVal {
    
    inline def setInputElm(value: HTMLInputElement | HTMLTextAreaElement): Self = StObject.set(x, "inputElm", value.asInstanceOf[js.Any])
    
    inline def setIsValid(value: Boolean | String): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
