package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.TensorInfo.ICooSparse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITensorInfo extends StObject {
  
  /** TensorInfo cooSparse */
  var cooSparse: js.UndefOr[ICooSparse | Null] = js.native
  
  /** TensorInfo dtype */
  var dtype: js.UndefOr[DataType | Null] = js.native
  
  /** TensorInfo name */
  var name: js.UndefOr[String | Null] = js.native
  
  /** TensorInfo tensorShape */
  var tensorShape: js.UndefOr[ITensorShape | Null] = js.native
}
object ITensorInfo {
  
  @scala.inline
  def apply(): ITensorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensorInfo]
  }
  
  @scala.inline
  implicit class ITensorInfoMutableBuilder[Self <: ITensorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCooSparse(value: ICooSparse): Self = StObject.set(x, "cooSparse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCooSparseNull: Self = StObject.set(x, "cooSparse", null)
    
    @scala.inline
    def setCooSparseUndefined: Self = StObject.set(x, "cooSparse", js.undefined)
    
    @scala.inline
    def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtypeNull: Self = StObject.set(x, "dtype", null)
    
    @scala.inline
    def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTensorShape(value: ITensorShape): Self = StObject.set(x, "tensorShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensorShapeNull: Self = StObject.set(x, "tensorShape", null)
    
    @scala.inline
    def setTensorShapeUndefined: Self = StObject.set(x, "tensorShape", js.undefined)
  }
}
