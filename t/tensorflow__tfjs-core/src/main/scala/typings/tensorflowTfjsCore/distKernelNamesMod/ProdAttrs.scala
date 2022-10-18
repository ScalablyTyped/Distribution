package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProdAttrs extends StObject {
  
  var axis: Double | js.Array[Double]
  
  var keepDims: Boolean
}
object ProdAttrs {
  
  inline def apply(axis: Double | js.Array[Double], keepDims: Boolean): ProdAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], keepDims = keepDims.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProdAttrs]
  }
  
  extension [Self <: ProdAttrs](x: Self) {
    
    inline def setAxis(value: Double | js.Array[Double]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisVarargs(value: Double*): Self = StObject.set(x, "axis", js.Array(value*))
    
    inline def setKeepDims(value: Boolean): Self = StObject.set(x, "keepDims", value.asInstanceOf[js.Any])
  }
}
