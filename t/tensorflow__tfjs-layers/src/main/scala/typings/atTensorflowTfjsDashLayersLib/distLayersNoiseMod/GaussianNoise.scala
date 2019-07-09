package typings
package atTensorflowTfjsDashLayersLib.distLayersNoiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianNoise")
@js.native
class GaussianNoise protected ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  def this(args: GaussianNoiseArgs) = this()
  val stddev: scala.Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/noise", "GaussianNoise")
@js.native
object GaussianNoise extends js.Object {
  var className: java.lang.String = js.native
}

