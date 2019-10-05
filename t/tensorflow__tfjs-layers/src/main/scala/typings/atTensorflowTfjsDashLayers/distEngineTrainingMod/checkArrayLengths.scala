package typings.atTensorflowTfjsDashLayers.distEngineTrainingMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "checkArrayLengths")
@js.native
object checkArrayLengths extends js.Object {
  def apply(inputs: js.Array[Tensor[Rank]], targets: js.Array[Tensor[Rank]]): Unit = js.native
  def apply(inputs: js.Array[Tensor[Rank]], targets: js.Array[Tensor[Rank]], weights: js.Array[Tensor[Rank]]): Unit = js.native
}

