package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesFilterIllegalMemberships extends StObject {
  
  var enumValues: FilterIllegalMemberships = js.native
}
object EnumValuesFilterIllegalMemberships {
  
  @scala.inline
  def apply(enumValues: FilterIllegalMemberships): EnumValuesFilterIllegalMemberships = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFilterIllegalMemberships]
  }
  
  @scala.inline
  implicit class EnumValuesFilterIllegalMembershipsMutableBuilder[Self <: EnumValuesFilterIllegalMemberships] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnumValues(value: FilterIllegalMemberships): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
  }
}
