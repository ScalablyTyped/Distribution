package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesRemove extends StObject {
  
  var enumValues: Remove
}
object EnumValuesRemove {
  
  inline def apply(enumValues: Remove): EnumValuesRemove = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesRemove]
  }
  
  extension [Self <: EnumValuesRemove](x: Self) {
    
    inline def setEnumValues(value: Remove): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
