package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseRNNLayerArgs extends LayerArgs {
  /**
    * A RNN cell instance. A RNN cell is a class that has:
    *   - a `call()` method, which takes `[Tensor, Tensor]` as the
    *     first input argument. The first item is the input at time t, and
    *     second item is the cell state at time t.
    *     The `call()` method returns `[outputAtT, statesAtTPlus1]`.
    *     The `call()` method of the cell can also take the argument `constants`,
    *     see section "Note on passing external constants" below.
    *     Porting Node: PyKeras overrides the `call()` signature of RNN cells,
    *       which are Layer subtypes, to accept two arguments. tfjs-layers does
    *       not do such overriding. Instead we preseve the `call()` signature,
    *       which due to its `Tensor|Tensor[]` argument and return value, is
    *       flexible enough to handle the inputs and states.
    *   - a `stateSize` attribute. This can be a single integer (single state)
    *     in which case it is the size of the recurrent state (which should be
    *     the same as the size of the cell output). This can also be an Array of
    *     integers (one size per state). In this case, the first entry
    *     (`stateSize[0]`) should be the same as the size of the cell output.
    * It is also possible for `cell` to be a list of RNN cell instances, in which
    * case the cells get stacked on after the other in the RNN, implementing an
    * efficient stacked RNN.
    */
  var cell: js.UndefOr[RNNCell | js.Array[RNNCell]] = js.undefined
  /**
    * If `true`, process the input sequence backwards and return the reversed
    * sequence (default: `false`).
    */
  var goBackwards: js.UndefOr[Boolean] = js.undefined
  /**
    * Dimensionality of the input (integer).
    *   This option (or alternatively, the option `inputShape`) is required when
    *   this layer is used as the first layer in a model.
    */
  var inputDim: js.UndefOr[Double] = js.undefined
  /**
    * Length of the input sequences, to be specified when it is constant.
    * This argument is required if you are going to connect `Flatten` then
    * `Dense` layers upstream (without it, the shape of the dense outputs cannot
    * be computed). Note that if the recurrent layer is not the first layer in
    * your model, you would need to specify the input length at the level of the
    * first layer (e.g., via the `inputShape` option).
    */
  var inputLength: js.UndefOr[Double] = js.undefined
  /**
    * Whether to return the last output in the output sequence, or the full
    * sequence.
    */
  var returnSequences: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to return the last state in addition to the output.
    */
  var returnState: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the last state for each sample at index i in a batch will be
    * used as initial state of the sample of index i in the following batch
    * (default: `false`).
    *
    * You can set RNN layers to be "stateful", which means that the states
    * computed for the samples in one batch will be reused as initial states
    * for the samples in the next batch. This assumes a one-to-one mapping
    * between samples in different successive batches.
    *
    * To enable "statefulness":
    *   - specify `stateful: true` in the layer constructor.
    *   - specify a fixed batch size for your model, by passing
    *     - if sequential model:
    *       `batchInputShape: [...]` to the first layer in your model.
    *     - else for functional model with 1 or more Input layers:
    *       `batchShape: [...]` to all the first layers in your model.
    *     This is the expected shape of your inputs
    *     *including the batch size*.
    *     It should be a tuple of integers, e.g., `[32, 10, 100]`.
    *   - specify `shuffle: false` when calling `LayersModel.fit()`.
    *
    * To reset the state of your model, call `resetStates()` on either the
    * specific layer or on the entire model.
    */
  var stateful: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the network will be unrolled, else a symbolic loop will be
    * used. Unrolling can speed-up a RNN, although it tends to be more memory-
    * intensive. Unrolling is only suitable for short sequences (default:
    * `false`).
    * Porting Note: tfjs-layers has an imperative backend. RNNs are executed with
    *   normal TypeScript control flow. Hence this property is inapplicable and
    *   ignored in tfjs-layers.
    */
  var unroll: js.UndefOr[Boolean] = js.undefined
}

object BaseRNNLayerArgs {
  @scala.inline
  def apply(
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    cell: RNNCell | js.Array[RNNCell] = null,
    dtype: DataType = null,
    goBackwards: js.UndefOr[Boolean] = js.undefined,
    inputDType: DataType = null,
    inputDim: Int | Double = null,
    inputLength: Int | Double = null,
    inputShape: Shape = null,
    name: String = null,
    returnSequences: js.UndefOr[Boolean] = js.undefined,
    returnState: js.UndefOr[Boolean] = js.undefined,
    stateful: js.UndefOr[Boolean] = js.undefined,
    trainable: js.UndefOr[Boolean] = js.undefined,
    unroll: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor[Rank]] = null
  ): BaseRNNLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (!js.isUndefined(goBackwards)) __obj.updateDynamic("goBackwards")(goBackwards.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputDim != null) __obj.updateDynamic("inputDim")(inputDim.asInstanceOf[js.Any])
    if (inputLength != null) __obj.updateDynamic("inputLength")(inputLength.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSequences)) __obj.updateDynamic("returnSequences")(returnSequences.asInstanceOf[js.Any])
    if (!js.isUndefined(returnState)) __obj.updateDynamic("returnState")(returnState.asInstanceOf[js.Any])
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (!js.isUndefined(unroll)) __obj.updateDynamic("unroll")(unroll.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRNNLayerArgs]
  }
}

