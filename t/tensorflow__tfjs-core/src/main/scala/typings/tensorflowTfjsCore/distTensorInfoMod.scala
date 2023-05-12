package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTensorInfoMod {
  
  type DataId = js.Object
  
  trait TensorInfo extends StObject {
    
    var dataId: DataId
    
    var dtype: DataType
    
    var shape: js.Array[Double]
  }
  object TensorInfo {
    
    inline def apply(dataId: DataId, dtype: DataType, shape: js.Array[Double]): TensorInfo = {
      val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[TensorInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TensorInfo] (val x: Self) extends AnyVal {
      
      inline def setDataId(value: DataId): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
    }
  }
}
