package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesRequestingUser extends StObject {
  
  var enumValues: RequestingUser
}
object EnumValuesRequestingUser {
  
  inline def apply(enumValues: RequestingUser): EnumValuesRequestingUser = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesRequestingUser]
  }
  
  extension [Self <: EnumValuesRequestingUser](x: Self) {
    
    inline def setEnumValues(value: RequestingUser): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
