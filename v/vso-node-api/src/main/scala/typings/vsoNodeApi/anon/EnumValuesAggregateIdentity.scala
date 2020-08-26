package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesAggregateIdentity extends js.Object {
  var enumValues: AggregateIdentity = js.native
}

object EnumValuesAggregateIdentity {
  @scala.inline
  def apply(enumValues: AggregateIdentity): EnumValuesAggregateIdentity = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesAggregateIdentity]
  }
  @scala.inline
  implicit class EnumValuesAggregateIdentityOps[Self <: EnumValuesAggregateIdentity] (val x: Self) extends AnyVal {
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
    def setEnumValues(value: AggregateIdentity): Self = this.set("enumValues", value.asInstanceOf[js.Any])
  }
  
}

