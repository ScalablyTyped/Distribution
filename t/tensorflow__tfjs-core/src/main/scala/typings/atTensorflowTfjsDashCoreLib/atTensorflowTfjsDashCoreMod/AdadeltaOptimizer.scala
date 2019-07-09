package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "AdadeltaOptimizer")
@js.native
class AdadeltaOptimizer protected ()
  extends atTensorflowTfjsDashCoreLib.distOptimizersAdadeltaUnderscoreOptimizerMod.AdadeltaOptimizer {
  def this(learningRate: scala.Double, rho: scala.Double) = this()
  def this(learningRate: scala.Double, rho: scala.Double, epsilon: scala.Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-core", "AdadeltaOptimizer")
@js.native
object AdadeltaOptimizer extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.distSerializationMod.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
}

