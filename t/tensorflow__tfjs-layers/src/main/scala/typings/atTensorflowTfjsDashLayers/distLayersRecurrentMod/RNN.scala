package typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serialization.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.InputSpec
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distTypesMod.RnnStepFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNN")
@js.native
class RNN protected () extends Layer {
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
  var states: js.Array[Tensor[Rank]] = js.native
  var states_ : js.Any = js.native
  val unroll: Boolean = js.native
  def getInitialState(inputs: Tensor[Rank]): js.Array[Tensor[Rank]] = js.native
  def getStates(): js.Array[Tensor[Rank]] = js.native
  def resetStates(states: js.Array[Tensor[Rank]]): Unit = js.native
  def resetStates(states: js.Array[Tensor[Rank]], training: Boolean): Unit = js.native
  def resetStates(states: Tensor[Rank]): Unit = js.native
  def resetStates(states: Tensor[Rank], training: Boolean): Unit = js.native
  def setStates(states: js.Array[Tensor[Rank]]): Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNN")
@js.native
object RNN extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
}

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "rnn")
@js.native
object rnn extends js.Object {
  def apply(stepFunction: RnnStepFunction, inputs: Tensor[Rank], initialStates: js.Array[Tensor[Rank]]): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = js.native
  def apply(
    stepFunction: RnnStepFunction,
    inputs: Tensor[Rank],
    initialStates: js.Array[Tensor[Rank]],
    goBackwards: Boolean
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = js.native
  def apply(
    stepFunction: RnnStepFunction,
    inputs: Tensor[Rank],
    initialStates: js.Array[Tensor[Rank]],
    goBackwards: Boolean,
    mask: Tensor[Rank]
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = js.native
  def apply(
    stepFunction: RnnStepFunction,
    inputs: Tensor[Rank],
    initialStates: js.Array[Tensor[Rank]],
    goBackwards: Boolean,
    mask: Tensor[Rank],
    constants: js.Array[Tensor[Rank]]
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = js.native
  def apply(
    stepFunction: RnnStepFunction,
    inputs: Tensor[Rank],
    initialStates: js.Array[Tensor[Rank]],
    goBackwards: Boolean,
    mask: Tensor[Rank],
    constants: js.Array[Tensor[Rank]],
    unroll: Boolean
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = js.native
  def apply(
    stepFunction: RnnStepFunction,
    inputs: Tensor[Rank],
    initialStates: js.Array[Tensor[Rank]],
    goBackwards: Boolean,
    mask: Tensor[Rank],
    constants: js.Array[Tensor[Rank]],
    unroll: Boolean,
    needPerStepOutputs: Boolean
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = js.native
}

