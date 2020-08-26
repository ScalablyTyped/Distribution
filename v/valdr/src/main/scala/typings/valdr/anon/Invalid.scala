package typings.valdr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Invalid extends js.Object {
  var invalid: String = js.native
  var valid: String = js.native
}

object Invalid {
  @scala.inline
  def apply(invalid: String, valid: String): Invalid = {
    val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invalid]
  }
  @scala.inline
  implicit class InvalidOps[Self <: Invalid] (val x: Self) extends AnyVal {
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
    def setInvalid(value: String): Self = this.set("invalid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: String): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
  
}

