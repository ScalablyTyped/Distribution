package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TypedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutDtype extends StObject {
  
  var outDtype: DataType
  
  var outShape: js.Array[Double]
  
  var outVals: TypedArray
}
object OutDtype {
  
  inline def apply(outDtype: DataType, outShape: js.Array[Double], outVals: TypedArray): OutDtype = {
    val __obj = js.Dynamic.literal(outDtype = outDtype.asInstanceOf[js.Any], outShape = outShape.asInstanceOf[js.Any], outVals = outVals.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutDtype]
  }
  
  extension [Self <: OutDtype](x: Self) {
    
    inline def setOutDtype(value: DataType): Self = StObject.set(x, "outDtype", value.asInstanceOf[js.Any])
    
    inline def setOutShape(value: js.Array[Double]): Self = StObject.set(x, "outShape", value.asInstanceOf[js.Any])
    
    inline def setOutShapeVarargs(value: Double*): Self = StObject.set(x, "outShape", js.Array(value*))
    
    inline def setOutVals(value: TypedArray): Self = StObject.set(x, "outVals", value.asInstanceOf[js.Any])
  }
}
