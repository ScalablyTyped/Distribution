package typings.tensorflowTfjsLayers.trainingTensorsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/training_tensors", "ensureTensorsRank2OrHigher")
@js.native
object ensureTensorsRank2OrHigher extends js.Object {
  def apply(tensors: js.Array[Tensor[Rank]]): js.Array[Tensor[Rank]] = js.native
  def apply(tensors: Tensor[Rank]): js.Array[Tensor[Rank]] = js.native
}

