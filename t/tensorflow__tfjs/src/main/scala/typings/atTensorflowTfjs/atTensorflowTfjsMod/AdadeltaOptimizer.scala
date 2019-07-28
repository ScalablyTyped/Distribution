package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "AdadeltaOptimizer")
@js.native
class AdadeltaOptimizer protected ()
  extends typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.AdadeltaOptimizer {
  def this(learningRate: Double, rho: Double) = this()
  def this(learningRate: Double, rho: Double, epsilon: Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs", "AdadeltaOptimizer")
@js.native
object AdadeltaOptimizer extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

