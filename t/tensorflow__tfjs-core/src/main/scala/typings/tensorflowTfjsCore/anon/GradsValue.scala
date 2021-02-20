package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradsValue[T /* <: Tensor[Rank] */] extends StObject {
  
  var grads: js.Array[Tensor[Rank]] = js.native
  
  var value: T = js.native
}
object GradsValue {
  
  @scala.inline
  def apply[T /* <: Tensor[Rank] */](grads: js.Array[Tensor[Rank]], value: T): GradsValue[T] = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradsValue[T]]
  }
  
  @scala.inline
  implicit class GradsValueMutableBuilder[Self <: GradsValue[_], T /* <: Tensor[Rank] */] (val x: Self with GradsValue[T]) extends AnyVal {
    
    @scala.inline
    def setGrads(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "grads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "grads", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
