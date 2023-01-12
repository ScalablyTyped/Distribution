package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesCloak extends StObject {
  
  var enumValues: Cloak
}
object EnumValuesCloak {
  
  inline def apply(enumValues: Cloak): EnumValuesCloak = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesCloak]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesCloak] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Cloak): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
