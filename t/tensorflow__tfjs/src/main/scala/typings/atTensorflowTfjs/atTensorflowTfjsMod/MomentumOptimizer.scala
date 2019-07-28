package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "MomentumOptimizer")
@js.native
class MomentumOptimizer protected ()
  extends typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.MomentumOptimizer {
  def this(learningRate: Double, momentum: Double) = this()
  def this(learningRate: Double, momentum: Double, useNesterov: Boolean) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs", "MomentumOptimizer")
@js.native
object MomentumOptimizer extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

