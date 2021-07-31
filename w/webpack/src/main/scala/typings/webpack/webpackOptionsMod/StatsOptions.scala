package typings.webpack.webpackOptionsMod

import typings.webpack.anon.Bold
import typings.webpack.webpackStrings.error
import typings.webpack.webpackStrings.info
import typings.webpack.webpackStrings.log
import typings.webpack.webpackStrings.none
import typings.webpack.webpackStrings.verbose
import typings.webpack.webpackStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatsOptions extends StObject {
  
  /**
  	 * fallback value for stats options when an option is not defined (has precedence over local webpack defaults)
  	 */
  var all: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add assets information
  	 */
  var assets: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * sort the assets by that field
  	 */
  var assetsSort: js.UndefOr[String] = js.undefined
  
  /**
  	 * add built at time information
  	 */
  var builtAt: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add also information about cached (not built) modules
  	 */
  var cached: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Show cached assets (setting this to `false` only shows emitted files)
  	 */
  var cachedAssets: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add children information
  	 */
  var children: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Display all chunk groups with the corresponding bundles
  	 */
  var chunkGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add built modules information to chunk information
  	 */
  var chunkModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add the origins of chunks and chunk merging info
  	 */
  var chunkOrigins: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add chunk information
  	 */
  var chunks: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * sort the chunks by that field
  	 */
  var chunksSort: js.UndefOr[String] = js.undefined
  
  /**
  	 * Enables/Disables colorful output
  	 */
  var colors: js.UndefOr[Boolean | Bold] = js.undefined
  
  /**
  	 * context directory for request shortening
  	 */
  var context: js.UndefOr[String] = js.undefined
  
  /**
  	 * add module depth in module graph
  	 */
  var depth: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Display the entry points with the corresponding bundles
  	 */
  var entrypoints: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add --env information
  	 */
  var env: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add details to errors (like resolving log)
  	 */
  var errorDetails: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add errors
  	 */
  var errors: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Please use excludeModules instead.
  	 */
  var exclude: js.UndefOr[FilterTypes | Boolean] = js.undefined
  
  /**
  	 * Suppress assets that match the specified filters. Filters can be Strings, RegExps or Functions
  	 */
  var excludeAssets: js.UndefOr[FilterTypes] = js.undefined
  
  /**
  	 * Suppress modules that match the specified filters. Filters can be Strings, RegExps, Booleans or Functions
  	 */
  var excludeModules: js.UndefOr[FilterTypes | Boolean] = js.undefined
  
  /**
  	 * add the hash of the compilation
  	 */
  var hash: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add logging output
  	 */
  var logging: js.UndefOr[Boolean | none | error | warn | info | log | verbose] = js.undefined
  
  /**
  	 * Include debug logging of specified loggers (i. e. for plugins or loaders). Filters can be Strings, RegExps or Functions
  	 */
  var loggingDebug: js.UndefOr[FilterTypes | Boolean] = js.undefined
  
  /**
  	 * add stack traces to logging output
  	 */
  var loggingTrace: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Set the maximum number of modules to be shown
  	 */
  var maxModules: js.UndefOr[Double] = js.undefined
  
  /**
  	 * add information about assets inside modules
  	 */
  var moduleAssets: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add dependencies and origin of warnings/errors
  	 */
  var moduleTrace: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add built modules information
  	 */
  var modules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * sort the modules by that field
  	 */
  var modulesSort: js.UndefOr[String] = js.undefined
  
  /**
  	 * add information about modules nested in other modules (like with module concatenation)
  	 */
  var nestedModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * show reasons why optimization bailed out for modules
  	 */
  var optimizationBailout: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add output path information
  	 */
  var outputPath: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add performance hint flags
  	 */
  var performance: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * show exports provided by modules
  	 */
  var providedExports: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add public path information
  	 */
  var publicPath: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add information about the reasons why modules are included
  	 */
  var reasons: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add the source code of modules
  	 */
  var source: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add timing information
  	 */
  var timings: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * show exports used by modules
  	 */
  var usedExports: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add webpack version information
  	 */
  var version: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * add warnings
  	 */
  var warnings: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Suppress warnings that match the specified filters. Filters can be Strings, RegExps or Functions
  	 */
  var warningsFilter: js.UndefOr[FilterTypes] = js.undefined
}
object StatsOptions {
  
  @scala.inline
  def apply(): StatsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatsOptions]
  }
  
  @scala.inline
  implicit class StatsOptionsMutableBuilder[Self <: StatsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    @scala.inline
    def setAssets(value: Boolean): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsSort(value: String): Self = StObject.set(x, "assetsSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetsSortUndefined: Self = StObject.set(x, "assetsSort", js.undefined)
    
    @scala.inline
    def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    @scala.inline
    def setBuiltAt(value: Boolean): Self = StObject.set(x, "builtAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuiltAtUndefined: Self = StObject.set(x, "builtAt", js.undefined)
    
    @scala.inline
    def setCached(value: Boolean): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachedAssets(value: Boolean): Self = StObject.set(x, "cachedAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachedAssetsUndefined: Self = StObject.set(x, "cachedAssets", js.undefined)
    
    @scala.inline
    def setCachedUndefined: Self = StObject.set(x, "cached", js.undefined)
    
    @scala.inline
    def setChildren(value: Boolean): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChunkGroups(value: Boolean): Self = StObject.set(x, "chunkGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkGroupsUndefined: Self = StObject.set(x, "chunkGroups", js.undefined)
    
    @scala.inline
    def setChunkModules(value: Boolean): Self = StObject.set(x, "chunkModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkModulesUndefined: Self = StObject.set(x, "chunkModules", js.undefined)
    
    @scala.inline
    def setChunkOrigins(value: Boolean): Self = StObject.set(x, "chunkOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunkOriginsUndefined: Self = StObject.set(x, "chunkOrigins", js.undefined)
    
    @scala.inline
    def setChunks(value: Boolean): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunksSort(value: String): Self = StObject.set(x, "chunksSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunksSortUndefined: Self = StObject.set(x, "chunksSort", js.undefined)
    
    @scala.inline
    def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    @scala.inline
    def setColors(value: Boolean | Bold): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setEntrypoints(value: Boolean): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntrypointsUndefined: Self = StObject.set(x, "entrypoints", js.undefined)
    
    @scala.inline
    def setEnv(value: Boolean): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    @scala.inline
    def setErrorDetails(value: Boolean): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setExclude(value: FilterTypes | Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeAssets(value: FilterTypes): Self = StObject.set(x, "excludeAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeAssetsFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "excludeAssets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcludeAssetsUndefined: Self = StObject.set(x, "excludeAssets", js.undefined)
    
    @scala.inline
    def setExcludeAssetsVarargs(value: FilterItemTypes*): Self = StObject.set(x, "excludeAssets", js.Array(value :_*))
    
    @scala.inline
    def setExcludeFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcludeModules(value: FilterTypes | Boolean): Self = StObject.set(x, "excludeModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeModulesFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "excludeModules", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcludeModulesUndefined: Self = StObject.set(x, "excludeModules", js.undefined)
    
    @scala.inline
    def setExcludeModulesVarargs(value: FilterItemTypes*): Self = StObject.set(x, "excludeModules", js.Array(value :_*))
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: FilterItemTypes*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean | none | error | warn | info | log | verbose): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingDebug(value: FilterTypes | Boolean): Self = StObject.set(x, "loggingDebug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingDebugFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "loggingDebug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoggingDebugUndefined: Self = StObject.set(x, "loggingDebug", js.undefined)
    
    @scala.inline
    def setLoggingDebugVarargs(value: FilterItemTypes*): Self = StObject.set(x, "loggingDebug", js.Array(value :_*))
    
    @scala.inline
    def setLoggingTrace(value: Boolean): Self = StObject.set(x, "loggingTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingTraceUndefined: Self = StObject.set(x, "loggingTrace", js.undefined)
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setMaxModules(value: Double): Self = StObject.set(x, "maxModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxModulesUndefined: Self = StObject.set(x, "maxModules", js.undefined)
    
    @scala.inline
    def setModuleAssets(value: Boolean): Self = StObject.set(x, "moduleAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleAssetsUndefined: Self = StObject.set(x, "moduleAssets", js.undefined)
    
    @scala.inline
    def setModuleTrace(value: Boolean): Self = StObject.set(x, "moduleTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleTraceUndefined: Self = StObject.set(x, "moduleTrace", js.undefined)
    
    @scala.inline
    def setModules(value: Boolean): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesSort(value: String): Self = StObject.set(x, "modulesSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesSortUndefined: Self = StObject.set(x, "modulesSort", js.undefined)
    
    @scala.inline
    def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    @scala.inline
    def setNestedModules(value: Boolean): Self = StObject.set(x, "nestedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedModulesUndefined: Self = StObject.set(x, "nestedModules", js.undefined)
    
    @scala.inline
    def setOptimizationBailout(value: Boolean): Self = StObject.set(x, "optimizationBailout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimizationBailoutUndefined: Self = StObject.set(x, "optimizationBailout", js.undefined)
    
    @scala.inline
    def setOutputPath(value: Boolean): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    @scala.inline
    def setProvidedExports(value: Boolean): Self = StObject.set(x, "providedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedExportsUndefined: Self = StObject.set(x, "providedExports", js.undefined)
    
    @scala.inline
    def setPublicPath(value: Boolean): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    
    @scala.inline
    def setReasons(value: Boolean): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    @scala.inline
    def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTimings(value: Boolean): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingsUndefined: Self = StObject.set(x, "timings", js.undefined)
    
    @scala.inline
    def setUsedExports(value: Boolean): Self = StObject.set(x, "usedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedExportsUndefined: Self = StObject.set(x, "usedExports", js.undefined)
    
    @scala.inline
    def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsFilter(value: FilterTypes): Self = StObject.set(x, "warningsFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsFilterFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "warningsFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarningsFilterUndefined: Self = StObject.set(x, "warningsFilter", js.undefined)
    
    @scala.inline
    def setWarningsFilterVarargs(value: FilterItemTypes*): Self = StObject.set(x, "warningsFilter", js.Array(value :_*))
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
