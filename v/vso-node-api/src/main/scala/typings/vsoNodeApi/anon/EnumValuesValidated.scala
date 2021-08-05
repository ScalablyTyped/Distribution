package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesValidated extends StObject {
  
  var enumValues: Validated
}
object EnumValuesValidated {
  
  inline def apply(enumValues: Validated): EnumValuesValidated = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesValidated]
  }
  
  extension [Self <: EnumValuesValidated](x: Self) {
    
    inline def setEnumValues(value: Validated): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
