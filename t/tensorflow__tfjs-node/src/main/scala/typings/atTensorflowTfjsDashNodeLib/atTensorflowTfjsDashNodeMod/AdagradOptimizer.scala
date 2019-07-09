package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "AdagradOptimizer")
@js.native
class AdagradOptimizer protected ()
  extends atTensorflowTfjsLib.atTensorflowTfjsMod.AdagradOptimizer {
  def this(learningRate: scala.Double) = this()
  def this(learningRate: scala.Double, initialAccumulatorValue: scala.Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-node", "AdagradOptimizer")
@js.native
object AdagradOptimizer extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.distSerializationMod.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
}

