package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputPlaceholder extends StObject {
  
  var textInputPlaceholder: js.UndefOr[String] = js.undefined
  
  var urlInputPlaceholder: js.UndefOr[String] = js.undefined
}
object TextInputPlaceholder {
  
  @scala.inline
  def apply(): TextInputPlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInputPlaceholder]
  }
  
  @scala.inline
  implicit class TextInputPlaceholderMutableBuilder[Self <: TextInputPlaceholder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextInputPlaceholder(value: String): Self = StObject.set(x, "textInputPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextInputPlaceholderUndefined: Self = StObject.set(x, "textInputPlaceholder", js.undefined)
    
    @scala.inline
    def setUrlInputPlaceholder(value: String): Self = StObject.set(x, "urlInputPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlInputPlaceholderUndefined: Self = StObject.set(x, "urlInputPlaceholder", js.undefined)
  }
}
