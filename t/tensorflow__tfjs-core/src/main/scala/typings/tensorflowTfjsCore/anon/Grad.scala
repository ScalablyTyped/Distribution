package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grad[O /* <: Tensor[Rank] */, I /* <: Tensor[Rank] */] extends js.Object {
  var grad: I = js.native
  var value: O = js.native
}

object Grad {
  @scala.inline
  def apply[/* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */ O, /* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */ I](grad: I, value: O): Grad[O, I] = {
    val __obj = js.Dynamic.literal(grad = grad.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grad[O, I]]
  }
  @scala.inline
  implicit class GradOps[Self <: Grad[_, _], /* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */ O, /* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */ I] (val x: Self with (Grad[O, I])) extends AnyVal {
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
    def setGrad(value: I): Self = this.set("grad", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: O): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

