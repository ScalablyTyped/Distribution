package typings.tensorflowTfjsLayers.mod.layers

import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typings.tensorflowTfjsLayers.recurrentMod.RNNLayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "layers.RNN")
@js.native
class RNN_ protected ()
  extends typings.tensorflowTfjsLayers.exportsLayersMod.RNN_ {
  def this(args: RNNLayerArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-layers", "layers.RNN")
@js.native
object RNN_ extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
}

