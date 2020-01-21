package typings.tensorflowTfjsLayers.mergeMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "multiply")
@js.native
object multiply extends js.Object {
  def apply(): Layer | SymbolicTensor | Tensor_[Rank] = js.native
  def apply(config: js.Array[SymbolicTensor | Tensor_[Rank]]): Layer | SymbolicTensor | Tensor_[Rank] = js.native
  def apply(config: LayerArgs): Layer | SymbolicTensor | Tensor_[Rank] = js.native
}

