package typings.yaireoTagify.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data passed with suggestionClick hook {@link Hooks.suggestionClick}.
  * @template T Type of the tag data. See the Tagify class for more details.
  */
trait SuggestionClickData[T /* <: BaseTagData */] extends StObject {
  
  /**
    * Element of selected suggestion item.
    */
  var suggestionElm: HTMLElement | Null
  
  /**
    * Data of selected suggestion item.
    */
  var tagData: T | Null
  
  /**
    * Tagify instance.
    */
  var tagify: Tagify[T]
}
object SuggestionClickData {
  
  inline def apply[T /* <: BaseTagData */](tagify: Tagify[T]): SuggestionClickData[T] = {
    val __obj = js.Dynamic.literal(tagify = tagify.asInstanceOf[js.Any], suggestionElm = null, tagData = null)
    __obj.asInstanceOf[SuggestionClickData[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestionClickData[?], T /* <: BaseTagData */] (val x: Self & SuggestionClickData[T]) extends AnyVal {
    
    inline def setSuggestionElm(value: HTMLElement): Self = StObject.set(x, "suggestionElm", value.asInstanceOf[js.Any])
    
    inline def setSuggestionElmNull: Self = StObject.set(x, "suggestionElm", null)
    
    inline def setTagData(value: T): Self = StObject.set(x, "tagData", value.asInstanceOf[js.Any])
    
    inline def setTagDataNull: Self = StObject.set(x, "tagData", null)
    
    inline def setTagify(value: Tagify[T]): Self = StObject.set(x, "tagify", value.asInstanceOf[js.Any])
  }
}
