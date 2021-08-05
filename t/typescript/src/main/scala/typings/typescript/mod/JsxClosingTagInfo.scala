package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsxClosingTagInfo extends StObject {
  
  val newText: java.lang.String
}
object JsxClosingTagInfo {
  
  inline def apply(newText: java.lang.String): JsxClosingTagInfo = {
    val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsxClosingTagInfo]
  }
  
  extension [Self <: JsxClosingTagInfo](x: Self) {
    
    inline def setNewText(value: java.lang.String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
  }
}
