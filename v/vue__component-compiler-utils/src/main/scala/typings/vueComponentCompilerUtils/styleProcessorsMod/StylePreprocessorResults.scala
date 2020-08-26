package typings.vueComponentCompilerUtils.styleProcessorsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StylePreprocessorResults extends js.Object {
  var code: String = js.native
  var errors: js.Array[Error] = js.native
  var map: js.UndefOr[js.Any] = js.native
}

object StylePreprocessorResults {
  @scala.inline
  def apply(code: String, errors: js.Array[Error]): StylePreprocessorResults = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylePreprocessorResults]
  }
  @scala.inline
  implicit class StylePreprocessorResultsOps[Self <: StylePreprocessorResults] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: js.Any): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
  
}

