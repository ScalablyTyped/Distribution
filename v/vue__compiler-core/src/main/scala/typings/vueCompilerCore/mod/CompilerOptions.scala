package typings.vueCompilerCore.mod

import typings.babelParser.mod.ParserPlugin
import typings.std.Record
import typings.vueCompilerCore.vueCompilerCoreStrings.function
import typings.vueCompilerCore.vueCompilerCoreStrings.module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.vueCompilerCore.mod.CompilerCompatOptions because Already inherited
- typings.vueCompilerCore.mod.ErrorHandlingOptions because Already inherited
- typings.vueCompilerCore.mod.SharedTransformCodegenOptions because var conflicts: prefixIdentifiers. Inlined ssr, inSSR, bindingMetadata, `inline`, isTS, filename
- typings.vueCompilerCore.mod.CodegenOptions because var conflicts: prefixIdentifiers, scopeId. Inlined mode, sourceMap, optimizeImports, runtimeModuleName, ssrRuntimeModuleName, runtimeGlobalName
- typings.vueCompilerCore.mod.TransformOptions because var conflicts: compatConfig, isBuiltInComponent, isCustomElement, onError, onWarn. Inlined nodeTransforms, directiveTransforms, transformHoist, prefixIdentifiers, hoistStatic, cacheHandlers, expressionPlugins, scopeId, slotted, ssrCssVars */ trait CompilerOptions
  extends StObject
     with ParserOptions {
  
  /**
    * Optional binding metadata analyzed from script - used to optimize
    * binding access when `prefixIdentifiers` is enabled.
    */
  var bindingMetadata: js.UndefOr[BindingMetadata] = js.undefined
  
  /**
    * Cache v-on handlers to avoid creating new inline functions on each render,
    * also avoids the need for dynamically patching the handlers by wrapping it.
    * e.g `@click="foo"` by default is compiled to `{ onClick: foo }`. With this
    * option it's compiled to:
    * ```js
    * { onClick: _cache[0] || (_cache[0] = e => _ctx.foo(e)) }
    * ```
    * - Requires "prefixIdentifiers" to be enabled because it relies on scope
    * analysis to determine if a handler is safe to cache.
    * @default false
    */
  var cacheHandlers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object of { name: transform } to be applied to every directive attribute
    * node found on element nodes.
    */
  var directiveTransforms: js.UndefOr[Record[String, js.UndefOr[DirectiveTransform]]] = js.undefined
  
  /**
    * A list of parser plugins to enable for `@babel/parser`, which is used to
    * parse expressions in bindings and interpolations.
    * https://babeljs.io/docs/en/next/babel-parser#plugins
    */
  var expressionPlugins: js.UndefOr[js.Array[ParserPlugin]] = js.undefined
  
  /**
    * Filename for source map generation.
    * Also used for self-recursive reference in templates
    * @default 'template.vue.html'
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * Hoist static VNodes and props objects to `_hoisted_x` constants
    * @default false
    */
  var hoistStatic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the compiler generates code for SSR,
    * it is always true when generating code for SSR,
    * regardless of whether we are generating code for SSR's fallback branch,
    * this means that when the compiler generates code for SSR's fallback branch:
    *  - context.ssr = false
    *  - context.inSSR = true
    */
  var inSSR: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Compile the function for inlining inside setup().
    * This allows the function to directly access setup() local bindings.
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates that transforms and codegen should try to output valid TS code
    */
  var isTS: js.UndefOr[Boolean] = js.undefined
  
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
    * An array of node transforms to be applied to every AST node.
    */
  var nodeTransforms: js.UndefOr[js.Array[NodeTransform]] = js.undefined
  
  /**
    * Option to optimize helper import bindings via variable assignment
    * (only used for webpack code-split)
    * @default false
    */
  var optimizeImports: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Transform expressions like {{ foo }} to `_ctx.foo`.
    * If this option is false, the generated code will be wrapped in a
    * `with (this) { ... }` block.
    * - This is force-enabled in module mode, since modules are by default strict
    * and cannot use `with`
    * @default mode === 'module'
    */
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
    * Indicates this SFC template has used :slotted in its styles
    * Defaults to `true` for backwards compatibility - SFC tooling should set it
    * to `false` if no `:slotted` usage is detected in `<style>`
    */
  var slotted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Generate source map?
    * @default false
    */
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Control whether generate SSR-optimized render functions instead.
    * The resulting function must be attached to the component via the
    * `ssrRender` option instead of `render`.
    *
    * When compiler generates code for SSR's fallback branch, we need to set it to false:
    *  - context.ssr = false
    *
    * see `subTransform` in `ssrTransformComponent.ts`
    */
  var ssr: js.UndefOr[Boolean] = js.undefined
  
  /**
    * SFC `<style vars>` injection string
    * Should already be an object expression, e.g. `{ 'xxxx-color': color }`
    * needed to render inline CSS variables on component root
    */
  var ssrCssVars: js.UndefOr[String] = js.undefined
  
  /**
    * Customize where to import ssr runtime helpers from/ **
    * @default 'vue/server-renderer'
    */
  var ssrRuntimeModuleName: js.UndefOr[String] = js.undefined
  
  /**
    * An optional hook to transform a node being hoisted.
    * used by compiler-dom to turn hoisted nodes into stringified HTML vnodes.
    * @default null
    */
  var transformHoist: js.UndefOr[HoistTransform | Null] = js.undefined
}
object CompilerOptions {
  
  inline def apply(): CompilerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompilerOptions] (val x: Self) extends AnyVal {
    
    inline def setBindingMetadata(value: BindingMetadata): Self = StObject.set(x, "bindingMetadata", value.asInstanceOf[js.Any])
    
    inline def setBindingMetadataUndefined: Self = StObject.set(x, "bindingMetadata", js.undefined)
    
    inline def setCacheHandlers(value: Boolean): Self = StObject.set(x, "cacheHandlers", value.asInstanceOf[js.Any])
    
    inline def setCacheHandlersUndefined: Self = StObject.set(x, "cacheHandlers", js.undefined)
    
    inline def setDirectiveTransforms(value: Record[String, js.UndefOr[DirectiveTransform]]): Self = StObject.set(x, "directiveTransforms", value.asInstanceOf[js.Any])
    
    inline def setDirectiveTransformsUndefined: Self = StObject.set(x, "directiveTransforms", js.undefined)
    
    inline def setExpressionPlugins(value: js.Array[ParserPlugin]): Self = StObject.set(x, "expressionPlugins", value.asInstanceOf[js.Any])
    
    inline def setExpressionPluginsUndefined: Self = StObject.set(x, "expressionPlugins", js.undefined)
    
    inline def setExpressionPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "expressionPlugins", js.Array(value*))
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setHoistStatic(value: Boolean): Self = StObject.set(x, "hoistStatic", value.asInstanceOf[js.Any])
    
    inline def setHoistStaticUndefined: Self = StObject.set(x, "hoistStatic", js.undefined)
    
    inline def setInSSR(value: Boolean): Self = StObject.set(x, "inSSR", value.asInstanceOf[js.Any])
    
    inline def setInSSRUndefined: Self = StObject.set(x, "inSSR", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setIsTS(value: Boolean): Self = StObject.set(x, "isTS", value.asInstanceOf[js.Any])
    
    inline def setIsTSUndefined: Self = StObject.set(x, "isTS", js.undefined)
    
    inline def setMode(value: module | function): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNodeTransforms(value: js.Array[NodeTransform]): Self = StObject.set(x, "nodeTransforms", value.asInstanceOf[js.Any])
    
    inline def setNodeTransformsUndefined: Self = StObject.set(x, "nodeTransforms", js.undefined)
    
    inline def setNodeTransformsVarargs(value: NodeTransform*): Self = StObject.set(x, "nodeTransforms", js.Array(value*))
    
    inline def setOptimizeImports(value: Boolean): Self = StObject.set(x, "optimizeImports", value.asInstanceOf[js.Any])
    
    inline def setOptimizeImportsUndefined: Self = StObject.set(x, "optimizeImports", js.undefined)
    
    inline def setPrefixIdentifiers(value: Boolean): Self = StObject.set(x, "prefixIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setPrefixIdentifiersUndefined: Self = StObject.set(x, "prefixIdentifiers", js.undefined)
    
    inline def setRuntimeGlobalName(value: String): Self = StObject.set(x, "runtimeGlobalName", value.asInstanceOf[js.Any])
    
    inline def setRuntimeGlobalNameUndefined: Self = StObject.set(x, "runtimeGlobalName", js.undefined)
    
    inline def setRuntimeModuleName(value: String): Self = StObject.set(x, "runtimeModuleName", value.asInstanceOf[js.Any])
    
    inline def setRuntimeModuleNameUndefined: Self = StObject.set(x, "runtimeModuleName", js.undefined)
    
    inline def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    inline def setScopeIdNull: Self = StObject.set(x, "scopeId", null)
    
    inline def setScopeIdUndefined: Self = StObject.set(x, "scopeId", js.undefined)
    
    inline def setSlotted(value: Boolean): Self = StObject.set(x, "slotted", value.asInstanceOf[js.Any])
    
    inline def setSlottedUndefined: Self = StObject.set(x, "slotted", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setSsrCssVars(value: String): Self = StObject.set(x, "ssrCssVars", value.asInstanceOf[js.Any])
    
    inline def setSsrCssVarsUndefined: Self = StObject.set(x, "ssrCssVars", js.undefined)
    
    inline def setSsrRuntimeModuleName(value: String): Self = StObject.set(x, "ssrRuntimeModuleName", value.asInstanceOf[js.Any])
    
    inline def setSsrRuntimeModuleNameUndefined: Self = StObject.set(x, "ssrRuntimeModuleName", js.undefined)
    
    inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    
    inline def setTransformHoist(
      value: (/* children */ js.Array[TemplateChildNode], /* context */ TransformContext, /* parent */ ParentNode2) => Unit
    ): Self = StObject.set(x, "transformHoist", js.Any.fromFunction3(value))
    
    inline def setTransformHoistNull: Self = StObject.set(x, "transformHoist", null)
    
    inline def setTransformHoistUndefined: Self = StObject.set(x, "transformHoist", js.undefined)
  }
}
