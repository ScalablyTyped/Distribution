package typings.valdr.valdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValdrViolation extends ValdrConstraintValidator {
  var field: String
  var `type`: String
  var valid: Boolean
  var validator: String
  var value: String
}

object ValdrViolation {
  @scala.inline
  def apply(field: String, message: String, `type`: String, valid: Boolean, validator: String, value: String): ValdrViolation = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validator = validator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValdrViolation]
  }
}

