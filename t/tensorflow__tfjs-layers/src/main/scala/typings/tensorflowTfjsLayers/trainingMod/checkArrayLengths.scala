package typings.tensorflowTfjsLayers.trainingMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "checkArrayLengths")
@js.native
object checkArrayLengths extends js.Object {
  def apply(inputs: js.Array[Tensor_[Rank]], targets: js.Array[Tensor_[Rank]]): Unit = js.native
  def apply(
    inputs: js.Array[Tensor_[Rank]],
    targets: js.Array[Tensor_[Rank]],
    weights: js.Array[Tensor_[Rank]]
  ): Unit = js.native
}

