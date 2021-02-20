package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillAttrs extends StObject {
  
  var dtype: DataType = js.native
  
  var shape: js.Array[Double] = js.native
  
  var value: Double | String = js.native
}
object FillAttrs {
  
  @scala.inline
  def apply(dtype: DataType, shape: js.Array[Double], value: Double | String): FillAttrs = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillAttrs]
  }
  
  @scala.inline
  implicit class FillAttrsMutableBuilder[Self <: FillAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
