package typings.vite.mod

import typings.std.Record
import typings.vite.anon.ProcessOptionspluginsArra
import typings.vite.viteBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSOptions extends StObject {
  
  /**
    * Enables css sourcemaps during dev
    * @default false
    * @experimental
    */
  var devSourcemap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * https://github.com/css-modules/postcss-modules
    */
  var modules: js.UndefOr[CSSModulesOptions | `false`] = js.undefined
  
  var postcss: js.UndefOr[String | ProcessOptionspluginsArra] = js.undefined
  
  var preprocessorOptions: js.UndefOr[Record[String, Any]] = js.undefined
}
object CSSOptions {
  
  inline def apply(): CSSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSOptions] (val x: Self) extends AnyVal {
    
    inline def setDevSourcemap(value: Boolean): Self = StObject.set(x, "devSourcemap", value.asInstanceOf[js.Any])
    
    inline def setDevSourcemapUndefined: Self = StObject.set(x, "devSourcemap", js.undefined)
    
    inline def setModules(value: CSSModulesOptions | `false`): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setPostcss(value: String | ProcessOptionspluginsArra): Self = StObject.set(x, "postcss", value.asInstanceOf[js.Any])
    
    inline def setPostcssUndefined: Self = StObject.set(x, "postcss", js.undefined)
    
    inline def setPreprocessorOptions(value: Record[String, Any]): Self = StObject.set(x, "preprocessorOptions", value.asInstanceOf[js.Any])
    
    inline def setPreprocessorOptionsUndefined: Self = StObject.set(x, "preprocessorOptions", js.undefined)
  }
}
