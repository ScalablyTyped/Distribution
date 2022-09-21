package typings.webpack.anon

import typings.webpack.mod.ModuleFilterItemTypes
import typings.webpack.mod.StatsModule
import typings.webpack.webpackStrings.`root-of-chunk`
import typings.webpack.webpackStrings.auto
import typings.webpack.webpackStrings.chunk
import typings.webpack.webpackStrings.module
import typings.webpack.webpackStrings.nested
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<webpack.webpack.StatsOptions, 'context' | 'chunkGroups' | 'requestShortener' | 'chunksSort' | 'modulesSort' | 'chunkModulesSort' | 'nestedModulesSort' | 'assetsSort' | 'ids' | 'cachedAssets' | 'groupAssetsByEmitStatus' | 'groupAssetsByPath' | 'groupAssetsByExtension' | 'assetsSpace' | 'excludeAssets' | 'excludeModules' | 'warningsFilter' | 'cachedModules' | 'orphanModules' | 'dependentModules' | 'runtimeModules' | 'groupModulesByCacheStatus' | 'groupModulesByLayer' | 'groupModulesByAttributes' | 'groupModulesByPath' | 'groupModulesByExtension' | 'groupModulesByType' | 'entrypoints' | 'chunkGroupAuxiliary' | 'chunkGroupChildren' | 'chunkGroupMaxAssets' | 'modulesSpace' | 'chunkModulesSpace' | 'nestedModulesSpace' | 'logging' | 'loggingDebug' | 'loggingTrace' | '_env'> */
trait OmitStatsOptionscontextch extends StObject {
  
  var all: js.UndefOr[Boolean] = js.undefined
  
  var assets: js.UndefOr[Boolean] = js.undefined
  
  var builtAt: js.UndefOr[Boolean] = js.undefined
  
  var cached: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Boolean] = js.undefined
  
  var chunkModules: js.UndefOr[Boolean] = js.undefined
  
  var chunkOrigins: js.UndefOr[Boolean] = js.undefined
  
  var chunkRelations: js.UndefOr[Boolean] = js.undefined
  
  var chunks: js.UndefOr[Boolean] = js.undefined
  
  var colors: js.UndefOr[Boolean | Bold] = js.undefined
  
  var depth: js.UndefOr[Boolean] = js.undefined
  
  var env: js.UndefOr[Boolean] = js.undefined
  
  var errorDetails: js.UndefOr[Boolean | auto] = js.undefined
  
  var errorStack: js.UndefOr[Boolean] = js.undefined
  
  var errors: js.UndefOr[Boolean] = js.undefined
  
  var errorsCount: js.UndefOr[Boolean] = js.undefined
  
  var exclude: js.UndefOr[
    String | Boolean | js.RegExp | js.Array[ModuleFilterItemTypes] | (js.Function3[
      /* name */ String, 
      /* module */ StatsModule, 
      /* type */ module | chunk | `root-of-chunk` | nested, 
      Boolean
    ])
  ] = js.undefined
  
  var groupAssetsByChunk: js.UndefOr[Boolean] = js.undefined
  
  var groupAssetsByInfo: js.UndefOr[Boolean] = js.undefined
  
  var groupReasonsByOrigin: js.UndefOr[Boolean] = js.undefined
  
  var hash: js.UndefOr[Boolean] = js.undefined
  
  var moduleAssets: js.UndefOr[Boolean] = js.undefined
  
  var moduleTrace: js.UndefOr[Boolean] = js.undefined
  
  var modules: js.UndefOr[Boolean] = js.undefined
  
  var nestedModules: js.UndefOr[Boolean] = js.undefined
  
  var optimizationBailout: js.UndefOr[Boolean] = js.undefined
  
  var outputPath: js.UndefOr[Boolean] = js.undefined
  
  var performance: js.UndefOr[Boolean] = js.undefined
  
  var preset: js.UndefOr[String | Boolean] = js.undefined
  
  var providedExports: js.UndefOr[Boolean] = js.undefined
  
  var publicPath: js.UndefOr[Boolean] = js.undefined
  
  var reasons: js.UndefOr[Boolean] = js.undefined
  
  var reasonsSpace: js.UndefOr[Double] = js.undefined
  
  var relatedAssets: js.UndefOr[Boolean] = js.undefined
  
  var runtime: js.UndefOr[Boolean] = js.undefined
  
  var source: js.UndefOr[Boolean] = js.undefined
  
  var timings: js.UndefOr[Boolean] = js.undefined
  
  var usedExports: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[Boolean] = js.undefined
  
  var warnings: js.UndefOr[Boolean] = js.undefined
  
  var warningsCount: js.UndefOr[Boolean] = js.undefined
}
object OmitStatsOptionscontextch {
  
  inline def apply(): OmitStatsOptionscontextch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitStatsOptionscontextch]
  }
  
  extension [Self <: OmitStatsOptionscontextch](x: Self) {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setAssets(value: Boolean): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setBuiltAt(value: Boolean): Self = StObject.set(x, "builtAt", value.asInstanceOf[js.Any])
    
    inline def setBuiltAtUndefined: Self = StObject.set(x, "builtAt", js.undefined)
    
    inline def setCached(value: Boolean): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    inline def setCachedUndefined: Self = StObject.set(x, "cached", js.undefined)
    
    inline def setChildren(value: Boolean): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChunkModules(value: Boolean): Self = StObject.set(x, "chunkModules", value.asInstanceOf[js.Any])
    
    inline def setChunkModulesUndefined: Self = StObject.set(x, "chunkModules", js.undefined)
    
    inline def setChunkOrigins(value: Boolean): Self = StObject.set(x, "chunkOrigins", value.asInstanceOf[js.Any])
    
    inline def setChunkOriginsUndefined: Self = StObject.set(x, "chunkOrigins", js.undefined)
    
    inline def setChunkRelations(value: Boolean): Self = StObject.set(x, "chunkRelations", value.asInstanceOf[js.Any])
    
    inline def setChunkRelationsUndefined: Self = StObject.set(x, "chunkRelations", js.undefined)
    
    inline def setChunks(value: Boolean): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setColors(value: Boolean | Bold): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setDepth(value: Boolean): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setEnv(value: Boolean): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setErrorDetails(value: Boolean | auto): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setErrorStack(value: Boolean): Self = StObject.set(x, "errorStack", value.asInstanceOf[js.Any])
    
    inline def setErrorStackUndefined: Self = StObject.set(x, "errorStack", js.undefined)
    
    inline def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsCount(value: Boolean): Self = StObject.set(x, "errorsCount", value.asInstanceOf[js.Any])
    
    inline def setErrorsCountUndefined: Self = StObject.set(x, "errorsCount", js.undefined)
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setExclude(
      value: String | Boolean | js.RegExp | js.Array[ModuleFilterItemTypes] | (js.Function3[
          /* name */ String, 
          /* module */ StatsModule, 
          /* type */ module | chunk | `root-of-chunk` | nested, 
          Boolean
        ])
    ): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeFunction3(
      value: (/* name */ String, /* module */ StatsModule, /* type */ module | chunk | `root-of-chunk` | nested) => Boolean
    ): Self = StObject.set(x, "exclude", js.Any.fromFunction3(value))
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: ModuleFilterItemTypes*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setGroupAssetsByChunk(value: Boolean): Self = StObject.set(x, "groupAssetsByChunk", value.asInstanceOf[js.Any])
    
    inline def setGroupAssetsByChunkUndefined: Self = StObject.set(x, "groupAssetsByChunk", js.undefined)
    
    inline def setGroupAssetsByInfo(value: Boolean): Self = StObject.set(x, "groupAssetsByInfo", value.asInstanceOf[js.Any])
    
    inline def setGroupAssetsByInfoUndefined: Self = StObject.set(x, "groupAssetsByInfo", js.undefined)
    
    inline def setGroupReasonsByOrigin(value: Boolean): Self = StObject.set(x, "groupReasonsByOrigin", value.asInstanceOf[js.Any])
    
    inline def setGroupReasonsByOriginUndefined: Self = StObject.set(x, "groupReasonsByOrigin", js.undefined)
    
    inline def setHash(value: Boolean): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setModuleAssets(value: Boolean): Self = StObject.set(x, "moduleAssets", value.asInstanceOf[js.Any])
    
    inline def setModuleAssetsUndefined: Self = StObject.set(x, "moduleAssets", js.undefined)
    
    inline def setModuleTrace(value: Boolean): Self = StObject.set(x, "moduleTrace", value.asInstanceOf[js.Any])
    
    inline def setModuleTraceUndefined: Self = StObject.set(x, "moduleTrace", js.undefined)
    
    inline def setModules(value: Boolean): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setNestedModules(value: Boolean): Self = StObject.set(x, "nestedModules", value.asInstanceOf[js.Any])
    
    inline def setNestedModulesUndefined: Self = StObject.set(x, "nestedModules", js.undefined)
    
    inline def setOptimizationBailout(value: Boolean): Self = StObject.set(x, "optimizationBailout", value.asInstanceOf[js.Any])
    
    inline def setOptimizationBailoutUndefined: Self = StObject.set(x, "optimizationBailout", js.undefined)
    
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
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
