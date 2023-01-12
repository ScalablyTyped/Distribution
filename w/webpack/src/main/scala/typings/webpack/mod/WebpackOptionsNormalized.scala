package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.`amd-require`
import typings.webpack.webpackStrings.`commonjs-module`
import typings.webpack.webpackStrings.`commonjs-static`
import typings.webpack.webpackStrings.`import`
import typings.webpack.webpackStrings.`node-commonjs`
import typings.webpack.webpackStrings.`this`
import typings.webpack.webpackStrings.`var`
import typings.webpack.webpackStrings.amd
import typings.webpack.webpackStrings.assign
import typings.webpack.webpackStrings.commonjs
import typings.webpack.webpackStrings.commonjs2
import typings.webpack.webpackStrings.development
import typings.webpack.webpackStrings.global
import typings.webpack.webpackStrings.jsonp
import typings.webpack.webpackStrings.module
import typings.webpack.webpackStrings.none
import typings.webpack.webpackStrings.production
import typings.webpack.webpackStrings.promise
import typings.webpack.webpackStrings.script
import typings.webpack.webpackStrings.self
import typings.webpack.webpackStrings.system
import typings.webpack.webpackStrings.umd
import typings.webpack.webpackStrings.umd2
import typings.webpack.webpackStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Normalized webpack options object.
  */
trait WebpackOptionsNormalized extends StObject {
  
  /**
  	 * Set the value of `require.amd` and `define.amd`. Or disable AMD support.
  	 */
  var amd: js.UndefOr[`false` | StringDictionary[Any]] = js.undefined
  
  /**
  	 * Report the first error as a hard error instead of tolerating it.
  	 */
  var bail: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Cache generated modules and chunks to improve performance for multiple incremental builds.
  	 */
  var cache: CacheOptionsNormalized
  
  /**
  	 * The base directory (absolute path!) for resolving the `entry` option. If `output.pathinfo` is set, the included pathinfo is shortened to this directory.
  	 */
  var context: js.UndefOr[String] = js.undefined
  
  /**
  	 * References to other configurations to depend on.
  	 */
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  	 * Options for the webpack-dev-server.
  	 */
  var devServer: js.UndefOr[DevServer] = js.undefined
  
  /**
  	 * A developer tool to enhance debugging (false | eval | [inline-|hidden-|eval-][nosources-][cheap-[module-]]source-map).
  	 */
  var devtool: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * The entry point(s) of the compilation.
  	 */
  var entry: EntryNormalized
  
  /**
  	 * Enables/Disables experiments (experimental features with relax SemVer compatibility).
  	 */
  var experiments: ExperimentsNormalized
  
  /**
  	 * Specify dependencies that shouldn't be resolved by webpack, but should become dependencies of the resulting bundle. The kind of the dependency depends on `output.libraryTarget`.
  	 */
  var externals: Externals
  
  /**
  	 * Enable presets of externals for specific targets.
  	 */
  var externalsPresets: ExternalsPresets
  
  /**
  	 * Specifies the default type of externals ('amd*', 'umd*', 'system' and 'jsonp' depend on output.libraryTarget set to the same value).
  	 */
  var externalsType: js.UndefOr[
    `import` | `var` | module | assign | `this` | window | self | global | commonjs | commonjs2 | `commonjs-module` | `commonjs-static` | amd | `amd-require` | umd | umd2 | jsonp | system | promise | script | `node-commonjs`
  ] = js.undefined
  
  /**
  	 * Ignore specific warnings.
  	 */
  var ignoreWarnings: js.UndefOr[
    js.Array[js.Function2[/* warning */ WebpackError, /* compilation */ Compilation, Boolean]]
  ] = js.undefined
  
  /**
  	 * Options for infrastructure level logging.
  	 */
  var infrastructureLogging: InfrastructureLogging
  
  /**
  	 * Custom values available in the loader context.
  	 */
  var loader: js.UndefOr[Loader] = js.undefined
  
  /**
  	 * Enable production optimizations or development hints.
  	 */
  var mode: js.UndefOr[none | development | production] = js.undefined
  
  /**
  	 * Options affecting the normal modules (`NormalModuleFactory`).
  	 */
  var module: ModuleOptionsNormalized
  
  /**
  	 * Name of the configuration. Used when loading multiple configurations.
  	 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  	 * Include polyfills or mocks for various node stuff.
  	 */
  var node: NodeWebpackOptions
  
  /**
  	 * Enables/Disables integrated optimizations.
  	 */
  var optimization: Optimization
  
  /**
  	 * Normalized options affecting the output of the compilation. `output` options tell webpack how to write the compiled files to disk.
  	 */
  var output: OutputNormalized
  
  /**
  	 * The number of parallel processed modules in the compilation.
  	 */
  var parallelism: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Configuration for web performance recommendations.
  	 */
  var performance: js.UndefOr[`false` | PerformanceOptions] = js.undefined
  
  /**
  	 * Add additional plugins to the compiler.
  	 */
  var plugins: js.Array[
    (js.ThisFunction1[/* this */ Compiler, /* compiler */ Compiler, Unit]) | WebpackPluginInstance
  ]
  
  /**
  	 * Capture timing information for each module.
  	 */
  var profile: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Store compiler state to a json file.
  	 */
  var recordsInputPath: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * Load compiler state from a json file.
  	 */
  var recordsOutputPath: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * Options for the resolver.
  	 */
  var resolve: ResolveOptionsWebpackOptions
  
  /**
  	 * Options for the resolver when resolving loaders.
  	 */
  var resolveLoader: ResolveOptionsWebpackOptions
  
  /**
  	 * Options affecting how file system snapshots are created and validated.
  	 */
  var snapshot: SnapshotOptions
  
  /**
  	 * Stats options object or preset name.
  	 */
  var stats: StatsValue
  
  /**
  	 * Environment to build for. An array of environments to build for all of them when possible.
  	 */
  var target: js.UndefOr[String | `false` | js.Array[String]] = js.undefined
  
  /**
  	 * Enter watch mode, which rebuilds on file change.
  	 */
  var watch: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Options for the watcher.
  	 */
  var watchOptions: WatchOptions
}
object WebpackOptionsNormalized {
  
  inline def apply(
    cache: CacheOptionsNormalized,
    entry: EntryNormalized,
    experiments: ExperimentsNormalized,
    externals: Externals,
    externalsPresets: ExternalsPresets,
    infrastructureLogging: InfrastructureLogging,
    module: ModuleOptionsNormalized,
    node: NodeWebpackOptions,
    optimization: Optimization,
    output: OutputNormalized,
    plugins: js.Array[
      (js.ThisFunction1[/* this */ Compiler, /* compiler */ Compiler, Unit]) | WebpackPluginInstance
    ],
    resolve: ResolveOptionsWebpackOptions,
    resolveLoader: ResolveOptionsWebpackOptions,
    snapshot: SnapshotOptions,
    stats: StatsValue,
    watchOptions: WatchOptions
  ): WebpackOptionsNormalized = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], experiments = experiments.asInstanceOf[js.Any], externals = externals.asInstanceOf[js.Any], externalsPresets = externalsPresets.asInstanceOf[js.Any], infrastructureLogging = infrastructureLogging.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], optimization = optimization.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any], resolveLoader = resolveLoader.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], watchOptions = watchOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpackOptionsNormalized]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebpackOptionsNormalized] (val x: Self) extends AnyVal {
    
    inline def setAmd(value: `false` | StringDictionary[Any]): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    inline def setAmdUndefined: Self = StObject.set(x, "amd", js.undefined)
    
    inline def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    
    inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
    
    inline def setCache(value: CacheOptionsNormalized): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDevServer(value: DevServer): Self = StObject.set(x, "devServer", value.asInstanceOf[js.Any])
    
    inline def setDevServerUndefined: Self = StObject.set(x, "devServer", js.undefined)
    
    inline def setDevtool(value: String | `false`): Self = StObject.set(x, "devtool", value.asInstanceOf[js.Any])
    
    inline def setDevtoolUndefined: Self = StObject.set(x, "devtool", js.undefined)
    
    inline def setEntry(value: EntryNormalized): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setEntryFunction0(value: () => js.Promise[EntryStaticNormalized]): Self = StObject.set(x, "entry", js.Any.fromFunction0(value))
    
    inline def setExperiments(value: ExperimentsNormalized): Self = StObject.set(x, "experiments", value.asInstanceOf[js.Any])
    
    inline def setExternals(value: Externals): Self = StObject.set(x, "externals", value.asInstanceOf[js.Any])
    
    inline def setExternalsFunction1(value: /* data */ ExternalItemFunctionData => js.Promise[ExternalItemValue]): Self = StObject.set(x, "externals", js.Any.fromFunction1(value))
    
    inline def setExternalsFunction2(
      value: (/* data */ ExternalItemFunctionData, /* callback */ js.Function2[
          /* err */ js.UndefOr[js.Error], 
          /* result */ js.UndefOr[String | Boolean | js.Array[String] | StringDictionary[Any]], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "externals", js.Any.fromFunction2(value))
    
    inline def setExternalsPresets(value: ExternalsPresets): Self = StObject.set(x, "externalsPresets", value.asInstanceOf[js.Any])
    
    inline def setExternalsType(
      value: `import` | `var` | module | assign | `this` | window | self | global | commonjs | commonjs2 | `commonjs-module` | `commonjs-static` | amd | `amd-require` | umd | umd2 | jsonp | system | promise | script | `node-commonjs`
    ): Self = StObject.set(x, "externalsType", value.asInstanceOf[js.Any])
    
    inline def setExternalsTypeUndefined: Self = StObject.set(x, "externalsType", js.undefined)
    
    inline def setExternalsVarargs(value: ExternalItem*): Self = StObject.set(x, "externals", js.Array(value*))
    
    inline def setIgnoreWarnings(value: js.Array[js.Function2[/* warning */ WebpackError, /* compilation */ Compilation, Boolean]]): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
    
    inline def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
    
    inline def setIgnoreWarningsVarargs(value: (js.Function2[/* warning */ WebpackError, /* compilation */ Compilation, Boolean])*): Self = StObject.set(x, "ignoreWarnings", js.Array(value*))
    
    inline def setInfrastructureLogging(value: InfrastructureLogging): Self = StObject.set(x, "infrastructureLogging", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: Loader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
    
    inline def setMode(value: none | development | production): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setModule(value: ModuleOptionsNormalized): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNode(value: NodeWebpackOptions): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setOptimization(value: Optimization): Self = StObject.set(x, "optimization", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: OutputNormalized): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setParallelism(value: Double): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
    
    inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
    
    inline def setPerformance(value: `false` | PerformanceOptions): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setPlugins(
      value: js.Array[
          (js.ThisFunction1[/* this */ Compiler, /* compiler */ Compiler, Unit]) | WebpackPluginInstance
        ]
    ): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setPluginsVarargs(
      value: ((js.ThisFunction1[/* this */ Compiler, /* compiler */ Compiler, Unit]) | WebpackPluginInstance)*
    ): Self = StObject.set(x, "plugins", js.Array(value*))
    
    inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setRecordsInputPath(value: String | `false`): Self = StObject.set(x, "recordsInputPath", value.asInstanceOf[js.Any])
    
    inline def setRecordsInputPathUndefined: Self = StObject.set(x, "recordsInputPath", js.undefined)
    
    inline def setRecordsOutputPath(value: String | `false`): Self = StObject.set(x, "recordsOutputPath", value.asInstanceOf[js.Any])
    
    inline def setRecordsOutputPathUndefined: Self = StObject.set(x, "recordsOutputPath", js.undefined)
    
    inline def setResolve(value: ResolveOptionsWebpackOptions): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveLoader(value: ResolveOptionsWebpackOptions): Self = StObject.set(x, "resolveLoader", value.asInstanceOf[js.Any])
    
    inline def setSnapshot(value: SnapshotOptions): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setStats(value: StatsValue): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String | `false` | js.Array[String]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: String*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchOptions(value: WatchOptions): Self = StObject.set(x, "watchOptions", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
  }
}
