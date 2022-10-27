package typings.vite.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkSize extends StObject {
  
  var chunkSize: js.UndefOr[Double] = js.undefined
  
  var dictionary: js.UndefOr[Buffer | js.Array[Buffer] | js.typedarray.DataView] = js.undefined
  
  var finishFlush: js.UndefOr[Double] = js.undefined
  
  var flush: js.UndefOr[Double] = js.undefined
  
  var info: js.UndefOr[Boolean] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var memLevel: js.UndefOr[Double] = js.undefined
  
  var strategy: js.UndefOr[Double] = js.undefined
  
  var windowBits: js.UndefOr[Double] = js.undefined
}
object ChunkSize {
  
  inline def apply(): ChunkSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkSize]
  }
  
  extension [Self <: ChunkSize](x: Self) {
    
    inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
    
    inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
    
    inline def setDictionary(value: Buffer | js.Array[Buffer] | js.typedarray.DataView): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    inline def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    inline def setDictionaryVarargs(value: Buffer*): Self = StObject.set(x, "dictionary", js.Array(value*))
    
    inline def setFinishFlush(value: Double): Self = StObject.set(x, "finishFlush", value.asInstanceOf[js.Any])
    
    inline def setFinishFlushUndefined: Self = StObject.set(x, "finishFlush", js.undefined)
    
    inline def setFlush(value: Double): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    inline def setFlushUndefined: Self = StObject.set(x, "flush", js.undefined)
    
    inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
    
    inline def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
    
    inline def setStrategy(value: Double): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setWindowBits(value: Double): Self = StObject.set(x, "windowBits", value.asInstanceOf[js.Any])
    
    inline def setWindowBitsUndefined: Self = StObject.set(x, "windowBits", js.undefined)
  }
}
