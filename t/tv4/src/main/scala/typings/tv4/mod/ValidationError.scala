package typings.tv4.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends js.Object {
  var code: Double = js.native
  var dataPath: js.UndefOr[String] = js.native
  var message: js.Any = js.native
  var schemaPath: js.UndefOr[String] = js.native
  var subErrors: js.UndefOr[js.Array[ValidationError]] = js.native
}

object ValidationError {
  @scala.inline
  def apply(code: Double, message: js.Any): ValidationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  @scala.inline
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: js.Any): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataPath(value: String): Self = this.set("dataPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataPath: Self = this.set("dataPath", js.undefined)
    @scala.inline
    def setSchemaPath(value: String): Self = this.set("schemaPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaPath: Self = this.set("schemaPath", js.undefined)
    @scala.inline
    def setSubErrorsVarargs(value: ValidationError*): Self = this.set("subErrors", js.Array(value :_*))
    @scala.inline
    def setSubErrors(value: js.Array[ValidationError]): Self = this.set("subErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubErrors: Self = this.set("subErrors", js.undefined)
  }
  
}

