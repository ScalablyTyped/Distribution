package typings.tensorflowTfjsLayers.activationsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/activations", "Activation")
@js.native
abstract class Activation () extends Serializable {
  @JSName("apply")
  def apply(tensor: Tensor[Rank]): Tensor[Rank] = js.native
  @JSName("apply")
  def apply(tensor: Tensor[Rank], axis: Double): Tensor[Rank] = js.native
}

