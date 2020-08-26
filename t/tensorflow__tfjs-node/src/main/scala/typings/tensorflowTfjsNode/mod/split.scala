package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "split")
@js.native
object split extends js.Object {
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, numOrSizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, numOrSizeSplits: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], numOrSizeSplits: js.Array[Double]): js.Array[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](
    x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank],
    numOrSizeSplits: js.Array[Double],
    axis: Double
  ): js.Array[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], numOrSizeSplits: Double): js.Array[T] = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], numOrSizeSplits: Double, axis: Double): js.Array[T] = js.native
}

