package typings
package atTensorflowTfjsDashCoreLib.distOptimizersAdadeltaUnderscoreOptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/adadelta_optimizer", "AdadeltaOptimizer")
@js.native
class AdadeltaOptimizer protected ()
  extends atTensorflowTfjsDashCoreLib.distOptimizersOptimizerMod.Optimizer {
  def this(learningRate: scala.Double, rho: scala.Double) = this()
  def this(learningRate: scala.Double, rho: scala.Double, epsilon: scala.Double) = this()
  var accumulatedGrads: js.Any = js.native
  var accumulatedUpdates: js.Any = js.native
  var epsilon: scala.Double = js.native
  var learningRate: scala.Double = js.native
  var rho: scala.Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/optimizers/adadelta_optimizer", "AdadeltaOptimizer")
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

