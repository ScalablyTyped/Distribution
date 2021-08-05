package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesAliasMemberGroupRole extends StObject {
  
  var enumValues: AliasMemberGroupRole
}
object EnumValuesAliasMemberGroupRole {
  
  inline def apply(enumValues: AliasMemberGroupRole): EnumValuesAliasMemberGroupRole = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAliasMemberGroupRole]
  }
  
  extension [Self <: EnumValuesAliasMemberGroupRole](x: Self) {
    
    inline def setEnumValues(value: AliasMemberGroupRole): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
