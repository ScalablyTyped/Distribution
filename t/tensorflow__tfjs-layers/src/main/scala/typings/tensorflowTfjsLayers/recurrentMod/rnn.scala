package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.distTypesMod.RnnStepFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

