package typings.vueCompilerSfc.mod

import typings.babelParser.mod.ParserPlugin
import typings.vueCompilerSfc.anon.FileExists
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
    * (**Experimental**) Enable macro `defineModel`
    * @default false
    */
  var defineModel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * File system access methods to be used when resolving types
    * imported in SFC macros. Defaults to ts.sys in Node.js, can be overwritten
    * to use a virtual file system for use in browsers (e.g. in REPLs)
    */
  var fs: js.UndefOr[FileExists] = js.undefined
  
  /**
    * Generate the final component as a variable instead of default export.
    * This is useful in e.g. @vitejs/plugin-vue where the script needs to be
    * placed inside the main module.
    */
  var genDefaultAs: js.UndefOr[String] = js.undefined
  
  /**
    * A list of files to parse for global types to be made available for type
    * resolving in SFC macros. The list must be fully resolved file system paths.
    */
  var globalTypeFiles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Hoist <script setup> static constants.
    * - Only enables when one `<script setup>` exists.
    * @default true
    */
  var hoistStatic: js.UndefOr[Boolean] = js.undefined
  
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
    * (**Experimental**) Enable reactive destructure for `defineProps`
    * @default false
    */
  var propsDestructure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Experimental) Enable syntax transform for using refs without `.value` and
    * using destructured props with reactivity
    * @deprecated the Reactivity Transform proposal has been dropped. This
    * feature will be removed from Vue core in 3.4. If you intend to continue
    * using it, disable this and switch to the [Vue Macros implementation](https://vue-macros.sxzz.moe/features/reactivity-transform.html).
    */
  var reactivityTransform: js.UndefOr[Boolean] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SFCScriptCompileOptions] (val x: Self) extends AnyVal {
    
    inline def setBabelParserPlugins(value: js.Array[ParserPlugin]): Self = StObject.set(x, "babelParserPlugins", value.asInstanceOf[js.Any])
    
    inline def setBabelParserPluginsUndefined: Self = StObject.set(x, "babelParserPlugins", js.undefined)
    
    inline def setBabelParserPluginsVarargs(value: ParserPlugin*): Self = StObject.set(x, "babelParserPlugins", js.Array(value*))
    
    inline def setDefineModel(value: Boolean): Self = StObject.set(x, "defineModel", value.asInstanceOf[js.Any])
    
    inline def setDefineModelUndefined: Self = StObject.set(x, "defineModel", js.undefined)
    
    inline def setFs(value: FileExists): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setFsUndefined: Self = StObject.set(x, "fs", js.undefined)
    
    inline def setGenDefaultAs(value: String): Self = StObject.set(x, "genDefaultAs", value.asInstanceOf[js.Any])
    
    inline def setGenDefaultAsUndefined: Self = StObject.set(x, "genDefaultAs", js.undefined)
    
    inline def setGlobalTypeFiles(value: js.Array[String]): Self = StObject.set(x, "globalTypeFiles", value.asInstanceOf[js.Any])
    
    inline def setGlobalTypeFilesUndefined: Self = StObject.set(x, "globalTypeFiles", js.undefined)
    
    inline def setGlobalTypeFilesVarargs(value: String*): Self = StObject.set(x, "globalTypeFiles", js.Array(value*))
    
    inline def setHoistStatic(value: Boolean): Self = StObject.set(x, "hoistStatic", value.asInstanceOf[js.Any])
    
    inline def setHoistStaticUndefined: Self = StObject.set(x, "hoistStatic", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInlineTemplate(value: Boolean): Self = StObject.set(x, "inlineTemplate", value.asInstanceOf[js.Any])
    
    inline def setInlineTemplateUndefined: Self = StObject.set(x, "inlineTemplate", js.undefined)
    
    inline def setIsProd(value: Boolean): Self = StObject.set(x, "isProd", value.asInstanceOf[js.Any])
    
    inline def setIsProdUndefined: Self = StObject.set(x, "isProd", js.undefined)
    
    inline def setPropsDestructure(value: Boolean): Self = StObject.set(x, "propsDestructure", value.asInstanceOf[js.Any])
    
    inline def setPropsDestructureUndefined: Self = StObject.set(x, "propsDestructure", js.undefined)
    
    inline def setReactivityTransform(value: Boolean): Self = StObject.set(x, "reactivityTransform", value.asInstanceOf[js.Any])
    
    inline def setReactivityTransformUndefined: Self = StObject.set(x, "reactivityTransform", js.undefined)
    
    inline def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setTemplateOptions(value: PartialSFCTemplateCompile): Self = StObject.set(x, "templateOptions", value.asInstanceOf[js.Any])
    
    inline def setTemplateOptionsUndefined: Self = StObject.set(x, "templateOptions", js.undefined)
  }
}
