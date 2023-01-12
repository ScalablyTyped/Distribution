package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesActive extends StObject {
  
  var enumValues: Active
}
object EnumValuesActive {
  
  inline def apply(enumValues: Active): EnumValuesActive = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesActive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesActive] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: Active): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
