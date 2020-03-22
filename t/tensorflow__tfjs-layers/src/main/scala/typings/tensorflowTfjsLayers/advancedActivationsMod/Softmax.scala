package typings.tensorflowTfjsLayers.advancedActivationsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.tensorflowTfjsLayersNumbers.`1`
import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "Softmax")
@js.native
class Softmax () extends Layer {
  def this(args: SoftmaxLayerArgs) = this()
  val DEFAULT_AXIS: `1` = js.native
  val axis: Double = js.native
  def softmax(t: Tensor[Rank]): Tensor[Rank] = js.native
  def softmax(t: Tensor[Rank], a: Double): Tensor[Rank] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "Softmax")
@js.native
object Softmax extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

