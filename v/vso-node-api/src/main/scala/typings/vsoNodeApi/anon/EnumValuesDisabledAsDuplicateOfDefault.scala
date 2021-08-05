package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDisabledAsDuplicateOfDefault extends StObject {
  
  var enumValues: DisabledAsDuplicateOfDefault
}
object EnumValuesDisabledAsDuplicateOfDefault {
  
  inline def apply(enumValues: DisabledAsDuplicateOfDefault): EnumValuesDisabledAsDuplicateOfDefault = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDisabledAsDuplicateOfDefault]
  }
  
  extension [Self <: EnumValuesDisabledAsDuplicateOfDefault](x: Self) {
    
    inline def setEnumValues(value: DisabledAsDuplicateOfDefault): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
