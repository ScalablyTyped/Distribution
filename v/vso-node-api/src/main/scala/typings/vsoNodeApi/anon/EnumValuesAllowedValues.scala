package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAllowedValues extends StObject {
  
  var enumValues: AllowedValues
}
object EnumValuesAllowedValues {
  
  inline def apply(enumValues: AllowedValues): EnumValuesAllowedValues = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAllowedValues]
  }
  
  extension [Self <: EnumValuesAllowedValues](x: Self) {
    
    inline def setEnumValues(value: AllowedValues): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
