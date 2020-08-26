package typings.tv4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiResult extends BaseResult {
  var errors: js.Array[ValidationError] = js.native
}

object MultiResult {
  @scala.inline
  def apply(errors: js.Array[ValidationError], missing: js.Array[String], valid: Boolean): MultiResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiResult]
  }
  @scala.inline
  implicit class MultiResultOps[Self <: MultiResult] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: ValidationError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[ValidationError]): Self = this.set("errors", value.asInstanceOf[js.Any])
  }
  
}

