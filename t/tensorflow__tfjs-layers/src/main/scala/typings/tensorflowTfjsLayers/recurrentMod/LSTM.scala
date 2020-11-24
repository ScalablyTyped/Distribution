package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "LSTM")
@js.native
class LSTM protected () extends RNN_ {
  def this(args: LSTMLayerArgs) = this()
}
/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "LSTM")
@js.native
object LSTM extends js.Object {
  
  /** @nocollapse */
  var className: String = js.native
  
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}
