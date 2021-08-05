package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBase64Encoded extends StObject {
  
  var enumValues: Base64Encoded
}
object EnumValuesBase64Encoded {
  
  inline def apply(enumValues: Base64Encoded): EnumValuesBase64Encoded = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBase64Encoded]
  }
  
  extension [Self <: EnumValuesBase64Encoded](x: Self) {
    
    inline def setEnumValues(value: Base64Encoded): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
