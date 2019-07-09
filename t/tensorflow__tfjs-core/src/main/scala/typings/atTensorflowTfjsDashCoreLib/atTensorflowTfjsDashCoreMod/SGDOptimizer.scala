package typings
package atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "SGDOptimizer")
@js.native
class SGDOptimizer protected ()
  extends atTensorflowTfjsDashCoreLib.distOptimizersSgdUnderscoreOptimizerMod.SGDOptimizer {
  def this(learningRate: scala.Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-core", "SGDOptimizer")
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

