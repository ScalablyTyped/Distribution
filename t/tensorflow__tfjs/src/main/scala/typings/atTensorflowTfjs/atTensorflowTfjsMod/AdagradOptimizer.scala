package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "AdagradOptimizer")
@js.native
class AdagradOptimizer protected ()
  extends typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.AdagradOptimizer {
  def this(learningRate: Double) = this()
  def this(learningRate: Double, initialAccumulatorValue: Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs", "AdagradOptimizer")
@js.native
object AdagradOptimizer extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

