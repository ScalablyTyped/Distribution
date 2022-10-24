package typings.wixStyleReact.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInputPlaceholder extends StObject {
  
  var textInputPlaceholder: Requireable[String]
  
  var urlInputPlaceholder: Requireable[String]
}
object TextInputPlaceholder {
  
  inline def apply(textInputPlaceholder: Requireable[String], urlInputPlaceholder: Requireable[String]): TextInputPlaceholder = {
    val __obj = js.Dynamic.literal(textInputPlaceholder = textInputPlaceholder.asInstanceOf[js.Any], urlInputPlaceholder = urlInputPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInputPlaceholder]
  }
  
  extension [Self <: TextInputPlaceholder](x: Self) {
    
    inline def setTextInputPlaceholder(value: Requireable[String]): Self = StObject.set(x, "textInputPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setUrlInputPlaceholder(value: Requireable[String]): Self = StObject.set(x, "urlInputPlaceholder", value.asInstanceOf[js.Any])
  }
}
