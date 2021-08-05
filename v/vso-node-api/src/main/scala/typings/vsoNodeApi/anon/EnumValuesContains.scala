package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesContains extends StObject {
  
  var enumValues: Contains
}
object EnumValuesContains {
  
  inline def apply(enumValues: Contains): EnumValuesContains = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesContains]
  }
  
  extension [Self <: EnumValuesContains](x: Self) {
    
    inline def setEnumValues(value: Contains): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
