package typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.Anon_Constants
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor
import typings.atTensorflowTfjsDashLayers.distTypesMod.RnnStepFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def rnn(stepFunction: RnnStepFunction, inputs: Tensor[Rank], initialStates: js.Array[Tensor[Rank]]): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = js.native
  def rnn(
    stepFunction: RnnStepFunction,
    inputs: Tensor[Rank],
    initialStates: js.Array[Tensor[Rank]],
    goBackwards: Boolean
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = js.native
  def rnn(
    stepFunction: RnnStepFunction,
    inputs: Tensor[Rank],
    initialStates: js.Array[Tensor[Rank]],
    goBackwards: Boolean,
    mask: Tensor[Rank]
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = js.native
  def rnn(
    stepFunction: RnnStepFunction,
    inputs: Tensor[Rank],
    initialStates: js.Array[Tensor[Rank]],
    goBackwards: Boolean,
    mask: Tensor[Rank],
    constants: js.Array[Tensor[Rank]]
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = js.native
  def rnn(
    stepFunction: RnnStepFunction,
    inputs: Tensor[Rank],
    initialStates: js.Array[Tensor[Rank]],
    goBackwards: Boolean,
    mask: Tensor[Rank],
    constants: js.Array[Tensor[Rank]],
    unroll: Boolean
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = js.native
  def rnn(
    stepFunction: RnnStepFunction,
    inputs: Tensor[Rank],
    initialStates: js.Array[Tensor[Rank]],
    goBackwards: Boolean,
    mask: Tensor[Rank],
    constants: js.Array[Tensor[Rank]],
    unroll: Boolean,
    needPerStepOutputs: Boolean
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], js.Array[Tensor[Rank]]] = js.native
  def standardizeArgs(
    inputs: Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor,
    initialState: Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor,
    constants: Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor
  ): Anon_Constants = js.native
  def standardizeArgs(
    inputs: Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor,
    initialState: Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor,
    constants: Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor,
    numConstants: Double
  ): Anon_Constants = js.native
}

