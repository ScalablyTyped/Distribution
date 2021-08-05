package typings.vueCompilerSfc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCDescriptor extends StObject {
  
  var customBlocks: js.Array[SFCBlock]
  
  var filename: String
  
  var script: SFCScriptBlock | Null
  
  var scriptSetup: SFCScriptBlock | Null
  
  var source: String
  
  var styles: js.Array[SFCStyleBlock]
  
  var template: SFCTemplateBlock | Null
}
object SFCDescriptor {
  
  inline def apply(
    customBlocks: js.Array[SFCBlock],
    filename: String,
    source: String,
    styles: js.Array[SFCStyleBlock]
  ): SFCDescriptor = {
    val __obj = js.Dynamic.literal(customBlocks = customBlocks.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], script = null, scriptSetup = null, template = null)
    __obj.asInstanceOf[SFCDescriptor]
  }
  
  extension [Self <: SFCDescriptor](x: Self) {
    
    inline def setCustomBlocks(value: js.Array[SFCBlock]): Self = StObject.set(x, "customBlocks", value.asInstanceOf[js.Any])
    
    inline def setCustomBlocksVarargs(value: SFCBlock*): Self = StObject.set(x, "customBlocks", js.Array(value :_*))
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setScript(value: SFCScriptBlock): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptNull: Self = StObject.set(x, "script", null)
    
    inline def setScriptSetup(value: SFCScriptBlock): Self = StObject.set(x, "scriptSetup", value.asInstanceOf[js.Any])
    
    inline def setScriptSetupNull: Self = StObject.set(x, "scriptSetup", null)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: js.Array[SFCStyleBlock]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: SFCStyleBlock*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    inline def setTemplate(value: SFCTemplateBlock): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
  }
}
