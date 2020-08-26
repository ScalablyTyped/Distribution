package typings.valdr.valdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValdrValidationResult extends js.Object {
  var valid: Boolean = js.native
  var validationResults: js.Array[ValdrViolation] = js.native
  var violations: js.Array[ValdrViolation] = js.native
}

object ValdrValidationResult {
  @scala.inline
  def apply(valid: Boolean, validationResults: js.Array[ValdrViolation], violations: js.Array[ValdrViolation]): ValdrValidationResult = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], validationResults = validationResults.asInstanceOf[js.Any], violations = violations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValdrValidationResult]
  }
  @scala.inline
  implicit class ValdrValidationResultOps[Self <: ValdrValidationResult] (val x: Self) extends AnyVal {
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
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValidationResultsVarargs(value: ValdrViolation*): Self = this.set("validationResults", js.Array(value :_*))
    @scala.inline
    def setValidationResults(value: js.Array[ValdrViolation]): Self = this.set("validationResults", value.asInstanceOf[js.Any])
    @scala.inline
    def setViolationsVarargs(value: ValdrViolation*): Self = this.set("violations", js.Array(value :_*))
    @scala.inline
    def setViolations(value: js.Array[ValdrViolation]): Self = this.set("violations", value.asInstanceOf[js.Any])
  }
  
}

