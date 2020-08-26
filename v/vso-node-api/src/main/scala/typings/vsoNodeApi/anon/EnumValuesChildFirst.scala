package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesChildFirst extends js.Object {
  var enumValues: ChildFirst = js.native
}

object EnumValuesChildFirst {
  @scala.inline
  def apply(enumValues: ChildFirst): EnumValuesChildFirst = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesChildFirst]
  }
  @scala.inline
  implicit class EnumValuesChildFirstOps[Self <: EnumValuesChildFirst] (val x: Self) extends AnyVal {
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
    def setEnumValues(value: ChildFirst): Self = this.set("enumValues", value.asInstanceOf[js.Any])
  }
  
}

