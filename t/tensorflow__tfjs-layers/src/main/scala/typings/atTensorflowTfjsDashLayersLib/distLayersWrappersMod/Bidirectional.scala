package typings
package atTensorflowTfjsDashLayersLib.distLayersWrappersMod

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
  var mergeMode: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.BidirectionalMergeMode = js.native
  var numConstants: js.UndefOr[js.Any] = js.native
  var returnSequences: js.Any = js.native
  var returnState: js.Any = js.native
  def resetStates(
    states: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): scala.Unit = js.native
  def resetStates(
    states: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): scala.Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/layers/wrappers", "Bidirectional")
@js.native
object Bidirectional extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
  /** @nocollapse */
  def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable */](
    cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
    config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
  ): T = js.native
}

