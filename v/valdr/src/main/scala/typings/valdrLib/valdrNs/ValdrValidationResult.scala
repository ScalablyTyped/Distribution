package typings
package valdrLib.valdrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValdrValidationResult extends js.Object {
  var valid: scala.Boolean
  var validationResults: js.Array[ValdrViolation]
  var violations: js.Array[ValdrViolation]
}

object ValdrValidationResult {
  @scala.inline
  def apply(
    valid: scala.Boolean,
    validationResults: js.Array[ValdrViolation],
    violations: js.Array[ValdrViolation]
  ): ValdrValidationResult = {
    val __obj = js.Dynamic.literal(valid = valid, validationResults = validationResults, violations = violations)
  
    __obj.asInstanceOf[ValdrValidationResult]
  }
}

