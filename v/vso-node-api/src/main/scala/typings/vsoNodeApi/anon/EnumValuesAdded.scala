package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAdded extends StObject {
  
  var enumValues: Added
}
object EnumValuesAdded {
  
  inline def apply(enumValues: Added): EnumValuesAdded = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAdded]
  }
  
  extension [Self <: EnumValuesAdded](x: Self) {
    
    inline def setEnumValues(value: Added): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
