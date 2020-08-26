package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnumValuesKeepSourceDeleteTarget extends js.Object {
  var enumValues: KeepSourceDeleteTarget = js.native
}

object EnumValuesKeepSourceDeleteTarget {
  @scala.inline
  def apply(enumValues: KeepSourceDeleteTarget): EnumValuesKeepSourceDeleteTarget = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumValuesKeepSourceDeleteTarget]
  }
  @scala.inline
  implicit class EnumValuesKeepSourceDeleteTargetOps[Self <: EnumValuesKeepSourceDeleteTarget] (val x: Self) extends AnyVal {
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
    def setEnumValues(value: KeepSourceDeleteTarget): Self = this.set("enumValues", value.asInstanceOf[js.Any])
  }
  
}

