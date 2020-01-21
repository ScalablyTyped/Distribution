package typings.tensorflowTfjsLayers.regularizersMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.tensorMod.Scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/regularizers", "Regularizer")
@js.native
abstract class Regularizer () extends Serializable {
  @JSName("apply")
  def apply(x: Tensor_[Rank]): Scalar = js.native
}

