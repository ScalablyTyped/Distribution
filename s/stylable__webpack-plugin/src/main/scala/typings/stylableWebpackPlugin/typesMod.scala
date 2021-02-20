package typings.stylableWebpackPlugin

import org.scalablytyped.runtime.TopLevel
import typings.stylableCore.mod.Stylable
import typings.stylableCore.stylableTransformerMod.StylableResults
import typings.stylableCore.stylableTransformerMod.TransformHooks
import typings.stylableOptimizer.mod.StylableOptimizer
import typings.stylableWebpackPlugin.anon.AfterTransform
import typings.stylableWebpackPlugin.anon.Apply
import typings.stylableWebpackPlugin.anon.AutoInit
import typings.stylableWebpackPlugin.anon.ClassNameOptimizations
import typings.stylableWebpackPlugin.anon.DUPLICATEMODULENAMESPACE
import typings.stylableWebpackPlugin.anon.FileDependencies
import typings.stylableWebpackPlugin.anon.Module
import typings.stylableWebpackPlugin.anon.Request
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.external
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.isolated
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.module
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.namespace
import typings.stylableWebpackPlugin.stylableWebpackPluginStrings.shared
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait CalcResult extends StObject {
    
    var cssDependencies: js.Array[StylableModule] = js.native
    
    var depth: Double = js.native
  }
  object CalcResult {
    
    @scala.inline
    def apply(cssDependencies: js.Array[StylableModule], depth: Double): CalcResult = {
      val __obj = js.Dynamic.literal(cssDependencies = cssDependencies.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalcResult]
    }
    
    @scala.inline
    implicit class CalcResultMutableBuilder[Self <: CalcResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssDependencies(value: js.Array[StylableModule]): Self = StObject.set(x, "cssDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssDependenciesVarargs(value: StylableModule*): Self = StObject.set(x, "cssDependencies", js.Array(value :_*))
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    }
  }
  
  type ShallowPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends new (): any? T[P] : std.Partial<T[P]>}
    */ typings.stylableWebpackPlugin.stylableWebpackPluginStrings.ShallowPartial with TopLevel[js.Any]
  
  @js.native
  trait StylableGeneratorOptions extends StObject {
    
    var afterTransform: js.Any = js.native
    
    var experimentalHMR: Boolean = js.native
    
    var includeCSSInJS: Boolean = js.native
    
    var runtimeStylesheetId: module | namespace = js.native
  }
  object StylableGeneratorOptions {
    
    @scala.inline
    def apply(
      afterTransform: js.Any,
      experimentalHMR: Boolean,
      includeCSSInJS: Boolean,
      runtimeStylesheetId: module | namespace
    ): StylableGeneratorOptions = {
      val __obj = js.Dynamic.literal(afterTransform = afterTransform.asInstanceOf[js.Any], experimentalHMR = experimentalHMR.asInstanceOf[js.Any], includeCSSInJS = includeCSSInJS.asInstanceOf[js.Any], runtimeStylesheetId = runtimeStylesheetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylableGeneratorOptions]
    }
    
    @scala.inline
    implicit class StylableGeneratorOptionsMutableBuilder[Self <: StylableGeneratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterTransform(value: js.Any): Self = StObject.set(x, "afterTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimentalHMR(value: Boolean): Self = StObject.set(x, "experimentalHMR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeCSSInJS(value: Boolean): Self = StObject.set(x, "includeCSSInJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeStylesheetId(value: module | namespace): Self = StObject.set(x, "runtimeStylesheetId", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Module * / any */ @js.native
  trait StylableModule extends StObject {
    
    def addDependency(
      dep: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Dependency */ js.Any
    ): Unit = js.native
    
    var buildInfo: FileDependencies = js.native
    
    var context: String = js.native
    
    var dependencies: js.UndefOr[js.Array[StylableModule]] = js.native
    
    var loaders: js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.NewLoader */ _
      ] = js.native
    
    var module: js.UndefOr[StylableModule] = js.native
    
    def originalSource(): String = js.native
    
    var reasons: js.Array[Module] = js.native
    
    var request: String = js.native
    
    var resource: String = js.native
  }
  object StylableModule {
    
    @scala.inline
    def apply(
      addDependency: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Dependency */ js.Any => Unit,
      buildInfo: FileDependencies,
      context: String,
      loaders: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.NewLoader */ _
        ],
      originalSource: () => String,
      reasons: js.Array[Module],
      request: String,
      resource: String
    ): StylableModule = {
      val __obj = js.Dynamic.literal(addDependency = js.Any.fromFunction1(addDependency), buildInfo = buildInfo.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], originalSource = js.Any.fromFunction0(originalSource), reasons = reasons.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[StylableModule]
    }
    
    @scala.inline
    implicit class StylableModuleMutableBuilder[Self <: StylableModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDependency(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Dependency */ js.Any => Unit
      ): Self = StObject.set(x, "addDependency", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBuildInfo(value: FileDependencies): Self = StObject.set(x, "buildInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependencies(value: js.Array[StylableModule]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDependenciesVarargs(value: StylableModule*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setLoaders(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.NewLoader */ _
            ]
      ): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadersVarargs(value: js.Any*): Self = StObject.set(x, "loaders", js.Array(value :_*))
      
      @scala.inline
      def setModule(value: StylableModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setOriginalSource(value: () => String): Self = StObject.set(x, "originalSource", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReasons(value: js.Array[Module]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonsVarargs(value: Module*): Self = StObject.set(x, "reasons", js.Array(value :_*))
      
      @scala.inline
      def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StylableWebpackPluginOptions extends StObject {
    
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
    implicit class StylableWebpackPluginOptionsMutableBuilder[Self <: StylableWebpackPluginOptions] (val x: Self) extends AnyVal {
      
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
      def setCreateRuntimeChunk(value: Boolean): Self = StObject.set(x, "createRuntimeChunk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExperimentalHMR(value: Boolean): Self = StObject.set(x, "experimentalHMR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGenerate(value: AfterTransform): Self = StObject.set(x, "generate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalRuntimeId(value: String): Self = StObject.set(x, "globalRuntimeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeCSSInJS(value: Boolean): Self = StObject.set(x, "includeCSSInJS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDynamicModulesInCSS(value: Boolean): Self = StObject.set(x, "includeDynamicModulesInCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimize(value: ClassNameOptimizations): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeStylableModulesPerChunks(value: Boolean): Self = StObject.set(x, "optimizeStylableModulesPerChunks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizer(value: StylableOptimizer): Self = StObject.set(x, "optimizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizerUndefined: Self = StObject.set(x, "optimizer", js.undefined)
      
      @scala.inline
      def setOutputCSS(value: Boolean): Self = StObject.set(x, "outputCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlugins(value: js.Array[Apply]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: Apply*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRequireModule(value: String => js.Any): Self = StObject.set(x, "requireModule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveNamespace(value: () => String): Self = StObject.set(x, "resolveNamespace", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResolveNamespaceUndefined: Self = StObject.set(x, "resolveNamespace", js.undefined)
      
      @scala.inline
      def setRuntimeMode(value: isolated | shared | external): Self = StObject.set(x, "runtimeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipDynamicCSSEmit(value: Boolean): Self = StObject.set(x, "skipDynamicCSSEmit", value.asInstanceOf[js.Any])
      
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
      def setUseEntryModuleInjection(value: Boolean): Self = StObject.set(x, "useEntryModuleInjection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWeakDeps(value: Boolean): Self = StObject.set(x, "useWeakDeps", value.asInstanceOf[js.Any])
    }
  }
  
  type WebpackAssetModule = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Module */ js.Any) with Request
}
