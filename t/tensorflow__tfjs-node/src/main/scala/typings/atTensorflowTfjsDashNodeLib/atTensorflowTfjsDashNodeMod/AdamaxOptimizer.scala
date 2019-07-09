package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "AdamaxOptimizer")
@js.native
class AdamaxOptimizer protected ()
  extends atTensorflowTfjsLib.atTensorflowTfjsMod.AdamaxOptimizer {
  def this(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double) = this()
  def this(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double, epsilon: scala.Double) = this()
  def this(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double, epsilon: scala.Double, decay: scala.Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-node", "AdamaxOptimizer")
@js.native
object AdamaxOptimizer extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.distSerializationMod.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
}

