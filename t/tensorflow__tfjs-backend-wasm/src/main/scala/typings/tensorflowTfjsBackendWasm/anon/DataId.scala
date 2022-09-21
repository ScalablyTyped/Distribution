package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.bool
import typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.complex64
import typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.float32
import typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.int32
import typings.tensorflowTfjsBackendWasm.tensorflowTfjsBackendWasmStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataId extends StObject {
  
  var dataId: js.Object
  
  var dtype: string | float32 | int32 | bool | complex64
  
  var shape: js.Array[Double]
}
object DataId {
  
  inline def apply(dataId: js.Object, dtype: string | float32 | int32 | bool | complex64, shape: js.Array[Double]): DataId = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataId]
  }
  
  extension [Self <: DataId](x: Self) {
    
    inline def setDataId(value: js.Object): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    inline def setDtype(value: string | float32 | int32 | bool | complex64): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
  }
}
