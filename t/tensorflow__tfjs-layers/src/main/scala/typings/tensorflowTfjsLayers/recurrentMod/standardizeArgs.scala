package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.anon.Constants
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/recurrent", "standardizeArgs")
@js.native
object standardizeArgs extends js.Object {
  def apply(
    inputs: Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor,
    initialState: Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor,
    constants: Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor,
    numConstants: js.UndefOr[Double]
  ): Constants = js.native
}

