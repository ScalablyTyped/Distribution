package typings.atTensorflowTfjsDashCore.distTapeMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tape", "getFilteredNodesXToY")
@js.native
object getFilteredNodesXToY extends js.Object {
  def apply(tape: js.Array[TapeNode], xs: js.Array[Tensor[Rank]], y: Tensor[Rank]): js.Array[TapeNode] = js.native
}

