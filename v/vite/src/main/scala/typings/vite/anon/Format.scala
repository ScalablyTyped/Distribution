package typings.vite.anon

import typings.vite.mod.PluginOption
import typings.vite.viteStrings.es
import typings.vite.viteStrings.iife
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  /**
    * Output format for worker bundle
    * @default 'iife'
    */
  var format: js.UndefOr[es | iife] = js.undefined
  
  /**
    * Vite plugins that apply to worker bundle
    */
  var plugins: js.UndefOr[js.Array[PluginOption]] = js.undefined
  
  /**
    * Rollup options to build worker bundle
    */
  var rollupOptions: js.UndefOr[OmitRollupOptionspluginsi] = js.undefined
}
object Format {
  
  inline def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: es | iife): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setPlugins(value: js.Array[PluginOption]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: PluginOption*): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setRollupOptions(value: OmitRollupOptionspluginsi): Self = StObject.set(x, "rollupOptions", value.asInstanceOf[js.Any])
    
    inline def setRollupOptionsUndefined: Self = StObject.set(x, "rollupOptions", js.undefined)
  }
}
