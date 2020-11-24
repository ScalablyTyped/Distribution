package typings.vueCompilerSfc.mod

import typings.std.Record
import typings.vueCompilerCore.mod.SourceLocation
import typings.vueCompilerSfc.vueCompilerSfcBooleans.`true`
import typings.vueCompilerSfc.vueCompilerSfcStrings.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCTemplateBlock extends SFCBlock {
  
  var functional: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_SFCTemplateBlock: template = js.native
}
object SFCTemplateBlock {
  
  @scala.inline
  def apply(attrs: Record[String, String | `true`], content: String, loc: SourceLocation, `type`: template): SFCTemplateBlock = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCTemplateBlock]
  }
  
  @scala.inline
  implicit class SFCTemplateBlockOps[Self <: SFCTemplateBlock] (val x: Self) extends AnyVal {
    
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
    def setType(value: template): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctional(value: Boolean): Self = this.set("functional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctional: Self = this.set("functional", js.undefined)
  }
}
