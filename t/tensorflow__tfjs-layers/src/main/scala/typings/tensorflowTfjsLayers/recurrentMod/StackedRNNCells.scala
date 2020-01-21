package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "StackedRNNCells")
@js.native
class StackedRNNCells protected () extends RNNCell {
  def this(args: StackedRNNCellsArgs) = this()
  var cells: js.Array[RNNCell] = js.native
  @JSName("stateSize")
  val stateSize_StackedRNNCells: js.Array[Double] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "StackedRNNCells")
@js.native
object StackedRNNCells extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
}

