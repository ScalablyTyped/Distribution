package typings.stylableWebpackPlugin.typesMod

import typings.stylableCore.mod.Stylable
import typings.stylableCore.stylableTransformerMod.StylableResults
import typings.stylableCore.stylableTransformerMod.TransformHooks
import typings.stylableOptimizer.mod.StylableOptimizer
import typings.stylableWebpackPlugin.anon.AfterTransform
import typings.stylableWebpackPlugin.anon.Apply
import typings.stylableWebpackPlugin.anon.AutoInit
import typings.stylableWebpackPlugin.anon.ClassNameOptimizations
import typings.stylableWebpackPlugin.anon.DUPLICATEMODULENAMESPACE
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.external
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.isolated
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylableWebpackPluginOptions extends js.Object {
  
  var afterTransform: js.UndefOr[
    (js.Function3[
      /* results */ StylableResults, 
      /* module */ StylableModule, 
      /* stylable */ Stylable, 
      Unit
    ]) | Null
  ] = js.native
  
  var bootstrap: AutoInit = js.native
  
  var createRuntimeChunk: Boolean = js.native
  
  var experimentalHMR: Boolean = js.native
  
  var filename: String = js.native
  
  var generate: AfterTransform = js.native
  
  var globalRuntimeId: String = js.native
  
  var includeCSSInJS: Boolean = js.native
  
  var includeDynamicModulesInCSS: Boolean = js.native
  
  var optimize: ClassNameOptimizations = js.native
  
  var optimizeStylableModulesPerChunks: Boolean = js.native
  
  var optimizer: js.UndefOr[StylableOptimizer] = js.native
  
  var outputCSS: Boolean = js.native
  
  var plugins: js.UndefOr[js.Array[Apply]] = js.native
  
  def requireModule(path: String): js.Any = js.native
  
  var resolveNamespace: js.UndefOr[js.Function0[String]] = js.native
  
  var runtimeMode: isolated | shared | external = js.native
  
  var skipDynamicCSSEmit: Boolean = js.native
  
  var transformHooks: js.UndefOr[TransformHooks] = js.native
  
  var unsafeBuildNamespace: js.UndefOr[Boolean] = js.native
  
  var unsafeMuteDiagnostics: DUPLICATEMODULENAMESPACE = js.native
  
  var useEntryModuleInjection: Boolean = js.native
  
  var useWeakDeps: Boolean = js.native
}
object StylableWebpackPluginOptions {
  
  @scala.inline
  def apply(
    bootstrap: AutoInit,
    createRuntimeChunk: Boolean,
    experimentalHMR: Boolean,
    filename: String,
    generate: AfterTransform,
    globalRuntimeId: String,
    includeCSSInJS: Boolean,
    includeDynamicModulesInCSS: Boolean,
    optimize: ClassNameOptimizations,
    optimizeStylableModulesPerChunks: Boolean,
    outputCSS: Boolean,
    requireModule: String => js.Any,
    runtimeMode: isolated | shared | external,
    skipDynamicCSSEmit: Boolean,
    unsafeMuteDiagnostics: DUPLICATEMODULENAMESPACE,
    useEntryModuleInjection: Boolean,
    useWeakDeps: Boolean
  ): StylableWebpackPluginOptions = {
    val __obj = js.Dynamic.literal(bootstrap = bootstrap.asInstanceOf[js.Any], createRuntimeChunk = createRuntimeChunk.asInstanceOf[js.Any], experimentalHMR = experimentalHMR.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], generate = generate.asInstanceOf[js.Any], globalRuntimeId = globalRuntimeId.asInstanceOf[js.Any], includeCSSInJS = includeCSSInJS.asInstanceOf[js.Any], includeDynamicModulesInCSS = includeDynamicModulesInCSS.asInstanceOf[js.Any], optimize = optimize.asInstanceOf[js.Any], optimizeStylableModulesPerChunks = optimizeStylableModulesPerChunks.asInstanceOf[js.Any], outputCSS = outputCSS.asInstanceOf[js.Any], requireModule = js.Any.fromFunction1(requireModule), runtimeMode = runtimeMode.asInstanceOf[js.Any], skipDynamicCSSEmit = skipDynamicCSSEmit.asInstanceOf[js.Any], unsafeMuteDiagnostics = unsafeMuteDiagnostics.asInstanceOf[js.Any], useEntryModuleInjection = useEntryModuleInjection.asInstanceOf[js.Any], useWeakDeps = useWeakDeps.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylableWebpackPluginOptions]
  }
  
  @scala.inline
  implicit class StylableWebpackPluginOptionsOps[Self <: StylableWebpackPluginOptions] (val x: Self) extends AnyVal {
    
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
    def setBootstrap(value: AutoInit): Self = this.set("bootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRuntimeChunk(value: Boolean): Self = this.set("createRuntimeChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalHMR(value: Boolean): Self = this.set("experimentalHMR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerate(value: AfterTransform): Self = this.set("generate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalRuntimeId(value: String): Self = this.set("globalRuntimeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCSSInJS(value: Boolean): Self = this.set("includeCSSInJS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDynamicModulesInCSS(value: Boolean): Self = this.set("includeDynamicModulesInCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimize(value: ClassNameOptimizations): Self = this.set("optimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeStylableModulesPerChunks(value: Boolean): Self = this.set("optimizeStylableModulesPerChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputCSS(value: Boolean): Self = this.set("outputCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireModule(value: String => js.Any): Self = this.set("requireModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRuntimeMode(value: isolated | shared | external): Self = this.set("runtimeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipDynamicCSSEmit(value: Boolean): Self = this.set("skipDynamicCSSEmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsafeMuteDiagnostics(value: DUPLICATEMODULENAMESPACE): Self = this.set("unsafeMuteDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEntryModuleInjection(value: Boolean): Self = this.set("useEntryModuleInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseWeakDeps(value: Boolean): Self = this.set("useWeakDeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterTransform(
      value: (/* results */ StylableResults, /* module */ StylableModule, /* stylable */ Stylable) => Unit
    ): Self = this.set("afterTransform", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterTransform: Self = this.set("afterTransform", js.undefined)
    
    @scala.inline
    def setAfterTransformNull: Self = this.set("afterTransform", null)
    
    @scala.inline
    def setOptimizer(value: StylableOptimizer): Self = this.set("optimizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizer: Self = this.set("optimizer", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: Apply*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[Apply]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setResolveNamespace(value: () => String): Self = this.set("resolveNamespace", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteResolveNamespace: Self = this.set("resolveNamespace", js.undefined)
    
    @scala.inline
    def setTransformHooks(value: TransformHooks): Self = this.set("transformHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformHooks: Self = this.set("transformHooks", js.undefined)
    
    @scala.inline
    def setUnsafeBuildNamespace(value: Boolean): Self = this.set("unsafeBuildNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafeBuildNamespace: Self = this.set("unsafeBuildNamespace", js.undefined)
  }
}
