package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesFreshLogin extends StObject {
  
  var enumValues: FreshLogin
}
object EnumValuesFreshLogin {
  
  inline def apply(enumValues: FreshLogin): EnumValuesFreshLogin = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFreshLogin]
  }
  
  extension [Self <: EnumValuesFreshLogin](x: Self) {
    
    inline def setEnumValues(value: FreshLogin): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
