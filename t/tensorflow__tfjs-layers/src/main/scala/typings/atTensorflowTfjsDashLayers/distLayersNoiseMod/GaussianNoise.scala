package typings.atTensorflowTfjsDashLayers.distLayersNoiseMod

import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianNoise")
@js.native
class GaussianNoise protected () extends Layer {
  def this(args: GaussianNoiseArgs) = this()
  val stddev: Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianNoise")
@js.native
object GaussianNoise extends js.Object {
  var className: String = js.native
}

