package typings
package atTensorflowTfjsDashCoreLib.distOptimizersAdamaxUnderscoreOptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/adamax_optimizer", "AdamaxOptimizer")
@js.native
class AdamaxOptimizer protected ()
  extends atTensorflowTfjsDashCoreLib.distOptimizersOptimizerMod.Optimizer {
  def this(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double) = this()
  def this(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double, epsilon: scala.Double) = this()
  def this(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double, epsilon: scala.Double, decay: scala.Double) = this()
  var accBeta1: js.Any = js.native
  var accumulatedFirstMoment: js.Any = js.native
  var accumulatedWeightedInfNorm: js.Any = js.native
  var beta1: scala.Double = js.native
  var beta2: scala.Double = js.native
  var decay: scala.Double = js.native
  var epsilon: scala.Double = js.native
  var iteration: js.Any = js.native
  var learningRate: scala.Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/optimizers/adamax_optimizer", "AdamaxOptimizer")
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

