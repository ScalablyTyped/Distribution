package typings.atTensorflowTfjsDashLayers.distLayersWrappersMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serializationNs.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.BidirectionalMergeMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "Bidirectional")
@js.native
class Bidirectional protected () extends Wrapper {
  def this(args: BidirectionalLayerArgs) = this()
  var _trainable: js.Any = js.native
  var backwardLayer: js.Any = js.native
  var forwardLayer: js.Any = js.native
  var mergeMode: BidirectionalMergeMode = js.native
  var numConstants: js.UndefOr[js.Any] = js.native
  var returnSequences: js.Any = js.native
  var returnState: js.Any = js.native
  def resetStates(states: js.Array[Tensor[Rank]]): Unit = js.native
  def resetStates(states: Tensor[Rank]): Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "Bidirectional")
@js.native
object Bidirectional extends js.Object {
  /** @nocollapse */
  var className: String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
}

