package typings.atTensorflowTfjsDashLayers.distLayersMergeMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def add(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def add(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def add(config: LayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def average(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def average(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def average(config: LayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def concatenate(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def concatenate(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def concatenate(config: ConcatenateLayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def maximum(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def maximum(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def maximum(config: LayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def minimum(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def minimum(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def minimum(config: LayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def multiply(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def multiply(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def multiply(config: LayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
}

