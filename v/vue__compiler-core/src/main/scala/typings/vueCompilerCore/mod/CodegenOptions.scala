package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreStrings.function
import typings.vueCompilerCore.vueCompilerCoreStrings.module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodegenOptions extends StObject {
  
  var bindingMetadata: js.UndefOr[BindingMetadata] = js.undefined
  
  /**
    * Filename for source map generation.
    * @default 'template.vue.html'
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * - `module` mode will generate ES module import statements for helpers
    * and export the render function as the default export.
    * - `function` mode will generate a single `const { helpers... } = Vue`
    * statement and return the render function. It expects `Vue` to be globally
    * available (or passed by wrapping the code with an IIFE). It is meant to be
    * used with `new Function(code)()` to generate a render function at runtime.
    * @default 'function'
    */
  var mode: js.UndefOr[module | function] = js.undefined
  
  /**
    * Option to optimize helper import bindings via variable assignment
    * (only used for webpack code-split)
    * @default false
    */
  var optimizeImports: js.UndefOr[Boolean] = js.undefined
  
  var prefixIdentifiers: js.UndefOr[Boolean] = js.undefined
  
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
  
  var ssr: js.UndefOr[Boolean] = js.undefined
}
object CodegenOptions {
  
  @scala.inline
  def apply(): CodegenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodegenOptions]
  }
  
  @scala.inline
  implicit class CodegenOptionsMutableBuilder[Self <: CodegenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindingMetadata(value: BindingMetadata): Self = StObject.set(x, "bindingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingMetadataUndefined: Self = StObject.set(x, "bindingMetadata", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setMode(value: module | function): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOptimizeImports(value: Boolean): Self = StObject.set(x, "optimizeImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeImportsUndefined: Self = StObject.set(x, "optimizeImports", js.undefined)
    
    @scala.inline
    def setPrefixIdentifiers(value: Boolean): Self = StObject.set(x, "prefixIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixIdentifiersUndefined: Self = StObject.set(x, "prefixIdentifiers", js.undefined)
    
    @scala.inline
    def setRuntimeGlobalName(value: String): Self = StObject.set(x, "runtimeGlobalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeGlobalNameUndefined: Self = StObject.set(x, "runtimeGlobalName", js.undefined)
    
    @scala.inline
    def setRuntimeModuleName(value: String): Self = StObject.set(x, "runtimeModuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeModuleNameUndefined: Self = StObject.set(x, "runtimeModuleName", js.undefined)
    
    @scala.inline
    def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeIdNull: Self = StObject.set(x, "scopeId", null)
    
    @scala.inline
    def setScopeIdUndefined: Self = StObject.set(x, "scopeId", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    @scala.inline
    def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
  }
}
