package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/gather_nd_util", JSImport.Namespace)
@js.native
object distOpsGatherUnderscoreNdUnderscoreUtilMod extends js.Object {
  def prepareAndValidate(tensor: Tensor[Rank], indices: Tensor[Rank]): js.Tuple4[js.Array[Double], Double, Double, js.Array[Double]] = js.native
}

