package typings.yaireoTagify.mod

import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input event, when a tag is being typed / edited. The properties of the
  * event data depend on the `mode` setting of tagify.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
/* Rewritten from type alias, can be one of: 
  - typings.yaireoTagify.mod.InputEventDataNormal[T]
  - typings.yaireoTagify.mod.InputEventDataMix[T]
*/
trait InputEventData[T /* <: BaseTagData */] extends StObject
object InputEventData {
  
  inline def InputEventDataMix[T /* <: BaseTagData */](tagify: Tagify[T], textContent: String): typings.yaireoTagify.mod.InputEventDataMix[T] = {
    val __obj = js.Dynamic.literal(tagify = tagify.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yaireoTagify.mod.InputEventDataMix[T]]
  }
  
  inline def InputEventDataNormal[T /* <: BaseTagData */](
    inputElm: HTMLInputElement | HTMLTextAreaElement,
    isValid: Boolean | String,
    tagify: Tagify[T],
    value: String
  ): typings.yaireoTagify.mod.InputEventDataNormal[T] = {
    val __obj = js.Dynamic.literal(inputElm = inputElm.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], tagify = tagify.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.yaireoTagify.mod.InputEventDataNormal[T]]
  }
}
