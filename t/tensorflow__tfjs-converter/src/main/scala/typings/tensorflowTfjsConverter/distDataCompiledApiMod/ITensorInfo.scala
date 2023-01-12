package typings.tensorflowTfjsConverter.distDataCompiledApiMod

import typings.tensorflowTfjsConverter.distDataCompiledApiMod.TensorInfo.ICooSparse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITensorInfo extends StObject {
  
  /** TensorInfo cooSparse */
  var cooSparse: js.UndefOr[ICooSparse | Null] = js.undefined
  
  /** TensorInfo dtype */
  var dtype: js.UndefOr[DataType | String | Null] = js.undefined
  
  /** TensorInfo name */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /** Resource id tensor was originally assigned to.  */
  var resourceId: js.UndefOr[Double | Null] = js.undefined
  
  /** TensorInfo tensorShape */
  var tensorShape: js.UndefOr[ITensorShape | Null] = js.undefined
}
object ITensorInfo {
  
  inline def apply(): ITensorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITensorInfo] (val x: Self) extends AnyVal {
    
    inline def setCooSparse(value: ICooSparse): Self = StObject.set(x, "cooSparse", value.asInstanceOf[js.Any])
    
    inline def setCooSparseNull: Self = StObject.set(x, "cooSparse", null)
    
    inline def setCooSparseUndefined: Self = StObject.set(x, "cooSparse", js.undefined)
    
    inline def setDtype(value: DataType | String): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setDtypeNull: Self = StObject.set(x, "dtype", null)
    
    inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceId(value: Double): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdNull: Self = StObject.set(x, "resourceId", null)
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setTensorShape(value: ITensorShape): Self = StObject.set(x, "tensorShape", value.asInstanceOf[js.Any])
    
    inline def setTensorShapeNull: Self = StObject.set(x, "tensorShape", null)
    
    inline def setTensorShapeUndefined: Self = StObject.set(x, "tensorShape", js.undefined)
  }
}
