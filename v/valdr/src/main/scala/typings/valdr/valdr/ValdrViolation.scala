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
    val __obj = js.Dynamic.literal(field = field, message = message, valid = valid, validator = validator, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ValdrViolation]
  }
}

