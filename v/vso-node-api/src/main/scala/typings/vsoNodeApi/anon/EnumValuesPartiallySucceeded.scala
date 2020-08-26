package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesPartiallySucceeded extends js.Object {
  var enumValues: PartiallySucceeded = js.native
}

object EnumValuesPartiallySucceeded {
  @scala.inline
  def apply(enumValues: PartiallySucceeded): EnumValuesPartiallySucceeded = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesPartiallySucceeded]
  }
  @scala.inline
  implicit class EnumValuesPartiallySucceededOps[Self <: EnumValuesPartiallySucceeded] (val x: Self) extends AnyVal {
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
    def setEnumValues(value: PartiallySucceeded): Self = this.set("enumValues", value.asInstanceOf[js.Any])
  }
  
}

