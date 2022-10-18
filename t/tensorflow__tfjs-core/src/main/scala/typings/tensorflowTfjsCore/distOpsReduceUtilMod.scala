package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsReduceUtilMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/reduce_util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/reduce_util", "PARALLELIZE_THRESHOLD")
  @js.native
  val PARALLELIZE_THRESHOLD: /* 30 */ Double = js.native
  
  inline def computeOptimalWindowSize(inSize: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeOptimalWindowSize")(inSize.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait ReduceInfo extends StObject {
    
    var batchSize: Double
    
    var inSize: Double
    
    var outSize: Double
    
    var windowSize: Double
  }
  object ReduceInfo {
    
    inline def apply(batchSize: Double, inSize: Double, outSize: Double, windowSize: Double): ReduceInfo = {
      val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], inSize = inSize.asInstanceOf[js.Any], outSize = outSize.asInstanceOf[js.Any], windowSize = windowSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReduceInfo]
    }
    
    extension [Self <: ReduceInfo](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setInSize(value: Double): Self = StObject.set(x, "inSize", value.asInstanceOf[js.Any])
      
      inline def setOutSize(value: Double): Self = StObject.set(x, "outSize", value.asInstanceOf[js.Any])
      
      inline def setWindowSize(value: Double): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    }
  }
}
