package typings.vueCompilerCore.anon

import typings.vueCompilerCore.mod.BindingMetadata
import typings.vueCompilerCore.mod.CodegenContext
import typings.vueCompilerCore.vueCompilerCoreStrings.function
import typings.vueCompilerCore.vueCompilerCoreStrings.module
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @vue/compiler-core.@vue/compiler-core.CodegenOptions & {  onContextCreated :(context : @vue/compiler-core.@vue/compiler-core.CodegenContext): void | undefined} */
@js.native
trait CodegenOptionsonContextCr extends js.Object {
  
  var bindingMetadata: js.UndefOr[BindingMetadata] = js.native
  
  /**
    * Filename for source map generation.
    * @default 'template.vue.html'
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * - `module` mode will generate ES module import statements for helpers
    * and export the render function as the default export.
    * - `function` mode will generate a single `const { helpers... } = Vue`
    * statement and return the render function. It expects `Vue` to be globally
    * available (or passed by wrapping the code with an IIFE). It is meant to be
    * used with `new Function(code)()` to generate a render function at runtime.
    * @default 'function'
    */
  var mode: js.UndefOr[module | function] = js.native
  
  var onContextCreated: js.UndefOr[js.Function1[/* context */ CodegenContext, Unit]] = js.native
  
  /**
    * Option to optimize helper import bindings via variable assignment
    * (only used for webpack code-split)
    * @default false
    */
  var optimizeImports: js.UndefOr[Boolean] = js.native
  
  var prefixIdentifiers: js.UndefOr[Boolean] = js.native
  
  /**
    * Customize the global variable name of `Vue` to get helpers from
    * in function mode
    * @default 'Vue'
    */
  var runtimeGlobalName: js.UndefOr[String] = js.native
  
  /**
    * Customize where to import runtime helpers from.
    * @default 'vue'
    */
  var runtimeModuleName: js.UndefOr[String] = js.native
  
  /**
    * SFC scoped styles ID
    */
  var scopeId: js.UndefOr[String | Null] = js.native
  
  /**
    * Generate source map?
    * @default false
    */
  var sourceMap: js.UndefOr[Boolean] = js.native
  
  var ssr: js.UndefOr[Boolean] = js.native
}
object CodegenOptionsonContextCr {
  
  @scala.inline
  def apply(): CodegenOptionsonContextCr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodegenOptionsonContextCr]
  }
  
  @scala.inline
  implicit class CodegenOptionsonContextCrOps[Self <: CodegenOptionsonContextCr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindingMetadata(value: BindingMetadata): Self = this.set("bindingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindingMetadata: Self = this.set("bindingMetadata", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setMode(value: module | function): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnContextCreated(value: /* context */ CodegenContext => Unit): Self = this.set("onContextCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnContextCreated: Self = this.set("onContextCreated", js.undefined)
    
    @scala.inline
    def setOptimizeImports(value: Boolean): Self = this.set("optimizeImports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeImports: Self = this.set("optimizeImports", js.undefined)
    
    @scala.inline
    def setPrefixIdentifiers(value: Boolean): Self = this.set("prefixIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixIdentifiers: Self = this.set("prefixIdentifiers", js.undefined)
    
    @scala.inline
    def setRuntimeGlobalName(value: String): Self = this.set("runtimeGlobalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeGlobalName: Self = this.set("runtimeGlobalName", js.undefined)
    
    @scala.inline
    def setRuntimeModuleName(value: String): Self = this.set("runtimeModuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeModuleName: Self = this.set("runtimeModuleName", js.undefined)
    
    @scala.inline
    def setScopeId(value: String): Self = this.set("scopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeId: Self = this.set("scopeId", js.undefined)
    
    @scala.inline
    def setScopeIdNull: Self = this.set("scopeId", null)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    
    @scala.inline
    def setSsr(value: Boolean): Self = this.set("ssr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsr: Self = this.set("ssr", js.undefined)
  }
}
