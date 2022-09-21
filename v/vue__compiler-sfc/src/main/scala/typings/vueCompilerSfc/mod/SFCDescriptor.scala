package typings.vueCompilerSfc.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCDescriptor extends StObject {
  
  var cssVars: js.Array[String]
  
  var customBlocks: js.Array[SFCBlock]
  
  var filename: String
  
  var script: SFCScriptBlock | Null
  
  var scriptSetup: SFCScriptBlock | Null
  
  /**
    * compare with an existing descriptor to determine whether HMR should perform
    * a reload vs. re-render.
    *
    * Note: this comparison assumes the prev/next script are already identical,
    * and only checks the special case where <script setup lang="ts"> unused import
    * pruning result changes due to template changes.
    */
  def shouldForceReload(prevImports: Record[String, ImportBinding]): Boolean
  
  /**
    * whether the SFC uses :slotted() modifier.
    * this is used as a compiler optimization hint.
    */
  var slotted: Boolean
  
  var source: String
  
  var styles: js.Array[SFCStyleBlock]
  
  var template: SFCTemplateBlock | Null
}
object SFCDescriptor {
  
  inline def apply(
    cssVars: js.Array[String],
    customBlocks: js.Array[SFCBlock],
    filename: String,
    shouldForceReload: Record[String, ImportBinding] => Boolean,
    slotted: Boolean,
    source: String,
    styles: js.Array[SFCStyleBlock]
  ): SFCDescriptor = {
    val __obj = js.Dynamic.literal(cssVars = cssVars.asInstanceOf[js.Any], customBlocks = customBlocks.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], shouldForceReload = js.Any.fromFunction1(shouldForceReload), slotted = slotted.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], script = null, scriptSetup = null, template = null)
    __obj.asInstanceOf[SFCDescriptor]
  }
  
  extension [Self <: SFCDescriptor](x: Self) {
    
    inline def setCssVars(value: js.Array[String]): Self = StObject.set(x, "cssVars", value.asInstanceOf[js.Any])
    
    inline def setCssVarsVarargs(value: String*): Self = StObject.set(x, "cssVars", js.Array(value*))
    
    inline def setCustomBlocks(value: js.Array[SFCBlock]): Self = StObject.set(x, "customBlocks", value.asInstanceOf[js.Any])
    
    inline def setCustomBlocksVarargs(value: SFCBlock*): Self = StObject.set(x, "customBlocks", js.Array(value*))
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setScript(value: SFCScriptBlock): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptNull: Self = StObject.set(x, "script", null)
    
    inline def setScriptSetup(value: SFCScriptBlock): Self = StObject.set(x, "scriptSetup", value.asInstanceOf[js.Any])
    
    inline def setScriptSetupNull: Self = StObject.set(x, "scriptSetup", null)
    
    inline def setShouldForceReload(value: Record[String, ImportBinding] => Boolean): Self = StObject.set(x, "shouldForceReload", js.Any.fromFunction1(value))
    
    inline def setSlotted(value: Boolean): Self = StObject.set(x, "slotted", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: js.Array[SFCStyleBlock]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: SFCStyleBlock*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTemplate(value: SFCTemplateBlock): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
  }
}
