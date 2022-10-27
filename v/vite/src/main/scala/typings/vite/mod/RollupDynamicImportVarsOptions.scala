package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupDynamicImportVarsOptions extends StObject {
  
  /**
    * Files to exclude in this plugin (default none).
    * @default []
    */
  var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  
  /**
    * Files to include in this plugin (default all).
    * @default []
    */
  var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  
  /**
    * By default, the plugin quits the build process when it encounters an error. If you set this option to true, it will throw a warning instead and leave the code untouched.
    * @default false
    */
  var warnOnError: js.UndefOr[Boolean] = js.undefined
}
object RollupDynamicImportVarsOptions {
  
  inline def apply(): RollupDynamicImportVarsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollupDynamicImportVarsOptions]
  }
  
  extension [Self <: RollupDynamicImportVarsOptions](x: Self) {
    
    inline def setExclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: String | js.RegExp | (js.Array[String | js.RegExp])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setWarnOnError(value: Boolean): Self = StObject.set(x, "warnOnError", value.asInstanceOf[js.Any])
    
    inline def setWarnOnErrorUndefined: Self = StObject.set(x, "warnOnError", js.undefined)
  }
}
