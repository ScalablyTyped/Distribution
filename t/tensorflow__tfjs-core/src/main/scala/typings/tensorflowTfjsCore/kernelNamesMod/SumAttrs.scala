package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SumAttrs extends StObject {
  
  var axis: Double | js.Array[Double]
  
  var keepDims: Boolean
}
object SumAttrs {
  
  inline def apply(axis: Double | js.Array[Double], keepDims: Boolean): SumAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], keepDims = keepDims.asInstanceOf[js.Any])
    __obj.asInstanceOf[SumAttrs]
  }
  
  extension [Self <: SumAttrs](x: Self) {
    
    inline def setAxis(value: Double | js.Array[Double]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisVarargs(value: Double*): Self = StObject.set(x, "axis", js.Array(value*))
    
    inline def setKeepDims(value: Boolean): Self = StObject.set(x, "keepDims", value.asInstanceOf[js.Any])
  }
}
