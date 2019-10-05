package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distOptimizersOptimizerMod.Optimizer
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/rmsprop_optimizer", JSImport.Namespace)
@js.native
object distOptimizersRmspropUnderscoreOptimizerMod extends js.Object {
  @js.native
  class RMSPropOptimizer protected () extends Optimizer {
    def this(learningRate: Double) = this()
    def this(learningRate: Double, decay: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: Double, epsilon: Double) = this()
    def this(learningRate: Double, decay: Double, momentum: Double, epsilon: Double, centered: Boolean) = this()
    var accumulatedMeanGrads: js.Any = js.native
    var accumulatedMeanSquares: js.Any = js.native
    var accumulatedMoments: js.Any = js.native
    var centered: js.Any = js.native
    var decay: Double = js.native
    var epsilon: Double = js.native
    var learningRate: Double = js.native
    var momentum: Double = js.native
  }
  
  /* static members */
  @js.native
  object RMSPropOptimizer extends js.Object {
    /** @nocollapse */
    var className: String = js.native
    /** @nocollapse */
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  }
  
}

