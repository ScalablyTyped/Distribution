package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesBuy extends StObject {
  
  var enumValues: Buy
}
object EnumValuesBuy {
  
  inline def apply(enumValues: Buy): EnumValuesBuy = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesBuy]
  }
  
  extension [Self <: EnumValuesBuy](x: Self) {
    
    inline def setEnumValues(value: Buy): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
