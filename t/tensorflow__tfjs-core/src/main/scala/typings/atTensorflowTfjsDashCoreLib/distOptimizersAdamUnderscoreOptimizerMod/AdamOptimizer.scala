package typings
package atTensorflowTfjsDashCoreLib.distOptimizersAdamUnderscoreOptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/adam_optimizer", "AdamOptimizer")
@js.native
class AdamOptimizer protected ()
  extends atTensorflowTfjsDashCoreLib.distOptimizersOptimizerMod.Optimizer {
  def this(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double) = this()
  def this(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double, epsilon: scala.Double) = this()
  var accBeta1: js.Any = js.native
  var accBeta2: js.Any = js.native
  var accumulatedFirstMoment: js.Any = js.native
  var accumulatedSecondMoment: js.Any = js.native
  var beta1: scala.Double = js.native
  var beta2: scala.Double = js.native
  var epsilon: scala.Double = js.native
  var learningRate: scala.Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/optimizers/adam_optimizer", "AdamOptimizer")
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

