package typings.vueCompilerCore.mod

import typings.babelParser.mod.ParserPlugin
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformOptions extends js.Object {
  
  /**
    * Optional binding metadata analyzed from script - used to optimize
    * binding access when `prefixIdentifiers` is enabled.
    */
  var bindingMetadata: js.UndefOr[BindingMetadata] = js.native
  
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
  var cacheHandlers: js.UndefOr[Boolean] = js.native
  
  /**
    * An object of { name: transform } to be applied to every directive attribute
    * node found on element nodes.
    */
  var directiveTransforms: js.UndefOr[Record[String, js.UndefOr[DirectiveTransform]]] = js.native
  
  /**
    * A list of parser plugins to enable for `@babel/parser`, which is used to
    * parse expressions in bindings and interpolations.
    * https://babeljs.io/docs/en/next/babel-parser#plugins
    */
  var expressionPlugins: js.UndefOr[js.Array[ParserPlugin]] = js.native
  
  /**
    * Hoist static VNodes and props objects to `_hoisted_x` constants
    * @default false
    */
  var hoistStatic: js.UndefOr[Boolean] = js.native
  
  /**
    * If the pairing runtime provides additional built-in elements, use this to
    * mark them as built-in so the compiler will generate component vnodes
    * for them.
    */
  var isBuiltInComponent: js.UndefOr[js.Function1[/* tag */ String, js.Symbol | Unit]] = js.native
  
  /**
    * Used by some transforms that expects only native elements
    */
  var isCustomElement: js.UndefOr[js.Function1[/* tag */ String, Boolean | Unit]] = js.native
  
  /**
    * An array of node transforms to be applied to every AST node.
    */
  var nodeTransforms: js.UndefOr[js.Array[NodeTransform]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ CompilerError, Unit]] = js.native
  
  /**
    * Transform expressions like {{ foo }} to `_ctx.foo`.
    * If this option is false, the generated code will be wrapped in a
    * `with (this) { ... }` block.
    * - This is force-enabled in module mode, since modules are by default strict
    * and cannot use `with`
    * @default mode === 'module'
    */
  var prefixIdentifiers: js.UndefOr[Boolean] = js.native
  
  /**
    * SFC scoped styles ID
    */
  var scopeId: js.UndefOr[String | Null] = js.native
  
  /**
    * Generate SSR-optimized render functions instead.
    * The resulting function must be attached to the component via the
    * `ssrRender` option instead of `render`.
    */
  var ssr: js.UndefOr[Boolean] = js.native
  
  /**
    * SFC `<style vars>` injection string
    * needed to render inline CSS variables on component root
    */
  var ssrCssVars: js.UndefOr[String] = js.native
  
  /**
    * An optional hook to transform a node being hoisted.
    * used by compiler-dom to turn hoisted nodes into stringified HTML vnodes.
    * @default null
    */
  var transformHoist: js.UndefOr[HoistTransform | Null] = js.native
}
object TransformOptions {
  
  @scala.inline
  def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  
  @scala.inline
  implicit class TransformOptionsOps[Self <: TransformOptions] (val x: Self) extends AnyVal {
    
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
    def setCacheHandlers(value: Boolean): Self = this.set("cacheHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheHandlers: Self = this.set("cacheHandlers", js.undefined)
    
    @scala.inline
    def setDirectiveTransforms(value: Record[String, js.UndefOr[DirectiveTransform]]): Self = this.set("directiveTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectiveTransforms: Self = this.set("directiveTransforms", js.undefined)
    
    @scala.inline
    def setExpressionPluginsVarargs(value: ParserPlugin*): Self = this.set("expressionPlugins", js.Array(value :_*))
    
    @scala.inline
    def setExpressionPlugins(value: js.Array[ParserPlugin]): Self = this.set("expressionPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressionPlugins: Self = this.set("expressionPlugins", js.undefined)
    
    @scala.inline
    def setHoistStatic(value: Boolean): Self = this.set("hoistStatic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoistStatic: Self = this.set("hoistStatic", js.undefined)
    
    @scala.inline
    def setIsBuiltInComponent(value: /* tag */ String => js.Symbol | Unit): Self = this.set("isBuiltInComponent", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsBuiltInComponent: Self = this.set("isBuiltInComponent", js.undefined)
    
    @scala.inline
    def setIsCustomElement(value: /* tag */ String => Boolean | Unit): Self = this.set("isCustomElement", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIsCustomElement: Self = this.set("isCustomElement", js.undefined)
    
    @scala.inline
    def setNodeTransformsVarargs(value: NodeTransform*): Self = this.set("nodeTransforms", js.Array(value :_*))
    
    @scala.inline
    def setNodeTransforms(value: js.Array[NodeTransform]): Self = this.set("nodeTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeTransforms: Self = this.set("nodeTransforms", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ CompilerError => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setPrefixIdentifiers(value: Boolean): Self = this.set("prefixIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixIdentifiers: Self = this.set("prefixIdentifiers", js.undefined)
    
    @scala.inline
    def setScopeId(value: String): Self = this.set("scopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeId: Self = this.set("scopeId", js.undefined)
    
    @scala.inline
    def setScopeIdNull: Self = this.set("scopeId", null)
    
    @scala.inline
    def setSsr(value: Boolean): Self = this.set("ssr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsr: Self = this.set("ssr", js.undefined)
    
    @scala.inline
    def setSsrCssVars(value: String): Self = this.set("ssrCssVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsrCssVars: Self = this.set("ssrCssVars", js.undefined)
    
    @scala.inline
    def setTransformHoist(
      value: (/* children */ js.Array[TemplateChildNode], /* context */ TransformContext, /* parent */ ParentNode2) => Unit
    ): Self = this.set("transformHoist", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTransformHoist: Self = this.set("transformHoist", js.undefined)
    
    @scala.inline
    def setTransformHoistNull: Self = this.set("transformHoist", null)
  }
}
