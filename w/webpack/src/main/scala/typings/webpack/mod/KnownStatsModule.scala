package typings.webpack.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsModule extends StObject {
  
  var assets: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var buildTimeExecuted: js.UndefOr[Boolean] = js.undefined
  
  var built: js.UndefOr[Boolean] = js.undefined
  
  var cacheable: js.UndefOr[Boolean] = js.undefined
  
  var cached: js.UndefOr[Boolean] = js.undefined
  
  var chunks: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var codeGenerated: js.UndefOr[Boolean] = js.undefined
  
  var dependent: js.UndefOr[Boolean] = js.undefined
  
  var depth: js.UndefOr[Double] = js.undefined
  
  var errors: js.UndefOr[Double] = js.undefined
  
  var failed: js.UndefOr[Boolean] = js.undefined
  
  var filteredModules: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String | Double] = js.undefined
  
  var identifier: js.UndefOr[String] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var index2: js.UndefOr[Double] = js.undefined
  
  var issuer: js.UndefOr[String] = js.undefined
  
  var issuerId: js.UndefOr[String | Double] = js.undefined
  
  var issuerName: js.UndefOr[String] = js.undefined
  
  var issuerPath: js.UndefOr[js.Array[StatsModuleIssuer]] = js.undefined
  
  var layer: js.UndefOr[String] = js.undefined
  
  var moduleType: js.UndefOr[String] = js.undefined
  
  var modules: js.UndefOr[js.Array[StatsModule]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var nameForCondition: js.UndefOr[String] = js.undefined
  
  var optimizationBailout: js.UndefOr[js.Array[String]] = js.undefined
  
  var optional: js.UndefOr[Boolean] = js.undefined
  
  var orphan: js.UndefOr[Boolean] = js.undefined
  
  var postOrderIndex: js.UndefOr[Double] = js.undefined
  
  var preOrderIndex: js.UndefOr[Double] = js.undefined
  
  var profile: js.UndefOr[StatsProfile] = js.undefined
  
  var providedExports: js.UndefOr[js.Array[String]] = js.undefined
  
  var reasons: js.UndefOr[js.Array[StatsModuleReason]] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var sizes: js.UndefOr[StringDictionary[Double]] = js.undefined
  
  var source: js.UndefOr[String | Buffer] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var usedExports: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var warnings: js.UndefOr[Double] = js.undefined
}
object KnownStatsModule {
  
  inline def apply(): KnownStatsModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownStatsModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnownStatsModule] (val x: Self) extends AnyVal {
    
    inline def setAssets(value: js.Array[String | Double]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: (String | Double)*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setBuildTimeExecuted(value: Boolean): Self = StObject.set(x, "buildTimeExecuted", value.asInstanceOf[js.Any])
    
    inline def setBuildTimeExecutedUndefined: Self = StObject.set(x, "buildTimeExecuted", js.undefined)
    
    inline def setBuilt(value: Boolean): Self = StObject.set(x, "built", value.asInstanceOf[js.Any])
    
    inline def setBuiltUndefined: Self = StObject.set(x, "built", js.undefined)
    
    inline def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
    
    inline def setCacheableUndefined: Self = StObject.set(x, "cacheable", js.undefined)
    
    inline def setCached(value: Boolean): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    inline def setCachedUndefined: Self = StObject.set(x, "cached", js.undefined)
    
    inline def setChunks(value: js.Array[String | Double]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setChunksVarargs(value: (String | Double)*): Self = StObject.set(x, "chunks", js.Array(value*))
    
    inline def setCodeGenerated(value: Boolean): Self = StObject.set(x, "codeGenerated", value.asInstanceOf[js.Any])
    
    inline def setCodeGeneratedUndefined: Self = StObject.set(x, "codeGenerated", js.undefined)
    
    inline def setDependent(value: Boolean): Self = StObject.set(x, "dependent", value.asInstanceOf[js.Any])
    
    inline def setDependentUndefined: Self = StObject.set(x, "dependent", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setFailed(value: Boolean): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "failed", js.undefined)
    
    inline def setFilteredModules(value: Double): Self = StObject.set(x, "filteredModules", value.asInstanceOf[js.Any])
    
    inline def setFilteredModulesUndefined: Self = StObject.set(x, "filteredModules", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndex2(value: Double): Self = StObject.set(x, "index2", value.asInstanceOf[js.Any])
    
    inline def setIndex2Undefined: Self = StObject.set(x, "index2", js.undefined)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerId(value: String | Double): Self = StObject.set(x, "issuerId", value.asInstanceOf[js.Any])
    
    inline def setIssuerIdUndefined: Self = StObject.set(x, "issuerId", js.undefined)
    
    inline def setIssuerName(value: String): Self = StObject.set(x, "issuerName", value.asInstanceOf[js.Any])
    
    inline def setIssuerNameUndefined: Self = StObject.set(x, "issuerName", js.undefined)
    
    inline def setIssuerPath(value: js.Array[StatsModuleIssuer]): Self = StObject.set(x, "issuerPath", value.asInstanceOf[js.Any])
    
    inline def setIssuerPathUndefined: Self = StObject.set(x, "issuerPath", js.undefined)
    
    inline def setIssuerPathVarargs(value: StatsModuleIssuer*): Self = StObject.set(x, "issuerPath", js.Array(value*))
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setModuleType(value: String): Self = StObject.set(x, "moduleType", value.asInstanceOf[js.Any])
    
    inline def setModuleTypeUndefined: Self = StObject.set(x, "moduleType", js.undefined)
    
    inline def setModules(value: js.Array[StatsModule]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
    
    inline def setModulesVarargs(value: StatsModule*): Self = StObject.set(x, "modules", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameForCondition(value: String): Self = StObject.set(x, "nameForCondition", value.asInstanceOf[js.Any])
    
    inline def setNameForConditionUndefined: Self = StObject.set(x, "nameForCondition", js.undefined)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptimizationBailout(value: js.Array[String]): Self = StObject.set(x, "optimizationBailout", value.asInstanceOf[js.Any])
    
    inline def setOptimizationBailoutUndefined: Self = StObject.set(x, "optimizationBailout", js.undefined)
    
    inline def setOptimizationBailoutVarargs(value: String*): Self = StObject.set(x, "optimizationBailout", js.Array(value*))
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setOrphan(value: Boolean): Self = StObject.set(x, "orphan", value.asInstanceOf[js.Any])
    
    inline def setOrphanUndefined: Self = StObject.set(x, "orphan", js.undefined)
    
    inline def setPostOrderIndex(value: Double): Self = StObject.set(x, "postOrderIndex", value.asInstanceOf[js.Any])
    
    inline def setPostOrderIndexUndefined: Self = StObject.set(x, "postOrderIndex", js.undefined)
    
    inline def setPreOrderIndex(value: Double): Self = StObject.set(x, "preOrderIndex", value.asInstanceOf[js.Any])
    
    inline def setPreOrderIndexUndefined: Self = StObject.set(x, "preOrderIndex", js.undefined)
    
    inline def setProfile(value: StatsProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setProvidedExports(value: js.Array[String]): Self = StObject.set(x, "providedExports", value.asInstanceOf[js.Any])
    
    inline def setProvidedExportsUndefined: Self = StObject.set(x, "providedExports", js.undefined)
    
    inline def setProvidedExportsVarargs(value: String*): Self = StObject.set(x, "providedExports", js.Array(value*))
    
    inline def setReasons(value: js.Array[StatsModuleReason]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    inline def setReasonsVarargs(value: StatsModuleReason*): Self = StObject.set(x, "reasons", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizes(value: StringDictionary[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSource(value: String | Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUsedExports(value: Boolean | js.Array[String]): Self = StObject.set(x, "usedExports", value.asInstanceOf[js.Any])
    
    inline def setUsedExportsUndefined: Self = StObject.set(x, "usedExports", js.undefined)
    
    inline def setUsedExportsVarargs(value: String*): Self = StObject.set(x, "usedExports", js.Array(value*))
    
    inline def setWarnings(value: Double): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
