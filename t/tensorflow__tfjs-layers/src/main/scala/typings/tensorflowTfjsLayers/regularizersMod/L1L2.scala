package typings.tensorflowTfjsLayers.regularizersMod

import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/regularizers", "L1L2")
@js.native
class L1L2 () extends Regularizer {
  def this(args: L1L2Args) = this()
  val hasL1: js.Any = js.native
  val hasL2: js.Any = js.native
  val l1: js.Any = js.native
  val l2: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/regularizers", "L1L2")
@js.native
object L1L2 extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

