package typings.stylableWebpackPlugin.anon

import typings.stylableCore.mod.Stylable
import typings.stylableCore.stylableTransformerMod.StylableResults
import typings.stylableCore.stylableTransformerMod.TransformHooks
import typings.stylableOptimizer.mod.StylableOptimizer
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.external
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.isolated
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.shared
import typings.stylableWebpackPlugin.typesMod.StylableModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@stylable/webpack-plugin.@stylable/webpack-plugin/cjs/types.StylableWebpackPluginOptions> */
@js.native
trait PartialStylableWebpackPlu extends StObject {
  
  var afterTransform: js.UndefOr[
    (js.Function3[
      /* results */ StylableResults, 
      /* module */ StylableModule, 
      /* stylable */ Stylable, 
      Unit
    ]) | Null
  ] = js.native
  
  var bootstrap: js.UndefOr[AutoInit] = js.native
  
  var createRuntimeChunk: js.UndefOr[Boolean] = js.native
  
  var experimentalHMR: js.UndefOr[Boolean] = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var generate: js.UndefOr[AfterTransform] = js.native
  
  var globalRuntimeId: js.UndefOr[String] = js.native
  
  var includeCSSInJS: js.UndefOr[Boolean] = js.native
  
  var includeDynamicModulesInCSS: js.UndefOr[Boolean] = js.native
  
  var optimize: js.UndefOr[ClassNameOptimizations] = js.native
  
  var optimizeStylableModulesPerChunks: js.UndefOr[Boolean] = js.native
  
  var optimizer: js.UndefOr[StylableOptimizer] = js.native
  
  var outputCSS: js.UndefOr[Boolean] = js.native
  
  var plugins: js.UndefOr[js.Array[Apply]] = js.native
  
  var requireModule: js.UndefOr[js.Function1[/* path */ String, _]] = js.native
  
  var resolveNamespace: js.UndefOr[js.Function0[String]] = js.native
  
  var runtimeMode: js.UndefOr[isolated | shared | external] = js.native
  
  var skipDynamicCSSEmit: js.UndefOr[Boolean] = js.native
  
  var transformHooks: js.UndefOr[TransformHooks] = js.native
  
  var unsafeBuildNamespace: js.UndefOr[Boolean] = js.native
  
  var unsafeMuteDiagnostics: js.UndefOr[DUPLICATEMODULENAMESPACE] = js.native
  
  var useEntryModuleInjection: js.UndefOr[Boolean] = js.native
  
  var useWeakDeps: js.UndefOr[Boolean] = js.native
}
object PartialStylableWebpackPlu {
  
  @scala.inline
  def apply(): PartialStylableWebpackPlu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStylableWebpackPlu]
  }
  
  @scala.inline
  implicit class PartialStylableWebpackPluMutableBuilder[Self <: PartialStylableWebpackPlu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterTransform(
      value: (/* results */ StylableResults, /* module */ StylableModule, /* stylable */ Stylable) => Unit
    ): Self = StObject.set(x, "afterTransform", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterTransformNull: Self = StObject.set(x, "afterTransform", null)
    
    @scala.inline
    def setAfterTransformUndefined: Self = StObject.set(x, "afterTransform", js.undefined)
    
    @scala.inline
    def setBootstrap(value: AutoInit): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapUndefined: Self = StObject.set(x, "bootstrap", js.undefined)
    
    @scala.inline
    def setCreateRuntimeChunk(value: Boolean): Self = StObject.set(x, "createRuntimeChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRuntimeChunkUndefined: Self = StObject.set(x, "createRuntimeChunk", js.undefined)
    
    @scala.inline
    def setExperimentalHMR(value: Boolean): Self = StObject.set(x, "experimentalHMR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalHMRUndefined: Self = StObject.set(x, "experimentalHMR", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    @scala.inline
    def setGenerate(value: AfterTransform): Self = StObject.set(x, "generate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
    
    @scala.inline
    def setGlobalRuntimeId(value: String): Self = StObject.set(x, "globalRuntimeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalRuntimeIdUndefined: Self = StObject.set(x, "globalRuntimeId", js.undefined)
    
    @scala.inline
    def setIncludeCSSInJS(value: Boolean): Self = StObject.set(x, "includeCSSInJS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeCSSInJSUndefined: Self = StObject.set(x, "includeCSSInJS", js.undefined)
    
    @scala.inline
    def setIncludeDynamicModulesInCSS(value: Boolean): Self = StObject.set(x, "includeDynamicModulesInCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDynamicModulesInCSSUndefined: Self = StObject.set(x, "includeDynamicModulesInCSS", js.undefined)
    
    @scala.inline
    def setOptimize(value: ClassNameOptimizations): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeStylableModulesPerChunks(value: Boolean): Self = StObject.set(x, "optimizeStylableModulesPerChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizeStylableModulesPerChunksUndefined: Self = StObject.set(x, "optimizeStylableModulesPerChunks", js.undefined)
    
    @scala.inline
    def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
    
    @scala.inline
    def setOptimizer(value: StylableOptimizer): Self = StObject.set(x, "optimizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizerUndefined: Self = StObject.set(x, "optimizer", js.undefined)
    
    @scala.inline
    def setOutputCSS(value: Boolean): Self = StObject.set(x, "outputCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputCSSUndefined: Self = StObject.set(x, "outputCSS", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Array[Apply]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: Apply*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setRequireModule(value: /* path */ String => _): Self = StObject.set(x, "requireModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireModuleUndefined: Self = StObject.set(x, "requireModule", js.undefined)
    
    @scala.inline
    def setResolveNamespace(value: () => String): Self = StObject.set(x, "resolveNamespace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResolveNamespaceUndefined: Self = StObject.set(x, "resolveNamespace", js.undefined)
    
    @scala.inline
    def setRuntimeMode(value: isolated | shared | external): Self = StObject.set(x, "runtimeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeModeUndefined: Self = StObject.set(x, "runtimeMode", js.undefined)
    
    @scala.inline
    def setSkipDynamicCSSEmit(value: Boolean): Self = StObject.set(x, "skipDynamicCSSEmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipDynamicCSSEmitUndefined: Self = StObject.set(x, "skipDynamicCSSEmit", js.undefined)
    
    @scala.inline
    def setTransformHooks(value: TransformHooks): Self = StObject.set(x, "transformHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformHooksUndefined: Self = StObject.set(x, "transformHooks", js.undefined)
    
    @scala.inline
    def setUnsafeBuildNamespace(value: Boolean): Self = StObject.set(x, "unsafeBuildNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsafeBuildNamespaceUndefined: Self = StObject.set(x, "unsafeBuildNamespace", js.undefined)
    
    @scala.inline
    def setUnsafeMuteDiagnostics(value: DUPLICATEMODULENAMESPACE): Self = StObject.set(x, "unsafeMuteDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsafeMuteDiagnosticsUndefined: Self = StObject.set(x, "unsafeMuteDiagnostics", js.undefined)
    
    @scala.inline
    def setUseEntryModuleInjection(value: Boolean): Self = StObject.set(x, "useEntryModuleInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseEntryModuleInjectionUndefined: Self = StObject.set(x, "useEntryModuleInjection", js.undefined)
    
    @scala.inline
    def setUseWeakDeps(value: Boolean): Self = StObject.set(x, "useWeakDeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseWeakDepsUndefined: Self = StObject.set(x, "useWeakDeps", js.undefined)
  }
}
