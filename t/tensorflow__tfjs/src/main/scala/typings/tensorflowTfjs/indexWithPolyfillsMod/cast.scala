package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "cast")
@js.native
object cast extends js.Object {
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: T, dtype: DataType): T = js.native
  def apply[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](x: TensorLike, dtype: DataType): T = js.native
}

