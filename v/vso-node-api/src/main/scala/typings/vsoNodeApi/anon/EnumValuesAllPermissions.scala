package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesAllPermissions extends js.Object {
  var enumValues: AllPermissions = js.native
}

object EnumValuesAllPermissions {
  @scala.inline
  def apply(enumValues: AllPermissions): EnumValuesAllPermissions = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAllPermissions]
  }
  @scala.inline
  implicit class EnumValuesAllPermissionsOps[Self <: EnumValuesAllPermissions] (val x: Self) extends AnyVal {
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
    def setEnumValues(value: AllPermissions): Self = this.set("enumValues", value.asInstanceOf[js.Any])
  }
  
}

