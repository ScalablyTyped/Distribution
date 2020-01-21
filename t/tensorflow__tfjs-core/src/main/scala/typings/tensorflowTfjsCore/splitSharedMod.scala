package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/backends/split_shared", JSImport.Namespace)
@js.native
object splitSharedMod extends js.Object {
  def split[T /* <: Tensor[Rank] */](x: T, sizeSplits: js.Array[Double], axis: Double): js.Array[T] = js.native
}

