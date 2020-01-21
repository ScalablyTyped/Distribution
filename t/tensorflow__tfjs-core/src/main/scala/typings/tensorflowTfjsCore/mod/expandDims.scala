package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "expandDims")
@js.native
object expandDims extends js.Object {
  def apply[R2 /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](x: TensorLike): Tensor[R2] = js.native
  def apply[R2 /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](x: TensorLike, axis: Double): Tensor[R2] = js.native
  def apply[R2 /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]): Tensor[R2] = js.native
  def apply[R2 /* <: typings.tensorflowTfjsCore.distTypesMod.Rank */](x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], axis: Double): Tensor[R2] = js.native
}

