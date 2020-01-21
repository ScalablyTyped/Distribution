package typings.tensorflowTfjsLayers.trainingTensorsMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.baseCallbacksMod.BaseCallback
import typings.tensorflowTfjsLayers.baseCallbacksMod.CustomCallbackArgs
import typings.tensorflowTfjsLayers.baseCallbacksMod.ModelLoggingVerbosity
import typings.tensorflowTfjsLayers.baseCallbacksMod.YieldEveryOptions
import typings.tensorflowTfjsLayers.trainingUtilsMod.ClassWeight
import typings.tensorflowTfjsLayers.trainingUtilsMod.ClassWeightMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelFitArgs extends js.Object {
  /**
    * Number of samples per gradient update. If unspecified, it
    * will default to 32.
    */
  var batchSize: js.UndefOr[Double] = js.undefined
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
  var callbacks: js.UndefOr[(js.Array[BaseCallback | CustomCallbackArgs]) | CustomCallbackArgs] = js.undefined
  /**
    * Optional object mapping class indices (integers) to
    * a weight (float) to apply to the model's loss for the samples from this
    * class during training. This can be useful to tell the model to "pay more
    * attention" to samples from an under-represented class.
    *
    * If the model has multiple outputs, a class weight can be specified for
    * each of the outputs by setting this field an array of weight object
    * or a object that maps model output names (e.g., `model.outputNames[0]`)
    * to weight objects.
    */
  var classWeight: js.UndefOr[ClassWeight | js.Array[ClassWeight] | ClassWeightMap] = js.undefined
  /** The number of times to iterate over the training data arrays. */
  var epochs: js.UndefOr[Double] = js.undefined
  /**
    * Epoch at which to start training (useful for resuming a previous training
    * run).
    */
  var initialEpoch: js.UndefOr[Double] = js.undefined
  /**
    * Optional array of the same length as x, containing
    * weights to apply to the model's loss for each sample. In the case of
    * temporal data, you can pass a 2D array with shape (samples,
    * sequenceLength), to apply a different weight to every timestep of every
    * sample. In this case you should make sure to specify
    * sampleWeightMode="temporal" in compile().
    */
  var sampleWeight: js.UndefOr[Tensor_[Rank]] = js.undefined
  /**
    * Whether to shuffle the training data before each epoch. Has
    * no effect when `stepsPerEpoch` is not `null`.
    */
  var shuffle: js.UndefOr[Boolean] = js.undefined
  /**
    * Total number of steps (batches of samples) before
    * declaring one epoch finished and starting the next epoch. When training
    * with Input Tensors such as TensorFlow data tensors, the default `null` is
    * equal to the number of unique samples in your dataset divided by the
    * batch size, or 1 if that cannot be determined.
    */
  var stepsPerEpoch: js.UndefOr[Double] = js.undefined
  /**
    * Data on which to evaluate the loss and any model
    * metrics at the end of each epoch. The model will not be trained on this
    * data. This could be a tuple [xVal, yVal] or a tuple [xVal, yVal,
    * valSampleWeights]. The model will not be trained on this data.
    * `validationData` will override `validationSplit`.
    */
  var validationData: js.UndefOr[
    (js.Tuple2[Tensor_[Rank] | js.Array[Tensor_[Rank]], Tensor_[Rank] | js.Array[Tensor_[Rank]]]) | (js.Tuple3[
      Tensor_[Rank] | js.Array[Tensor_[Rank]], 
      Tensor_[Rank] | js.Array[Tensor_[Rank]], 
      Tensor_[Rank] | js.Array[Tensor_[Rank]]
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
  var validationSplit: js.UndefOr[Double] = js.undefined
  /**
    * Only relevant if `stepsPerEpoch` is specified. Total number of steps
    * (batches of samples) to validate before stopping.
    */
  var validationSteps: js.UndefOr[Double] = js.undefined
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
  var verbose: js.UndefOr[ModelLoggingVerbosity] = js.undefined
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
  var yieldEvery: js.UndefOr[YieldEveryOptions] = js.undefined
}

object ModelFitArgs {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    callbacks: (js.Array[BaseCallback | CustomCallbackArgs]) | CustomCallbackArgs = null,
    classWeight: ClassWeight | js.Array[ClassWeight] | ClassWeightMap = null,
    epochs: Int | Double = null,
    initialEpoch: Int | Double = null,
    sampleWeight: Tensor_[Rank] = null,
    shuffle: js.UndefOr[Boolean] = js.undefined,
    stepsPerEpoch: Int | Double = null,
    validationData: (js.Tuple2[Tensor_[Rank] | js.Array[Tensor_[Rank]], Tensor_[Rank] | js.Array[Tensor_[Rank]]]) | (js.Tuple3[
      Tensor_[Rank] | js.Array[Tensor_[Rank]], 
      Tensor_[Rank] | js.Array[Tensor_[Rank]], 
      Tensor_[Rank] | js.Array[Tensor_[Rank]]
    ]) = null,
    validationSplit: Int | Double = null,
    validationSteps: Int | Double = null,
    verbose: ModelLoggingVerbosity = null,
    yieldEvery: YieldEveryOptions = null
  ): ModelFitArgs = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (classWeight != null) __obj.updateDynamic("classWeight")(classWeight.asInstanceOf[js.Any])
    if (epochs != null) __obj.updateDynamic("epochs")(epochs.asInstanceOf[js.Any])
    if (initialEpoch != null) __obj.updateDynamic("initialEpoch")(initialEpoch.asInstanceOf[js.Any])
    if (sampleWeight != null) __obj.updateDynamic("sampleWeight")(sampleWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(shuffle)) __obj.updateDynamic("shuffle")(shuffle.asInstanceOf[js.Any])
    if (stepsPerEpoch != null) __obj.updateDynamic("stepsPerEpoch")(stepsPerEpoch.asInstanceOf[js.Any])
    if (validationData != null) __obj.updateDynamic("validationData")(validationData.asInstanceOf[js.Any])
    if (validationSplit != null) __obj.updateDynamic("validationSplit")(validationSplit.asInstanceOf[js.Any])
    if (validationSteps != null) __obj.updateDynamic("validationSteps")(validationSteps.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (yieldEvery != null) __obj.updateDynamic("yieldEvery")(yieldEvery.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelFitArgs]
  }
}

