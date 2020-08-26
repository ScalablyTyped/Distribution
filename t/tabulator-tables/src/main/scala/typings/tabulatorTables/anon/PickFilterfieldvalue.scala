package typings.tabulatorTables.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<tabulator-tables.Tabulator.Filter, 'field' | 'value'> */
@js.native
trait PickFilterfieldvalue extends js.Object {
  var field: String = js.native
  var value: js.Any = js.native
}

object PickFilterfieldvalue {
  @scala.inline
  def apply(field: String, value: js.Any): PickFilterfieldvalue = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickFilterfieldvalue]
  }
  @scala.inline
  implicit class PickFilterfieldvalueOps[Self <: PickFilterfieldvalue] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

