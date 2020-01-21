package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.AnonConstants
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "standardizeArgs")
@js.native
object standardizeArgs extends js.Object {
  def apply(
    inputs: Tensor_[Rank] | (js.Array[SymbolicTensor | Tensor_[Rank]]) | SymbolicTensor,
    initialState: Tensor_[Rank] | (js.Array[SymbolicTensor | Tensor_[Rank]]) | SymbolicTensor,
    constants: Tensor_[Rank] | (js.Array[SymbolicTensor | Tensor_[Rank]]) | SymbolicTensor
  ): AnonConstants = js.native
  def apply(
    inputs: Tensor_[Rank] | (js.Array[SymbolicTensor | Tensor_[Rank]]) | SymbolicTensor,
    initialState: Tensor_[Rank] | (js.Array[SymbolicTensor | Tensor_[Rank]]) | SymbolicTensor,
    constants: Tensor_[Rank] | (js.Array[SymbolicTensor | Tensor_[Rank]]) | SymbolicTensor,
    numConstants: Double
  ): AnonConstants = js.native
}

