package typings.tensorflowTfjsCore.opsMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "cast")
@js.native
object cast extends js.Object {
  def apply[T /* <: Tensor[Rank] */](x: T, dtype: DataType): T = js.native
  def apply[T /* <: Tensor[Rank] */](x: TensorLike, dtype: DataType): T = js.native
}

