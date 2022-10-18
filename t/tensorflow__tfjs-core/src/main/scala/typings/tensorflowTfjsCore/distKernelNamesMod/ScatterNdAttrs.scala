package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScatterNdAttrs extends StObject {
  
  var shape: js.Array[Double]
}
object ScatterNdAttrs {
  
  inline def apply(shape: js.Array[Double]): ScatterNdAttrs = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterNdAttrs]
  }
  
  extension [Self <: ScatterNdAttrs](x: Self) {
    
    inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
  }
}
