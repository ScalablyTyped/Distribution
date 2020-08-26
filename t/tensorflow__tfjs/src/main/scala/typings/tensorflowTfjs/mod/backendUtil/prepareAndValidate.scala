package typings.tensorflowTfjs.mod.backendUtil

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "backend_util.prepareAndValidate")
@js.native
object prepareAndValidate extends js.Object {
  def apply(tensor: Tensor[Rank], indices: Tensor[Rank]): js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]] = js.native
}

