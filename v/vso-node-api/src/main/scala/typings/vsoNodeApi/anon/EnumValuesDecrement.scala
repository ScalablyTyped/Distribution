package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDecrement extends StObject {
  
  var enumValues: Decrement
}
object EnumValuesDecrement {
  
  inline def apply(enumValues: Decrement): EnumValuesDecrement = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDecrement]
  }
  
  extension [Self <: EnumValuesDecrement](x: Self) {
    
    inline def setEnumValues(value: Decrement): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
