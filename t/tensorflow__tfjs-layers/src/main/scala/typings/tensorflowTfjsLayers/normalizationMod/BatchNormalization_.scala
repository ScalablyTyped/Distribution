package typings.tensorflowTfjsLayers.normalizationMod

import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "BatchNormalization")
@js.native
class BatchNormalization_ () extends Layer {
  def this(args: BatchNormalizationLayerArgs) = this()
  val axis: js.Any = js.native
  var beta: js.Any = js.native
  val betaConstraint: js.Any = js.native
  val betaInitializer: js.Any = js.native
  val betaRegularizer: js.Any = js.native
  val center: js.Any = js.native
  val epsilon: js.Any = js.native
  var gamma: js.Any = js.native
  val gammaConstraint: js.Any = js.native
  val gammaInitializer: js.Any = js.native
  val gammaRegularizer: js.Any = js.native
  val momentum: js.Any = js.native
  var movingMean: js.Any = js.native
  val movingMeanInitializer: js.Any = js.native
  var movingVariance: js.Any = js.native
  val movingVarianceInitializer: js.Any = js.native
  val scale: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "BatchNormalization")
@js.native
object BatchNormalization_ extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

