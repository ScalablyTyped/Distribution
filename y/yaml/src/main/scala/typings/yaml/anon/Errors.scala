package typings.yaml.anon

import typings.yaml.utilMod.YAMLSyntaxError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends js.Object {
  var errors: js.Array[YAMLSyntaxError] = js.native
  var str: String = js.native
}

object Errors {
  @scala.inline
  def apply(errors: js.Array[YAMLSyntaxError], str: String): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  @scala.inline
  implicit class ErrorsOps[Self <: Errors] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: YAMLSyntaxError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[YAMLSyntaxError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setStr(value: String): Self = this.set("str", value.asInstanceOf[js.Any])
  }
  
}

