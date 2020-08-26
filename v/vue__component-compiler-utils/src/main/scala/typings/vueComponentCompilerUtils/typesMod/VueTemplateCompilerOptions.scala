package typings.vueComponentCompilerUtils.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.condense
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.preserve
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTemplateCompilerOptions extends js.Object {
  var directives: js.UndefOr[StringDictionary[js.Function]] = js.native
  var modules: js.UndefOr[js.Array[js.Object]] = js.native
  var outputSourceRange: js.UndefOr[Boolean] = js.native
  var whitespace: js.UndefOr[preserve | condense] = js.native
}

object VueTemplateCompilerOptions {
  @scala.inline
  def apply(): VueTemplateCompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VueTemplateCompilerOptions]
  }
  @scala.inline
  implicit class VueTemplateCompilerOptionsOps[Self <: VueTemplateCompilerOptions] (val x: Self) extends AnyVal {
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
    def setDirectives(value: StringDictionary[js.Function]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    @scala.inline
    def setModulesVarargs(value: js.Object*): Self = this.set("modules", js.Array(value :_*))
    @scala.inline
    def setModules(value: js.Array[js.Object]): Self = this.set("modules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    @scala.inline
    def setOutputSourceRange(value: Boolean): Self = this.set("outputSourceRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputSourceRange: Self = this.set("outputSourceRange", js.undefined)
    @scala.inline
    def setWhitespace(value: preserve | condense): Self = this.set("whitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitespace: Self = this.set("whitespace", js.undefined)
  }
  
}

