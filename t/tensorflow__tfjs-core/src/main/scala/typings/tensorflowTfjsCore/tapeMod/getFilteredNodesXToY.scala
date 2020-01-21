package typings.tensorflowTfjsCore.tapeMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tape", "getFilteredNodesXToY")
@js.native
object getFilteredNodesXToY extends js.Object {
  def apply(tape: js.Array[TapeNode], xs: js.Array[Tensor[Rank]], y: Tensor[Rank]): js.Array[TapeNode] = js.native
}

