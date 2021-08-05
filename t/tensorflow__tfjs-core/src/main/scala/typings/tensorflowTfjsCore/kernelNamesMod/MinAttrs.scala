package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinAttrs extends StObject {
  
  var axis: Double | js.Array[Double]
  
  var keepDims: Boolean
}
object MinAttrs {
  
  inline def apply(axis: Double | js.Array[Double], keepDims: Boolean): MinAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], keepDims = keepDims.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinAttrs]
  }
  
  extension [Self <: MinAttrs](x: Self) {
    
    inline def setAxis(value: Double | js.Array[Double]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisVarargs(value: Double*): Self = StObject.set(x, "axis", js.Array(value :_*))
    
    inline def setKeepDims(value: Boolean): Self = StObject.set(x, "keepDims", value.asInstanceOf[js.Any])
  }
}
