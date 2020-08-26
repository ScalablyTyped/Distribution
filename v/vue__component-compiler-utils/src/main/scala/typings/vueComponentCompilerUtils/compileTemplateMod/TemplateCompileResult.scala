package typings.vueComponentCompilerUtils.compileTemplateMod

import typings.vueComponentCompilerUtils.typesMod.ErrorWithRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateCompileResult extends js.Object {
  var ast: js.UndefOr[js.Object] = js.native
  var code: String = js.native
  var errors: js.Array[String | ErrorWithRange] = js.native
  var source: String = js.native
  var tips: js.Array[String | ErrorWithRange] = js.native
}

object TemplateCompileResult {
  @scala.inline
  def apply(
    code: String,
    errors: js.Array[String | ErrorWithRange],
    source: String,
    tips: js.Array[String | ErrorWithRange]
  ): TemplateCompileResult = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateCompileResult]
  }
  @scala.inline
  implicit class TemplateCompileResultOps[Self <: TemplateCompileResult] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: (String | ErrorWithRange)*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[String | ErrorWithRange]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTipsVarargs(value: (String | ErrorWithRange)*): Self = this.set("tips", js.Array(value :_*))
    @scala.inline
    def setTips(value: js.Array[String | ErrorWithRange]): Self = this.set("tips", value.asInstanceOf[js.Any])
    @scala.inline
    def setAst(value: js.Object): Self = this.set("ast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAst: Self = this.set("ast", js.undefined)
  }
  
}

