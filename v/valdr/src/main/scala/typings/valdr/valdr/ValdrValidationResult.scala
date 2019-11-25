package typings.valdr.valdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValdrValidationResult extends js.Object {
  var valid: Boolean
  var validationResults: js.Array[ValdrViolation]
  var violations: js.Array[ValdrViolation]
}

object ValdrValidationResult {
  @scala.inline
  def apply(valid: Boolean, validationResults: js.Array[ValdrViolation], violations: js.Array[ValdrViolation]): ValdrValidationResult = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], validationResults = validationResults.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValdrValidationResult]
  }
}

