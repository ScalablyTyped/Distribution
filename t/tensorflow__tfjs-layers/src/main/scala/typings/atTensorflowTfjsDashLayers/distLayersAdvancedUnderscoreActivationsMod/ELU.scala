package typings.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod

import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersNumbers.`1`
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ELU")
@js.native
class ELU () extends Layer {
  def this(args: ELULayerArgs) = this()
  val DEFAULT_ALPHA: `1` = js.native
  val alpha: Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ELU")
@js.native
object ELU extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

