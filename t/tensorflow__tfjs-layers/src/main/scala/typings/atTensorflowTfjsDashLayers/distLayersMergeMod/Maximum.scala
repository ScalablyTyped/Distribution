package typings.atTensorflowTfjsDashLayers.distLayersMergeMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Maximum")
@js.native
class Maximum () extends Merge {
  def this(args: LayerArgs) = this()
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "Maximum")
@js.native
object Maximum extends js.Object {
  /** @nocollapse */
  var className: String = js.native
}

@JSImport("@tensorflow/tfjs-layers/dist/layers/merge", "maximum")
@js.native
object maximum extends js.Object {
  def apply(): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def apply(config: js.Array[SymbolicTensor | Tensor[Rank]]): Layer | SymbolicTensor | Tensor[Rank] = js.native
  def apply(config: LayerArgs): Layer | SymbolicTensor | Tensor[Rank] = js.native
}

