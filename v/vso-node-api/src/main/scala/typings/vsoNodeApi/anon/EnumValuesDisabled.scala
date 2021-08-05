package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesDisabled extends StObject {
  
  var enumValues: Disabled
}
object EnumValuesDisabled {
  
  inline def apply(enumValues: Disabled): EnumValuesDisabled = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesDisabled]
  }
  
  extension [Self <: EnumValuesDisabled](x: Self) {
    
    inline def setEnumValues(value: Disabled): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
