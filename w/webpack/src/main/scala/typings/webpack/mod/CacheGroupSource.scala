package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheGroupSource extends StObject {
  
  var automaticNameDelimiter: String
  
  var chunksFilter: js.UndefOr[js.Function1[/* chunk */ Chunk, Boolean]] = js.undefined
  
  var enforce: js.UndefOr[Boolean] = js.undefined
  
  var enforceSizeThreshold: SplitChunksSizes
  
  var filename: js.UndefOr[
    String | (js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String])
  ] = js.undefined
  
  var getName: js.UndefOr[
    js.Function3[
      /* module */ js.UndefOr[Module], 
      /* chunks */ js.UndefOr[js.Array[Chunk]], 
      /* key */ js.UndefOr[String], 
      js.UndefOr[String]
    ]
  ] = js.undefined
  
  var idHint: js.UndefOr[String] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var maxAsyncRequests: js.UndefOr[Double] = js.undefined
  
  var maxAsyncSize: SplitChunksSizes
  
  var maxInitialRequests: js.UndefOr[Double] = js.undefined
  
  var maxInitialSize: SplitChunksSizes
  
  var minChunks: js.UndefOr[Double] = js.undefined
  
  var minRemainingSize: SplitChunksSizes
  
  var minSize: SplitChunksSizes
  
  var minSizeReduction: SplitChunksSizes
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var reuseExistingChunk: js.UndefOr[Boolean] = js.undefined
  
  var usedExports: js.UndefOr[Boolean] = js.undefined
}
object CacheGroupSource {
  
  inline def apply(
    automaticNameDelimiter: String,
    enforceSizeThreshold: SplitChunksSizes,
    maxAsyncSize: SplitChunksSizes,
    maxInitialSize: SplitChunksSizes,
    minRemainingSize: SplitChunksSizes,
    minSize: SplitChunksSizes,
    minSizeReduction: SplitChunksSizes
  ): CacheGroupSource = {
    val __obj = js.Dynamic.literal(automaticNameDelimiter = automaticNameDelimiter.asInstanceOf[js.Any], enforceSizeThreshold = enforceSizeThreshold.asInstanceOf[js.Any], maxAsyncSize = maxAsyncSize.asInstanceOf[js.Any], maxInitialSize = maxInitialSize.asInstanceOf[js.Any], minRemainingSize = minRemainingSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], minSizeReduction = minSizeReduction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheGroupSource]
  }
  
  extension [Self <: CacheGroupSource](x: Self) {
    
    inline def setAutomaticNameDelimiter(value: String): Self = StObject.set(x, "automaticNameDelimiter", value.asInstanceOf[js.Any])
    
    inline def setChunksFilter(value: /* chunk */ Chunk => Boolean): Self = StObject.set(x, "chunksFilter", js.Any.fromFunction1(value))
    
    inline def setChunksFilterUndefined: Self = StObject.set(x, "chunksFilter", js.undefined)
    
    inline def setEnforce(value: Boolean): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceSizeThreshold(value: SplitChunksSizes): Self = StObject.set(x, "enforceSizeThreshold", value.asInstanceOf[js.Any])
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setFilename(value: String | (js.Function2[/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo], String])): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameFunction2(value: (/* arg0 */ PathData, /* arg1 */ js.UndefOr[AssetInfo]) => String): Self = StObject.set(x, "filename", js.Any.fromFunction2(value))
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setGetName(
      value: (/* module */ js.UndefOr[Module], /* chunks */ js.UndefOr[js.Array[Chunk]], /* key */ js.UndefOr[String]) => js.UndefOr[String]
    ): Self = StObject.set(x, "getName", js.Any.fromFunction3(value))
    
    inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    inline def setIdHint(value: String): Self = StObject.set(x, "idHint", value.asInstanceOf[js.Any])
    
    inline def setIdHintUndefined: Self = StObject.set(x, "idHint", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMaxAsyncRequests(value: Double): Self = StObject.set(x, "maxAsyncRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxAsyncRequestsUndefined: Self = StObject.set(x, "maxAsyncRequests", js.undefined)
    
    inline def setMaxAsyncSize(value: SplitChunksSizes): Self = StObject.set(x, "maxAsyncSize", value.asInstanceOf[js.Any])
    
    inline def setMaxInitialRequests(value: Double): Self = StObject.set(x, "maxInitialRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxInitialRequestsUndefined: Self = StObject.set(x, "maxInitialRequests", js.undefined)
    
    inline def setMaxInitialSize(value: SplitChunksSizes): Self = StObject.set(x, "maxInitialSize", value.asInstanceOf[js.Any])
    
    inline def setMinChunks(value: Double): Self = StObject.set(x, "minChunks", value.asInstanceOf[js.Any])
    
    inline def setMinChunksUndefined: Self = StObject.set(x, "minChunks", js.undefined)
    
    inline def setMinRemainingSize(value: SplitChunksSizes): Self = StObject.set(x, "minRemainingSize", value.asInstanceOf[js.Any])
    
    inline def setMinSize(value: SplitChunksSizes): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeReduction(value: SplitChunksSizes): Self = StObject.set(x, "minSizeReduction", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setReuseExistingChunk(value: Boolean): Self = StObject.set(x, "reuseExistingChunk", value.asInstanceOf[js.Any])
    
    inline def setReuseExistingChunkUndefined: Self = StObject.set(x, "reuseExistingChunk", js.undefined)
    
    inline def setUsedExports(value: Boolean): Self = StObject.set(x, "usedExports", value.asInstanceOf[js.Any])
    
    inline def setUsedExportsUndefined: Self = StObject.set(x, "usedExports", js.undefined)
  }
}
