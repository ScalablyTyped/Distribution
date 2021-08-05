package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAssigned extends StObject {
  
  var enumValues: Assigned
}
object EnumValuesAssigned {
  
  inline def apply(enumValues: Assigned): EnumValuesAssigned = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAssigned]
  }
  
  extension [Self <: EnumValuesAssigned](x: Self) {
    
    inline def setEnumValues(value: Assigned): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
