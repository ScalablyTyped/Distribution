package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor1D
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Values[T /* <: Tensor[Rank] */] extends StObject {
  
  var indices: Tensor1D = js.native
  
  var values: T = js.native
}
object Values {
  
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](indices: Tensor1D, values: T): Values[T] = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Values[T]]
  }
  
  @scala.inline
  implicit class ValuesMutableBuilder[Self <: Values[_], T /* <: Tensor[Rank] */] (val x: Self with Values[T]) extends AnyVal {
    
    @scala.inline
    def setIndices(value: Tensor1D): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: T): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
