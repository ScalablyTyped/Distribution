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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@stylable/webpack-plugin.@stylable/webpack-plugin/cjs/types.StylableWebpackPluginOptions> */
trait PartialStylableWebpackPlu extends StObject {
  
  var afterTransform: js.UndefOr[
    (js.Function3[
      /* results */ StylableResults, 
      /* module */ StylableModule, 
      /* stylable */ Stylable, 
      Unit
    ]) | Null
  ] = js.undefined
  
  var bootstrap: js.UndefOr[AutoInit] = js.undefined
  
  var createRuntimeChunk: js.UndefOr[Boolean] = js.undefined
  
  var experimentalHMR: js.UndefOr[Boolean] = js.undefined
  
  var filename: js.UndefOr[String] = js.undefined
  
  var generate: js.UndefOr[AfterTransform] = js.undefined
  
  var globalRuntimeId: js.UndefOr[String] = js.undefined
  
  var includeCSSInJS: js.UndefOr[Boolean] = js.undefined
  
  var includeDynamicModulesInCSS: js.UndefOr[Boolean] = js.undefined
  
  var optimize: js.UndefOr[ClassNameOptimizations] = js.undefined
  
  var optimizeStylableModulesPerChunks: js.UndefOr[Boolean] = js.undefined
  
  var optimizer: js.UndefOr[StylableOptimizer] = js.undefined
  
  var outputCSS: js.UndefOr[Boolean] = js.undefined
  
  var plugins: js.UndefOr[js.Array[Apply]] = js.undefined
  
  var requireModule: js.UndefOr[js.Function1[/* path */ String, js.Any]] = js.undefined
  
  var resolveNamespace: js.UndefOr[js.Function0[String]] = js.undefined
  
  var runtimeMode: js.UndefOr[isolated | shared | external] = js.undefined
  
  var skipDynamicCSSEmit: js.UndefOr[Boolean] = js.undefined
  
  var transformHooks: js.UndefOr[TransformHooks] = js.undefined
  
  var unsafeBuildNamespace: js.UndefOr[Boolean] = js.undefined
  
  var unsafeMuteDiagnostics: js.UndefOr[DUPLICATEMODULENAMESPACE] = js.undefined
  
  var useEntryModuleInjection: js.UndefOr[Boolean] = js.undefined
  
  var useWeakDeps: js.UndefOr[Boolean] = js.undefined
}
object PartialStylableWebpackPlu {
  
  inline def apply(): PartialStylableWebpackPlu = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStylableWebpackPlu]
  }
  
  extension [Self <: PartialStylableWebpackPlu](x: Self) {
    
    inline def setAfterTransform(
      value: (/* results */ StylableResults, /* module */ StylableModule, /* stylable */ Stylable) => Unit
    ): Self = StObject.set(x, "afterTransform", js.Any.fromFunction3(value))
    
    inline def setAfterTransformNull: Self = StObject.set(x, "afterTransform", null)
    
    inline def setAfterTransformUndefined: Self = StObject.set(x, "afterTransform", js.undefined)
    
    inline def setBootstrap(value: AutoInit): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setBootstrapUndefined: Self = StObject.set(x, "bootstrap", js.undefined)
    
    inline def setCreateRuntimeChunk(value: Boolean): Self = StObject.set(x, "createRuntimeChunk", value.asInstanceOf[js.Any])
    
    inline def setCreateRuntimeChunkUndefined: Self = StObject.set(x, "createRuntimeChunk", js.undefined)
    
    inline def setExperimentalHMR(value: Boolean): Self = StObject.set(x, "experimentalHMR", value.asInstanceOf[js.Any])
    
    inline def setExperimentalHMRUndefined: Self = StObject.set(x, "experimentalHMR", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setGenerate(value: AfterTransform): Self = StObject.set(x, "generate", value.asInstanceOf[js.Any])
    
    inline def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
    
    inline def setGlobalRuntimeId(value: String): Self = StObject.set(x, "globalRuntimeId", value.asInstanceOf[js.Any])
    
    inline def setGlobalRuntimeIdUndefined: Self = StObject.set(x, "globalRuntimeId", js.undefined)
    
    inline def setIncludeCSSInJS(value: Boolean): Self = StObject.set(x, "includeCSSInJS", value.asInstanceOf[js.Any])
    
    inline def setIncludeCSSInJSUndefined: Self = StObject.set(x, "includeCSSInJS", js.undefined)
    
    inline def setIncludeDynamicModulesInCSS(value: Boolean): Self = StObject.set(x, "includeDynamicModulesInCSS", value.asInstanceOf[js.Any])
    
    inline def setIncludeDynamicModulesInCSSUndefined: Self = StObject.set(x, "includeDynamicModulesInCSS", js.undefined)
    
    inline def setOptimize(value: ClassNameOptimizations): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
    
    inline def setOptimizeStylableModulesPerChunks(value: Boolean): Self = StObject.set(x, "optimizeStylableModulesPerChunks", value.asInstanceOf[js.Any])
    
    inline def setOptimizeStylableModulesPerChunksUndefined: Self = StObject.set(x, "optimizeStylableModulesPerChunks", js.undefined)
    
    inline def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
    
    inline def setOptimizer(value: StylableOptimizer): Self = StObject.set(x, "optimizer", value.asInstanceOf[js.Any])
    
    inline def setOptimizerUndefined: Self = StObject.set(x, "optimizer", js.undefined)
    
    inline def setOutputCSS(value: Boolean): Self = StObject.set(x, "outputCSS", value.asInstanceOf[js.Any])
    
    inline def setOutputCSSUndefined: Self = StObject.set(x, "outputCSS", js.undefined)
    
    inline def setPlugins(value: js.Array[Apply]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    inline def setPluginsVarargs(value: Apply*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    inline def setRequireModule(value: /* path */ String => js.Any): Self = StObject.set(x, "requireModule", js.Any.fromFunction1(value))
    
    inline def setRequireModuleUndefined: Self = StObject.set(x, "requireModule", js.undefined)
    
    inline def setResolveNamespace(value: () => String): Self = StObject.set(x, "resolveNamespace", js.Any.fromFunction0(value))
    
    inline def setResolveNamespaceUndefined: Self = StObject.set(x, "resolveNamespace", js.undefined)
    
    inline def setRuntimeMode(value: isolated | shared | external): Self = StObject.set(x, "runtimeMode", value.asInstanceOf[js.Any])
    
    inline def setRuntimeModeUndefined: Self = StObject.set(x, "runtimeMode", js.undefined)
    
    inline def setSkipDynamicCSSEmit(value: Boolean): Self = StObject.set(x, "skipDynamicCSSEmit", value.asInstanceOf[js.Any])
    
    inline def setSkipDynamicCSSEmitUndefined: Self = StObject.set(x, "skipDynamicCSSEmit", js.undefined)
    
    inline def setTransformHooks(value: TransformHooks): Self = StObject.set(x, "transformHooks", value.asInstanceOf[js.Any])
    
    inline def setTransformHooksUndefined: Self = StObject.set(x, "transformHooks", js.undefined)
    
    inline def setUnsafeBuildNamespace(value: Boolean): Self = StObject.set(x, "unsafeBuildNamespace", value.asInstanceOf[js.Any])
    
    inline def setUnsafeBuildNamespaceUndefined: Self = StObject.set(x, "unsafeBuildNamespace", js.undefined)
    
    inline def setUnsafeMuteDiagnostics(value: DUPLICATEMODULENAMESPACE): Self = StObject.set(x, "unsafeMuteDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setUnsafeMuteDiagnosticsUndefined: Self = StObject.set(x, "unsafeMuteDiagnostics", js.undefined)
    
    inline def setUseEntryModuleInjection(value: Boolean): Self = StObject.set(x, "useEntryModuleInjection", value.asInstanceOf[js.Any])
    
    inline def setUseEntryModuleInjectionUndefined: Self = StObject.set(x, "useEntryModuleInjection", js.undefined)
    
    inline def setUseWeakDeps(value: Boolean): Self = StObject.set(x, "useWeakDeps", value.asInstanceOf[js.Any])
    
    inline def setUseWeakDepsUndefined: Self = StObject.set(x, "useWeakDeps", js.undefined)
  }
}
