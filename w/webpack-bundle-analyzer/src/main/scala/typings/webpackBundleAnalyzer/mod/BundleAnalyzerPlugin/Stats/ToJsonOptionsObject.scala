package typings.webpackBundleAnalyzer.mod.BundleAnalyzerPlugin.Stats

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToJsonOptionsObject extends _ToJsonOptions {
  
  /** fallback value for stats options when an option is not defined (has precedence over local webpack defaults) */
  var all: js.UndefOr[Boolean] = js.native
  
  /** Add asset Information */
  var assets: js.UndefOr[Boolean] = js.native
  
  /** Sort assets by a field */
  var assetsSort: js.UndefOr[String] = js.native
  
  /** Add built at time information */
  var builtAt: js.UndefOr[Boolean] = js.native
  
  /** Add information about cached (not built) modules */
  var cached: js.UndefOr[Boolean] = js.native
  
  /** Show cached assets (setting this to `false` only shows emitted files) */
  var cachedAssets: js.UndefOr[Boolean] = js.native
  
  /** Add children information */
  var children: js.UndefOr[Boolean] = js.native
  
  /** Add information about the `namedChunkGroups` */
  var chunkGroups: js.UndefOr[Boolean] = js.native
  
  /** Add built modules information to chunk information */
  var chunkModules: js.UndefOr[Boolean] = js.native
  
  /** Add the origins of chunks and chunk merging info */
  var chunkOrigins: js.UndefOr[Boolean] = js.native
  
  /** Add chunk information (setting this to `false` allows for a less verbose output) */
  var chunks: js.UndefOr[Boolean] = js.native
  
  /** Sort the chunks by a field */
  var chunksSort: js.UndefOr[String] = js.native
  
  /** Context directory for request shortening */
  var context: js.UndefOr[String] = js.native
  
  /** Display the distance from the entry point for each module */
  var depth: js.UndefOr[Boolean] = js.native
  
  /** Display the entry points with the corresponding bundles */
  var entrypoints: js.UndefOr[Boolean] = js.native
  
  /** Add --env information */
  var env: js.UndefOr[Boolean] = js.native
  
  /** Add details to errors (like resolving log) */
  var errorDetails: js.UndefOr[Boolean] = js.native
  
  /** Add errors */
  var errors: js.UndefOr[Boolean] = js.native
  
  /** See excludeModules */
  var exclude: js.UndefOr[StatsExcludeFilter] = js.native
  
  /** Exclude assets from being displayed in stats */
  var excludeAssets: js.UndefOr[StatsExcludeFilter] = js.native
  
  /** Exclude modules from being displayed in stats */
  var excludeModules: js.UndefOr[StatsExcludeFilter] = js.native
  
  /** Add the hash of the compilation */
  var hash: js.UndefOr[Boolean] = js.native
  
  /** Set the maximum number of modules to be shown */
  var maxModules: js.UndefOr[Double] = js.native
  
  /** Show dependencies and origin of warnings/errors */
  var moduleTrace: js.UndefOr[Boolean] = js.native
  
  /** Add built modules information */
  var modules: js.UndefOr[Boolean] = js.native
  
  /** Sort the modules by a field */
  var modulesSort: js.UndefOr[String] = js.native
  
  /** Show performance hint when file size exceeds `performance.maxAssetSize` */
  var performance: js.UndefOr[Boolean] = js.native
  
  /** Show the exports of the modules */
  var providedExports: js.UndefOr[Boolean] = js.native
  
  /** Add public path information */
  var publicPath: js.UndefOr[Boolean] = js.native
  
  /** Add information about the reasons why modules are included */
  var reasons: js.UndefOr[Boolean] = js.native
  
  /** Add the source code of modules */
  var source: js.UndefOr[Boolean] = js.native
  
  /** Add timing information */
  var timings: js.UndefOr[Boolean] = js.native
  
  /** Show which exports of a module are used */
  var usedExports: js.UndefOr[Boolean] = js.native
  
  /** Add webpack version information */
  var version: js.UndefOr[Boolean] = js.native
  
  /** Add warnings */
  var warnings: js.UndefOr[Boolean] = js.native
  
  /** Filter warnings to be shown */
  var warningsFilter: js.UndefOr[
    String | RegExp | (js.Array[String | RegExp]) | (js.Function1[/* warning */ String, Boolean])
  ] = js.native
}
object ToJsonOptionsObject {
  
  @scala.inline
  def apply(): ToJsonOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToJsonOptionsObject]
  }
  
  @scala.inline
  implicit class ToJsonOptionsObjectOps[Self <: ToJsonOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setExcludeVarargs(value: ((js.Function1[/* assetName */ String, Boolean]) | RegExp | String)*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExcludeFunction1(value: /* assetName */ String => Boolean): Self = this.set("exclude", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExclude(value: StatsExcludeFilter): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExcludeAssetsVarargs(value: ((js.Function1[/* assetName */ String, Boolean]) | RegExp | String)*): Self = this.set("excludeAssets", js.Array(value :_*))
    
    @scala.inline
    def setExcludeAssetsFunction1(value: /* assetName */ String => Boolean): Self = this.set("excludeAssets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcludeAssets(value: StatsExcludeFilter): Self = this.set("excludeAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeAssets: Self = this.set("excludeAssets", js.undefined)
    
    @scala.inline
    def setExcludeModulesVarargs(value: ((js.Function1[/* assetName */ String, Boolean]) | RegExp | String)*): Self = this.set("excludeModules", js.Array(value :_*))
    
    @scala.inline
    def setExcludeModulesFunction1(value: /* assetName */ String => Boolean): Self = this.set("excludeModules", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExcludeModules(value: StatsExcludeFilter): Self = this.set("excludeModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeModules: Self = this.set("excludeModules", js.undefined)
    
    @scala.inline
    def setHash(value: Boolean): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHash: Self = this.set("hash", js.undefined)
    
    @scala.inline
    def setMaxModules(value: Double): Self = this.set("maxModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxModules: Self = this.set("maxModules", js.undefined)
    
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
    def setWarningsFilterVarargs(value: (String | RegExp)*): Self = this.set("warningsFilter", js.Array(value :_*))
    
    @scala.inline
    def setWarningsFilterFunction1(value: /* warning */ String => Boolean): Self = this.set("warningsFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWarningsFilter(
      value: String | RegExp | (js.Array[String | RegExp]) | (js.Function1[/* warning */ String, Boolean])
    ): Self = this.set("warningsFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarningsFilter: Self = this.set("warningsFilter", js.undefined)
  }
}
