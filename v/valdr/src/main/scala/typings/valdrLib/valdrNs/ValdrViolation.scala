package typings
package valdrLib.valdrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValdrViolation extends ValdrConstraintValidator {
  var field: java.lang.String
  var `type`: java.lang.String
  var valid: scala.Boolean
  var validator: java.lang.String
  var value: java.lang.String
}

object ValdrViolation {
  @scala.inline
  def apply(
    field: java.lang.String,
    message: java.lang.String,
    `type`: java.lang.String,
    valid: scala.Boolean,
    validator: java.lang.String,
    value: java.lang.String
  ): ValdrViolation = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("field")(field)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("valid")(valid)
    __obj.updateDynamic("validator")(validator)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ValdrViolation]
  }
}

