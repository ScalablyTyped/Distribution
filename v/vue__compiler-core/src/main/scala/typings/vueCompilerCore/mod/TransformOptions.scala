package typings.vueCompilerCore.mod

import typings.babelParser.mod.ParserPlugin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformOptions
  extends StObject
     with SharedTransformCodegenOptions
     with ErrorHandlingOptions
     with CompilerCompatOptions {
  
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
    * Hoist static VNodes and props objects to `_hoisted_x` constants
    * @default false
    */
  var hoistStatic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the pairing runtime provides additional built-in elements, use this to
    * mark them as built-in so the compiler will generate component vnodes
    * for them.
    */
  var isBuiltInComponent: js.UndefOr[js.Function1[/* tag */ String, js.Symbol | Unit]] = js.undefined
  
  /**
    * Used by some transforms that expects only native elements
    */
  var isCustomElement: js.UndefOr[js.Function1[/* tag */ String, Boolean | Unit]] = js.undefined
  
  /**
    * An array of node transforms to be applied to every AST node.
    */
  var nodeTransforms: js.UndefOr[js.Array[NodeTransform]] = js.undefined
  
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
    * SFC `<style vars>` injection string
    * Should already be an object expression, e.g. `{ 'xxxx-color': color }`
    * needed to render inline CSS variables on component root
    */
  var ssrCssVars: js.UndefOr[String] = js.undefined
  
  /**
    * An optional hook to transform a node being hoisted.
    * used by compiler-dom to turn hoisted nodes into stringified HTML vnodes.
    * @default null
    */
  var transformHoist: js.UndefOr[HoistTransform | Null] = js.undefined
}
object TransformOptions {
  
  inline def apply(): TransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformOptions]
  }
  
  extension [Self <: TransformOptions](x: Self) {
    
    inline def setCacheHandlers(value: Boolean): Self = StObject.set(x, "cacheHandlers", value.asInstanceOf[js.Any])
    
    inline def setCacheHandlersUndefined: Self = StObject.set(x, "cacheHandlers", js.undefined)
    
    inline def setDirectiveTransforms(value: Record[String, js.UndefOr[DirectiveTransform]]): Self = StObject.set(x, "directiveTransforms", value.asInstanceOf[js.Any])
    
    inline def setDirectiveTransformsUndefined: Self = StObject.set(x, "directiveTransforms", js.undefined)
    
    inline def setExpressionPlugins(value: js.Array[ParserPlugin]): Self = StObject.set(x, "expressionPlugins", value.asInstanceOf[js.Any])
    
    inline def setExpressionPluginsUndefined: Self = StObject.set(x, "expressionPlugins", js.undefined)
    
    inline def setExpressionPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "expressionPlugins", js.Array(value*))
    
    inline def setHoistStatic(value: Boolean): Self = StObject.set(x, "hoistStatic", value.asInstanceOf[js.Any])
    
    inline def setHoistStaticUndefined: Self = StObject.set(x, "hoistStatic", js.undefined)
    
    inline def setIsBuiltInComponent(value: /* tag */ String => js.Symbol | Unit): Self = StObject.set(x, "isBuiltInComponent", js.Any.fromFunction1(value))
    
    inline def setIsBuiltInComponentUndefined: Self = StObject.set(x, "isBuiltInComponent", js.undefined)
    
    inline def setIsCustomElement(value: /* tag */ String => Boolean | Unit): Self = StObject.set(x, "isCustomElement", js.Any.fromFunction1(value))
    
    inline def setIsCustomElementUndefined: Self = StObject.set(x, "isCustomElement", js.undefined)
    
    inline def setNodeTransforms(value: js.Array[NodeTransform]): Self = StObject.set(x, "nodeTransforms", value.asInstanceOf[js.Any])
    
    inline def setNodeTransformsUndefined: Self = StObject.set(x, "nodeTransforms", js.undefined)
    
    inline def setNodeTransformsVarargs(value: NodeTransform*): Self = StObject.set(x, "nodeTransforms", js.Array(value*))
    
    inline def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    inline def setScopeIdNull: Self = StObject.set(x, "scopeId", null)
    
    inline def setScopeIdUndefined: Self = StObject.set(x, "scopeId", js.undefined)
    
    inline def setSlotted(value: Boolean): Self = StObject.set(x, "slotted", value.asInstanceOf[js.Any])
    
    inline def setSlottedUndefined: Self = StObject.set(x, "slotted", js.undefined)
    
    inline def setSsrCssVars(value: String): Self = StObject.set(x, "ssrCssVars", value.asInstanceOf[js.Any])
    
    inline def setSsrCssVarsUndefined: Self = StObject.set(x, "ssrCssVars", js.undefined)
    
    inline def setTransformHoist(
      value: (/* children */ js.Array[TemplateChildNode], /* context */ TransformContext, /* parent */ ParentNode2) => Unit
    ): Self = StObject.set(x, "transformHoist", js.Any.fromFunction3(value))
    
    inline def setTransformHoistNull: Self = StObject.set(x, "transformHoist", null)
    
    inline def setTransformHoistUndefined: Self = StObject.set(x, "transformHoist", js.undefined)
  }
}
