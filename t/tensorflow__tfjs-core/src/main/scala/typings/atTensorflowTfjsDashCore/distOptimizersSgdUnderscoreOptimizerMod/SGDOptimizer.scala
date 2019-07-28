package typings.atTensorflowTfjsDashCore.distOptimizersSgdUnderscoreOptimizerMod

import typings.atTensorflowTfjsDashCore.distOptimizersOptimizerMod.Optimizer
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", "SGDOptimizer")
@js.native
class SGDOptimizer protected () extends Optimizer {
  def this(learningRate: Double) = this()
  var c: Scalar = js.native
  var learningRate: Double = js.native
  /**
    * Sets the learning rate of the optimizer.
    */
  def setLearningRate(learningRate: Double): Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", "SGDOptimizer")
@js.native
object SGDOptimizer extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

