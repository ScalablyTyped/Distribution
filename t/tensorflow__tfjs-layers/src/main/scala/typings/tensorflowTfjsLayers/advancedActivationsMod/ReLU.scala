package typings.tensorflowTfjsLayers.advancedActivationsMod

import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ReLU")
@js.native
class ReLU () extends Layer {
  def this(args: ReLULayerArgs) = this()
  var maxValue: Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ReLU")
@js.native
object ReLU extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

