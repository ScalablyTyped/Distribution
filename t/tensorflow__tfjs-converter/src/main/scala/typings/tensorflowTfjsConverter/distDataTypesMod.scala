package typings.tensorflowTfjsConverter

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsConverter.distExecutorHashTableMod.HashTable
import typings.tensorflowTfjsConverter.distExecutorTensorArrayMod.TensorArray
import typings.tensorflowTfjsConverter.distExecutorTensorListMod.TensorList
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDataTypesMod {
  
  type HashTableMap = NumberDictionary[HashTable]
  
  type NamedTensorMap = StringDictionary[Tensor[Rank]]
  
  type NamedTensorsMap = StringDictionary[js.Array[Tensor[Rank]]]
  
  type TensorArrayMap = NumberDictionary[TensorArray]
  
  trait TensorInfo extends StObject {
    
    var dtype: DataType
    
    var name: String
    
    var shape: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object TensorInfo {
    
    inline def apply(dtype: DataType, name: String): TensorInfo = {
      val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TensorInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TensorInfo] (val x: Self) extends AnyVal {
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
    }
  }
  
  type TensorListMap = NumberDictionary[TensorList]
}
