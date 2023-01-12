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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnumValuesFreshLogin] (val x: Self) extends AnyVal {
    
    inline def setEnumValues(value: FreshLogin): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
