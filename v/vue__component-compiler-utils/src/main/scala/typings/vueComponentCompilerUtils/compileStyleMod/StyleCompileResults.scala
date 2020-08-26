package typings.vueComponentCompilerUtils.compileStyleMod

import typings.postcss.mod.LazyResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleCompileResults extends js.Object {
  var code: String = js.native
  var errors: js.Array[String] = js.native
  var map: js.Any | Unit = js.native
  var rawResult: LazyResult | Unit = js.native
}

object StyleCompileResults {
  @scala.inline
  def apply(code: String, errors: js.Array[String], map: js.Any | Unit, rawResult: LazyResult | Unit): StyleCompileResults = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], rawResult = rawResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleCompileResults]
  }
  @scala.inline
  implicit class StyleCompileResultsOps[Self <: StyleCompileResults] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: js.Any | Unit): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawResult(value: LazyResult | Unit): Self = this.set("rawResult", value.asInstanceOf[js.Any])
  }
  
}

