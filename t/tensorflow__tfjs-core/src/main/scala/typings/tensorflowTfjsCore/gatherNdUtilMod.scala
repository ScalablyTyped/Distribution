package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/gather_nd_util", JSImport.Namespace)
@js.native
object gatherNdUtilMod extends js.Object {
  def prepareAndValidate(tensor: Tensor[Rank], indices: Tensor[Rank]): js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]] = js.native
}

