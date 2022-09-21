package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinChunkSizePluginOptions extends StObject {
  
  /**
  	 * Constant overhead for a chunk.
  	 */
  var chunkOverhead: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Multiplicator for initial chunks.
  	 */
  var entryChunkMultiplicator: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Minimum number of characters.
  	 */
  var minChunkSize: Double
}
object MinChunkSizePluginOptions {
  
  inline def apply(minChunkSize: Double): MinChunkSizePluginOptions = {
    val __obj = js.Dynamic.literal(minChunkSize = minChunkSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinChunkSizePluginOptions]
  }
  
  extension [Self <: MinChunkSizePluginOptions](x: Self) {
    
    inline def setChunkOverhead(value: Double): Self = StObject.set(x, "chunkOverhead", value.asInstanceOf[js.Any])
    
    inline def setChunkOverheadUndefined: Self = StObject.set(x, "chunkOverhead", js.undefined)
    
    inline def setEntryChunkMultiplicator(value: Double): Self = StObject.set(x, "entryChunkMultiplicator", value.asInstanceOf[js.Any])
    
    inline def setEntryChunkMultiplicatorUndefined: Self = StObject.set(x, "entryChunkMultiplicator", js.undefined)
    
    inline def setMinChunkSize(value: Double): Self = StObject.set(x, "minChunkSize", value.asInstanceOf[js.Any])
  }
}
