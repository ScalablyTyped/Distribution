package typings.vueCompilerSfc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCDescriptor extends js.Object {
  
  var customBlocks: js.Array[SFCBlock] = js.native
  
  var filename: String = js.native
  
  var script: SFCScriptBlock | Null = js.native
  
  var scriptSetup: SFCScriptBlock | Null = js.native
  
  var source: String = js.native
  
  var styles: js.Array[SFCStyleBlock] = js.native
  
  var template: SFCTemplateBlock | Null = js.native
}
object SFCDescriptor {
  
  @scala.inline
  def apply(
    customBlocks: js.Array[SFCBlock],
    filename: String,
    source: String,
    styles: js.Array[SFCStyleBlock]
  ): SFCDescriptor = {
    val __obj = js.Dynamic.literal(customBlocks = customBlocks.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCDescriptor]
  }
  
  @scala.inline
  implicit class SFCDescriptorOps[Self <: SFCDescriptor] (val x: Self) extends AnyVal {
    
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
    def setCustomBlocksVarargs(value: SFCBlock*): Self = this.set("customBlocks", js.Array(value :_*))
    
    @scala.inline
    def setCustomBlocks(value: js.Array[SFCBlock]): Self = this.set("customBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: SFCStyleBlock*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[SFCStyleBlock]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: SFCScriptBlock): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptNull: Self = this.set("script", null)
    
    @scala.inline
    def setScriptSetup(value: SFCScriptBlock): Self = this.set("scriptSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptSetupNull: Self = this.set("scriptSetup", null)
    
    @scala.inline
    def setTemplate(value: SFCTemplateBlock): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNull: Self = this.set("template", null)
  }
}
