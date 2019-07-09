package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "RMSPropOptimizer")
@js.native
class RMSPropOptimizer protected ()
  extends atTensorflowTfjsDashCoreLib.distOptimizersRmspropUnderscoreOptimizerMod.RMSPropOptimizer {
  def this(learningRate: scala.Double) = this()
  def this(learningRate: scala.Double, decay: scala.Double) = this()
  def this(learningRate: scala.Double, decay: scala.Double, momentum: scala.Double) = this()
  def this(learningRate: scala.Double, decay: scala.Double, momentum: scala.Double, epsilon: scala.Double) = this()
  def this(learningRate: scala.Double, decay: scala.Double, momentum: scala.Double, epsilon: scala.Double, centered: scala.Boolean) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-core", "RMSPropOptimizer")
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

