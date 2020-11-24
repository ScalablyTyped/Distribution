package typings.webpack.webpackOptionsMod

import typings.webpack.anon.Bold
import typings.webpack.webpackStrings.error
import typings.webpack.webpackStrings.info
import typings.webpack.webpackStrings.log
import typings.webpack.webpackStrings.none
import typings.webpack.webpackStrings.verbose
import typings.webpack.webpackStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatsOptions extends js.Object {
  
  /**
  	 * fallback value for stats options when an option is not defined (has precedence over local webpack defaults)
  	 */
  var all: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add assets information
  	 */
  var assets: js.UndefOr[Boolean] = js.native
  
  /**
  	 * sort the assets by that field
  	 */
  var assetsSort: js.UndefOr[String] = js.native
  
  /**
  	 * add built at time information
  	 */
  var builtAt: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add also information about cached (not built) modules
  	 */
  var cached: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Show cached assets (setting this to `false` only shows emitted files)
  	 */
  var cachedAssets: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add children information
  	 */
  var children: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Display all chunk groups with the corresponding bundles
  	 */
  var chunkGroups: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add built modules information to chunk information
  	 */
  var chunkModules: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add the origins of chunks and chunk merging info
  	 */
  var chunkOrigins: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add chunk information
  	 */
  var chunks: js.UndefOr[Boolean] = js.native
  
  /**
  	 * sort the chunks by that field
  	 */
  var chunksSort: js.UndefOr[String] = js.native
  
  /**
  	 * Enables/Disables colorful output
  	 */
  var colors: js.UndefOr[Boolean | Bold] = js.native
  
  /**
  	 * context directory for request shortening
  	 */
  var context: js.UndefOr[String] = js.native
  
  /**
  	 * add module depth in module graph
  	 */
  var depth: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Display the entry points with the corresponding bundles
  	 */
  var entrypoints: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add --env information
  	 */
  var env: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add details to errors (like resolving log)
  	 */
  var errorDetails: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add errors
  	 */
  var errors: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Please use excludeModules instead.
  	 */
  var exclude: js.UndefOr[FilterTypes | Boolean] = js.native
  
  /**
  	 * Suppress assets that match the specified filters. Filters can be Strings, RegExps or Functions
  	 */
  var excludeAssets: js.UndefOr[FilterTypes] = js.native
  
  /**
  	 * Suppress modules that match the specified filters. Filters can be Strings, RegExps, Booleans or Functions
  	 */
  var excludeModules: js.UndefOr[FilterTypes | Boolean] = js.native
  
  /**
  	 * add the hash of the compilation
  	 */
  var hash: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add logging output
  	 */
  var logging: js.UndefOr[Boolean | none | error | warn | info | log | verbose] = js.native
  
  /**
  	 * Include debug logging of specified loggers (i. e. for plugins or loaders). Filters can be Strings, RegExps or Functions
  	 */
  var loggingDebug: js.UndefOr[FilterTypes | Boolean] = js.native
  
  /**
  	 * add stack traces to logging output
  	 */
  var loggingTrace: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Set the maximum number of modules to be shown
  	 */
  var maxModules: js.UndefOr[Double] = js.native
  
  /**
  	 * add information about assets inside modules
  	 */
  var moduleAssets: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add dependencies and origin of warnings/errors
  	 */
  var moduleTrace: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add built modules information
  	 */
  var modules: js.UndefOr[Boolean] = js.native
  
  /**
  	 * sort the modules by that field
  	 */
  var modulesSort: js.UndefOr[String] = js.native
  
  /**
  	 * add information about modules nested in other modules (like with module concatenation)
  	 */
  var nestedModules: js.UndefOr[Boolean] = js.native
  
  /**
  	 * show reasons why optimization bailed out for modules
  	 */
  var optimizationBailout: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Add output path information
  	 */
  var outputPath: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add performance hint flags
  	 */
  var performance: js.UndefOr[Boolean] = js.native
  
  /**
  	 * show exports provided by modules
  	 */
  var providedExports: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Add public path information
  	 */
  var publicPath: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add information about the reasons why modules are included
  	 */
  var reasons: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add the source code of modules
  	 */
  var source: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add timing information
  	 */
  var timings: js.UndefOr[Boolean] = js.native
  
  /**
  	 * show exports used by modules
  	 */
  var usedExports: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add webpack version information
  	 */
  var version: js.UndefOr[Boolean] = js.native
  
  /**
  	 * add warnings
  	 */
  var warnings: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Suppress warnings that match the specified filters. Filters can be Strings, RegExps or Functions
  	 */
  var warningsFilter: js.UndefOr[FilterTypes] = js.native
}
object StatsOptions {
  
  @scala.inline
  def apply(): StatsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatsOptions]
  }
  
  @scala.inline
  implicit class StatsOptionsOps[Self <: StatsOptions] (val x: Self) extends AnyVal {
    
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
    def setAll(value: Boolean): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setAssets(value: Boolean): Self = this.set("assets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssets: Self = this.set("assets", js.undefined)
    
    @scala.inline
    def setAssetsSort(value: String): Self = this.set("assetsSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetsSort: Self = this.set("assetsSort", js.undefined)
    
    @scala.inline
    def setBuiltAt(value: Boolean): Self = this.set("builtAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuiltAt: Self = this.set("builtAt", js.undefined)
    
    @scala.inline
    def setCached(value: Boolean): Self = this.set("cached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCached: Self = this.set("cached", js.undefined)
    
    @scala.inline
    def setCachedAssets(value: Boolean): Self = this.set("cachedAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachedAssets: Self = this.set("cachedAssets", js.undefined)
    
    @scala.inline
    def setChildren(value: Boolean): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChunkGroups(value: Boolean): Self = this.set("chunkGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkGroups: Self = this.set("chunkGroups", js.undefined)
    
    @scala.inline
    def setChunkModules(value: Boolean): Self = this.set("chunkModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkModules: Self = this.set("chunkModules", js.undefined)
    
    @scala.inline
    def setChunkOrigins(value: Boolean): Self = this.set("chunkOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunkOrigins: Self = this.set("chunkOrigins", js.undefined)
    
    @scala.inline
    def setChunks(value: Boolean): Self = this.set("chunks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunks: Self = this.set("chunks", js.undefined)
    
    @scala.inline
    def setChunksSort(value: String): Self = this.set("chunksSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunksSort: Self = this.set("chunksSort", js.undefined)
    
    @scala.inline
    def setColors(value: Boolean | Bold): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setDepth(value: Boolean): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setEntrypoints(value: Boolean): Self = this.set("entrypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntrypoints: Self = this.set("entrypoints", js.undefined)
    
    @scala.inline
    def setEnv(value: Boolean): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setErrorDetails(value: Boolean): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setErrors(value: Boolean): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: FilterItemTypes*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExcludeFunction1(value: /* value */ String => Boolean): Self = this.set("exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExclude(value: FilterTypes | Boolean): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExcludeAssetsVarargs(value: FilterItemTypes*): Self = this.set("excludeAssets", js.Array(value :_*))
    
    @scala.inline
    def setExcludeAssetsFunction1(value: /* value */ String => Boolean): Self = this.set("excludeAssets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcludeAssets(value: FilterTypes): Self = this.set("excludeAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeAssets: Self = this.set("excludeAssets", js.undefined)
    
    @scala.inline
    def setExcludeModulesVarargs(value: FilterItemTypes*): Self = this.set("excludeModules", js.Array(value :_*))
    
    @scala.inline
    def setExcludeModulesFunction1(value: /* value */ String => Boolean): Self = this.set("excludeModules", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcludeModules(value: FilterTypes | Boolean): Self = this.set("excludeModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeModules: Self = this.set("excludeModules", js.undefined)
    
    @scala.inline
    def setHash(value: Boolean): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean | none | error | warn | info | log | verbose): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setLoggingDebugVarargs(value: FilterItemTypes*): Self = this.set("loggingDebug", js.Array(value :_*))
    
    @scala.inline
    def setLoggingDebugFunction1(value: /* value */ String => Boolean): Self = this.set("loggingDebug", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoggingDebug(value: FilterTypes | Boolean): Self = this.set("loggingDebug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingDebug: Self = this.set("loggingDebug", js.undefined)
    
    @scala.inline
    def setLoggingTrace(value: Boolean): Self = this.set("loggingTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingTrace: Self = this.set("loggingTrace", js.undefined)
    
    @scala.inline
    def setMaxModules(value: Double): Self = this.set("maxModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxModules: Self = this.set("maxModules", js.undefined)
    
    @scala.inline
    def setModuleAssets(value: Boolean): Self = this.set("moduleAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleAssets: Self = this.set("moduleAssets", js.undefined)
    
    @scala.inline
    def setModuleTrace(value: Boolean): Self = this.set("moduleTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleTrace: Self = this.set("moduleTrace", js.undefined)
    
    @scala.inline
    def setModules(value: Boolean): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setModulesSort(value: String): Self = this.set("modulesSort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModulesSort: Self = this.set("modulesSort", js.undefined)
    
    @scala.inline
    def setNestedModules(value: Boolean): Self = this.set("nestedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNestedModules: Self = this.set("nestedModules", js.undefined)
    
    @scala.inline
    def setOptimizationBailout(value: Boolean): Self = this.set("optimizationBailout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimizationBailout: Self = this.set("optimizationBailout", js.undefined)
    
    @scala.inline
    def setOutputPath(value: Boolean): Self = this.set("outputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputPath: Self = this.set("outputPath", js.undefined)
    
    @scala.inline
    def setPerformance(value: Boolean): Self = this.set("performance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerformance: Self = this.set("performance", js.undefined)
    
    @scala.inline
    def setProvidedExports(value: Boolean): Self = this.set("providedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvidedExports: Self = this.set("providedExports", js.undefined)
    
    @scala.inline
    def setPublicPath(value: Boolean): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setReasons(value: Boolean): Self = this.set("reasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReasons: Self = this.set("reasons", js.undefined)
    
    @scala.inline
    def setSource(value: Boolean): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTimings(value: Boolean): Self = this.set("timings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimings: Self = this.set("timings", js.undefined)
    
    @scala.inline
    def setUsedExports(value: Boolean): Self = this.set("usedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedExports: Self = this.set("usedExports", js.undefined)
    
    @scala.inline
    def setVersion(value: Boolean): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWarnings(value: Boolean): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
    
    @scala.inline
    def setWarningsFilterVarargs(value: FilterItemTypes*): Self = this.set("warningsFilter", js.Array(value :_*))
    
    @scala.inline
    def setWarningsFilterFunction1(value: /* value */ String => Boolean): Self = this.set("warningsFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarningsFilter(value: FilterTypes): Self = this.set("warningsFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarningsFilter: Self = this.set("warningsFilter", js.undefined)
  }
}
