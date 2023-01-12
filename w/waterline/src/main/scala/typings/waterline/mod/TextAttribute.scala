package typings.waterline.mod

import typings.waterline.waterlineStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAttribute
  extends StObject
     with BaseAttribute[String] {
  
  @JSName("type")
  var type_TextAttribute: text
}
object TextAttribute {
  
  inline def apply(): TextAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("text")
    __obj.asInstanceOf[TextAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextAttribute] (val x: Self) extends AnyVal {
    
    inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
