package typings.atTensorflowTfjsDashCore.distOpsScatterUnderscoreNdUnderscoreUtilMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/scatter_nd_util", "validateInput")
@js.native
object validateInput extends js.Object {
  def apply(updates: Tensor[Rank], indices: Tensor[Rank], shape: js.Array[Double]): Unit = js.native
}

