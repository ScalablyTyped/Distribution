package typings.webpack.webpackOptionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.webpack.anon.AggregateTimeout
import typings.webpack.anon.Debug
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.`async-node`
import typings.webpack.webpackStrings.`electron-main`
import typings.webpack.webpackStrings.`electron-preload`
import typings.webpack.webpackStrings.`electron-renderer`
import typings.webpack.webpackStrings.`errors-only`
import typings.webpack.webpackStrings.`errors-warnings`
import typings.webpack.webpackStrings.`node-webkit`
import typings.webpack.webpackStrings.detailed
import typings.webpack.webpackStrings.development
import typings.webpack.webpackStrings.minimal
import typings.webpack.webpackStrings.node
import typings.webpack.webpackStrings.none
import typings.webpack.webpackStrings.normal
import typings.webpack.webpackStrings.production
import typings.webpack.webpackStrings.verbose
import typings.webpack.webpackStrings.web
import typings.webpack.webpackStrings.webworker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpackOptions extends StObject {
  
  /**
  	 * Set the value of `require.amd` and `define.amd`. Or disable AMD support.
  	 */
  var amd: js.UndefOr[`false` | StringDictionary[js.Any]] = js.native
  
  /**
  	 * Report the first error as a hard error instead of tolerating it.
  	 */
  var bail: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Cache generated modules and chunks to improve performance for multiple incremental builds.
  	 */
  var cache: js.UndefOr[Boolean | StringDictionary[js.Any]] = js.native
  
  /**
  	 * The base directory (absolute path!) for resolving the `entry` option. If `output.pathinfo` is set, the included pathinfo is shortened to this directory.
  	 */
  var context: js.UndefOr[String] = js.native
  
  /**
  	 * References to other configurations to depend on.
  	 */
  var dependencies: js.UndefOr[js.Array[String]] = js.native
  
  /**
  	 * Options for the webpack-dev-server
  	 */
  var devServer: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
  	 * A developer tool to enhance debugging.
  	 */
  var devtool: js.UndefOr[String | `false`] = js.native
  
  /**
  	 * The entry point(s) of the compilation.
  	 */
  var entry: js.UndefOr[Entry] = js.native
  
  /**
  	 * Specify dependencies that shouldn't be resolved by webpack, but should become dependencies of the resulting bundle. The kind of the dependency depends on `output.libraryTarget`.
  	 */
  var externals: js.UndefOr[Externals] = js.native
  
  /**
  	 * Options for infrastructure level logging
  	 */
  var infrastructureLogging: js.UndefOr[Debug] = js.native
  
  /**
  	 * Custom values available in the loader context.
  	 */
  var loader: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
  	 * Enable production optimizations or development hints.
  	 */
  var mode: js.UndefOr[development | production | none] = js.native
  
  /**
  	 * Options affecting the normal modules (`NormalModuleFactory`).
  	 */
  var module: js.UndefOr[ModuleOptions] = js.native
  
  /**
  	 * Name of the configuration. Used when loading multiple configurations.
  	 */
  var name: js.UndefOr[String] = js.native
  
  /**
  	 * Include polyfills or mocks for various node stuff.
  	 */
  var node: js.UndefOr[`false` | NodeOptions] = js.native
  
  /**
  	 * Enables/Disables integrated optimizations
  	 */
  var optimization: js.UndefOr[OptimizationOptions] = js.native
  
  /**
  	 * Options affecting the output of the compilation. `output` options tell webpack how to write the compiled files to disk.
  	 */
  var output: js.UndefOr[OutputOptions] = js.native
  
  /**
  	 * The number of parallel processed modules in the compilation.
  	 */
  var parallelism: js.UndefOr[Double] = js.native
  
  /**
  	 * Configuration for web performance recommendations.
  	 */
  var performance: js.UndefOr[`false` | PerformanceOptions] = js.native
  
  /**
  	 * Add additional plugins to the compiler.
  	 */
  var plugins: js.UndefOr[js.Array[WebpackPluginInstance | WebpackPluginFunction]] = js.native
  
  /**
  	 * Capture timing information for each module.
  	 */
  var profile: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Store compiler state to a json file.
  	 */
  var recordsInputPath: js.UndefOr[String] = js.native
  
  /**
  	 * Load compiler state from a json file.
  	 */
  var recordsOutputPath: js.UndefOr[String] = js.native
  
  /**
  	 * Store/Load compiler state from/to a json file. This will result in persistent ids of modules and chunks. An absolute path is expected. `recordsPath` is used for `recordsInputPath` and `recordsOutputPath` if they left undefined.
  	 */
  var recordsPath: js.UndefOr[String] = js.native
  
  /**
  	 * Options for the resolver
  	 */
  var resolve: js.UndefOr[ResolveOptions] = js.native
  
  /**
  	 * Options for the resolver when resolving loaders
  	 */
  var resolveLoader: js.UndefOr[ResolveOptions] = js.native
  
  /**
  	 * Options for webpack-serve
  	 */
  var serve: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
  	 * Used by the webpack CLI program to pass stats options.
  	 */
  var stats: js.UndefOr[
    StatsOptions | Boolean | none | `errors-only` | minimal | normal | detailed | verbose | `errors-warnings`
  ] = js.native
  
  /**
  	 * Environment to build for
  	 */
  var target: js.UndefOr[
    web | webworker | node | `async-node` | `node-webkit` | `electron-main` | `electron-renderer` | `electron-preload` | (js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* compiler */ js.Any, 
      Unit
    ])
  ] = js.native
  
  /**
  	 * Enter watch mode, which rebuilds on file change.
  	 */
  var watch: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Options for the watcher
  	 */
  var watchOptions: js.UndefOr[AggregateTimeout] = js.native
}
object WebpackOptions {
  
  @scala.inline
  def apply(): WebpackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpackOptions]
  }
  
  @scala.inline
  implicit class WebpackOptionsMutableBuilder[Self <: WebpackOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmd(value: `false` | StringDictionary[js.Any]): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmdUndefined: Self = StObject.set(x, "amd", js.undefined)
    
    @scala.inline
    def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean | StringDictionary[js.Any]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDevServer(value: StringDictionary[js.Any]): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevServerUndefined: Self = StObject.set(x, "devServer", js.undefined)
    
    @scala.inline
    def setDevtool(value: String | `false`): Self = StObject.set(x, "devtool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevtoolUndefined: Self = StObject.set(x, "devtool", js.undefined)
    
    @scala.inline
    def setEntry(value: Entry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryFunction0(value: () => EntryStatic | js.Promise[EntryStatic]): Self = StObject.set(x, "entry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEntryUndefined: Self = StObject.set(x, "entry", js.undefined)
    
    @scala.inline
    def setEntryVarargs(value: String*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    @scala.inline
    def setExternals(value: Externals): Self = StObject.set(x, "externals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalsFunction3(
      value: (/* context */ String, /* request */ String, /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[String], Unit]) => Unit
    ): Self = StObject.set(x, "externals", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExternalsUndefined: Self = StObject.set(x, "externals", js.undefined)
    
    @scala.inline
    def setExternalsVarargs(
      value: ((js.Function3[
          /* context */ String, 
          /* request */ String, 
          /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[String], Unit], 
          Unit
        ]) | ExternalItem)*
    ): Self = StObject.set(x, "externals", js.Array(value :_*))
    
    @scala.inline
    def setInfrastructureLogging(value: Debug): Self = StObject.set(x, "infrastructureLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfrastructureLoggingUndefined: Self = StObject.set(x, "infrastructureLogging", js.undefined)
    
    @scala.inline
    def setLoader(value: StringDictionary[js.Any]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    @scala.inline
    def setMode(value: development | production | none): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setModule(value: ModuleOptions): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNode(value: `false` | NodeOptions): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setOptimization(value: OptimizationOptions): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizationUndefined: Self = StObject.set(x, "optimization", js.undefined)
    
    @scala.inline
    def setOutput(value: OutputOptions): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
    
    @scala.inline
    def setPerformance(value: `false` | PerformanceOptions): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    @scala.inline
    def setPlugins(value: js.Array[WebpackPluginInstance | WebpackPluginFunction]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: (WebpackPluginInstance | WebpackPluginFunction)*): Self = StObject.set(x, "plugins", js.Array(value :_*))
    
    @scala.inline
    def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setRecordsInputPath(value: String): Self = StObject.set(x, "recordsInputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsInputPathUndefined: Self = StObject.set(x, "recordsInputPath", js.undefined)
    
    @scala.inline
    def setRecordsOutputPath(value: String): Self = StObject.set(x, "recordsOutputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsOutputPathUndefined: Self = StObject.set(x, "recordsOutputPath", js.undefined)
    
    @scala.inline
    def setRecordsPath(value: String): Self = StObject.set(x, "recordsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsPathUndefined: Self = StObject.set(x, "recordsPath", js.undefined)
    
    @scala.inline
    def setResolve(value: ResolveOptions): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveLoader(value: ResolveOptions): Self = StObject.set(x, "resolveLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveLoaderUndefined: Self = StObject.set(x, "resolveLoader", js.undefined)
    
    @scala.inline
    def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    @scala.inline
    def setServe(value: StringDictionary[js.Any]): Self = StObject.set(x, "serve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServeUndefined: Self = StObject.set(x, "serve", js.undefined)
    
    @scala.inline
    def setStats(
      value: StatsOptions | Boolean | none | `errors-only` | minimal | normal | detailed | verbose | `errors-warnings`
    ): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
    
    @scala.inline
    def setTarget(
      value: web | webworker | node | `async-node` | `node-webkit` | `electron-main` | `electron-renderer` | `electron-preload` | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* compiler */ js.Any, 
          Unit
        ])
    ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFunction1(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* compiler */ js.Any => Unit
    ): Self = StObject.set(x, "target", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchOptions(value: AggregateTimeout): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchOptionsUndefined: Self = StObject.set(x, "watchOptions", js.undefined)
    
    @scala.inline
    def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
