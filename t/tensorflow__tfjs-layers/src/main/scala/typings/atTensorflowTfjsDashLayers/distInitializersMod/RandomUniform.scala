package typings.atTensorflowTfjsDashLayers.distInitializersMod

import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersNumbers.`-0.05`
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersNumbers.`0.05`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "RandomUniform")
@js.native
class RandomUniform protected () extends Initializer {
  def this(args: RandomUniformArgs) = this()
  val DEFAULT_MAXVAL: `0.05` = js.native
  val DEFAULT_MINVAL: `-0.05` = js.native
  var maxval: js.Any = js.native
  var minval: js.Any = js.native
  var seed: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/initializers", "RandomUniform")
@js.native
object RandomUniform extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

