package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Activation")
@js.native
class Activation protected () extends Layer {
  def this(args: ActivationLayerArgs) = this()
  var activation: typings.tensorflowTfjsLayers.activationsMod.Activation = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Activation")
@js.native
object Activation extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

