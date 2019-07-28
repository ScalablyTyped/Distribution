package typings.atTensorflowTfjsDashCore.distTapeMod

import org.scalablytyped.runtime.NumberDictionary
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tape", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def backpropagateGradients(
    tensorAccumulatedGradientMap: NumberDictionary[Tensor[Rank]],
    filteredTape: js.Array[TapeNode],
    tidy: js.Function1[/* f */ js.Function, Tensor[Rank]]
  ): Unit = js.native
  def getFilteredNodesXToY(tape: js.Array[TapeNode], xs: js.Array[Tensor[Rank]], y: Tensor[Rank]): js.Array[TapeNode] = js.native
}

