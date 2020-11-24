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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpackOptions extends js.Object {
  
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
  implicit class WebpackOptionsOps[Self <: WebpackOptions] (val x: Self) extends AnyVal {
    
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
    def setAmd(value: `false` | StringDictionary[js.Any]): Self = this.set("amd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmd: Self = this.set("amd", js.undefined)
    
    @scala.inline
    def setBail(value: Boolean): Self = this.set("bail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBail: Self = this.set("bail", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean | StringDictionary[js.Any]): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDependenciesVarargs(value: String*): Self = this.set("dependencies", js.Array(value :_*))
    
    @scala.inline
    def setDependencies(value: js.Array[String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    
    @scala.inline
    def setDevServer(value: StringDictionary[js.Any]): Self = this.set("devServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevServer: Self = this.set("devServer", js.undefined)
    
    @scala.inline
    def setDevtool(value: String | `false`): Self = this.set("devtool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevtool: Self = this.set("devtool", js.undefined)
    
    @scala.inline
    def setEntryVarargs(value: String*): Self = this.set("entry", js.Array(value :_*))
    
    @scala.inline
    def setEntryFunction0(value: () => EntryStatic | js.Promise[EntryStatic]): Self = this.set("entry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEntry(value: Entry): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    
    @scala.inline
    def setExternalsVarargs(
      value: ((js.Function3[
          /* context */ String, 
          /* request */ String, 
          /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[String], Unit], 
          Unit
        ]) | ExternalItem)*
    ): Self = this.set("externals", js.Array(value :_*))
    
    @scala.inline
    def setExternalsFunction3(
      value: (/* context */ String, /* request */ String, /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* result */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("externals", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExternals(value: Externals): Self = this.set("externals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternals: Self = this.set("externals", js.undefined)
    
    @scala.inline
    def setInfrastructureLogging(value: Debug): Self = this.set("infrastructureLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfrastructureLogging: Self = this.set("infrastructureLogging", js.undefined)
    
    @scala.inline
    def setLoader(value: StringDictionary[js.Any]): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setMode(value: development | production | none): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setModule(value: ModuleOptions): Self = this.set("module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModule: Self = this.set("module", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNode(value: `false` | NodeOptions): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    
    @scala.inline
    def setOptimization(value: OptimizationOptions): Self = this.set("optimization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimization: Self = this.set("optimization", js.undefined)
    
    @scala.inline
    def setOutput(value: OutputOptions): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setParallelism(value: Double): Self = this.set("parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelism: Self = this.set("parallelism", js.undefined)
    
    @scala.inline
    def setPerformance(value: `false` | PerformanceOptions): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    
    @scala.inline
    def setPluginsVarargs(value: (WebpackPluginInstance | WebpackPluginFunction)*): Self = this.set("plugins", js.Array(value :_*))
    
    @scala.inline
    def setPlugins(value: js.Array[WebpackPluginInstance | WebpackPluginFunction]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setProfile(value: Boolean): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setRecordsInputPath(value: String): Self = this.set("recordsInputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordsInputPath: Self = this.set("recordsInputPath", js.undefined)
    
    @scala.inline
    def setRecordsOutputPath(value: String): Self = this.set("recordsOutputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordsOutputPath: Self = this.set("recordsOutputPath", js.undefined)
    
    @scala.inline
    def setRecordsPath(value: String): Self = this.set("recordsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordsPath: Self = this.set("recordsPath", js.undefined)
    
    @scala.inline
    def setResolve(value: ResolveOptions): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setResolveLoader(value: ResolveOptions): Self = this.set("resolveLoader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolveLoader: Self = this.set("resolveLoader", js.undefined)
    
    @scala.inline
    def setServe(value: StringDictionary[js.Any]): Self = this.set("serve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServe: Self = this.set("serve", js.undefined)
    
    @scala.inline
    def setStats(
      value: StatsOptions | Boolean | none | `errors-only` | minimal | normal | detailed | verbose | `errors-warnings`
    ): Self = this.set("stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
    
    @scala.inline
    def setTargetFunction1(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* compiler */ js.Any => Unit
    ): Self = this.set("target", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTarget(
      value: web | webworker | node | `async-node` | `node-webkit` | `electron-main` | `electron-renderer` | `electron-preload` | (js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_Compiler */ /* compiler */ js.Any, 
          Unit
        ])
    ): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setWatch(value: Boolean): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
    
    @scala.inline
    def setWatchOptions(value: AggregateTimeout): Self = this.set("watchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchOptions: Self = this.set("watchOptions", js.undefined)
  }
}
