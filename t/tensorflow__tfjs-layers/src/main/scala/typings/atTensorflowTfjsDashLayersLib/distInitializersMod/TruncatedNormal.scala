package typings
package atTensorflowTfjsDashLayersLib.distInitializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/initializers", "TruncatedNormal")
@js.native
class TruncatedNormal protected () extends Initializer {
  def this(args: TruncatedNormalArgs) = this()
  val DEFAULT_MEAN: atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibNumbers.`0` = js.native
  val DEFAULT_STDDEV: atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersLibNumbers.`0DOT05` = js.native
  var mean: js.Any = js.native
  var seed: js.Any = js.native
  var stddev: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/initializers", "TruncatedNormal")
@js.native
object TruncatedNormal extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
}

