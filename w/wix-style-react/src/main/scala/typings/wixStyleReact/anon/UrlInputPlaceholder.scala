package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlInputPlaceholder extends StObject {
  
  var textInputPlaceholder: js.UndefOr[String] = js.undefined
  
  var urlInputPlaceholder: js.UndefOr[String] = js.undefined
}
object UrlInputPlaceholder {
  
  inline def apply(): UrlInputPlaceholder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlInputPlaceholder]
  }
  
  extension [Self <: UrlInputPlaceholder](x: Self) {
    
    inline def setTextInputPlaceholder(value: String): Self = StObject.set(x, "textInputPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setTextInputPlaceholderUndefined: Self = StObject.set(x, "textInputPlaceholder", js.undefined)
    
    inline def setUrlInputPlaceholder(value: String): Self = StObject.set(x, "urlInputPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setUrlInputPlaceholderUndefined: Self = StObject.set(x, "urlInputPlaceholder", js.undefined)
  }
}
