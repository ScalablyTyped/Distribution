package typings
package atTensorflowTfjsDashLayersLib.distLayersRecurrentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNN")
@js.native
class RNN protected ()
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer {
  def this(args: RNNLayerArgs) = this()
  val cell: RNNCell = js.native
  val goBackwards: scala.Boolean = js.native
  var keptStates: js.Any = js.native
  var numConstants: js.Any = js.native
  val returnSequences: scala.Boolean = js.native
  val returnState: scala.Boolean = js.native
  var stateSpec: js.Array[atTensorflowTfjsDashLayersLib.distEngineTopologyMod.InputSpec] = js.native
  /**
    * Get the current state tensors of the RNN.
    *
    * If the state hasn't been set, return an array of `null`s of the correct
    * length.
    */
  var states: js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  var states_ : js.Any = js.native
  val unroll: scala.Boolean = js.native
  def getInitialState(
    inputs: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def getStates(): js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  def resetStates(
    states: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): scala.Unit = js.native
  def resetStates(
    states: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    training: scala.Boolean
  ): scala.Unit = js.native
  def resetStates(
    states: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Unit = js.native
  def resetStates(
    states: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    training: scala.Boolean
  ): scala.Unit = js.native
  def setStates(
    states: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "RNN")
@js.native
object RNN extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict,
    customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
}

