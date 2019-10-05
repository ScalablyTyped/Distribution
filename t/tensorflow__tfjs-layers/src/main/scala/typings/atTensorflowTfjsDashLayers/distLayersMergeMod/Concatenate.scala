package typings.atTensorflowTfjsDashLayers.distLayersMergeMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersNumbers.`-1`
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Concatenate")
@js.native
class Concatenate () extends Merge {
  def this(args: ConcatenateLayerArgs) = this()
  val DEFAULT_AXIS: `-1` = js.native
  val axis: js.Any = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Concatenate")
@js.native
object Concatenate extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "concatenate")
@js.native
object concatenate extends js.Object {
  def apply(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def apply(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def apply(config: ConcatenateLayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
}

