package typings.webidl2.mod

import typings.webidl2.webidl2Strings.boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueDescriptionBoolean extends ValueDescription {
  var `type`: boolean = js.native
  var value: Boolean = js.native
}

object ValueDescriptionBoolean {
  @scala.inline
  def apply(`type`: boolean, value: Boolean): ValueDescriptionBoolean = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionBoolean]
  }
  @scala.inline
  implicit class ValueDescriptionBooleanOps[Self <: ValueDescriptionBoolean] (val x: Self) extends AnyVal {
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
    def setType(value: boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

