package typings.atTensorflowTfjsDashNode.atTensorflowTfjsDashNodeMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "AdamOptimizer")
@js.native
class AdamOptimizer protected ()
  extends typings.atTensorflowTfjs.atTensorflowTfjsMod.AdamOptimizer {
  def this(learningRate: Double, beta1: Double, beta2: Double) = this()
  def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-node", "AdamOptimizer")
@js.native
object AdamOptimizer extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

