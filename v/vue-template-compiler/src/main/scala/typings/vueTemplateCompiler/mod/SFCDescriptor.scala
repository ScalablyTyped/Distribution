package typings.vueTemplateCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCDescriptor extends StObject {
  
  var customBlocks: js.Array[SFCBlock]
  
  var script: js.UndefOr[SFCBlock] = js.undefined
  
  var styles: js.Array[SFCBlock]
  
  var template: js.UndefOr[SFCBlock] = js.undefined
}
object SFCDescriptor {
  
  inline def apply(customBlocks: js.Array[SFCBlock], styles: js.Array[SFCBlock]): SFCDescriptor = {
    val __obj = js.Dynamic.literal(customBlocks = customBlocks.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SFCDescriptor] (val x: Self) extends AnyVal {
    
    inline def setCustomBlocks(value: js.Array[SFCBlock]): Self = StObject.set(x, "customBlocks", value.asInstanceOf[js.Any])
    
    inline def setCustomBlocksVarargs(value: SFCBlock*): Self = StObject.set(x, "customBlocks", js.Array(value*))
    
    inline def setScript(value: SFCBlock): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setStyles(value: js.Array[SFCBlock]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: SFCBlock*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTemplate(value: SFCBlock): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
