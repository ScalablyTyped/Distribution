package typings.tensorflowTfjsLayers.constraintsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/constraints", "UnitNorm")
@js.native
class UnitNorm protected () extends Constraint {
  def this(args: UnitNormArgs) = this()
  var axis: js.Any = js.native
  val defaultAxis: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/constraints", "UnitNorm")
@js.native
object UnitNorm extends js.Object {
  /** @nocollapse */
  val className: typings.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.UnitNorm = js.native
}

