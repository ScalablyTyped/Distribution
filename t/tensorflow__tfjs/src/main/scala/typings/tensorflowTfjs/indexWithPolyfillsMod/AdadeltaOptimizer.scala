package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "AdadeltaOptimizer")
@js.native
class AdadeltaOptimizer protected ()
  extends typings.tensorflowTfjs.mod.AdadeltaOptimizer {
  def this(learningRate: Double, rho: Double) = this()
  def this(learningRate: Double, rho: Double, epsilon: Double) = this()
}
/* static members */
@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "AdadeltaOptimizer")
@js.native
object AdadeltaOptimizer extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
  
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}
