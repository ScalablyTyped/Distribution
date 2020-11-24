package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.Serializable
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core", "SGDOptimizer")
@js.native
class SGDOptimizer protected ()
  extends typings.tensorflowTfjsCore.baseMod.SGDOptimizer {
  def this(learningRate: Double) = this()
}
/* static members */
@JSImport("@tensorflow/tfjs-core", "SGDOptimizer")
@js.native
object SGDOptimizer extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
  
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}
