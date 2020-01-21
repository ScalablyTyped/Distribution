package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typings.tensorflowTfjsLayers.topologyMod.InputSpec
import typings.tensorflowTfjsLayers.topologyMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNN")
@js.native
class RNN_ protected () extends Layer {
  def this(args: RNNLayerArgs) = this()
  val cell: RNNCell = js.native
  val goBackwards: Boolean = js.native
  var keptStates: js.Any = js.native
  var numConstants: js.Any = js.native
  val returnSequences: Boolean = js.native
  val returnState: Boolean = js.native
  var stateSpec: js.Array[InputSpec] = js.native
  /**
    * Get the current state tensors of the RNN.
    *
    * If the state hasn't been set, return an array of `null`s of the correct
    * length.
    */
  var states: js.Array[Tensor_[Rank]] = js.native
  var states_ : js.Any = js.native
  val unroll: Boolean = js.native
  def getInitialState(inputs: Tensor_[Rank]): js.Array[Tensor_[Rank]] = js.native
  def getStates(): js.Array[Tensor_[Rank]] = js.native
  def resetStates(states: js.Array[Tensor_[Rank]]): Unit = js.native
  def resetStates(states: js.Array[Tensor_[Rank]], training: Boolean): Unit = js.native
  def resetStates(states: Tensor_[Rank]): Unit = js.native
  def resetStates(states: Tensor_[Rank], training: Boolean): Unit = js.native
  def setStates(states: js.Array[Tensor_[Rank]]): Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNN")
@js.native
object RNN_ extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
}

