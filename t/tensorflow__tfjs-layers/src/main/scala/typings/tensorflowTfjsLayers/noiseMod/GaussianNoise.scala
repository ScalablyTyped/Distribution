package typings.tensorflowTfjsLayers.noiseMod

import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /** @nocollapse */
  var className: String = js.native
}
