package typings.atTensorflowTfjsDashCore.distTapeMod

import org.scalablytyped.runtime.NumberDictionary
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tape", "backpropagateGradients")
@js.native
object backpropagateGradients extends js.Object {
  def apply(
    tensorAccumulatedGradientMap: NumberDictionary[Tensor[Rank]],
    filteredTape: js.Array[TapeNode],
    tidy: js.Function1[/* f */ js.Function, Tensor[Rank]]
  ): Unit = js.native
}

