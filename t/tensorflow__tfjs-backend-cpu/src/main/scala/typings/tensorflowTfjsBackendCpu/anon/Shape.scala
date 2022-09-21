package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Shape extends StObject {
  
  var shape: js.Array[Double]
  
  var vals: BackendValues
}
object Shape {
  
  inline def apply(shape: js.Array[Double], vals: BackendValues): Shape = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  
  extension [Self <: Shape](x: Self) {
    
    inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
    
    inline def setVals(value: BackendValues): Self = StObject.set(x, "vals", value.asInstanceOf[js.Any])
    
    inline def setValsVarargs(value: js.typedarray.Uint8Array*): Self = StObject.set(x, "vals", js.Array(value*))
  }
}
