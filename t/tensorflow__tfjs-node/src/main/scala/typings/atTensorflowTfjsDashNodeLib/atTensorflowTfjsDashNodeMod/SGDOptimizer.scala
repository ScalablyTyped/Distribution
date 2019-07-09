package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "SGDOptimizer")
@js.native
class SGDOptimizer protected ()
  extends atTensorflowTfjsLib.atTensorflowTfjsMod.SGDOptimizer {
  def this(learningRate: scala.Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-node", "SGDOptimizer")
@js.native
object SGDOptimizer extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.distSerializationMod.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
}

