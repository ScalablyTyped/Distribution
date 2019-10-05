package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "batchToSpaceND")
@js.native
object batchToSpaceND extends js.Object {
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: T, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
  def apply[T /* <: typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank] */](x: TensorLike, blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): T = js.native
}

