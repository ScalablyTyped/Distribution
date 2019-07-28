package typings.atTensorflowTfjsDashLayers.distEngineInputUnderscoreLayerMod

import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputLayerArgs extends js.Object {
  /** Batch input shape, including the batch axis. */
  var batchInputShape: js.UndefOr[Shape] = js.undefined
  /** Optional input batch size (integer or null). */
  var batchSize: js.UndefOr[Double] = js.undefined
  /** Datatype of the input.  */
  var dtype: js.UndefOr[DataType] = js.undefined
  /** Input shape, not including the batch axis. */
  var inputShape: js.UndefOr[Shape] = js.undefined
  /** Name of the layer. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Whether the placeholder created is meant to be sparse.
    */
  var sparse: js.UndefOr[Boolean] = js.undefined
}

object InputLayerArgs {
  @scala.inline
  def apply(
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    dtype: DataType = null,
    inputShape: Shape = null,
    name: String = null,
    sparse: js.UndefOr[Boolean] = js.undefined
  ): InputLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse)
    __obj.asInstanceOf[InputLayerArgs]
  }
}

