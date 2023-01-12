package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedTransformCodegenOptions extends StObject {
  
  /**
    * Optional binding metadata analyzed from script - used to optimize
    * binding access when `prefixIdentifiers` is enabled.
    */
  var bindingMetadata: js.UndefOr[BindingMetadata] = js.undefined
  
  /**
    * Filename for source map generation.
    * Also used for self-recursive reference in templates
    * @default 'template.vue.html'
    */
  var filename: js.UndefOr[String] = js.undefined
  
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
    * Transform expressions like {{ foo }} to `_ctx.foo`.
    * If this option is false, the generated code will be wrapped in a
    * `with (this) { ... }` block.
    * - This is force-enabled in module mode, since modules are by default strict
    * and cannot use `with`
    * @default mode === 'module'
    */
  var prefixIdentifiers: js.UndefOr[Boolean] = js.undefined
  
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
}
object SharedTransformCodegenOptions {
  
  inline def apply(): SharedTransformCodegenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedTransformCodegenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedTransformCodegenOptions] (val x: Self) extends AnyVal {
    
    inline def setBindingMetadata(value: BindingMetadata): Self = StObject.set(x, "bindingMetadata", value.asInstanceOf[js.Any])
    
    inline def setBindingMetadataUndefined: Self = StObject.set(x, "bindingMetadata", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setInSSR(value: Boolean): Self = StObject.set(x, "inSSR", value.asInstanceOf[js.Any])
    
    inline def setInSSRUndefined: Self = StObject.set(x, "inSSR", js.undefined)
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
    
    inline def setIsTS(value: Boolean): Self = StObject.set(x, "isTS", value.asInstanceOf[js.Any])
    
    inline def setIsTSUndefined: Self = StObject.set(x, "isTS", js.undefined)
    
    inline def setPrefixIdentifiers(value: Boolean): Self = StObject.set(x, "prefixIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setPrefixIdentifiersUndefined: Self = StObject.set(x, "prefixIdentifiers", js.undefined)
    
    inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
  }
}
