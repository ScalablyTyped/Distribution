package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesAliasMemberGroupRole extends StObject {
  
  var enumValues: AliasMemberGroupRole = js.native
}
object EnumValuesAliasMemberGroupRole {
  
  @scala.inline
  def apply(enumValues: AliasMemberGroupRole): EnumValuesAliasMemberGroupRole = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAliasMemberGroupRole]
  }
  
  @scala.inline
  implicit class EnumValuesAliasMemberGroupRoleMutableBuilder[Self <: EnumValuesAliasMemberGroupRole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: AliasMemberGroupRole): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
