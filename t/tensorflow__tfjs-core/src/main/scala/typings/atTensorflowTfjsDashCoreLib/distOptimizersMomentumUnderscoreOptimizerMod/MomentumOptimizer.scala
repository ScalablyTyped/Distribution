package typings
package atTensorflowTfjsDashCoreLib.distOptimizersMomentumUnderscoreOptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/momentum_optimizer", "MomentumOptimizer")
@js.native
class MomentumOptimizer protected ()
  extends atTensorflowTfjsDashCoreLib.distOptimizersSgdUnderscoreOptimizerMod.SGDOptimizer {
  def this(learningRate: scala.Double, momentum: scala.Double) = this()
  def this(learningRate: scala.Double, momentum: scala.Double, useNesterov: scala.Boolean) = this()
  var accumulations: js.Any = js.native
  var m: js.Any = js.native
  var momentum: js.Any = js.native
  var useNesterov: js.Any = js.native
  /**
    * Sets the momentum of the optimizer.
    *
    * @param momentum
    */
  def setMomentum(momentum: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/optimizers/momentum_optimizer", "MomentumOptimizer")
@js.native
object MomentumOptimizer extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.distSerializationMod.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
}

