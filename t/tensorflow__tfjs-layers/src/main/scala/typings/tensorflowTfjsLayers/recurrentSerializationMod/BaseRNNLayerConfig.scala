package typings.tensorflowTfjsLayers.recurrentSerializationMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyConfigMod.LayerConfig
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
    batch_size: js.UndefOr[Double] = js.undefined,
    cell: RNNCellSerialization | js.Array[RNNCellSerialization] = null,
    dtype: DataType = null,
    go_backwards: js.UndefOr[Boolean] = js.undefined,
    input_dim: js.UndefOr[Double] = js.undefined,
    input_dtype: DataType = null,
    input_length: js.UndefOr[Double] = js.undefined,
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
    if (!js.isUndefined(batch_size)) __obj.updateDynamic("batch_size")(batch_size.get.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (!js.isUndefined(go_backwards)) __obj.updateDynamic("go_backwards")(go_backwards.get.asInstanceOf[js.Any])
    if (!js.isUndefined(input_dim)) __obj.updateDynamic("input_dim")(input_dim.get.asInstanceOf[js.Any])
    if (input_dtype != null) __obj.updateDynamic("input_dtype")(input_dtype.asInstanceOf[js.Any])
    if (!js.isUndefined(input_length)) __obj.updateDynamic("input_length")(input_length.get.asInstanceOf[js.Any])
    if (input_shape != null) __obj.updateDynamic("input_shape")(input_shape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(return_sequences)) __obj.updateDynamic("return_sequences")(return_sequences.get.asInstanceOf[js.Any])
    if (!js.isUndefined(return_state)) __obj.updateDynamic("return_state")(return_state.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unroll)) __obj.updateDynamic("unroll")(unroll.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRNNLayerConfig]
  }
}

