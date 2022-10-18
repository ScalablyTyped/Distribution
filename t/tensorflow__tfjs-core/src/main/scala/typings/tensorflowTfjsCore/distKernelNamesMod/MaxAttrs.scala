package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxAttrs extends StObject {
  
  var keepDims: Boolean
  
  var reductionIndices: Double | js.Array[Double]
}
object MaxAttrs {
  
  inline def apply(keepDims: Boolean, reductionIndices: Double | js.Array[Double]): MaxAttrs = {
    val __obj = js.Dynamic.literal(keepDims = keepDims.asInstanceOf[js.Any], reductionIndices = reductionIndices.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxAttrs]
  }
  
  extension [Self <: MaxAttrs](x: Self) {
    
    inline def setKeepDims(value: Boolean): Self = StObject.set(x, "keepDims", value.asInstanceOf[js.Any])
    
    inline def setReductionIndices(value: Double | js.Array[Double]): Self = StObject.set(x, "reductionIndices", value.asInstanceOf[js.Any])
    
    inline def setReductionIndicesVarargs(value: Double*): Self = StObject.set(x, "reductionIndices", js.Array(value*))
  }
}
