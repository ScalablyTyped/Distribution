package typings.waterline.mod

import typings.waterline.waterlineStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayAttribute
  extends StObject
     with BaseAttribute[Any]
     with _Attribute {
  
  @JSName("type")
  var type_ArrayAttribute: array
}
object ArrayAttribute {
  
  inline def apply(): ArrayAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[ArrayAttribute]
  }
  
  extension [Self <: ArrayAttribute](x: Self) {
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
