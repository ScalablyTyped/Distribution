package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAllPermissions extends StObject {
  
  var enumValues: AllPermissions
}
object EnumValuesAllPermissions {
  
  inline def apply(enumValues: AllPermissions): EnumValuesAllPermissions = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAllPermissions]
  }
  
  extension [Self <: EnumValuesAllPermissions](x: Self) {
    
    inline def setEnumValues(value: AllPermissions): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
