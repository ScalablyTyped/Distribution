package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodegenOptions
  extends StObject
     with SharedTransformCodegenOptions {
  
  /**
    * - `module` mode will generate ES module import statements for helpers
    * and export the render function as the default export.
    * - `function` mode will generate a single `const { helpers... } = Vue`
    * statement and return the render function. It expects `Vue` to be globally
    * available (or passed by wrapping the code with an IIFE). It is meant to be
    * used with `new Function(code)()` to generate a render function at runtime.
    * @default 'function'
    */
  var mode: js.UndefOr["module" | "function"] = js.undefined
  
  /**
    * Option to optimize helper import bindings via variable assignment
    * (only used for webpack code-split)
    * @default false
    */
  var optimizeImports: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Customize the global variable name of `Vue` to get helpers from
    * in function mode
    * @default 'Vue'
    */
  var runtimeGlobalName: js.UndefOr[String] = js.undefined
  
  /**
    * Customize where to import runtime helpers from.
    * @default 'vue'
    */
  var runtimeModuleName: js.UndefOr[String] = js.undefined
  
  /**
    * SFC scoped styles ID
    */
  var scopeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Generate source map?
    * @default false
    */
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Customize where to import ssr runtime helpers from/ **
    * @default 'vue/server-renderer'
    */
  var ssrRuntimeModuleName: js.UndefOr[String] = js.undefined
}
object CodegenOptions {
  
  inline def apply(): CodegenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodegenOptions]
  }
  
  extension [Self <: CodegenOptions](x: Self) {
    
    inline def setMode(value: "module" | "function"): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOptimizeImports(value: Boolean): Self = StObject.set(x, "optimizeImports", value.asInstanceOf[js.Any])
    
    inline def setOptimizeImportsUndefined: Self = StObject.set(x, "optimizeImports", js.undefined)
    
    inline def setRuntimeGlobalName(value: String): Self = StObject.set(x, "runtimeGlobalName", value.asInstanceOf[js.Any])
    
    inline def setRuntimeGlobalNameUndefined: Self = StObject.set(x, "runtimeGlobalName", js.undefined)
    
    inline def setRuntimeModuleName(value: String): Self = StObject.set(x, "runtimeModuleName", value.asInstanceOf[js.Any])
    
    inline def setRuntimeModuleNameUndefined: Self = StObject.set(x, "runtimeModuleName", js.undefined)
    
    inline def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    inline def setScopeIdNull: Self = StObject.set(x, "scopeId", null)
    
    inline def setScopeIdUndefined: Self = StObject.set(x, "scopeId", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setSsrRuntimeModuleName(value: String): Self = StObject.set(x, "ssrRuntimeModuleName", value.asInstanceOf[js.Any])
    
    inline def setSsrRuntimeModuleNameUndefined: Self = StObject.set(x, "ssrRuntimeModuleName", js.undefined)
  }
}
