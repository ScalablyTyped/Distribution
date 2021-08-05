package typings.waterline.mod

import typings.waterline.waterlineStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringAttribute
  extends StObject
     with BaseAttribute[String]
     with _Attribute {
  
  @JSName("type")
  var type_StringAttribute: string
}
object StringAttribute {
  
  inline def apply(): StringAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[StringAttribute]
  }
  
  extension [Self <: StringAttribute](x: Self) {
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
