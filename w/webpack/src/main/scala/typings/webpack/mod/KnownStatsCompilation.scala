package typings.webpack.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsCompilation extends StObject {
  
  var assets: js.UndefOr[js.Array[StatsAsset]] = js.undefined
  
  var assetsByChunkName: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  
  var builtAt: js.UndefOr[Double] = js.undefined
  
  var children: js.UndefOr[js.Array[StatsCompilation]] = js.undefined
  
  var chunks: js.UndefOr[js.Array[StatsChunk]] = js.undefined
  
  var entrypoints: js.UndefOr[Record[String, StatsChunkGroup]] = js.undefined
  
  var env: js.UndefOr[Any] = js.undefined
  
  var errors: js.UndefOr[js.Array[StatsError]] = js.undefined
  
  var errorsCount: js.UndefOr[Double] = js.undefined
  
  var filteredAssets: js.UndefOr[Double] = js.undefined
  
  var filteredModules: js.UndefOr[Double] = js.undefined
  
  var hash: js.UndefOr[String] = js.undefined
  
  var logging: js.UndefOr[Record[String, StatsLogging]] = js.undefined
  
  var modules: js.UndefOr[js.Array[StatsModule]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var namedChunkGroups: js.UndefOr[Record[String, StatsChunkGroup]] = js.undefined
  
  var needAdditionalPass: js.UndefOr[Boolean] = js.undefined
  
  var outputPath: js.UndefOr[String] = js.undefined
  
  var publicPath: js.UndefOr[String] = js.undefined
  
  var time: js.UndefOr[Double] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var warnings: js.UndefOr[js.Array[StatsError]] = js.undefined
  
  var warningsCount: js.UndefOr[Double] = js.undefined
}
object KnownStatsCompilation {
  
  inline def apply(): KnownStatsCompilation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownStatsCompilation]
  }
  
  extension [Self <: KnownStatsCompilation](x: Self) {
    
    inline def setAssets(value: js.Array[StatsAsset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsByChunkName(value: Record[String, js.Array[String]]): Self = StObject.set(x, "assetsByChunkName", value.asInstanceOf[js.Any])
    
    inline def setAssetsByChunkNameUndefined: Self = StObject.set(x, "assetsByChunkName", js.undefined)
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: StatsAsset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setBuiltAt(value: Double): Self = StObject.set(x, "builtAt", value.asInstanceOf[js.Any])
    
    inline def setBuiltAtUndefined: Self = StObject.set(x, "builtAt", js.undefined)
    
    inline def setChildren(value: js.Array[StatsCompilation]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: StatsCompilation*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChunks(value: js.Array[StatsChunk]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setChunksVarargs(value: StatsChunk*): Self = StObject.set(x, "chunks", js.Array(value*))
    
    inline def setEntrypoints(value: Record[String, StatsChunkGroup]): Self = StObject.set(x, "entrypoints", value.asInstanceOf[js.Any])
    
    inline def setEntrypointsUndefined: Self = StObject.set(x, "entrypoints", js.undefined)
    
    inline def setEnv(value: Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setErrors(value: js.Array[StatsError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsCount(value: Double): Self = StObject.set(x, "errorsCount", value.asInstanceOf[js.Any])
    
    inline def setErrorsCountUndefined: Self = StObject.set(x, "errorsCount", js.undefined)
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: StatsError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setFilteredAssets(value: Double): Self = StObject.set(x, "filteredAssets", value.asInstanceOf[js.Any])
    
    inline def setFilteredAssetsUndefined: Self = StObject.set(x, "filteredAssets", js.undefined)
    
    inline def setFilteredModules(value: Double): Self = StObject.set(x, "filteredModules", value.asInstanceOf[js.Any])
    
    inline def setFilteredModulesUndefined: Self = StObject.set(x, "filteredModules", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setLogging(value: Record[String, StatsLogging]): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setModules(value: js.Array[StatsModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setModulesVarargs(value: StatsModule*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamedChunkGroups(value: Record[String, StatsChunkGroup]): Self = StObject.set(x, "namedChunkGroups", value.asInstanceOf[js.Any])
    
    inline def setNamedChunkGroupsUndefined: Self = StObject.set(x, "namedChunkGroups", js.undefined)
    
    inline def setNeedAdditionalPass(value: Boolean): Self = StObject.set(x, "needAdditionalPass", value.asInstanceOf[js.Any])
    
    inline def setNeedAdditionalPassUndefined: Self = StObject.set(x, "needAdditionalPass", js.undefined)
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    
    inline def setPublicPathUndefined: Self = StObject.set(x, "publicPath", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWarnings(value: js.Array[StatsError]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsCount(value: Double): Self = StObject.set(x, "warningsCount", value.asInstanceOf[js.Any])
    
    inline def setWarningsCountUndefined: Self = StObject.set(x, "warningsCount", js.undefined)
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: StatsError*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
