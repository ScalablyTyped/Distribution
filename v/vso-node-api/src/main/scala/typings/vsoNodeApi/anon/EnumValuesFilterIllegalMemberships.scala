package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesFilterIllegalMemberships extends js.Object {
  
  var enumValues: FilterIllegalMemberships = js.native
}
object EnumValuesFilterIllegalMemberships {
  
  @scala.inline
  def apply(enumValues: FilterIllegalMemberships): EnumValuesFilterIllegalMemberships = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFilterIllegalMemberships]
  }
  
  @scala.inline
  implicit class EnumValuesFilterIllegalMembershipsOps[Self <: EnumValuesFilterIllegalMemberships] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnumValues(value: FilterIllegalMemberships): Self = this.set("enumValues", value.asInstanceOf[js.Any])
  }
}
