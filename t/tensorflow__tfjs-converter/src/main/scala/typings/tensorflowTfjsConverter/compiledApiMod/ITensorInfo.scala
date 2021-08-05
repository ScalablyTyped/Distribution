package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.TensorInfo.ICooSparse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITensorInfo extends StObject {
  
  /** TensorInfo cooSparse */
  var cooSparse: js.UndefOr[ICooSparse | Null] = js.undefined
  
  /** TensorInfo dtype */
  var dtype: js.UndefOr[DataType | Null] = js.undefined
  
  /** TensorInfo name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** TensorInfo tensorShape */
  var tensorShape: js.UndefOr[ITensorShape | Null] = js.undefined
}
object ITensorInfo {
  
  inline def apply(): ITensorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensorInfo]
  }
  
  extension [Self <: ITensorInfo](x: Self) {
    
    inline def setCooSparse(value: ICooSparse): Self = StObject.set(x, "cooSparse", value.asInstanceOf[js.Any])
    
    inline def setCooSparseNull: Self = StObject.set(x, "cooSparse", null)
    
    inline def setCooSparseUndefined: Self = StObject.set(x, "cooSparse", js.undefined)
    
    inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setDtypeNull: Self = StObject.set(x, "dtype", null)
    
    inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTensorShape(value: ITensorShape): Self = StObject.set(x, "tensorShape", value.asInstanceOf[js.Any])
    
    inline def setTensorShapeNull: Self = StObject.set(x, "tensorShape", null)
    
    inline def setTensorShapeUndefined: Self = StObject.set(x, "tensorShape", js.undefined)
  }
}
