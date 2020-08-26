package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GradFunc[T /* <: Tensor[Rank] */] extends js.Object {
  var value: T = js.native
  def gradFunc(dy: T, saved: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
}

object GradFunc {
  @scala.inline
  def apply[/* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */ T](gradFunc: (T, js.Array[Tensor[Rank]]) => Tensor[Rank] | js.Array[Tensor[Rank]], value: T): GradFunc[T] = {
    val __obj = js.Dynamic.literal(gradFunc = js.Any.fromFunction2(gradFunc), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradFunc[T]]
  }
  @scala.inline
  implicit class GradFuncOps[Self <: GradFunc[_], /* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */ T] (val x: Self with GradFunc[T]) extends AnyVal {
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
    def setGradFunc(value: (T, js.Array[Tensor[Rank]]) => Tensor[Rank] | js.Array[Tensor[Rank]]): Self = this.set("gradFunc", js.Any.fromFunction2(value))
    @scala.inline
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

