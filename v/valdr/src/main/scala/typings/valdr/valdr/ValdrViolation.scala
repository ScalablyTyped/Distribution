package typings.valdr.valdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValdrViolation extends ValdrConstraintValidator {
  var field: String = js.native
  var `type`: String = js.native
  var valid: Boolean = js.native
  var validator: String = js.native
  var value: String = js.native
}

object ValdrViolation {
  @scala.inline
  def apply(field: String, message: String, `type`: String, valid: Boolean, validator: String, value: String): ValdrViolation = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValdrViolation]
  }
  @scala.inline
  implicit class ValdrViolationOps[Self <: ValdrViolation] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidator(value: String): Self = this.set("validator", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

