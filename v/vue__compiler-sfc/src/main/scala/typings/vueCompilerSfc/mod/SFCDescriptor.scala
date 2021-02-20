package typings.vueCompilerSfc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCDescriptor extends StObject {
  
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
  implicit class SFCDescriptorMutableBuilder[Self <: SFCDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomBlocks(value: js.Array[SFCBlock]): Self = StObject.set(x, "customBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomBlocksVarargs(value: SFCBlock*): Self = StObject.set(x, "customBlocks", js.Array(value :_*))
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: SFCScriptBlock): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptNull: Self = StObject.set(x, "script", null)
    
    @scala.inline
    def setScriptSetup(value: SFCScriptBlock): Self = StObject.set(x, "scriptSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptSetupNull: Self = StObject.set(x, "scriptSetup", null)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: js.Array[SFCStyleBlock]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: SFCStyleBlock*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setTemplate(value: SFCTemplateBlock): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNull: Self = StObject.set(x, "template", null)
  }
}
