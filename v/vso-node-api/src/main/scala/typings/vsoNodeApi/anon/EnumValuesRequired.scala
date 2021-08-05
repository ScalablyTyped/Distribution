package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesRequired extends StObject {
  
  var enumValues: Required
}
object EnumValuesRequired {
  
  inline def apply(enumValues: Required): EnumValuesRequired = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesRequired]
  }
  
  extension [Self <: EnumValuesRequired](x: Self) {
    
    inline def setEnumValues(value: Required): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
