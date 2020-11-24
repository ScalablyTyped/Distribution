package typings.vueInbrowserCompilerUtils.parseComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VsgSFCDescriptorSimple extends js.Object {
  
  var script: js.UndefOr[String] = js.native
  
  var template: js.UndefOr[String] = js.native
}
object VsgSFCDescriptorSimple {
  
  @scala.inline
  def apply(): VsgSFCDescriptorSimple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VsgSFCDescriptorSimple]
  }
  
  @scala.inline
  implicit class VsgSFCDescriptorSimpleOps[Self <: VsgSFCDescriptorSimple] (val x: Self) extends AnyVal {
    
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
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
