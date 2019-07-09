package typings
package atTensorflowTfjsDashCoreLib.distOptimizersSgdUnderscoreOptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", "SGDOptimizer")
@js.native
class SGDOptimizer protected ()
  extends atTensorflowTfjsDashCoreLib.distOptimizersOptimizerMod.Optimizer {
  def this(learningRate: scala.Double) = this()
  var c: atTensorflowTfjsDashCoreLib.distTensorMod.Scalar = js.native
  var learningRate: scala.Double = js.native
  /**
    * Sets the learning rate of the optimizer.
    */
  def setLearningRate(learningRate: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", "SGDOptimizer")
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

