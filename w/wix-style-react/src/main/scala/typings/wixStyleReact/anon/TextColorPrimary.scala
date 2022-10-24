package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextColorPrimary extends StObject {
  
  var textColorPrimary: String
}
object TextColorPrimary {
  
  inline def apply(textColorPrimary: String): TextColorPrimary = {
    val __obj = js.Dynamic.literal(textColorPrimary = textColorPrimary.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColorPrimary]
  }
  
  extension [Self <: TextColorPrimary](x: Self) {
    
    inline def setTextColorPrimary(value: String): Self = StObject.set(x, "textColorPrimary", value.asInstanceOf[js.Any])
  }
}
