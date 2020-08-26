package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradsValue[O /* <: Tensor[Rank] */] extends js.Object {
  var grads: js.Array[Tensor[Rank]] = js.native
  var value: O = js.native
}

object GradsValue {
  @scala.inline
  def apply[/* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */ O](grads: js.Array[Tensor[Rank]], value: O): GradsValue[O] = {
    val __obj = js.Dynamic.literal(grads = grads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradsValue[O]]
  }
  @scala.inline
  implicit class GradsValueOps[Self <: GradsValue[_], /* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */ O] (val x: Self with GradsValue[O]) extends AnyVal {
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
    def setValue(value: O): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

