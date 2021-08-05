package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDefinition extends StObject {
  
  var enumValues: Definition
}
object EnumValuesDefinition {
  
  inline def apply(enumValues: Definition): EnumValuesDefinition = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDefinition]
  }
  
  extension [Self <: EnumValuesDefinition](x: Self) {
    
    inline def setEnumValues(value: Definition): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
