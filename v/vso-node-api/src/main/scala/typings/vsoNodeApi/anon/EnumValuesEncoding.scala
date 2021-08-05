package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesEncoding extends StObject {
  
  var enumValues: Encoding
}
object EnumValuesEncoding {
  
  inline def apply(enumValues: Encoding): EnumValuesEncoding = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesEncoding]
  }
  
  extension [Self <: EnumValuesEncoding](x: Self) {
    
    inline def setEnumValues(value: Encoding): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
