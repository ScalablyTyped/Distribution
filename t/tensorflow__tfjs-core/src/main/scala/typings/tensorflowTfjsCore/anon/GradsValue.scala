package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GradsValue[T /* <: Tensor[Rank] */] extends js.Object {
  
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
  implicit class GradsValueOps[Self <: GradsValue[_], T /* <: Tensor[Rank] */] (val x: Self with GradsValue[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGradsVarargs(value: Tensor[Rank]*): Self = this.set("grads", js.Array(value :_*))
    
    @scala.inline
    def setGrads(value: js.Array[Tensor[Rank]]): Self = this.set("grads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
