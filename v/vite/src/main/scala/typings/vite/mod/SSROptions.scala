package typings.vite.mod

import typings.vite.viteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSROptions extends StObject {
  
  var external: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Define the format for the ssr build. Since Vite v3 the SSR build generates ESM by default.
    * `'cjs'` can be selected to generate a CJS build, but it isn't recommended. This option is
    * left marked as experimental to give users more time to update to ESM. CJS builds requires
    * complex externalization heuristics that aren't present in the ESM format.
    * @experimental
    */
  var format: js.UndefOr[SSRFormat] = js.undefined
  
  var noExternal: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp]) | `true`] = js.undefined
  
  /**
    * Control over which dependencies are optimized during SSR and esbuild options
    * During build:
    *   no external CJS dependencies are optimized by default
    * During dev:
    *   explicit no external CJS dependencies are optimized by default
    * @experimental
    */
  var optimizeDeps: js.UndefOr[SsrDepOptimizationOptions] = js.undefined
  
  /**
    * Define the target for the ssr build. The browser field in package.json
    * is ignored for node but used if webworker is the target
    * Default: 'node'
    */
  var target: js.UndefOr[SSRTarget] = js.undefined
}
object SSROptions {
  
  inline def apply(): SSROptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSROptions]
  }
  
  extension [Self <: SSROptions](x: Self) {
    
    inline def setExternal(value: js.Array[String]): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    inline def setExternalVarargs(value: String*): Self = StObject.set(x, "external", js.Array(value*))
    
    inline def setFormat(value: SSRFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setNoExternal(value: String | js.RegExp | (js.Array[String | js.RegExp]) | `true`): Self = StObject.set(x, "noExternal", value.asInstanceOf[js.Any])
    
    inline def setNoExternalUndefined: Self = StObject.set(x, "noExternal", js.undefined)
    
    inline def setNoExternalVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "noExternal", js.Array(value*))
    
    inline def setOptimizeDeps(value: SsrDepOptimizationOptions): Self = StObject.set(x, "optimizeDeps", value.asInstanceOf[js.Any])
    
    inline def setOptimizeDepsUndefined: Self = StObject.set(x, "optimizeDeps", js.undefined)
    
    inline def setTarget(value: SSRTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
