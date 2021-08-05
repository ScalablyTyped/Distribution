package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesSystem extends StObject {
  
  var enumValues: System
}
object EnumValuesSystem {
  
  inline def apply(enumValues: System): EnumValuesSystem = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesSystem]
  }
  
  extension [Self <: EnumValuesSystem](x: Self) {
    
    inline def setEnumValues(value: System): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
