package typings
package atTensorflowTfjsDashCoreLib.distOptimizersRmspropUnderscoreOptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/rmsprop_optimizer", "RMSPropOptimizer")
@js.native
class RMSPropOptimizer protected ()
  extends atTensorflowTfjsDashCoreLib.distOptimizersOptimizerMod.Optimizer {
  def this(learningRate: scala.Double) = this()
  def this(learningRate: scala.Double, decay: scala.Double) = this()
  def this(learningRate: scala.Double, decay: scala.Double, momentum: scala.Double) = this()
  def this(learningRate: scala.Double, decay: scala.Double, momentum: scala.Double, epsilon: scala.Double) = this()
  def this(learningRate: scala.Double, decay: scala.Double, momentum: scala.Double, epsilon: scala.Double, centered: scala.Boolean) = this()
  var accumulatedMeanGrads: js.Any = js.native
  var accumulatedMeanSquares: js.Any = js.native
  var accumulatedMoments: js.Any = js.native
  var centered: js.Any = js.native
  var decay: scala.Double = js.native
  var epsilon: scala.Double = js.native
  var learningRate: scala.Double = js.native
  var momentum: scala.Double = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/optimizers/rmsprop_optimizer", "RMSPropOptimizer")
@js.native
object RMSPropOptimizer extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.distSerializationMod.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
}

