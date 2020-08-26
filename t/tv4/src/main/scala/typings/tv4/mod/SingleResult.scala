package typings.tv4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleResult extends BaseResult {
  var error: ValidationError = js.native
}

object SingleResult {
  @scala.inline
  def apply(error: ValidationError, missing: js.Array[String], valid: Boolean): SingleResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleResult]
  }
  @scala.inline
  implicit class SingleResultOps[Self <: SingleResult] (val x: Self) extends AnyVal {
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
    def setError(value: ValidationError): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

