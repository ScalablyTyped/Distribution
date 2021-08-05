package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDefault extends StObject {
  
  var enumValues: Default
}
object EnumValuesDefault {
  
  inline def apply(enumValues: Default): EnumValuesDefault = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDefault]
  }
  
  extension [Self <: EnumValuesDefault](x: Self) {
    
    inline def setEnumValues(value: Default): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
