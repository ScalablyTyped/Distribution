package typings.tensorflowTfjsLayers.advancedActivationsMod

import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "LeakyReLU")
@js.native
class LeakyReLU () extends Layer {
  def this(args: LeakyReLULayerArgs) = this()
  val DEFAULT_ALPHA: /* 0.3 */ Double = js.native
  val alpha: Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "LeakyReLU")
@js.native
object LeakyReLU extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

