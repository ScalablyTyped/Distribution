package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAboveNormal extends StObject {
  
  var enumValues: AboveNormal
}
object EnumValuesAboveNormal {
  
  inline def apply(enumValues: AboveNormal): EnumValuesAboveNormal = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAboveNormal]
  }
  
  extension [Self <: EnumValuesAboveNormal](x: Self) {
    
    inline def setEnumValues(value: AboveNormal): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
