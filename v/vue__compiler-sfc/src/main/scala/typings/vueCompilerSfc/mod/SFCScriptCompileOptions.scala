package typings.vueCompilerSfc.mod

import typings.babelParser.mod.ParserPlugin
import typings.vueCompilerSfc.anon.PartialSFCTemplateCompile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCScriptCompileOptions extends StObject {
  
  /**
    * https://babeljs.io/docs/en/babel-parser#plugins
    */
  var babelParserPlugins: js.UndefOr[js.Array[ParserPlugin]] = js.undefined
  
  /**
    * Scope ID for prefixing injected CSS variables.
    * This must be consistent with the `id` passed to `compileStyle`.
    */
  var id: String
  
  /**
    * Compile the template and inline the resulting render function
    * directly inside setup().
    * - Only affects `<script setup>`
    * - This should only be used in production because it prevents the template
    * from being hot-reloaded separately from component state.
    */
  var inlineTemplate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Production mode. Used to determine whether to generate hashed CSS variables
    */
  var isProd: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Experimental) Enable syntax transform for destructuring from defineProps()
    * https://github.com/vuejs/rfcs/discussions/394
    * @deprecated now part of `reactivityTransform`
    * @default false
    */
  var propsDestructureTransform: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Experimental) Enable syntax transform for using refs without `.value` and
    * using destructured props with reactivity
    */
  var reactivityTransform: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated use `reactivityTransform` instead.
    */
  var refSugar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Experimental) Enable syntax transform for using refs without `.value`
    * https://github.com/vuejs/rfcs/discussions/369
    * @deprecated now part of `reactivityTransform`
    * @default false
    */
  var refTransform: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable/disable source map. Defaults to true.
    */
  var sourceMap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Options for template compilation when inlining. Note these are options that
    * would normally be passed to `compiler-sfc`'s own `compileTemplate()`, not
    * options passed to `compiler-dom`.
    */
  var templateOptions: js.UndefOr[PartialSFCTemplateCompile] = js.undefined
}
object SFCScriptCompileOptions {
  
  inline def apply(id: String): SFCScriptCompileOptions = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCScriptCompileOptions]
  }
  
  extension [Self <: SFCScriptCompileOptions](x: Self) {
    
    inline def setBabelParserPlugins(value: js.Array[ParserPlugin]): Self = StObject.set(x, "babelParserPlugins", value.asInstanceOf[js.Any])
    
    inline def setBabelParserPluginsUndefined: Self = StObject.set(x, "babelParserPlugins", js.undefined)
    
    inline def setBabelParserPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "babelParserPlugins", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInlineTemplate(value: Boolean): Self = StObject.set(x, "inlineTemplate", value.asInstanceOf[js.Any])
    
    inline def setInlineTemplateUndefined: Self = StObject.set(x, "inlineTemplate", js.undefined)
    
    inline def setIsProd(value: Boolean): Self = StObject.set(x, "isProd", value.asInstanceOf[js.Any])
    
    inline def setIsProdUndefined: Self = StObject.set(x, "isProd", js.undefined)
    
    inline def setPropsDestructureTransform(value: Boolean): Self = StObject.set(x, "propsDestructureTransform", value.asInstanceOf[js.Any])
    
    inline def setPropsDestructureTransformUndefined: Self = StObject.set(x, "propsDestructureTransform", js.undefined)
    
    inline def setReactivityTransform(value: Boolean): Self = StObject.set(x, "reactivityTransform", value.asInstanceOf[js.Any])
    
    inline def setReactivityTransformUndefined: Self = StObject.set(x, "reactivityTransform", js.undefined)
    
    inline def setRefSugar(value: Boolean): Self = StObject.set(x, "refSugar", value.asInstanceOf[js.Any])
    
    inline def setRefSugarUndefined: Self = StObject.set(x, "refSugar", js.undefined)
    
    inline def setRefTransform(value: Boolean): Self = StObject.set(x, "refTransform", value.asInstanceOf[js.Any])
    
    inline def setRefTransformUndefined: Self = StObject.set(x, "refTransform", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setTemplateOptions(value: PartialSFCTemplateCompile): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
    
    inline def setTemplateOptionsUndefined: Self = StObject.set(x, "templateOptions", js.undefined)
  }
}
