package typings.atTensorflowTfjsDashLayers.distInitializersMod

import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "Orthogonal")
@js.native
class Orthogonal () extends Initializer {
  def this(args: OrthogonalArgs) = this()
  val DEFAULT_GAIN: `1` = js.native
  val gain: Double = js.native
  val seed: Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/initializers", "Orthogonal")
@js.native
object Orthogonal extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

