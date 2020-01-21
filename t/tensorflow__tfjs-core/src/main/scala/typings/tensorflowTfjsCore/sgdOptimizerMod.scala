package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.optimizerMod.Optimizer
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.tensorMod.Scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/sgd_optimizer", JSImport.Namespace)
@js.native
object sgdOptimizerMod extends js.Object {
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
  @js.native
  object SGDOptimizer extends js.Object {
    /** @nocollapse */
    var className: String = js.native
    /** @nocollapse */
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
  
}

