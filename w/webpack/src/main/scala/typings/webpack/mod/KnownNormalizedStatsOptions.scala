package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
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

trait KnownNormalizedStatsOptions extends StObject {
  
  var assetsSort: String
  
  var assetsSpace: Double
  
  var cachedAssets: Boolean
  
  var cachedModules: Boolean
  
  var chunkGroupAuxiliary: Boolean
  
  var chunkGroupChildren: Boolean
  
  var chunkGroupMaxAssets: Double
  
  var chunkGroups: Boolean
  
  var chunkModulesSort: String
  
  var chunkModulesSpace: Double
  
  var chunksSort: String
  
  var context: String
  
  var dependentModules: Boolean
  
  var entrypoints: Boolean | auto
  
  var excludeAssets: js.Array[js.Function2[/* value */ String, /* asset */ StatsAsset, Boolean]]
  
  var excludeModules: js.Array[
    js.Function3[
      /* name */ String, 
      /* module */ StatsModule, 
      /* type */ module | chunk | `root-of-chunk` | nested, 
      Boolean
    ]
  ]
  
  var groupAssetsByEmitStatus: Boolean
  
  var groupAssetsByExtension: Boolean
  
  var groupAssetsByPath: Boolean
  
  var groupModulesByAttributes: Boolean
  
  var groupModulesByCacheStatus: Boolean
  
  var groupModulesByExtension: Boolean
  
  var groupModulesByLayer: Boolean
  
  var groupModulesByPath: Boolean
  
  var groupModulesByType: Boolean
  
  var ids: Boolean
  
  var logging: `false` | none | error | warn | info | log | verbose
  
  var loggingDebug: js.Array[js.Function1[/* value */ String, Boolean]]
  
  var loggingTrace: Boolean
  
  var modulesSort: String
  
  var modulesSpace: Double
  
  var nestedModulesSort: String
  
  var nestedModulesSpace: Double
  
  var orphanModules: Boolean
  
  var requestShortener: RequestShortener
  
  var runtimeModules: Boolean
  
  var warningsFilter: js.Array[js.Function2[/* warning */ StatsError, /* textValue */ String, Boolean]]
}
object KnownNormalizedStatsOptions {
  
  inline def apply(
    assetsSort: String,
    assetsSpace: Double,
    cachedAssets: Boolean,
    cachedModules: Boolean,
    chunkGroupAuxiliary: Boolean,
    chunkGroupChildren: Boolean,
    chunkGroupMaxAssets: Double,
    chunkGroups: Boolean,
    chunkModulesSort: String,
    chunkModulesSpace: Double,
    chunksSort: String,
    context: String,
    dependentModules: Boolean,
    entrypoints: Boolean | auto,
    excludeAssets: js.Array[js.Function2[/* value */ String, /* asset */ StatsAsset, Boolean]],
    excludeModules: js.Array[
      js.Function3[
        /* name */ String, 
        /* module */ StatsModule, 
        /* type */ module | chunk | `root-of-chunk` | nested, 
        Boolean
      ]
    ],
    groupAssetsByEmitStatus: Boolean,
    groupAssetsByExtension: Boolean,
    groupAssetsByPath: Boolean,
    groupModulesByAttributes: Boolean,
    groupModulesByCacheStatus: Boolean,
    groupModulesByExtension: Boolean,
    groupModulesByLayer: Boolean,
    groupModulesByPath: Boolean,
    groupModulesByType: Boolean,
    ids: Boolean,
    logging: `false` | none | error | warn | info | log | verbose,
    loggingDebug: js.Array[js.Function1[/* value */ String, Boolean]],
    loggingTrace: Boolean,
    modulesSort: String,
    modulesSpace: Double,
    nestedModulesSort: String,
    nestedModulesSpace: Double,
    orphanModules: Boolean,
    requestShortener: RequestShortener,
    runtimeModules: Boolean,
    warningsFilter: js.Array[js.Function2[/* warning */ StatsError, /* textValue */ String, Boolean]]
  ): KnownNormalizedStatsOptions = {
    val __obj = js.Dynamic.literal(assetsSort = assetsSort.asInstanceOf[js.Any], assetsSpace = assetsSpace.asInstanceOf[js.Any], cachedAssets = cachedAssets.asInstanceOf[js.Any], cachedModules = cachedModules.asInstanceOf[js.Any], chunkGroupAuxiliary = chunkGroupAuxiliary.asInstanceOf[js.Any], chunkGroupChildren = chunkGroupChildren.asInstanceOf[js.Any], chunkGroupMaxAssets = chunkGroupMaxAssets.asInstanceOf[js.Any], chunkGroups = chunkGroups.asInstanceOf[js.Any], chunkModulesSort = chunkModulesSort.asInstanceOf[js.Any], chunkModulesSpace = chunkModulesSpace.asInstanceOf[js.Any], chunksSort = chunksSort.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], dependentModules = dependentModules.asInstanceOf[js.Any], entrypoints = entrypoints.asInstanceOf[js.Any], excludeAssets = excludeAssets.asInstanceOf[js.Any], excludeModules = excludeModules.asInstanceOf[js.Any], groupAssetsByEmitStatus = groupAssetsByEmitStatus.asInstanceOf[js.Any], groupAssetsByExtension = groupAssetsByExtension.asInstanceOf[js.Any], groupAssetsByPath = groupAssetsByPath.asInstanceOf[js.Any], groupModulesByAttributes = groupModulesByAttributes.asInstanceOf[js.Any], groupModulesByCacheStatus = groupModulesByCacheStatus.asInstanceOf[js.Any], groupModulesByExtension = groupModulesByExtension.asInstanceOf[js.Any], groupModulesByLayer = groupModulesByLayer.asInstanceOf[js.Any], groupModulesByPath = groupModulesByPath.asInstanceOf[js.Any], groupModulesByType = groupModulesByType.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], loggingDebug = loggingDebug.asInstanceOf[js.Any], loggingTrace = loggingTrace.asInstanceOf[js.Any], modulesSort = modulesSort.asInstanceOf[js.Any], modulesSpace = modulesSpace.asInstanceOf[js.Any], nestedModulesSort = nestedModulesSort.asInstanceOf[js.Any], nestedModulesSpace = nestedModulesSpace.asInstanceOf[js.Any], orphanModules = orphanModules.asInstanceOf[js.Any], requestShortener = requestShortener.asInstanceOf[js.Any], runtimeModules = runtimeModules.asInstanceOf[js.Any], warningsFilter = warningsFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownNormalizedStatsOptions]
  }
  
  extension [Self <: KnownNormalizedStatsOptions](x: Self) {
    
    inline def setAssetsSort(value: String): Self = StObject.set(x, "assetsSort", value.asInstanceOf[js.Any])
    
    inline def setAssetsSpace(value: Double): Self = StObject.set(x, "assetsSpace", value.asInstanceOf[js.Any])
    
    inline def setCachedAssets(value: Boolean): Self = StObject.set(x, "cachedAssets", value.asInstanceOf[js.Any])
    
    inline def setCachedModules(value: Boolean): Self = StObject.set(x, "cachedModules", value.asInstanceOf[js.Any])
    
    inline def setChunkGroupAuxiliary(value: Boolean): Self = StObject.set(x, "chunkGroupAuxiliary", value.asInstanceOf[js.Any])
    
    inline def setChunkGroupChildren(value: Boolean): Self = StObject.set(x, "chunkGroupChildren", value.asInstanceOf[js.Any])
    
    inline def setChunkGroupMaxAssets(value: Double): Self = StObject.set(x, "chunkGroupMaxAssets", value.asInstanceOf[js.Any])
    
    inline def setChunkGroups(value: Boolean): Self = StObject.set(x, "chunkGroups", value.asInstanceOf[js.Any])
    
    inline def setChunkModulesSort(value: String): Self = StObject.set(x, "chunkModulesSort", value.asInstanceOf[js.Any])
    
    inline def setChunkModulesSpace(value: Double): Self = StObject.set(x, "chunkModulesSpace", value.asInstanceOf[js.Any])
    
    inline def setChunksSort(value: String): Self = StObject.set(x, "chunksSort", value.asInstanceOf[js.Any])
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDependentModules(value: Boolean): Self = StObject.set(x, "dependentModules", value.asInstanceOf[js.Any])
    
    inline def setEntrypoints(value: Boolean | auto): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
    
    inline def setExcludeAssets(value: js.Array[js.Function2[/* value */ String, /* asset */ StatsAsset, Boolean]]): Self = StObject.set(x, "excludeAssets", value.asInstanceOf[js.Any])
    
    inline def setExcludeAssetsVarargs(value: (js.Function2[/* value */ String, /* asset */ StatsAsset, Boolean])*): Self = StObject.set(x, "excludeAssets", js.Array(value*))
    
    inline def setExcludeModules(
      value: js.Array[
          js.Function3[
            /* name */ String, 
            /* module */ StatsModule, 
            /* type */ module | chunk | `root-of-chunk` | nested, 
            Boolean
          ]
        ]
    ): Self = StObject.set(x, "excludeModules", value.asInstanceOf[js.Any])
    
    inline def setExcludeModulesVarargs(
      value: (js.Function3[
          /* name */ String, 
          /* module */ StatsModule, 
          /* type */ module | chunk | `root-of-chunk` | nested, 
          Boolean
        ])*
    ): Self = StObject.set(x, "excludeModules", js.Array(value*))
    
    inline def setGroupAssetsByEmitStatus(value: Boolean): Self = StObject.set(x, "groupAssetsByEmitStatus", value.asInstanceOf[js.Any])
    
    inline def setGroupAssetsByExtension(value: Boolean): Self = StObject.set(x, "groupAssetsByExtension", value.asInstanceOf[js.Any])
    
    inline def setGroupAssetsByPath(value: Boolean): Self = StObject.set(x, "groupAssetsByPath", value.asInstanceOf[js.Any])
    
    inline def setGroupModulesByAttributes(value: Boolean): Self = StObject.set(x, "groupModulesByAttributes", value.asInstanceOf[js.Any])
    
    inline def setGroupModulesByCacheStatus(value: Boolean): Self = StObject.set(x, "groupModulesByCacheStatus", value.asInstanceOf[js.Any])
    
    inline def setGroupModulesByExtension(value: Boolean): Self = StObject.set(x, "groupModulesByExtension", value.asInstanceOf[js.Any])
    
    inline def setGroupModulesByLayer(value: Boolean): Self = StObject.set(x, "groupModulesByLayer", value.asInstanceOf[js.Any])
    
    inline def setGroupModulesByPath(value: Boolean): Self = StObject.set(x, "groupModulesByPath", value.asInstanceOf[js.Any])
    
    inline def setGroupModulesByType(value: Boolean): Self = StObject.set(x, "groupModulesByType", value.asInstanceOf[js.Any])
    
    inline def setIds(value: Boolean): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setLogging(value: `false` | none | error | warn | info | log | verbose): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingDebug(value: js.Array[js.Function1[/* value */ String, Boolean]]): Self = StObject.set(x, "loggingDebug", value.asInstanceOf[js.Any])
    
    inline def setLoggingDebugVarargs(value: (js.Function1[/* value */ String, Boolean])*): Self = StObject.set(x, "loggingDebug", js.Array(value*))
    
    inline def setLoggingTrace(value: Boolean): Self = StObject.set(x, "loggingTrace", value.asInstanceOf[js.Any])
    
    inline def setModulesSort(value: String): Self = StObject.set(x, "modulesSort", value.asInstanceOf[js.Any])
    
    inline def setModulesSpace(value: Double): Self = StObject.set(x, "modulesSpace", value.asInstanceOf[js.Any])
    
    inline def setNestedModulesSort(value: String): Self = StObject.set(x, "nestedModulesSort", value.asInstanceOf[js.Any])
    
    inline def setNestedModulesSpace(value: Double): Self = StObject.set(x, "nestedModulesSpace", value.asInstanceOf[js.Any])
    
    inline def setOrphanModules(value: Boolean): Self = StObject.set(x, "orphanModules", value.asInstanceOf[js.Any])
    
    inline def setRequestShortener(value: RequestShortener): Self = StObject.set(x, "requestShortener", value.asInstanceOf[js.Any])
    
    inline def setRuntimeModules(value: Boolean): Self = StObject.set(x, "runtimeModules", value.asInstanceOf[js.Any])
    
    inline def setWarningsFilter(value: js.Array[js.Function2[/* warning */ StatsError, /* textValue */ String, Boolean]]): Self = StObject.set(x, "warningsFilter", value.asInstanceOf[js.Any])
    
    inline def setWarningsFilterVarargs(value: (js.Function2[/* warning */ StatsError, /* textValue */ String, Boolean])*): Self = StObject.set(x, "warningsFilter", js.Array(value*))
  }
}
