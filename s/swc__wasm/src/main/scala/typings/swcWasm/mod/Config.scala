package typings.swcWasm.mod

import typings.swcWasm.swcWasmStrings.`inline`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var env: js.UndefOr[EnvConfig] = js.undefined
  
  /**
    * Note: The type is string because it follows rust's regex syntax.
    */
  var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var inlineSourcesContent: js.UndefOr[Boolean] = js.undefined
  
  var jsc: js.UndefOr[JscConfig] = js.undefined
  
  var minify: js.UndefOr[Boolean] = js.undefined
  
  var module: js.UndefOr[ModuleConfig] = js.undefined
  
  /**
    * - true to generate a sourcemap for the code and include it in the result object.
    * - "inline" to generate a sourcemap and append it as a data URL to the end of the code, but not include it in the result object.
    *
    * `swc-cli` overloads some of these to also affect how maps are written to disk:
    *
    * - true will write the map to a .map file on disk
    * - "inline" will write the file directly, so it will have a data: containing the map
    * - Note: These options are bit weird, so it may make the most sense to just use true
    *  and handle the rest in your own code, depending on your use case.
    */
  var sourceMaps: js.UndefOr[Boolean | `inline`] = js.undefined
  
  /**
    * Note: The type is string because it follows rust's regex syntax.
    */
  var test: js.UndefOr[String | js.Array[String]] = js.undefined
}
object Config {
  
  inline def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setEnv(value: EnvConfig): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setInlineSourcesContent(value: Boolean): Self = StObject.set(x, "inlineSourcesContent", value.asInstanceOf[js.Any])
    
    inline def setInlineSourcesContentUndefined: Self = StObject.set(x, "inlineSourcesContent", js.undefined)
    
    inline def setJsc(value: JscConfig): Self = StObject.set(x, "jsc", value.asInstanceOf[js.Any])
    
    inline def setJscUndefined: Self = StObject.set(x, "jsc", js.undefined)
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setModule(value: ModuleConfig): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setSourceMaps(value: Boolean | `inline`): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
    
    inline def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
    
    inline def setTest(value: String | js.Array[String]): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setTestVarargs(value: String*): Self = StObject.set(x, "test", js.Array(value*))
  }
}
