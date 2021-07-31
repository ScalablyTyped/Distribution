package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumValuesRequestingUser extends StObject {
  
  var enumValues: RequestingUser
}
object EnumValuesRequestingUser {
  
  @scala.inline
  def apply(enumValues: RequestingUser): EnumValuesRequestingUser = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesRequestingUser]
  }
  
  @scala.inline
  implicit class EnumValuesRequestingUserMutableBuilder[Self <: EnumValuesRequestingUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: RequestingUser): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
