package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildRequestValidationResult extends js.Object {
  /**
    * The message associated with the result.
    */
  var message: String = js.native
  /**
    * The result.
    */
  var result: ValidationResult = js.native
}

object BuildRequestValidationResult {
  @scala.inline
  def apply(message: String, result: ValidationResult): BuildRequestValidationResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildRequestValidationResult]
  }
  @scala.inline
  implicit class BuildRequestValidationResultOps[Self <: BuildRequestValidationResult] (val x: Self) extends AnyVal {
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: ValidationResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

