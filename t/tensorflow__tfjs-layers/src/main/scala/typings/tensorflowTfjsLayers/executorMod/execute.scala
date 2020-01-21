package typings.tensorflowTfjsLayers.executorMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.distTypesMod.Kwargs
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "execute")
@js.native
object execute extends js.Object {
  def apply(fetches: js.Array[SymbolicTensor], feedDict: FeedDict): Tensor_[Rank] | (js.Array[js.Array[Tensor_[Rank]] | Tensor_[Rank]]) = js.native
  def apply(fetches: js.Array[SymbolicTensor], feedDict: FeedDict, kwargs: Kwargs): Tensor_[Rank] | (js.Array[js.Array[Tensor_[Rank]] | Tensor_[Rank]]) = js.native
  def apply(fetches: js.Array[SymbolicTensor], feedDict: FeedDict, kwargs: Kwargs, probe: ExecutionProbe): Tensor_[Rank] | (js.Array[js.Array[Tensor_[Rank]] | Tensor_[Rank]]) = js.native
  def apply(fetches: SymbolicTensor, feedDict: FeedDict): Tensor_[Rank] | (js.Array[js.Array[Tensor_[Rank]] | Tensor_[Rank]]) = js.native
  def apply(fetches: SymbolicTensor, feedDict: FeedDict, kwargs: Kwargs): Tensor_[Rank] | (js.Array[js.Array[Tensor_[Rank]] | Tensor_[Rank]]) = js.native
  def apply(fetches: SymbolicTensor, feedDict: FeedDict, kwargs: Kwargs, probe: ExecutionProbe): Tensor_[Rank] | (js.Array[js.Array[Tensor_[Rank]] | Tensor_[Rank]]) = js.native
}

