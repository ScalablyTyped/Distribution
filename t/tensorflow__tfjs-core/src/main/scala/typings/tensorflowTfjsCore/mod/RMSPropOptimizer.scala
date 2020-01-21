package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core", "RMSPropOptimizer")
@js.native
class RMSPropOptimizer protected ()
  extends typings.tensorflowTfjsCore.rmspropOptimizerMod.RMSPropOptimizer {
  def this(learningRate: Double) = this()
  def this(learningRate: Double, decay: Double) = this()
  def this(learningRate: Double, decay: Double, momentum: Double) = this()
  def this(learningRate: Double, decay: Double, momentum: Double, epsilon: Double) = this()
  def this(learningRate: Double, decay: Double, momentum: Double, epsilon: Double, centered: Boolean) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-core", "RMSPropOptimizer")
@js.native
object RMSPropOptimizer extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

