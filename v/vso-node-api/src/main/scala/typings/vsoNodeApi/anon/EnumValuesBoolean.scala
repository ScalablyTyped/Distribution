package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBoolean extends StObject {
  
  var enumValues: Boolean
}
object EnumValuesBoolean {
  
  inline def apply(enumValues: Boolean): EnumValuesBoolean = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBoolean]
  }
  
  extension [Self <: EnumValuesBoolean](x: Self) {
    
    inline def setEnumValues(value: Boolean): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
