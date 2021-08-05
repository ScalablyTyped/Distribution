package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDefinitionNameAscending extends StObject {
  
  var enumValues: DefinitionNameAscending
}
object EnumValuesDefinitionNameAscending {
  
  inline def apply(enumValues: DefinitionNameAscending): EnumValuesDefinitionNameAscending = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDefinitionNameAscending]
  }
  
  extension [Self <: EnumValuesDefinitionNameAscending](x: Self) {
    
    inline def setEnumValues(value: DefinitionNameAscending): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
