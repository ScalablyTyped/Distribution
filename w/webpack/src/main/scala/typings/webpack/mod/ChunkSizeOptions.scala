package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkSizeOptions extends StObject {
  
  /**
  	 * constant overhead for a chunk
  	 */
  var chunkOverhead: js.UndefOr[Double] = js.undefined
  
  /**
  	 * multiplicator for initial chunks
  	 */
  var entryChunkMultiplicator: js.UndefOr[Double] = js.undefined
}
object ChunkSizeOptions {
  
  inline def apply(): ChunkSizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkSizeOptions]
  }
  
  extension [Self <: ChunkSizeOptions](x: Self) {
    
    inline def setChunkOverhead(value: Double): Self = StObject.set(x, "chunkOverhead", value.asInstanceOf[js.Any])
    
    inline def setChunkOverheadUndefined: Self = StObject.set(x, "chunkOverhead", js.undefined)
    
    inline def setEntryChunkMultiplicator(value: Double): Self = StObject.set(x, "entryChunkMultiplicator", value.asInstanceOf[js.Any])
    
    inline def setEntryChunkMultiplicatorUndefined: Self = StObject.set(x, "entryChunkMultiplicator", js.undefined)
  }
}
