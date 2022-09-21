package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsAsset extends StObject {
  
  var auxiliaryChunkIdHints: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var auxiliaryChunkNames: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var auxiliaryChunks: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var cached: Boolean
  
  var chunkIdHints: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var chunkNames: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var chunks: js.UndefOr[js.Array[String | Double]] = js.undefined
  
  var comparedForEmit: Boolean
  
  var emitted: Boolean
  
  var filteredRelated: js.UndefOr[Double] = js.undefined
  
  var info: AssetInfo
  
  var isOverSizeLimit: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var related: js.UndefOr[js.Array[StatsAsset]] = js.undefined
  
  var size: Double
  
  var `type`: String
}
object KnownStatsAsset {
  
  inline def apply(
    cached: Boolean,
    comparedForEmit: Boolean,
    emitted: Boolean,
    info: AssetInfo,
    name: String,
    size: Double,
    `type`: String
  ): KnownStatsAsset = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], comparedForEmit = comparedForEmit.asInstanceOf[js.Any], emitted = emitted.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownStatsAsset]
  }
  
  extension [Self <: KnownStatsAsset](x: Self) {
    
    inline def setAuxiliaryChunkIdHints(value: js.Array[String | Double]): Self = StObject.set(x, "auxiliaryChunkIdHints", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryChunkIdHintsUndefined: Self = StObject.set(x, "auxiliaryChunkIdHints", js.undefined)
    
    inline def setAuxiliaryChunkIdHintsVarargs(value: (String | Double)*): Self = StObject.set(x, "auxiliaryChunkIdHints", js.Array(value*))
    
    inline def setAuxiliaryChunkNames(value: js.Array[String | Double]): Self = StObject.set(x, "auxiliaryChunkNames", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryChunkNamesUndefined: Self = StObject.set(x, "auxiliaryChunkNames", js.undefined)
    
    inline def setAuxiliaryChunkNamesVarargs(value: (String | Double)*): Self = StObject.set(x, "auxiliaryChunkNames", js.Array(value*))
    
    inline def setAuxiliaryChunks(value: js.Array[String | Double]): Self = StObject.set(x, "auxiliaryChunks", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryChunksUndefined: Self = StObject.set(x, "auxiliaryChunks", js.undefined)
    
    inline def setAuxiliaryChunksVarargs(value: (String | Double)*): Self = StObject.set(x, "auxiliaryChunks", js.Array(value*))
    
    inline def setCached(value: Boolean): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    inline def setChunkIdHints(value: js.Array[String | Double]): Self = StObject.set(x, "chunkIdHints", value.asInstanceOf[js.Any])
    
    inline def setChunkIdHintsUndefined: Self = StObject.set(x, "chunkIdHints", js.undefined)
    
    inline def setChunkIdHintsVarargs(value: (String | Double)*): Self = StObject.set(x, "chunkIdHints", js.Array(value*))
    
    inline def setChunkNames(value: js.Array[String | Double]): Self = StObject.set(x, "chunkNames", value.asInstanceOf[js.Any])
    
    inline def setChunkNamesUndefined: Self = StObject.set(x, "chunkNames", js.undefined)
    
    inline def setChunkNamesVarargs(value: (String | Double)*): Self = StObject.set(x, "chunkNames", js.Array(value*))
    
    inline def setChunks(value: js.Array[String | Double]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
    
    inline def setChunksVarargs(value: (String | Double)*): Self = StObject.set(x, "chunks", js.Array(value*))
    
    inline def setComparedForEmit(value: Boolean): Self = StObject.set(x, "comparedForEmit", value.asInstanceOf[js.Any])
    
    inline def setEmitted(value: Boolean): Self = StObject.set(x, "emitted", value.asInstanceOf[js.Any])
    
    inline def setFilteredRelated(value: Double): Self = StObject.set(x, "filteredRelated", value.asInstanceOf[js.Any])
    
    inline def setFilteredRelatedUndefined: Self = StObject.set(x, "filteredRelated", js.undefined)
    
    inline def setInfo(value: AssetInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setIsOverSizeLimit(value: Boolean): Self = StObject.set(x, "isOverSizeLimit", value.asInstanceOf[js.Any])
    
    inline def setIsOverSizeLimitUndefined: Self = StObject.set(x, "isOverSizeLimit", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRelated(value: js.Array[StatsAsset]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
    
    inline def setRelatedVarargs(value: StatsAsset*): Self = StObject.set(x, "related", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
