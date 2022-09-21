package typings.wavesurferJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peakcacheMod {
  
  @JSImport("wavesurfer.js/src/peakcache", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PeakCache {
    
    /* CompleteClass */
    override def addRangeToPeakCache(length: Double, start: Double, end: Double): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def clearPeakCache(): Unit = js.native
    
    /* CompleteClass */
    override def getCacheRanges(): js.Array[js.Array[Double]] = js.native
  }
  
  trait PeakCache extends StObject {
    
    def addRangeToPeakCache(length: Double, start: Double, end: Double): js.Array[js.Array[Double]]
    
    def clearPeakCache(): Unit
    
    def getCacheRanges(): js.Array[js.Array[Double]]
  }
  object PeakCache {
    
    inline def apply(
      addRangeToPeakCache: (Double, Double, Double) => js.Array[js.Array[Double]],
      clearPeakCache: () => Unit,
      getCacheRanges: () => js.Array[js.Array[Double]]
    ): PeakCache = {
      val __obj = js.Dynamic.literal(addRangeToPeakCache = js.Any.fromFunction3(addRangeToPeakCache), clearPeakCache = js.Any.fromFunction0(clearPeakCache), getCacheRanges = js.Any.fromFunction0(getCacheRanges))
      __obj.asInstanceOf[PeakCache]
    }
    
    extension [Self <: PeakCache](x: Self) {
      
      inline def setAddRangeToPeakCache(value: (Double, Double, Double) => js.Array[js.Array[Double]]): Self = StObject.set(x, "addRangeToPeakCache", js.Any.fromFunction3(value))
      
      inline def setClearPeakCache(value: () => Unit): Self = StObject.set(x, "clearPeakCache", js.Any.fromFunction0(value))
      
      inline def setGetCacheRanges(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "getCacheRanges", js.Any.fromFunction0(value))
    }
  }
}
