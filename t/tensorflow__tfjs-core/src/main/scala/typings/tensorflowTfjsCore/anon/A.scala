package typings.tensorflowTfjsCore.anon

import typings.std.Uint8Array
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait A[T /* <: Tensor[Rank] */] extends js.Object {
  var a: T | TensorLike = js.native
  var activation: js.UndefOr[typings.tensorflowTfjsCore.fusedUtilMod.Activation] = js.native
  var b: T | TensorLike = js.native
  var bias: js.UndefOr[Tensor[Rank] | TensorLike] = js.native
  var preluActivationWeights: js.UndefOr[Tensor[Rank]] = js.native
  var transposeA: js.UndefOr[Boolean] = js.native
  var transposeB: js.UndefOr[Boolean] = js.native
}

object A {
  @scala.inline
  def apply[/* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */ T](a: T | TensorLike, b: T | TensorLike): A[T] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[A[T]]
  }
  @scala.inline
  implicit class AOps[Self <: A[_], /* <: typings.tensorflowTfjsCore.tensorMod.Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */ T] (val x: Self with A[T]) extends AnyVal {
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
    def setAVarargs(value: Uint8Array*): Self = this.set("a", js.Array(value :_*))
    @scala.inline
    def setA(value: T | TensorLike): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def setBVarargs(value: Uint8Array*): Self = this.set("b", js.Array(value :_*))
    @scala.inline
    def setB(value: T | TensorLike): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def setActivation(value: typings.tensorflowTfjsCore.fusedUtilMod.Activation): Self = this.set("activation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivation: Self = this.set("activation", js.undefined)
    @scala.inline
    def setBiasVarargs(value: Uint8Array*): Self = this.set("bias", js.Array(value :_*))
    @scala.inline
    def setBias(value: Tensor[Rank] | TensorLike): Self = this.set("bias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBias: Self = this.set("bias", js.undefined)
    @scala.inline
    def setPreluActivationWeights(value: Tensor[Rank]): Self = this.set("preluActivationWeights", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreluActivationWeights: Self = this.set("preluActivationWeights", js.undefined)
    @scala.inline
    def setTransposeA(value: Boolean): Self = this.set("transposeA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransposeA: Self = this.set("transposeA", js.undefined)
    @scala.inline
    def setTransposeB(value: Boolean): Self = this.set("transposeB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransposeB: Self = this.set("transposeB", js.undefined)
  }
  
}

