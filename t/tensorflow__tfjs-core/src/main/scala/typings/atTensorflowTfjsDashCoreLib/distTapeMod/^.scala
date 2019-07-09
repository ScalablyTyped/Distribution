package typings
package atTensorflowTfjsDashCoreLib.distTapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tape", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def backpropagateGradients(
    tensorAccumulatedGradientMap: org.scalablytyped.runtime.NumberDictionary[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    filteredTape: js.Array[TapeNode],
    tidy: js.Function1[
      /* f */ js.Function, 
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Unit = js.native
  def getFilteredNodesXToY(
    tape: js.Array[TapeNode],
    xs: js.Array[
      atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Array[TapeNode] = js.native
}

