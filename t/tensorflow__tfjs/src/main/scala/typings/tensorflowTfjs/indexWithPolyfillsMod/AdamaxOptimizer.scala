package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "AdamaxOptimizer")
@js.native
class AdamaxOptimizer protected ()
  extends typings.tensorflowTfjs.mod.AdamaxOptimizer {
  def this(learningRate: Double, beta1: Double, beta2: Double) = this()
  def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double) = this()
  def this(
    learningRate: Double,
    beta1: Double,
    beta2: Double,
    epsilon: js.UndefOr[scala.Nothing],
    decay: Double
  ) = this()
  def this(learningRate: Double, beta1: Double, beta2: Double, epsilon: Double, decay: Double) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "AdamaxOptimizer")
@js.native
object AdamaxOptimizer extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

