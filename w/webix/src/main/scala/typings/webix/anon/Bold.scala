package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bold extends StObject {
  
  var bold: String
  
  var italic: String
  
  var underline: String
}
object Bold {
  
  inline def apply(bold: String, italic: String, underline: String): Bold = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bold]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bold] (val x: Self) extends AnyVal {
    
    inline def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setItalic(value: String): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: String): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
  }
}
