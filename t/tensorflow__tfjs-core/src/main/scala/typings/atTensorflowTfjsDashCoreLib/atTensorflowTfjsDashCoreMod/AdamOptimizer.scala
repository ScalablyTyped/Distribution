package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "AdamOptimizer")
@js.native
class AdamOptimizer protected ()
  extends atTensorflowTfjsDashCoreLib.distOptimizersAdamUnderscoreOptimizerMod.AdamOptimizer {
  def this(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double) = this()
  def this(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double, epsilon: scala.Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-core", "AdamOptimizer")
@js.native
object AdamOptimizer extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.distSerializationMod.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
}

