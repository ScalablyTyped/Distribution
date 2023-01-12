package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distBaseCallbacksMod.BaseCallback
import typings.tensorflowTfjsLayers.distBaseCallbacksMod.CustomCallbackArgs
import typings.tensorflowTfjsLayers.distBaseCallbacksMod.History
import typings.tensorflowTfjsLayers.distBaseCallbacksMod.ModelLoggingVerbosity
import typings.tensorflowTfjsLayers.distBaseCallbacksMod.YieldEveryOptions
import typings.tensorflowTfjsLayers.distEngineDatasetStubMod.Dataset
import typings.tensorflowTfjsLayers.distEngineDatasetStubMod.LazyIterator
import typings.tensorflowTfjsLayers.distEngineTrainingUtilsMod.ClassWeight
import typings.tensorflowTfjsLayers.distEngineTrainingUtilsMod.ClassWeightMap
import typings.tensorflowTfjsLayers.distTypesMod.TensorOrArrayOrMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEngineTrainingDatasetMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training_dataset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluateDataset[T](model: Any, dataset: Dataset[T], args: ModelEvaluateDatasetArgs): js.Promise[Scalar | js.Array[Scalar]] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateDataset")(model.asInstanceOf[js.Any], dataset.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scalar | js.Array[Scalar]]]
  inline def evaluateDataset[T](model: Any, dataset: LazyIterator[T], args: ModelEvaluateDatasetArgs): js.Promise[Scalar | js.Array[Scalar]] = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateDataset")(model.asInstanceOf[js.Any], dataset.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Scalar | js.Array[Scalar]]]
  
  inline def fitDataset[T](model: Any, dataset: Dataset[T], args: ModelFitDatasetArgs[T]): js.Promise[History] = (^.asInstanceOf[js.Dynamic].applyDynamic("fitDataset")(model.asInstanceOf[js.Any], dataset.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[History]]
  
  trait FitDatasetElement extends StObject {
    
    var xs: TensorOrArrayOrMap
    
    var ys: TensorOrArrayOrMap
  }
  object FitDatasetElement {
    
    inline def apply(xs: TensorOrArrayOrMap, ys: TensorOrArrayOrMap): FitDatasetElement = {
      val __obj = js.Dynamic.literal(xs = xs.asInstanceOf[js.Any], ys = ys.asInstanceOf[js.Any])
      __obj.asInstanceOf[FitDatasetElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FitDatasetElement] (val x: Self) extends AnyVal {
      
      inline def setXs(value: TensorOrArrayOrMap): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "xs", js.Array(value*))
      
      inline def setYs(value: TensorOrArrayOrMap): Self = StObject.set(x, "ys", value.asInstanceOf[js.Any])
      
      inline def setYsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "ys", js.Array(value*))
    }
  }
  
  trait ModelEvaluateDatasetArgs extends StObject {
    
    /**
      * Number of batches to draw from the dataset object before ending the
      * evaluation.
      */
    var batches: js.UndefOr[Double] = js.undefined
    
    /**
      * Verbosity mode.
      */
    var verbose: js.UndefOr[ModelLoggingVerbosity] = js.undefined
  }
  object ModelEvaluateDatasetArgs {
    
    inline def apply(): ModelEvaluateDatasetArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelEvaluateDatasetArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelEvaluateDatasetArgs] (val x: Self) extends AnyVal {
      
      inline def setBatches(value: Double): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
      
      inline def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
      
      inline def setVerbose(value: ModelLoggingVerbosity): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait ModelFitDatasetArgs[T] extends StObject {
    
    /**
      * (Optional) Total number of steps (batches of samples) before
      * declaring one epoch finished and starting the next epoch. It should
      * typically be equal to the number of samples of your dataset divided by
      * the batch size, so that `fitDataset`() call can utilize the entire dataset.
      * If it is not provided, use `done` return value in `iterator.next()` as
      * signal to finish an epoch.
      */
    var batchesPerEpoch: js.UndefOr[Double] = js.undefined
    
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
      * or an object that maps model output names (e.g., `model.outputNames[0]`)
      * to weight objects.
      */
    var classWeight: js.UndefOr[ClassWeight | js.Array[ClassWeight] | ClassWeightMap] = js.undefined
    
    /**
      * Integer number of times to iterate over the training dataset.
      */
    var epochs: Double
    
    /**
      * Epoch at which to start training (useful for resuming a previous training
      * run). When this is used, `epochs` is the index of the "final epoch".
      * The model is not trained for a number of iterations given by `epochs`,
      * but merely until the epoch of index `epochs` is reached.
      */
    var initialEpoch: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional batch size for validation.
      *
      * Used only if `validationData` is an array of `tf.Tensor` objects, i.e., not
      * a dataset object.
      *
      * If not specified, its value defaults to 32.
      */
    var validationBatchSize: js.UndefOr[Double] = js.undefined
    
    /**
      * (Optional) Only relevant if `validationData` is specified and is a dataset
      * object.
      *
      * Total number of batches of samples to draw from `validationData` for
      * validation purpose before stopping at the end of every epoch. If not
      * specified, `evaluateDataset` will use `iterator.next().done` as signal to
      * stop validation.
      */
    var validationBatches: js.UndefOr[Double] = js.undefined
    
    /**
      * Data on which to evaluate the loss and any model
      * metrics at the end of each epoch. The model will not be trained on this
      * data. This could be any of the following:
      *
      *   - An array `[xVal, yVal]`, where the two values may be `tf.Tensor`,
      *     an array of Tensors, or a map of string to Tensor.
      *   - Similarly, an array ` [xVal, yVal, valSampleWeights]`
      *     (not implemented yet).
      *   - a `Dataset` object with elements of the form `{xs: xVal, ys: yVal}`,
      *     where `xs` and `ys` are the feature and label tensors, respectively.
      *
      * If `validationData` is an Array of Tensor objects, each `tf.Tensor` will be
      * sliced into batches during validation, using the parameter
      * `validationBatchSize` (which defaults to 32). The entirety of the
      * `tf.Tensor` objects will be used in the validation.
      *
      * If `validationData` is a dataset object, and the `validationBatches`
      * parameter is specified, the validation will use `validationBatches` batches
      * drawn from the dataset object. If `validationBatches` parameter is not
      * specified, the validation will stop when the dataset is exhausted.
      *
      * The model will not be trained on this data.
      */
    var validationData: js.UndefOr[
        (js.Tuple2[TensorOrArrayOrMap, TensorOrArrayOrMap]) | (js.Tuple3[TensorOrArrayOrMap, TensorOrArrayOrMap, TensorOrArrayOrMap]) | Dataset[T]
      ] = js.undefined
    
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
      *   - a `number`: Will yield every `number` milliseconds.
      *   - `'never'`: never yield. (But yielding can still happen through `await
      *      nextFrame()` calls in custom callbacks.)
      */
    var yieldEvery: js.UndefOr[YieldEveryOptions] = js.undefined
  }
  object ModelFitDatasetArgs {
    
    inline def apply[T](epochs: Double): ModelFitDatasetArgs[T] = {
      val __obj = js.Dynamic.literal(epochs = epochs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelFitDatasetArgs[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelFitDatasetArgs[?], T] (val x: Self & ModelFitDatasetArgs[T]) extends AnyVal {
      
      inline def setBatchesPerEpoch(value: Double): Self = StObject.set(x, "batchesPerEpoch", value.asInstanceOf[js.Any])
      
      inline def setBatchesPerEpochUndefined: Self = StObject.set(x, "batchesPerEpoch", js.undefined)
      
      inline def setCallbacks(value: (js.Array[BaseCallback | CustomCallbackArgs]) | CustomCallbackArgs): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksUndefined: Self = StObject.set(x, "callbacks", js.undefined)
      
      inline def setCallbacksVarargs(value: (BaseCallback | CustomCallbackArgs)*): Self = StObject.set(x, "callbacks", js.Array(value*))
      
      inline def setClassWeight(value: ClassWeight | js.Array[ClassWeight] | ClassWeightMap): Self = StObject.set(x, "classWeight", value.asInstanceOf[js.Any])
      
      inline def setClassWeightUndefined: Self = StObject.set(x, "classWeight", js.undefined)
      
      inline def setClassWeightVarargs(value: ClassWeight*): Self = StObject.set(x, "classWeight", js.Array(value*))
      
      inline def setEpochs(value: Double): Self = StObject.set(x, "epochs", value.asInstanceOf[js.Any])
      
      inline def setInitialEpoch(value: Double): Self = StObject.set(x, "initialEpoch", value.asInstanceOf[js.Any])
      
      inline def setInitialEpochUndefined: Self = StObject.set(x, "initialEpoch", js.undefined)
      
      inline def setValidationBatchSize(value: Double): Self = StObject.set(x, "validationBatchSize", value.asInstanceOf[js.Any])
      
      inline def setValidationBatchSizeUndefined: Self = StObject.set(x, "validationBatchSize", js.undefined)
      
      inline def setValidationBatches(value: Double): Self = StObject.set(x, "validationBatches", value.asInstanceOf[js.Any])
      
      inline def setValidationBatchesUndefined: Self = StObject.set(x, "validationBatches", js.undefined)
      
      inline def setValidationData(
        value: (js.Tuple2[TensorOrArrayOrMap, TensorOrArrayOrMap]) | (js.Tuple3[TensorOrArrayOrMap, TensorOrArrayOrMap, TensorOrArrayOrMap]) | Dataset[T]
      ): Self = StObject.set(x, "validationData", value.asInstanceOf[js.Any])
      
      inline def setValidationDataUndefined: Self = StObject.set(x, "validationData", js.undefined)
      
      inline def setVerbose(value: ModelLoggingVerbosity): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setYieldEvery(value: YieldEveryOptions): Self = StObject.set(x, "yieldEvery", value.asInstanceOf[js.Any])
      
      inline def setYieldEveryUndefined: Self = StObject.set(x, "yieldEvery", js.undefined)
    }
  }
}
