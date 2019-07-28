package typings.atTensorflowTfjsDashLayers.distConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/constraints", "MaxNorm")
@js.native
class MaxNorm protected () extends Constraint {
  def this(args: MaxNormArgs) = this()
  var axis: js.Any = js.native
  val defaultAxis: js.Any = js.native
  val defaultMaxValue: js.Any = js.native
  var maxValue: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/constraints", "MaxNorm")
@js.native
object MaxNorm extends js.Object {
  /** @nocollapse */
  val className: typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.MaxNorm = js.native
}

