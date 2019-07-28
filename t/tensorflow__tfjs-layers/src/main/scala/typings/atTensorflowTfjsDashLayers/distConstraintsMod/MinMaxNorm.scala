package typings.atTensorflowTfjsDashLayers.distConstraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/constraints", "MinMaxNorm")
@js.native
class MinMaxNorm protected () extends Constraint {
  def this(args: MinMaxNormArgs) = this()
  var axis: js.Any = js.native
  val defaultAxis: js.Any = js.native
  val defaultMaxValue: js.Any = js.native
  val defaultMinValue: js.Any = js.native
  val defaultRate: js.Any = js.native
  var maxValue: js.Any = js.native
  var minValue: js.Any = js.native
  var rate: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/constraints", "MinMaxNorm")
@js.native
object MinMaxNorm extends js.Object {
  /** @nocollapse */
  val className: typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersStrings.MinMaxNorm = js.native
}

