package typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatLayersRecurrentUnderscoreSerializationMod

import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatTopologyUnderscoreConfigMod.LayerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseRNNLayerConfig extends LayerConfig {
  var cell: js.UndefOr[RNNCellSerialization | js.Array[RNNCellSerialization]] = js.undefined
  var go_backwards: js.UndefOr[Boolean] = js.undefined
  var input_dim: js.UndefOr[Double] = js.undefined
  var input_length: js.UndefOr[Double] = js.undefined
  var return_sequences: js.UndefOr[Boolean] = js.undefined
  var return_state: js.UndefOr[Boolean] = js.undefined
  var stateful: js.UndefOr[Boolean] = js.undefined
  var unroll: js.UndefOr[Boolean] = js.undefined
}

object BaseRNNLayerConfig {
  @scala.inline
  def apply(
    batch_input_shape: Shape = null,
    batch_size: Int | Double = null,
    cell: RNNCellSerialization | js.Array[RNNCellSerialization] = null,
    dtype: DataType = null,
    go_backwards: js.UndefOr[Boolean] = js.undefined,
    input_dim: Int | Double = null,
    input_dtype: DataType = null,
    input_length: Int | Double = null,
    input_shape: Shape = null,
    name: String = null,
    return_sequences: js.UndefOr[Boolean] = js.undefined,
    return_state: js.UndefOr[Boolean] = js.undefined,
    stateful: js.UndefOr[Boolean] = js.undefined,
    trainable: js.UndefOr[Boolean] = js.undefined,
    unroll: js.UndefOr[Boolean] = js.undefined
  ): BaseRNNLayerConfig = {
    val __obj = js.Dynamic.literal()
    if (batch_input_shape != null) __obj.updateDynamic("batch_input_shape")(batch_input_shape.asInstanceOf[js.Any])
    if (batch_size != null) __obj.updateDynamic("batch_size")(batch_size.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (!js.isUndefined(go_backwards)) __obj.updateDynamic("go_backwards")(go_backwards.asInstanceOf[js.Any])
    if (input_dim != null) __obj.updateDynamic("input_dim")(input_dim.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (input_length != null) __obj.updateDynamic("input_length")(input_length.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(return_sequences)) __obj.updateDynamic("return_sequences")(return_sequences.asInstanceOf[js.Any])
    if (!js.isUndefined(return_state)) __obj.updateDynamic("return_state")(return_state.asInstanceOf[js.Any])
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (!js.isUndefined(unroll)) __obj.updateDynamic("unroll")(unroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRNNLayerConfig]
  }
}

