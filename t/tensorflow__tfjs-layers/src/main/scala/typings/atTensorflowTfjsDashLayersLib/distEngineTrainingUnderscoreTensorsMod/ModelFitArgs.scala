package typings
package atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreTensorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelFitArgs extends js.Object {
  /**
    * Number of samples per gradient update. If unspecified, it
    * will default to 32.
    */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * List of callbacks to be called during training.
    * Can have one or more of the following callbacks:
    *   - `onTrainBegin(logs)`: called when training starts.
    *   - `onTrainEnd(logs)`: called when training ends.
    *   - `onEpochBegin(epoch, logs)`: called at the start of every epoch.
    *   - `onEpochEnd(epoch, logs)`: called at the end of every epoch.
    *   - `onBatchBegin(batch, logs)`: called at the start of every batch.
    *   - `onBatchEnd(batch, logs)`: called at the end of every batch.
    *   - `onYield(epoch, batch, logs)`: called every `yieldEvery` milliseconds
    *      with the current epoch, batch and logs. The logs are the same
    *      as in `onBatchEnd()`. Note that `onYield` can skip batches or
    *      epochs. See also docs for `yieldEvery` below.
    */
  var callbacks: js.UndefOr[
    (js.Array[
      atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.BaseCallback | atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.CustomCallbackArgs
    ]) | atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.CustomCallbackArgs
  ] = js.undefined
  /**
    * Optional dictionary mapping class indices (integers) to
    * a weight (float) to apply to the model's loss for the samples from this
    * class during training. This can be useful to tell the model to "pay more
    * attention" to samples from an under-represented class.
    */
  var classWeight: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  /** The number of times to iterate over the training data arrays. */
  var epochs: js.UndefOr[scala.Double] = js.undefined
  /**
    * Epoch at which to start training (useful for resuming a previous training
    * run).
    */
  var initialEpoch: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional array of the same length as x, containing
    * weights to apply to the model's loss for each sample. In the case of
    * temporal data, you can pass a 2D array with shape (samples,
    * sequenceLength), to apply a different weight to every timestep of every
    * sample. In this case you should make sure to specify
    * sampleWeightMode="temporal" in compile().
    */
  var sampleWeight: js.UndefOr[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.undefined
  /**
    * Whether to shuffle the training data before each epoch. Has
    * no effect when `stepsPerEpoch` is not `null`.
    */
  var shuffle: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Total number of steps (batches of samples) before
    * declaring one epoch finished and starting the next epoch. When training
    * with Input Tensors such as TensorFlow data tensors, the default `null` is
    * equal to the number of unique samples in your dataset divided by the
    * batch size, or 1 if that cannot be determined.
    */
  var stepsPerEpoch: js.UndefOr[scala.Double] = js.undefined
  /**
    * Data on which to evaluate the loss and any model
    * metrics at the end of each epoch. The model will not be trained on this
    * data. This could be a tuple [xVal, yVal] or a tuple [xVal, yVal,
    * valSampleWeights]. The model will not be trained on this data.
    * `validationData` will override `validationSplit`.
    */
  var validationData: js.UndefOr[
    (js.Tuple2[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
        atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ]), 
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
        atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ])
    ]) | (js.Tuple3[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
        atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ]), 
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
        atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ]), 
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
        atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ])
    ])
  ] = js.undefined
  /**
    * Float between 0 and 1: fraction of the training data
    * to be used as validation data. The model will set apart this fraction of
    * the training data, will not train on it, and will evaluate the loss and
    * any model metrics on this data at the end of each epoch.
    * The validation data is selected from the last samples in the `x` and `y`
    * data provided, before shuffling.
    */
  var validationSplit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Only relevant if `stepsPerEpoch` is specified. Total number of steps
    * (batches of samples) to validate before stopping.
    */
  var validationSteps: js.UndefOr[scala.Double] = js.undefined
  /**
    * Verbosity level.
    *
    * Expected to be 0, 1, or 2. Default: 1.
    *
    * 0 - No printed message during fit() call.
    * 1 - In Node.js (tfjs-node), prints the progress bar, together with
    *     real-time updates of loss and metric values and training speed.
    *     In the browser: no action. This is the default.
    * 2 - Not implemented yet.
    */
  var verbose: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity
  ] = js.undefined
  /**
    * Configures the frequency of yielding the main thread to other tasks.
    *
    * In the browser environment, yielding the main thread can improve the
    * responsiveness of the page during training. In the Node.js environment,
    * it can ensure tasks queued in the event loop can be handled in a timely
    * manner.
    *
    * The value can be one of the following:
    *   - `'auto'`: The yielding happens at a certain frame rate (currently set
    *               at 125ms). This is the default.
    *   - `'batch'`: yield every batch.
    *   - `'epoch'`: yield every epoch.
    *   - any `number`: yield every `number` milliseconds.
    *   - `'never'`: never yield. (yielding can still happen through `await
    *      nextFrame()` calls in custom callbacks.)
    */
  var yieldEvery: js.UndefOr[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.YieldEveryOptions] = js.undefined
}

object ModelFitArgs {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    callbacks: (js.Array[
      atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.BaseCallback | atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.CustomCallbackArgs
    ]) | atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.CustomCallbackArgs = null,
    classWeight: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    epochs: scala.Int | scala.Double = null,
    initialEpoch: scala.Int | scala.Double = null,
    sampleWeight: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] = null,
    shuffle: js.UndefOr[scala.Boolean] = js.undefined,
    stepsPerEpoch: scala.Int | scala.Double = null,
    validationData: (js.Tuple2[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
        atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ]), 
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
        atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ])
    ]) | (js.Tuple3[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
        atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ]), 
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
        atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ]), 
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
        atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
      ])
    ]) = null,
    validationSplit: scala.Int | scala.Double = null,
    validationSteps: scala.Int | scala.Double = null,
    verbose: atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity = null,
    yieldEvery: atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.YieldEveryOptions = null
  ): ModelFitArgs = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (classWeight != null) __obj.updateDynamic("classWeight")(classWeight)
    if (epochs != null) __obj.updateDynamic("epochs")(epochs.asInstanceOf[js.Any])
    if (initialEpoch != null) __obj.updateDynamic("initialEpoch")(initialEpoch.asInstanceOf[js.Any])
    if (sampleWeight != null) __obj.updateDynamic("sampleWeight")(sampleWeight)
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle)
    if (stepsPerEpoch != null) __obj.updateDynamic("stepsPerEpoch")(stepsPerEpoch.asInstanceOf[js.Any])
    if (validationData != null) __obj.updateDynamic("validationData")(validationData.asInstanceOf[js.Any])
    if (validationSplit != null) __obj.updateDynamic("validationSplit")(validationSplit.asInstanceOf[js.Any])
    if (validationSteps != null) __obj.updateDynamic("validationSteps")(validationSteps.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose)
    if (yieldEvery != null) __obj.updateDynamic("yieldEvery")(yieldEvery.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelFitArgs]
  }
}

