package typings.waterline.mod

import typings.waterline.waterlineStrings.json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonAttribute
  extends StObject
     with BaseAttribute[Any]
     with _Attribute {
  
  @JSName("type")
  var type_JsonAttribute: json
}
object JsonAttribute {
  
  inline def apply(): JsonAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("json")
    __obj.asInstanceOf[JsonAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JsonAttribute] (val x: Self) extends AnyVal {
    
    inline def setType(value: json): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
