package typings.tensorflowTfjsLayers.inputLayerMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
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
    batchSize: js.UndefOr[Double] = js.undefined,
    dtype: DataType = null,
    inputShape: Shape = null,
    name: String = null,
    sparse: js.UndefOr[Boolean] = js.undefined
  ): InputLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(sparse)) __obj.updateDynamic("sparse")(sparse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputLayerArgs]
  }
}

