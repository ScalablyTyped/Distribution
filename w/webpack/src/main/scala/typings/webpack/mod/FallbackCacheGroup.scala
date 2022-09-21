package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FallbackCacheGroup extends StObject {
  
  var automaticNameDelimiter: String
  
  def chunksFilter(chunk: Chunk): Boolean
  
  var maxAsyncSize: SplitChunksSizes
  
  var maxInitialSize: SplitChunksSizes
  
  var minSize: SplitChunksSizes
}
object FallbackCacheGroup {
  
  inline def apply(
    automaticNameDelimiter: String,
    chunksFilter: Chunk => Boolean,
    maxAsyncSize: SplitChunksSizes,
    maxInitialSize: SplitChunksSizes,
    minSize: SplitChunksSizes
  ): FallbackCacheGroup = {
    val __obj = js.Dynamic.literal(automaticNameDelimiter = automaticNameDelimiter.asInstanceOf[js.Any], chunksFilter = js.Any.fromFunction1(chunksFilter), maxAsyncSize = maxAsyncSize.asInstanceOf[js.Any], maxInitialSize = maxInitialSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackCacheGroup]
  }
  
  extension [Self <: FallbackCacheGroup](x: Self) {
    
    inline def setAutomaticNameDelimiter(value: String): Self = StObject.set(x, "automaticNameDelimiter", value.asInstanceOf[js.Any])
    
    inline def setChunksFilter(value: Chunk => Boolean): Self = StObject.set(x, "chunksFilter", js.Any.fromFunction1(value))
    
    inline def setMaxAsyncSize(value: SplitChunksSizes): Self = StObject.set(x, "maxAsyncSize", value.asInstanceOf[js.Any])
    
    inline def setMaxInitialSize(value: SplitChunksSizes): Self = StObject.set(x, "maxInitialSize", value.asInstanceOf[js.Any])
    
    inline def setMinSize(value: SplitChunksSizes): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
  }
}
