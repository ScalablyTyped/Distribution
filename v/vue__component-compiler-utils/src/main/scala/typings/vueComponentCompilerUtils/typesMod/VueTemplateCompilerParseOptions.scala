package typings.vueComponentCompilerUtils.typesMod

import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.line
import typings.vueComponentCompilerUtils.vueComponentCompilerUtilsStrings.space
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VueTemplateCompilerParseOptions extends js.Object {
  var pad: js.UndefOr[line | space] = js.native
}

object VueTemplateCompilerParseOptions {
  @scala.inline
  def apply(): VueTemplateCompilerParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VueTemplateCompilerParseOptions]
  }
  @scala.inline
  implicit class VueTemplateCompilerParseOptionsOps[Self <: VueTemplateCompilerParseOptions] (val x: Self) extends AnyVal {
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
    def setPad(value: line | space): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
  }
  
}

