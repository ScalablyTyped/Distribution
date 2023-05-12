package typings.webpack.mod

import typings.webpack.anon.Bold
import typings.webpack.webpackStrings.`root-of-chunk`
import typings.webpack.webpackStrings.auto
import typings.webpack.webpackStrings.chunk
import typings.webpack.webpackStrings.error
import typings.webpack.webpackStrings.info
import typings.webpack.webpackStrings.log
import typings.webpack.webpackStrings.module
import typings.webpack.webpackStrings.nested
import typings.webpack.webpackStrings.none
import typings.webpack.webpackStrings.verbose
import typings.webpack.webpackStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stats options object.
  */
trait StatsOptions
  extends StObject
     with _StatsValue {
  
  /**
  	 * Fallback value for stats options when an option is not defined (has precedence over local webpack defaults).
  	 */
  var all: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add assets information.
  	 */
  var assets: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Sort the assets by that field.
  	 */
  var assetsSort: js.UndefOr[String] = js.undefined
  
  /**
  	 * Space to display assets (groups will be collapsed to fit this space).
  	 */
  var assetsSpace: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Add built at time information.
  	 */
  var builtAt: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add information about cached (not built) modules (deprecated: use 'cachedModules' instead).
  	 */
  var cached: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Show cached assets (setting this to `false` only shows emitted files).
  	 */
  var cachedAssets: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add information about cached (not built) modules.
  	 */
  var cachedModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add children information.
  	 */
  var children: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Display auxiliary assets in chunk groups.
  	 */
  var chunkGroupAuxiliary: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Display children of chunk groups.
  	 */
  var chunkGroupChildren: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Limit of assets displayed in chunk groups.
  	 */
  var chunkGroupMaxAssets: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Display all chunk groups with the corresponding bundles.
  	 */
  var chunkGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add built modules information to chunk information.
  	 */
  var chunkModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Space to display chunk modules (groups will be collapsed to fit this space, value is in number of modules/group).
  	 */
  var chunkModulesSpace: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Add the origins of chunks and chunk merging info.
  	 */
  var chunkOrigins: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add information about parent, children and sibling chunks to chunk information.
  	 */
  var chunkRelations: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add chunk information.
  	 */
  var chunks: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Sort the chunks by that field.
  	 */
  var chunksSort: js.UndefOr[String] = js.undefined
  
  /**
  	 * Enables/Disables colorful output.
  	 */
  var colors: js.UndefOr[Boolean | Bold] = js.undefined
  
  /**
  	 * Context directory for request shortening.
  	 */
  var context: js.UndefOr[String] = js.undefined
  
  /**
  	 * Show chunk modules that are dependencies of other modules of the chunk.
  	 */
  var dependentModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add module depth in module graph.
  	 */
  var depth: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Display the entry points with the corresponding bundles.
  	 */
  var entrypoints: js.UndefOr[Boolean | auto] = js.undefined
  
  /**
  	 * Add --env information.
  	 */
  var env: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add details to errors (like resolving log).
  	 */
  var errorDetails: js.UndefOr[Boolean | auto] = js.undefined
  
  /**
  	 * Add internal stack trace to errors.
  	 */
  var errorStack: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add errors.
  	 */
  var errors: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add errors count.
  	 */
  var errorsCount: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Space to display errors (value is in number of lines).
  	 */
  var errorsSpace: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Please use excludeModules instead.
  	 */
  var exclude: js.UndefOr[
    String | Boolean | js.RegExp | js.Array[ModuleFilterItemTypes] | (js.Function3[
      /* name */ String, 
      /* module */ StatsModule, 
      /* type */ module | chunk | `root-of-chunk` | nested, 
      Boolean
    ])
  ] = js.undefined
  
  /**
  	 * Suppress assets that match the specified filters. Filters can be Strings, RegExps or Functions.
  	 */
  var excludeAssets: js.UndefOr[
    String | js.RegExp | js.Array[AssetFilterItemTypes] | (js.Function2[/* name */ String, /* asset */ StatsAsset, Boolean])
  ] = js.undefined
  
  /**
  	 * Suppress modules that match the specified filters. Filters can be Strings, RegExps, Booleans or Functions.
  	 */
  var excludeModules: js.UndefOr[
    String | Boolean | js.RegExp | js.Array[ModuleFilterItemTypes] | (js.Function3[
      /* name */ String, 
      /* module */ StatsModule, 
      /* type */ module | chunk | `root-of-chunk` | nested, 
      Boolean
    ])
  ] = js.undefined
  
  /**
  	 * Group assets by how their are related to chunks.
  	 */
  var groupAssetsByChunk: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Group assets by their status (emitted, compared for emit or cached).
  	 */
  var groupAssetsByEmitStatus: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Group assets by their extension.
  	 */
  var groupAssetsByExtension: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Group assets by their asset info (immutable, development, hotModuleReplacement, etc).
  	 */
  var groupAssetsByInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Group assets by their path.
  	 */
  var groupAssetsByPath: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Group modules by their attributes (errors, warnings, assets, optional, orphan, or dependent).
  	 */
  var groupModulesByAttributes: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Group modules by their status (cached or built and cacheable).
  	 */
  var groupModulesByCacheStatus: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Group modules by their extension.
  	 */
  var groupModulesByExtension: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Group modules by their layer.
  	 */
  var groupModulesByLayer: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Group modules by their path.
  	 */
  var groupModulesByPath: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Group modules by their type.
  	 */
  var groupModulesByType: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Group reasons by their origin module.
  	 */
  var groupReasonsByOrigin: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add the hash of the compilation.
  	 */
  var hash: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add ids.
  	 */
  var ids: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add logging output.
  	 */
  var logging: js.UndefOr[Boolean | none | error | warn | info | log | verbose] = js.undefined
  
  /**
  	 * Include debug logging of specified loggers (i. e. for plugins or loaders). Filters can be Strings, RegExps or Functions.
  	 */
  var loggingDebug: js.UndefOr[
    String | Boolean | js.RegExp | js.Array[FilterItemTypes] | (js.Function1[/* value */ String, Boolean])
  ] = js.undefined
  
  /**
  	 * Add stack traces to logging output.
  	 */
  var loggingTrace: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add information about assets inside modules.
  	 */
  var moduleAssets: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add dependencies and origin of warnings/errors.
  	 */
  var moduleTrace: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add built modules information.
  	 */
  var modules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Sort the modules by that field.
  	 */
  var modulesSort: js.UndefOr[String] = js.undefined
  
  /**
  	 * Space to display modules (groups will be collapsed to fit this space, value is in number of modules/groups).
  	 */
  var modulesSpace: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Add information about modules nested in other modules (like with module concatenation).
  	 */
  var nestedModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Space to display modules nested within other modules (groups will be collapsed to fit this space, value is in number of modules/group).
  	 */
  var nestedModulesSpace: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Show reasons why optimization bailed out for modules.
  	 */
  var optimizationBailout: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add information about orphan modules.
  	 */
  var orphanModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add output path information.
  	 */
  var outputPath: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add performance hint flags.
  	 */
  var performance: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Preset for the default values.
  	 */
  var preset: js.UndefOr[String | Boolean] = js.undefined
  
  /**
  	 * Show exports provided by modules.
  	 */
  var providedExports: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add public path information.
  	 */
  var publicPath: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add information about the reasons why modules are included.
  	 */
  var reasons: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Space to display reasons (groups will be collapsed to fit this space).
  	 */
  var reasonsSpace: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Add information about assets that are related to other assets (like SourceMaps for assets).
  	 */
  var relatedAssets: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add information about runtime modules (deprecated: use 'runtimeModules' instead).
  	 */
  var runtime: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add information about runtime modules.
  	 */
  var runtimeModules: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add the source code of modules.
  	 */
  var source: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add timing information.
  	 */
  var timings: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Show exports used by modules.
  	 */
  var usedExports: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add webpack version information.
  	 */
  var version: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add warnings.
  	 */
  var warnings: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Add warnings count.
  	 */
  var warningsCount: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Suppress listing warnings that match the specified filters (they will still be counted). Filters can be Strings, RegExps or Functions.
  	 */
  var warningsFilter: js.UndefOr[
    String | js.RegExp | js.Array[WarningFilterItemTypes] | (js.Function2[/* warning */ StatsError, /* value */ String, Boolean])
  ] = js.undefined
  
  /**
  	 * Space to display warnings (value is in number of lines).
  	 */
  var warningsSpace: js.UndefOr[Double] = js.undefined
}
object StatsOptions {
  
  inline def apply(): StatsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatsOptions] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setAssets(value: Boolean): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsSort(value: String): Self = StObject.set(x, "assetsSort", value.asInstanceOf[js.Any])
    
    inline def setAssetsSortUndefined: Self = StObject.set(x, "assetsSort", js.undefined)
    
    inline def setAssetsSpace(value: Double): Self = StObject.set(x, "assetsSpace", value.asInstanceOf[js.Any])
    
    inline def setAssetsSpaceUndefined: Self = StObject.set(x, "assetsSpace", js.undefined)
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setBuiltAt(value: Boolean): Self = StObject.set(x, "builtAt", value.asInstanceOf[js.Any])
    
    inline def setBuiltAtUndefined: Self = StObject.set(x, "builtAt", js.undefined)
    
    inline def setCached(value: Boolean): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    inline def setCachedAssets(value: Boolean): Self = StObject.set(x, "cachedAssets", value.asInstanceOf[js.Any])
    
    inline def setCachedAssetsUndefined: Self = StObject.set(x, "cachedAssets", js.undefined)
    
    inline def setCachedModules(value: Boolean): Self = StObject.set(x, "cachedModules", value.asInstanceOf[js.Any])
    
    inline def setCachedModulesUndefined: Self = StObject.set(x, "cachedModules", js.undefined)
    
    inline def setCachedUndefined: Self = StObject.set(x, "cached", js.undefined)
    
    inline def setChildren(value: Boolean): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChunkGroupAuxiliary(value: Boolean): Self = StObject.set(x, "chunkGroupAuxiliary", value.asInstanceOf[js.Any])
    
    inline def setChunkGroupAuxiliaryUndefined: Self = StObject.set(x, "chunkGroupAuxiliary", js.undefined)
    
    inline def setChunkGroupChildren(value: Boolean): Self = StObject.set(x, "chunkGroupChildren", value.asInstanceOf[js.Any])
    
    inline def setChunkGroupChildrenUndefined: Self = StObject.set(x, "chunkGroupChildren", js.undefined)
    
    inline def setChunkGroupMaxAssets(value: Double): Self = StObject.set(x, "chunkGroupMaxAssets", value.asInstanceOf[js.Any])
    
    inline def setChunkGroupMaxAssetsUndefined: Self = StObject.set(x, "chunkGroupMaxAssets", js.undefined)
    
    inline def setChunkGroups(value: Boolean): Self = StObject.set(x, "chunkGroups", value.asInstanceOf[js.Any])
    
    inline def setChunkGroupsUndefined: Self = StObject.set(x, "chunkGroups", js.undefined)
    
    inline def setChunkModules(value: Boolean): Self = StObject.set(x, "chunkModules", value.asInstanceOf[js.Any])
    
    inline def setChunkModulesSpace(value: Double): Self = StObject.set(x, "chunkModulesSpace", value.asInstanceOf[js.Any])
    
    inline def setChunkModulesSpaceUndefined: Self = StObject.set(x, "chunkModulesSpace", js.undefined)
    
    inline def setChunkModulesUndefined: Self = StObject.set(x, "chunkModules", js.undefined)
    
    inline def setChunkOrigins(value: Boolean): Self = StObject.set(x, "chunkOrigins", value.asInstanceOf[js.Any])
    
    inline def setChunkOriginsUndefined: Self = StObject.set(x, "chunkOrigins", js.undefined)
    
    inline def setChunkRelations(value: Boolean): Self = StObject.set(x, "chunkRelations", value.asInstanceOf[js.Any])
    
    inline def setChunkRelationsUndefined: Self = StObject.set(x, "chunkRelations", js.undefined)
    
    inline def setChunks(value: Boolean): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksSort(value: String): Self = StObject.set(x, "chunksSort", value.asInstanceOf[js.Any])
    
    inline def setChunksSortUndefined: Self = StObject.set(x, "chunksSort", js.undefined)
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setColors(value: Boolean | Bold): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDependentModules(value: Boolean): Self = StObject.set(x, "dependentModules", value.asInstanceOf[js.Any])
    
    inline def setDependentModulesUndefined: Self = StObject.set(x, "dependentModules", js.undefined)
    
    inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setEntrypoints(value: Boolean | auto): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
    
    inline def setEntrypointsUndefined: Self = StObject.set(x, "entrypoints", js.undefined)
    
    inline def setEnv(value: Boolean): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setErrorDetails(value: Boolean | auto): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setErrorStack(value: Boolean): Self = StObject.set(x, "errorStack", value.asInstanceOf[js.Any])
    
    inline def setErrorStackUndefined: Self = StObject.set(x, "errorStack", js.undefined)
    
    inline def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsCount(value: Boolean): Self = StObject.set(x, "errorsCount", value.asInstanceOf[js.Any])
    
    inline def setErrorsCountUndefined: Self = StObject.set(x, "errorsCount", js.undefined)
    
    inline def setErrorsSpace(value: Double): Self = StObject.set(x, "errorsSpace", value.asInstanceOf[js.Any])
    
    inline def setErrorsSpaceUndefined: Self = StObject.set(x, "errorsSpace", js.undefined)
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setExclude(
      value: String | Boolean | js.RegExp | js.Array[ModuleFilterItemTypes] | (js.Function3[
          /* name */ String, 
          /* module */ StatsModule, 
          /* type */ module | chunk | `root-of-chunk` | nested, 
          Boolean
        ])
    ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeAssets(
      value: String | js.RegExp | js.Array[AssetFilterItemTypes] | (js.Function2[/* name */ String, /* asset */ StatsAsset, Boolean])
    ): Self = StObject.set(x, "excludeAssets", value.asInstanceOf[js.Any])
    
    inline def setExcludeAssetsFunction2(value: (/* name */ String, /* asset */ StatsAsset) => Boolean): Self = StObject.set(x, "excludeAssets", js.Any.fromFunction2(value))
    
    inline def setExcludeAssetsUndefined: Self = StObject.set(x, "excludeAssets", js.undefined)
    
    inline def setExcludeAssetsVarargs(value: AssetFilterItemTypes*): Self = StObject.set(x, "excludeAssets", js.Array(value*))
    
    inline def setExcludeFunction3(
      value: (/* name */ String, /* module */ StatsModule, /* type */ module | chunk | `root-of-chunk` | nested) => Boolean
    ): Self = StObject.set(x, "exclude", js.Any.fromFunction3(value))
    
    inline def setExcludeModules(
      value: String | Boolean | js.RegExp | js.Array[ModuleFilterItemTypes] | (js.Function3[
          /* name */ String, 
          /* module */ StatsModule, 
          /* type */ module | chunk | `root-of-chunk` | nested, 
          Boolean
        ])
    ): Self = StObject.set(x, "excludeModules", value.asInstanceOf[js.Any])
    
    inline def setExcludeModulesFunction3(
      value: (/* name */ String, /* module */ StatsModule, /* type */ module | chunk | `root-of-chunk` | nested) => Boolean
    ): Self = StObject.set(x, "excludeModules", js.Any.fromFunction3(value))
    
    inline def setExcludeModulesUndefined: Self = StObject.set(x, "excludeModules", js.undefined)
    
    inline def setExcludeModulesVarargs(value: ModuleFilterItemTypes*): Self = StObject.set(x, "excludeModules", js.Array(value*))
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: ModuleFilterItemTypes*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setGroupAssetsByChunk(value: Boolean): Self = StObject.set(x, "groupAssetsByChunk", value.asInstanceOf[js.Any])
    
    inline def setGroupAssetsByChunkUndefined: Self = StObject.set(x, "groupAssetsByChunk", js.undefined)
    
    inline def setGroupAssetsByEmitStatus(value: Boolean): Self = StObject.set(x, "groupAssetsByEmitStatus", value.asInstanceOf[js.Any])
    
    inline def setGroupAssetsByEmitStatusUndefined: Self = StObject.set(x, "groupAssetsByEmitStatus", js.undefined)
    
    inline def setGroupAssetsByExtension(value: Boolean): Self = StObject.set(x, "groupAssetsByExtension", value.asInstanceOf[js.Any])
    
    inline def setGroupAssetsByExtensionUndefined: Self = StObject.set(x, "groupAssetsByExtension", js.undefined)
    
    inline def setGroupAssetsByInfo(value: Boolean): Self = StObject.set(x, "groupAssetsByInfo", value.asInstanceOf[js.Any])
    
    inline def setGroupAssetsByInfoUndefined: Self = StObject.set(x, "groupAssetsByInfo", js.undefined)
    
    inline def setGroupAssetsByPath(value: Boolean): Self = StObject.set(x, "groupAssetsByPath", value.asInstanceOf[js.Any])
    
    inline def setGroupAssetsByPathUndefined: Self = StObject.set(x, "groupAssetsByPath", js.undefined)
    
    inline def setGroupModulesByAttributes(value: Boolean): Self = StObject.set(x, "groupModulesByAttributes", value.asInstanceOf[js.Any])
    
    inline def setGroupModulesByAttributesUndefined: Self = StObject.set(x, "groupModulesByAttributes", js.undefined)
    
    inline def setGroupModulesByCacheStatus(value: Boolean): Self = StObject.set(x, "groupModulesByCacheStatus", value.asInstanceOf[js.Any])
    
    inline def setGroupModulesByCacheStatusUndefined: Self = StObject.set(x, "groupModulesByCacheStatus", js.undefined)
    
    inline def setGroupModulesByExtension(value: Boolean): Self = StObject.set(x, "groupModulesByExtension", value.asInstanceOf[js.Any])
    
    inline def setGroupModulesByExtensionUndefined: Self = StObject.set(x, "groupModulesByExtension", js.undefined)
    
    inline def setGroupModulesByLayer(value: Boolean): Self = StObject.set(x, "groupModulesByLayer", value.asInstanceOf[js.Any])
    
    inline def setGroupModulesByLayerUndefined: Self = StObject.set(x, "groupModulesByLayer", js.undefined)
    
    inline def setGroupModulesByPath(value: Boolean): Self = StObject.set(x, "groupModulesByPath", value.asInstanceOf[js.Any])
    
    inline def setGroupModulesByPathUndefined: Self = StObject.set(x, "groupModulesByPath", js.undefined)
    
    inline def setGroupModulesByType(value: Boolean): Self = StObject.set(x, "groupModulesByType", value.asInstanceOf[js.Any])
    
    inline def setGroupModulesByTypeUndefined: Self = StObject.set(x, "groupModulesByType", js.undefined)
    
    inline def setGroupReasonsByOrigin(value: Boolean): Self = StObject.set(x, "groupReasonsByOrigin", value.asInstanceOf[js.Any])
    
    inline def setGroupReasonsByOriginUndefined: Self = StObject.set(x, "groupReasonsByOrigin", js.undefined)
    
    inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setIds(value: Boolean): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setLogging(value: Boolean | none | error | warn | info | log | verbose): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingDebug(
      value: String | Boolean | js.RegExp | js.Array[FilterItemTypes] | (js.Function1[/* value */ String, Boolean])
    ): Self = StObject.set(x, "loggingDebug", value.asInstanceOf[js.Any])
    
    inline def setLoggingDebugFunction1(value: /* value */ String => Boolean): Self = StObject.set(x, "loggingDebug", js.Any.fromFunction1(value))
    
    inline def setLoggingDebugUndefined: Self = StObject.set(x, "loggingDebug", js.undefined)
    
    inline def setLoggingDebugVarargs(value: FilterItemTypes*): Self = StObject.set(x, "loggingDebug", js.Array(value*))
    
    inline def setLoggingTrace(value: Boolean): Self = StObject.set(x, "loggingTrace", value.asInstanceOf[js.Any])
    
    inline def setLoggingTraceUndefined: Self = StObject.set(x, "loggingTrace", js.undefined)
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setModuleAssets(value: Boolean): Self = StObject.set(x, "moduleAssets", value.asInstanceOf[js.Any])
    
    inline def setModuleAssetsUndefined: Self = StObject.set(x, "moduleAssets", js.undefined)
    
    inline def setModuleTrace(value: Boolean): Self = StObject.set(x, "moduleTrace", value.asInstanceOf[js.Any])
    
    inline def setModuleTraceUndefined: Self = StObject.set(x, "moduleTrace", js.undefined)
    
    inline def setModules(value: Boolean): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesSort(value: String): Self = StObject.set(x, "modulesSort", value.asInstanceOf[js.Any])
    
    inline def setModulesSortUndefined: Self = StObject.set(x, "modulesSort", js.undefined)
    
    inline def setModulesSpace(value: Double): Self = StObject.set(x, "modulesSpace", value.asInstanceOf[js.Any])
    
    inline def setModulesSpaceUndefined: Self = StObject.set(x, "modulesSpace", js.undefined)
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setNestedModules(value: Boolean): Self = StObject.set(x, "nestedModules", value.asInstanceOf[js.Any])
    
    inline def setNestedModulesSpace(value: Double): Self = StObject.set(x, "nestedModulesSpace", value.asInstanceOf[js.Any])
    
    inline def setNestedModulesSpaceUndefined: Self = StObject.set(x, "nestedModulesSpace", js.undefined)
    
    inline def setNestedModulesUndefined: Self = StObject.set(x, "nestedModules", js.undefined)
    
    inline def setOptimizationBailout(value: Boolean): Self = StObject.set(x, "optimizationBailout", value.asInstanceOf[js.Any])
    
    inline def setOptimizationBailoutUndefined: Self = StObject.set(x, "optimizationBailout", js.undefined)
    
    inline def setOrphanModules(value: Boolean): Self = StObject.set(x, "orphanModules", value.asInstanceOf[js.Any])
    
    inline def setOrphanModulesUndefined: Self = StObject.set(x, "orphanModules", js.undefined)
    
    inline def setOutputPath(value: Boolean): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setPreset(value: String | Boolean): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
    
    inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
    
    inline def setProvidedExports(value: Boolean): Self = StObject.set(x, "providedExports", value.asInstanceOf[js.Any])
    
    inline def setProvidedExportsUndefined: Self = StObject.set(x, "providedExports", js.undefined)
    
    inline def setPublicPath(value: Boolean): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    
    inline def setReasons(value: Boolean): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsSpace(value: Double): Self = StObject.set(x, "reasonsSpace", value.asInstanceOf[js.Any])
    
    inline def setReasonsSpaceUndefined: Self = StObject.set(x, "reasonsSpace", js.undefined)
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    inline def setRelatedAssets(value: Boolean): Self = StObject.set(x, "relatedAssets", value.asInstanceOf[js.Any])
    
    inline def setRelatedAssetsUndefined: Self = StObject.set(x, "relatedAssets", js.undefined)
    
    inline def setRuntime(value: Boolean): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeModules(value: Boolean): Self = StObject.set(x, "runtimeModules", value.asInstanceOf[js.Any])
    
    inline def setRuntimeModulesUndefined: Self = StObject.set(x, "runtimeModules", js.undefined)
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSource(value: Boolean): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTimings(value: Boolean): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
    
    inline def setTimingsUndefined: Self = StObject.set(x, "timings", js.undefined)
    
    inline def setUsedExports(value: Boolean): Self = StObject.set(x, "usedExports", value.asInstanceOf[js.Any])
    
    inline def setUsedExportsUndefined: Self = StObject.set(x, "usedExports", js.undefined)
    
    inline def setVersion(value: Boolean): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsCount(value: Boolean): Self = StObject.set(x, "warningsCount", value.asInstanceOf[js.Any])
    
    inline def setWarningsCountUndefined: Self = StObject.set(x, "warningsCount", js.undefined)
    
    inline def setWarningsFilter(
      value: String | js.RegExp | js.Array[WarningFilterItemTypes] | (js.Function2[/* warning */ StatsError, /* value */ String, Boolean])
    ): Self = StObject.set(x, "warningsFilter", value.asInstanceOf[js.Any])
    
    inline def setWarningsFilterFunction2(value: (/* warning */ StatsError, /* value */ String) => Boolean): Self = StObject.set(x, "warningsFilter", js.Any.fromFunction2(value))
    
    inline def setWarningsFilterUndefined: Self = StObject.set(x, "warningsFilter", js.undefined)
    
    inline def setWarningsFilterVarargs(value: WarningFilterItemTypes*): Self = StObject.set(x, "warningsFilter", js.Array(value*))
    
    inline def setWarningsSpace(value: Double): Self = StObject.set(x, "warningsSpace", value.asInstanceOf[js.Any])
    
    inline def setWarningsSpaceUndefined: Self = StObject.set(x, "warningsSpace", js.undefined)
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
