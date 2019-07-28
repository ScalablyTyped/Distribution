package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/complex_ops", JSImport.Namespace)
@js.native
object distOpsComplexUnderscoreOpsMod extends js.Object {
  @js.native
  object complex extends js.Object {
    def apply[T /* <: Tensor[Rank] */](real: T, imag: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](real: T, imag: TensorLike): T = js.native
    def apply[T /* <: Tensor[Rank] */](real: TensorLike, imag: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](real: TensorLike, imag: TensorLike): T = js.native
  }
  
  @js.native
  object imag extends js.Object {
    def apply[T /* <: Tensor[Rank] */](input: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](input: TensorLike): T = js.native
  }
  
  @js.native
  object real extends js.Object {
    def apply[T /* <: Tensor[Rank] */](input: T): T = js.native
    def apply[T /* <: Tensor[Rank] */](input: TensorLike): T = js.native
  }
  
}

