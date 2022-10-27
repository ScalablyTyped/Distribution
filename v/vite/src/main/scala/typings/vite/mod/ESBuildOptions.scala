package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ESBuildOptions
  extends StObject
     with typings.esbuild.mod.TransformOptions {
  
  var exclude: js.UndefOr[String | js.RegExp | (js.Array[js.RegExp | String])] = js.undefined
  
  var include: js.UndefOr[String | js.RegExp | (js.Array[js.RegExp | String])] = js.undefined
  
  var jsxInject: js.UndefOr[String] = js.undefined
  
  /**
    * This option is not respected. Use `build.minify` instead.
    */
  @JSName("minify")
  var minify_ESBuildOptions: js.UndefOr[scala.Nothing] = js.undefined
}
object ESBuildOptions {
  
  inline def apply(): ESBuildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ESBuildOptions]
  }
  
  extension [Self <: ESBuildOptions](x: Self) {
    
    inline def setExclude(value: String | js.RegExp | (js.Array[js.RegExp | String])): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInclude(value: String | js.RegExp | (js.Array[js.RegExp | String])): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: (js.RegExp | String)*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setJsxInject(value: String): Self = StObject.set(x, "jsxInject", value.asInstanceOf[js.Any])
    
    inline def setJsxInjectUndefined: Self = StObject.set(x, "jsxInject", js.undefined)
  }
}
