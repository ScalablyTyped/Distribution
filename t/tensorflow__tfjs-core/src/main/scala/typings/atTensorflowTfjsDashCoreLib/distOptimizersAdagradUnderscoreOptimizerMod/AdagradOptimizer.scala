package typings
package atTensorflowTfjsDashCoreLib.distOptimizersAdagradUnderscoreOptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/adagrad_optimizer", "AdagradOptimizer")
@js.native
class AdagradOptimizer protected ()
  extends atTensorflowTfjsDashCoreLib.distOptimizersOptimizerMod.Optimizer {
  def this(learningRate: scala.Double) = this()
  def this(learningRate: scala.Double, initialAccumulatorValue: scala.Double) = this()
  var accumulatedGrads: js.Any = js.native
  var initialAccumulatorValue: js.Any = js.native
  var learningRate: scala.Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/optimizers/adagrad_optimizer", "AdagradOptimizer")
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

