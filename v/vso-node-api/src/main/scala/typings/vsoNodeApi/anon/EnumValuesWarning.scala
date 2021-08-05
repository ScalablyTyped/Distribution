package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesWarning extends StObject {
  
  var enumValues: Warning
}
object EnumValuesWarning {
  
  inline def apply(enumValues: Warning): EnumValuesWarning = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesWarning]
  }
  
  extension [Self <: EnumValuesWarning](x: Self) {
    
    inline def setEnumValues(value: Warning): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
