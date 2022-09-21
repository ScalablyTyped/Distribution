package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggressiveSplittingPluginOptions extends StObject {
  
  /**
  	 * Extra cost for each chunk (Default: 9.8kiB).
  	 */
  var chunkOverhead: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Extra cost multiplicator for entry chunks (Default: 10).
  	 */
  var entryChunkMultiplicator: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Byte, max size of per file (Default: 50kiB).
  	 */
  var maxSize: js.UndefOr[Double] = js.undefined
  
  /**
  	 * Byte, split point. (Default: 30kiB).
  	 */
  var minSize: js.UndefOr[Double] = js.undefined
}
object AggressiveSplittingPluginOptions {
  
  inline def apply(): AggressiveSplittingPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggressiveSplittingPluginOptions]
  }
  
  extension [Self <: AggressiveSplittingPluginOptions](x: Self) {
    
    inline def setChunkOverhead(value: Double): Self = StObject.set(x, "chunkOverhead", value.asInstanceOf[js.Any])
    
    inline def setChunkOverheadUndefined: Self = StObject.set(x, "chunkOverhead", js.undefined)
    
    inline def setEntryChunkMultiplicator(value: Double): Self = StObject.set(x, "entryChunkMultiplicator", value.asInstanceOf[js.Any])
    
    inline def setEntryChunkMultiplicatorUndefined: Self = StObject.set(x, "entryChunkMultiplicator", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
