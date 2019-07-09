package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "MomentumOptimizer")
@js.native
class MomentumOptimizer protected ()
  extends atTensorflowTfjsDashCoreLib.distOptimizersMomentumUnderscoreOptimizerMod.MomentumOptimizer {
  def this(learningRate: scala.Double, momentum: scala.Double) = this()
  def this(learningRate: scala.Double, momentum: scala.Double, useNesterov: scala.Boolean) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-core", "MomentumOptimizer")
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

