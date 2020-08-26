package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesFreshLogin extends js.Object {
  var enumValues: FreshLogin = js.native
}

object EnumValuesFreshLogin {
  @scala.inline
  def apply(enumValues: FreshLogin): EnumValuesFreshLogin = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesFreshLogin]
  }
  @scala.inline
  implicit class EnumValuesFreshLoginOps[Self <: EnumValuesFreshLogin] (val x: Self) extends AnyVal {
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
    def setEnumValues(value: FreshLogin): Self = this.set("enumValues", value.asInstanceOf[js.Any])
  }
  
}

