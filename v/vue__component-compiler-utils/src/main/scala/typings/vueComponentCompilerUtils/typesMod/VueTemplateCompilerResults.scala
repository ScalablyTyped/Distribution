package typings.vueComponentCompilerUtils.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTemplateCompilerResults extends js.Object {
  var ast: js.UndefOr[js.Object] = js.native
  var errors: js.Array[String | ErrorWithRange] = js.native
  var render: String = js.native
  var staticRenderFns: js.Array[String] = js.native
  var tips: js.Array[String | ErrorWithRange] = js.native
}

object VueTemplateCompilerResults {
  @scala.inline
  def apply(
    errors: js.Array[String | ErrorWithRange],
    render: String,
    staticRenderFns: js.Array[String],
    tips: js.Array[String | ErrorWithRange]
  ): VueTemplateCompilerResults = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], staticRenderFns = staticRenderFns.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueTemplateCompilerResults]
  }
  @scala.inline
  implicit class VueTemplateCompilerResultsOps[Self <: VueTemplateCompilerResults] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: (String | ErrorWithRange)*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[String | ErrorWithRange]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setRender(value: String): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaticRenderFnsVarargs(value: String*): Self = this.set("staticRenderFns", js.Array(value :_*))
    @scala.inline
    def setStaticRenderFns(value: js.Array[String]): Self = this.set("staticRenderFns", value.asInstanceOf[js.Any])
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

