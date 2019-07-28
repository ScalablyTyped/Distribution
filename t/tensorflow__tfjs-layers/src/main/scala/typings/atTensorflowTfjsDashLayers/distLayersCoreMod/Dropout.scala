package typings.atTensorflowTfjsDashLayers.distLayersCoreMod

import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dropout")
@js.native
class Dropout protected () extends Layer {
  def this(args: DropoutLayerArgs) = this()
  var getNoiseShape: js.Any = js.native
  val noiseShape: js.Any = js.native
  val rate: js.Any = js.native
  val seed: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/core", "Dropout")
@js.native
object Dropout extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

