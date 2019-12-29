package typings.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod

import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersNumbers.`0.3`
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "LeakyReLU")
@js.native
class LeakyReLU () extends Layer {
  def this(args: LeakyReLULayerArgs) = this()
  val DEFAULT_ALPHA: `0.3` = js.native
  val alpha: Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "LeakyReLU")
@js.native
object LeakyReLU extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

