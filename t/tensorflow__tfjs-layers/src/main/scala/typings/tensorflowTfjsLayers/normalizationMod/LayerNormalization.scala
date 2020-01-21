package typings.tensorflowTfjsLayers.normalizationMod

import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "LayerNormalization")
@js.native
class LayerNormalization () extends Layer {
  def this(args: LayerNormalizationLayerArgs) = this()
  var axis: js.Any = js.native
  var beta: js.Any = js.native
  val betaInitializer: Initializer = js.native
  val betaRegularizer: Regularizer = js.native
  val center: Boolean = js.native
  val epsilon: Double = js.native
  var gamma: js.Any = js.native
  val gammaInitializer: Initializer = js.native
  val gammaRegularizer: Regularizer = js.native
  val scale: Boolean = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "LayerNormalization")
@js.native
object LayerNormalization extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

