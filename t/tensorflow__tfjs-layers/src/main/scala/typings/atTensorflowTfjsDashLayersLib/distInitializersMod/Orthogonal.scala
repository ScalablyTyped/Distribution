package typings
package atTensorflowTfjsDashLayersLib.distInitializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "Orthogonal")
@js.native
class Orthogonal () extends Initializer {
  def this(args: OrthogonalArgs) = this()
  val DEFAULT_GAIN: atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibNumbers.`1` = js.native
  val gain: scala.Double = js.native
  val seed: scala.Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/initializers", "Orthogonal")
@js.native
object Orthogonal extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
}

