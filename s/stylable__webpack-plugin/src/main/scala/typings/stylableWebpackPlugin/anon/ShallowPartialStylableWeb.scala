package typings.stylableWebpackPlugin.anon

import typings.std.Partial
import typings.stylableCore.mod.Stylable
import typings.stylableCore.stylableTransformerMod.StylableResults
import typings.stylableCore.stylableTransformerMod.TransformHooks
import typings.stylableOptimizer.mod.StylableOptimizer
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.external
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.isolated
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.shared
import typings.stylableWebpackPlugin.typesMod.StylableModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @stylable/webpack-plugin.@stylable/webpack-plugin/cjs/types.ShallowPartial<@stylable/webpack-plugin.@stylable/webpack-plugin/cjs/types.StylableWebpackPluginOptions> */
@js.native
trait ShallowPartialStylableWeb extends js.Object {
  
  var afterTransform: js.UndefOr[
    (Partial[
      js.UndefOr[
        (js.Function3[
          /* results */ StylableResults, 
          /* module */ StylableModule, 
          /* stylable */ Stylable, 
          Unit
        ]) | Null
      ]
    ]) | (js.Function3[
      /* results */ StylableResults, 
      /* module */ StylableModule, 
      /* stylable */ Stylable, 
      Unit
    ]) | Null
  ] = js.native
  
  var bootstrap: js.UndefOr[PartialautoInitbooleanget | AutoInit] = js.native
  
  var createRuntimeChunk: js.UndefOr[Partial[Boolean] | Boolean] = js.native
  
  var experimentalHMR: js.UndefOr[Partial[Boolean] | Boolean] = js.native
  
  var filename: js.UndefOr[Partial[String] | String] = js.native
  
  var generate: js.UndefOr[PartialruntimeStylesheetI | AfterTransform] = js.native
  
  var globalRuntimeId: js.UndefOr[Partial[String] | String] = js.native
  
  var includeCSSInJS: js.UndefOr[Partial[Boolean] | Boolean] = js.native
  
  var includeDynamicModulesInCSS: js.UndefOr[Partial[Boolean] | Boolean] = js.native
  
  var optimize: js.UndefOr[PartialremoveUnusedCompon | ClassNameOptimizations] = js.native
  
  var optimizeStylableModulesPerChunks: js.UndefOr[Partial[Boolean] | Boolean] = js.native
  
  var optimizer: js.UndefOr[Partial[js.UndefOr[StylableOptimizer]] | StylableOptimizer] = js.native
  
  var outputCSS: js.UndefOr[Partial[Boolean] | Boolean] = js.native
  
  var plugins: js.UndefOr[Partial[js.UndefOr[js.Array[Apply]]] | js.Array[Apply]] = js.native
  
  var requireModule: js.UndefOr[
    (Partial[js.Function1[/* path */ String, _]]) | (js.Function1[/* path */ String, _])
  ] = js.native
  
  var resolveNamespace: js.UndefOr[Partial[js.UndefOr[js.Function0[String]]] | js.Function0[String]] = js.native
  
  var runtimeMode: js.UndefOr[(Partial[isolated | shared | external]) | isolated | shared | external] = js.native
  
  var skipDynamicCSSEmit: js.UndefOr[Partial[Boolean] | Boolean] = js.native
  
  var transformHooks: js.UndefOr[Partial[js.UndefOr[TransformHooks]] | TransformHooks] = js.native
  
  var unsafeBuildNamespace: js.UndefOr[Partial[js.UndefOr[Boolean]] | Boolean] = js.native
  
  var unsafeMuteDiagnostics: js.UndefOr[PartialDUPLICATEMODULENAM | DUPLICATEMODULENAMESPACE] = js.native
  
  var useEntryModuleInjection: js.UndefOr[Partial[Boolean] | Boolean] = js.native
  
  var useWeakDeps: js.UndefOr[Partial[Boolean] | Boolean] = js.native
}
object ShallowPartialStylableWeb {
  
  @scala.inline
  def apply(): ShallowPartialStylableWeb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShallowPartialStylableWeb]
  }
  
  @scala.inline
  implicit class ShallowPartialStylableWebOps[Self <: ShallowPartialStylableWeb] (val x: Self) extends AnyVal {
    
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
    def setAfterTransformFunction3(
      value: (/* results */ StylableResults, /* module */ StylableModule, /* stylable */ Stylable) => Unit
    ): Self = this.set("afterTransform", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterTransform(
      value: (Partial[
          js.UndefOr[
            (js.Function3[
              /* results */ StylableResults, 
              /* module */ StylableModule, 
              /* stylable */ Stylable, 
              Unit
            ]) | Null
          ]
        ]) | (js.Function3[
          /* results */ StylableResults, 
          /* module */ StylableModule, 
          /* stylable */ Stylable, 
          Unit
        ])
    ): Self = this.set("afterTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterTransform: Self = this.set("afterTransform", js.undefined)
    
    @scala.inline
    def setAfterTransformNull: Self = this.set("afterTransform", null)
    
    @scala.inline
    def setBootstrap(value: PartialautoInitbooleanget | AutoInit): Self = this.set("bootstrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBootstrap: Self = this.set("bootstrap", js.undefined)
    
    @scala.inline
    def setCreateRuntimeChunk(value: Partial[Boolean] | Boolean): Self = this.set("createRuntimeChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateRuntimeChunk: Self = this.set("createRuntimeChunk", js.undefined)
    
    @scala.inline
    def setExperimentalHMR(value: Partial[Boolean] | Boolean): Self = this.set("experimentalHMR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimentalHMR: Self = this.set("experimentalHMR", js.undefined)
    
    @scala.inline
    def setFilename(value: Partial[String] | String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setGenerate(value: PartialruntimeStylesheetI | AfterTransform): Self = this.set("generate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerate: Self = this.set("generate", js.undefined)
    
    @scala.inline
    def setGlobalRuntimeId(value: Partial[String] | String): Self = this.set("globalRuntimeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalRuntimeId: Self = this.set("globalRuntimeId", js.undefined)
    
    @scala.inline
    def setIncludeCSSInJS(value: Partial[Boolean] | Boolean): Self = this.set("includeCSSInJS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeCSSInJS: Self = this.set("includeCSSInJS", js.undefined)
    
    @scala.inline
    def setIncludeDynamicModulesInCSS(value: Partial[Boolean] | Boolean): Self = this.set("includeDynamicModulesInCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDynamicModulesInCSS: Self = this.set("includeDynamicModulesInCSS", js.undefined)
    
    @scala.inline
    def setOptimize(value: PartialremoveUnusedCompon | ClassNameOptimizations): Self = this.set("optimize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimize: Self = this.set("optimize", js.undefined)
    
    @scala.inline
    def setOptimizeStylableModulesPerChunks(value: Partial[Boolean] | Boolean): Self = this.set("optimizeStylableModulesPerChunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizeStylableModulesPerChunks: Self = this.set("optimizeStylableModulesPerChunks", js.undefined)
    
    @scala.inline
    def setOptimizer(value: Partial[js.UndefOr[StylableOptimizer]] | StylableOptimizer): Self = this.set("optimizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizer: Self = this.set("optimizer", js.undefined)
    
    @scala.inline
    def setOutputCSS(value: Partial[Boolean] | Boolean): Self = this.set("outputCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputCSS: Self = this.set("outputCSS", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: Apply*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: Partial[js.UndefOr[js.Array[Apply]]] | js.Array[Apply]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRequireModuleFunction1(value: /* path */ String => _): Self = this.set("requireModule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequireModule(value: (Partial[js.Function1[/* path */ String, _]]) | (js.Function1[/* path */ String, _])): Self = this.set("requireModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireModule: Self = this.set("requireModule", js.undefined)
    
    @scala.inline
    def setResolveNamespaceFunction0(value: () => String): Self = this.set("resolveNamespace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResolveNamespace(value: Partial[js.UndefOr[js.Function0[String]]] | js.Function0[String]): Self = this.set("resolveNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveNamespace: Self = this.set("resolveNamespace", js.undefined)
    
    @scala.inline
    def setRuntimeMode(value: (Partial[isolated | shared | external]) | isolated | shared | external): Self = this.set("runtimeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeMode: Self = this.set("runtimeMode", js.undefined)
    
    @scala.inline
    def setSkipDynamicCSSEmit(value: Partial[Boolean] | Boolean): Self = this.set("skipDynamicCSSEmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipDynamicCSSEmit: Self = this.set("skipDynamicCSSEmit", js.undefined)
    
    @scala.inline
    def setTransformHooks(value: Partial[js.UndefOr[TransformHooks]] | TransformHooks): Self = this.set("transformHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformHooks: Self = this.set("transformHooks", js.undefined)
    
    @scala.inline
    def setUnsafeBuildNamespace(value: Partial[js.UndefOr[Boolean]] | Boolean): Self = this.set("unsafeBuildNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafeBuildNamespace: Self = this.set("unsafeBuildNamespace", js.undefined)
    
    @scala.inline
    def setUnsafeMuteDiagnostics(value: PartialDUPLICATEMODULENAM | DUPLICATEMODULENAMESPACE): Self = this.set("unsafeMuteDiagnostics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafeMuteDiagnostics: Self = this.set("unsafeMuteDiagnostics", js.undefined)
    
    @scala.inline
    def setUseEntryModuleInjection(value: Partial[Boolean] | Boolean): Self = this.set("useEntryModuleInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEntryModuleInjection: Self = this.set("useEntryModuleInjection", js.undefined)
    
    @scala.inline
    def setUseWeakDeps(value: Partial[Boolean] | Boolean): Self = this.set("useWeakDeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseWeakDeps: Self = this.set("useWeakDeps", js.undefined)
  }
}
