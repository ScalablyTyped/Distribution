package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitChunkCountPluginOptions extends StObject {
  
  /**
  	 * Constant overhead for a chunk.
  	 */
  var chunkOverhead: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Multiplicator for initial chunks.
  	 */
  var entryChunkMultiplicator: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Limit the maximum number of chunks using a value greater greater than or equal to 1.
  	 */
  var maxChunks: Double
}
object LimitChunkCountPluginOptions {
  
  inline def apply(maxChunks: Double): LimitChunkCountPluginOptions = {
    val __obj = js.Dynamic.literal(maxChunks = maxChunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitChunkCountPluginOptions]
  }
  
  extension [Self <: LimitChunkCountPluginOptions](x: Self) {
    
    inline def setChunkOverhead(value: Double): Self = StObject.set(x, "chunkOverhead", value.asInstanceOf[js.Any])
    
    inline def setChunkOverheadUndefined: Self = StObject.set(x, "chunkOverhead", js.undefined)
    
    inline def setEntryChunkMultiplicator(value: Double): Self = StObject.set(x, "entryChunkMultiplicator", value.asInstanceOf[js.Any])
    
    inline def setEntryChunkMultiplicatorUndefined: Self = StObject.set(x, "entryChunkMultiplicator", js.undefined)
    
    inline def setMaxChunks(value: Double): Self = StObject.set(x, "maxChunks", value.asInstanceOf[js.Any])
  }
}
