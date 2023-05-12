package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typings.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typings.tensorflowTfjsCore.distIoTypesMod.SaveConfig
import typings.tensorflowTfjsCore.distIoTypesMod.SaveResult
import typings.tensorflowTfjsCore.distModelTypesMod.ModelPredictConfig
import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorTypesMod.NamedTensorMap
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Optimizer
import typings.tensorflowTfjsLayers.distBaseCallbacksMod.BaseCallback
import typings.tensorflowTfjsLayers.distBaseCallbacksMod.History
import typings.tensorflowTfjsLayers.distBaseCallbacksMod.ModelLoggingVerbosity
import typings.tensorflowTfjsLayers.distEngineContainerMod.Container
import typings.tensorflowTfjsLayers.distEngineContainerMod.ContainerArgs
import typings.tensorflowTfjsLayers.distEngineDatasetStubMod.Dataset
import typings.tensorflowTfjsLayers.distEngineTrainingDatasetMod.ModelEvaluateDatasetArgs
import typings.tensorflowTfjsLayers.distEngineTrainingDatasetMod.ModelFitDatasetArgs
import typings.tensorflowTfjsLayers.distEngineTrainingTensorsMod.ModelFitArgs
import typings.tensorflowTfjsLayers.distEngineTrainingUtilsMod.ClassWeight
import typings.tensorflowTfjsLayers.distEngineTrainingUtilsMod.ClassWeightMap
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.distKerasFormatTrainingConfigMod.TrainingConfig
import typings.tensorflowTfjsLayers.distTypesMod.LossOrMetricFn
import typings.tensorflowTfjsLayers.distTypesMod.NamedTensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEngineTrainingMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/training", "Functional")
  @js.native
  open class Functional protected () extends LayersModel {
    def this(args: ContainerArgs) = this()
  }
  /* static members */
  object Functional {
    
    @JSImport("@tensorflow/tfjs-layers/dist/engine/training", "Functional")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-layers/dist/engine/training", "Functional.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.tensorflowTfjsCore.distModelTypesMod.InferenceModel because var conflicts: inputs, outputs. Inlined execute, execute, execute, execute, execute, execute, predict, predict, predict */ @JSImport("@tensorflow/tfjs-layers/dist/engine/training", "LayersModel")
  @js.native
  open class LayersModel protected () extends Container {
    def this(args: ContainerArgs) = this()
    
    /**
      * Get number of samples provided for training, evaluation or prediction.
      *
      * @param ins Input `tf.Tensor`.
      * @param batchSize Integer batch size, optional.
      * @param steps Total number of steps (batches of samples) before
      * declaring loop finished. Optional.
      * @param stepsName The public API's parameter name for `steps`.
      * @returns Number of samples provided.
      */
    /* private */ var checkNumSamples: Any = js.native
    
    /**
      * Check trainable weights count consistency.
      *
      * This will raise a warning if `this.trainableWeights` and
      * `this.collectedTrainableWeights` are inconsistent (i.e., have different
      * numbers of parameters).
      * Inconsistency will typically arise when one modifies `model.trainable`
      * without calling `model.compile()` again.
      */
    /* protected */ def checkTrainableWeightsConsistency(): Unit = js.native
    
    /* private */ var collectedTrainableWeights: Any = js.native
    
    /**
      * Configures and prepares the model for training and evaluation.  Compiling
      * outfits the model with an optimizer, loss, and/or metrics.  Calling `fit`
      * or `evaluate` on an un-compiled model will throw an error.
      *
      * @param args a `ModelCompileArgs` specifying the loss, optimizer, and
      * metrics to be used for fitting and evaluating this model.
      *
      * @doc {heading: 'Models', subheading: 'Classes'}
      */
    def compile(args: ModelCompileArgs): Unit = js.native
    
    def evaluate(x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]]): Scalar | js.Array[Scalar] = js.native
    def evaluate(x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]], args: ModelEvaluateArgs): Scalar | js.Array[Scalar] = js.native
    def evaluate(x: js.Array[Tensor[Rank]], y: Tensor[Rank]): Scalar | js.Array[Scalar] = js.native
    def evaluate(x: js.Array[Tensor[Rank]], y: Tensor[Rank], args: ModelEvaluateArgs): Scalar | js.Array[Scalar] = js.native
    def evaluate(x: Tensor[Rank], y: js.Array[Tensor[Rank]]): Scalar | js.Array[Scalar] = js.native
    def evaluate(x: Tensor[Rank], y: js.Array[Tensor[Rank]], args: ModelEvaluateArgs): Scalar | js.Array[Scalar] = js.native
    /**
      * Returns the loss value & metrics values for the model in test mode.
      *
      * Loss and metrics are specified during `compile()`, which needs to happen
      * before calls to `evaluate()`.
      *
      * Computation is done in batches.
      *
      * ```js
      * const model = tf.sequential({
      *   layers: [tf.layers.dense({units: 1, inputShape: [10]})]
      * });
      * model.compile({optimizer: 'sgd', loss: 'meanSquaredError'});
      * const result = model.evaluate(
      *     tf.ones([8, 10]), tf.ones([8, 1]), {batchSize: 4});
      * result.print();
      * ```
      *
      * @param x `tf.Tensor` of test data, or an `Array` of `tf.Tensor`s if the
      * model has multiple inputs.
      * @param y `tf.Tensor` of target data, or an `Array` of `tf.Tensor`s if the
      * model has multiple outputs.
      * @param args A `ModelEvaluateArgs`, containing optional fields.
      *
      * @return `Scalar` test loss (if the model has a single output and no
      *   metrics) or `Array` of `Scalar`s (if the model has multiple outputs
      *   and/or metrics). The attribute `model.metricsNames`
      *   will give you the display labels for the scalar outputs.
      *
      * @doc {heading: 'Models', subheading: 'Classes'}
      */
    def evaluate(x: Tensor[Rank], y: Tensor[Rank]): Scalar | js.Array[Scalar] = js.native
    def evaluate(x: Tensor[Rank], y: Tensor[Rank], args: ModelEvaluateArgs): Scalar | js.Array[Scalar] = js.native
    
    /**
      * Evaluate model using a dataset object.
      *
      * Note: Unlike `evaluate()`, this method is asynchronous (`async`).
      *
      * @param dataset A dataset object. Its `iterator()` method is expected
      *   to generate a dataset iterator object, the `next()` method of which
      *   is expected to produce data batches for evaluation. The return value
      *   of the `next()` call ought to contain a boolean `done` field and a
      *   `value` field. The `value` field is expected to be an array of two
      *   `tf.Tensor`s or an array of two nested `tf.Tensor` structures. The former
      *   case is for models with exactly one input and one output (e.g.
      *   a sequential model). The latter case is for models with multiple
      *   inputs and/or multiple outputs. Of the two items in the array, the
      *   first is the input feature(s) and the second is the output target(s).
      * @param args A configuration object for the dataset-based evaluation.
      * @returns Loss and metric values as an Array of `Scalar` objects.
      *
      * @doc {heading: 'Models', subheading: 'Classes'}
      */
    def evaluateDataset(dataset: Dataset[js.Object]): js.Promise[Scalar | js.Array[Scalar]] = js.native
    def evaluateDataset(dataset: Dataset[js.Object], args: ModelEvaluateDatasetArgs): js.Promise[Scalar | js.Array[Scalar]] = js.native
    
    def execute(inputs: js.Array[Tensor[Rank]], outputs: String): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def execute(inputs: js.Array[Tensor[Rank]], outputs: js.Array[String]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    /**
      * Execute internal tensors of the model with input data feed.
      * @param inputs Input data feed. Must match the inputs of the model.
      * @param outputs Names of the output tensors to be fetched. Must match
      *   names of the SymbolicTensors that belong to the graph.
      * @returns Fetched values for `outputs`.
      */
    /**
      * Single Execute the inference for the input tensors and return activation
      * values for specified output node names without batching.
      *
      * @param input The input tensors, when there is single input for the model,
      * inputs param should be a Tensor. For models with multiple inputs, inputs
      * params should be in either Tensor[] if the input order is fixed, or
      * otherwise NamedTensorMap format.
      *
      * @param outputs string|string[]. List of output node names to retrieve
      * activation from.
      *
      * @returns Activation values for the output nodes result tensors. The return
      * type matches specified parameter outputs type. The output would be single
      * Tensor if single output is specified, otherwise Tensor[] for multiple
      * outputs.
      */
    def execute(inputs: Tensor[Rank], outputs: String): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def execute(inputs: Tensor[Rank], outputs: js.Array[String]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def execute(inputs: NamedTensorMap, outputs: String): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def execute(inputs: NamedTensorMap, outputs: js.Array[String]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    
    /* private */ var feedLossFns: Any = js.native
    
    /* private */ var feedOutputShapes: Any = js.native
    
    def fit(x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]]): js.Promise[History] = js.native
    def fit(x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
    def fit(x: js.Array[Tensor[Rank]], y: StringDictionary[Tensor[Rank]]): js.Promise[History] = js.native
    def fit(x: js.Array[Tensor[Rank]], y: StringDictionary[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
    def fit(x: js.Array[Tensor[Rank]], y: Tensor[Rank]): js.Promise[History] = js.native
    def fit(x: js.Array[Tensor[Rank]], y: Tensor[Rank], args: ModelFitArgs): js.Promise[History] = js.native
    def fit(x: StringDictionary[Tensor[Rank]], y: js.Array[Tensor[Rank]]): js.Promise[History] = js.native
    def fit(x: StringDictionary[Tensor[Rank]], y: js.Array[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
    def fit(x: StringDictionary[Tensor[Rank]], y: StringDictionary[Tensor[Rank]]): js.Promise[History] = js.native
    def fit(x: StringDictionary[Tensor[Rank]], y: StringDictionary[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
    def fit(x: StringDictionary[Tensor[Rank]], y: Tensor[Rank]): js.Promise[History] = js.native
    def fit(x: StringDictionary[Tensor[Rank]], y: Tensor[Rank], args: ModelFitArgs): js.Promise[History] = js.native
    def fit(x: Tensor[Rank], y: js.Array[Tensor[Rank]]): js.Promise[History] = js.native
    def fit(x: Tensor[Rank], y: js.Array[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
    def fit(x: Tensor[Rank], y: StringDictionary[Tensor[Rank]]): js.Promise[History] = js.native
    def fit(x: Tensor[Rank], y: StringDictionary[Tensor[Rank]], args: ModelFitArgs): js.Promise[History] = js.native
    /**
      * Trains the model for a fixed number of epochs (iterations on a
      * dataset).
      *
      * ```js
      * const model = tf.sequential({
      *     layers: [tf.layers.dense({units: 1, inputShape: [10]})]
      * });
      * model.compile({optimizer: 'sgd', loss: 'meanSquaredError'});
      * for (let i = 1; i < 5 ; ++i) {
      *   const h = await model.fit(tf.ones([8, 10]), tf.ones([8, 1]), {
      *       batchSize: 4,
      *       epochs: 3
      *   });
      *   console.log("Loss after Epoch " + i + " : " + h.history.loss[0]);
      * }
      * ```
      *
      * @param x `tf.Tensor` of training data, or an array of `tf.Tensor`s if the
      * model has multiple inputs. If all inputs in the model are named, you
      * can also pass a dictionary mapping input names to `tf.Tensor`s.
      * @param y `tf.Tensor` of target (label) data, or an array of `tf.Tensor`s if
      * the model has multiple outputs. If all outputs in the model are named,
      * you can also pass a dictionary mapping output names to `tf.Tensor`s.
      * @param args A `ModelFitArgs`, containing optional fields.
      *
      * @return A `History` instance. Its `history` attribute contains all
      *   information collected during training.
      *
      * @exception ValueError In case of mismatch between the provided input
      * data and what the model expects.
      *
      * @doc {heading: 'Models', subheading: 'Classes'}
      */
    def fit(x: Tensor[Rank], y: Tensor[Rank]): js.Promise[History] = js.native
    def fit(x: Tensor[Rank], y: Tensor[Rank], args: ModelFitArgs): js.Promise[History] = js.native
    
    /**
      * Trains the model using a dataset object.
      *
      * @param dataset A dataset object. Its `iterator()` method is expected
      *   to generate a dataset iterator object, the `next()` method of which
      *   is expected to produce data batches for training. The return value
      *   of the `next()` call ought to contain a boolean `done` field and a
      *   `value` field. The `value` field is expected to be an array of two
      *   `tf.Tensor`s or an array of two nested `tf.Tensor` structures. The former
      *   case is for models with exactly one input and one output (e.g.
      *   a sequential model). The latter case is for models with multiple
      *   inputs and/or multiple outputs.
      *   Of the two items in the array, the first is the input feature(s) and
      *   the second is the output target(s).
      * @param args A `ModelFitDatasetArgs`, containing optional fields.
      *
      * @return A `History` instance. Its `history` attribute contains all
      *   information collected during training.
      *
      * @doc {heading: 'Models', subheading: 'Classes'}
      */
    def fitDataset[T](dataset: Dataset[T], args: ModelFitDatasetArgs[T]): js.Promise[History] = js.native
    
    /**
      * Abstract fit function for `f(ins)`.
      * @param f A Function returning a list of tensors. For training, this
      *   function is expected to perform the updates to the variables.
      * @param ins List of tensors to be fed to `f`.
      * @param outLabels List of strings, display names of the outputs of `f`.
      * @param batchSize Integer batch size or `== null` if unknown. Default : 32.
      * @param epochs Number of times to iterate over the data. Default : 1.
      * @param verbose Verbosity mode: 0, 1, or 2. Default: 1.
      * @param callbacks List of callbacks to be called during training.
      * @param valF Function to call for validation.
      * @param valIns List of tensors to be fed to `valF`.
      * @param shuffle Whether to shuffle the data at the beginning of every
      * epoch. Default : true.
      * @param callbackMetrics List of strings, the display names of the metrics
      *   passed to the callbacks. They should be the concatenation of the
      *   display names of the outputs of `f` and the list of display names
      *   of the outputs of `valF`.
      * @param initialEpoch Epoch at which to start training (useful for
      *   resuming a previous training run). Default : 0.
      * @param stepsPerEpoch Total number of steps (batches on samples) before
      *   declaring one epoch finished and starting the next epoch. Ignored with
      *   the default value of `undefined` or `null`.
      * @param validationSteps Number of steps to run validation for (only if
      *   doing validation from data tensors). Not applicable for tfjs-layers.
      * @returns A `History` object.
      */
    def fitLoop(
      f: js.Function1[/* data */ js.Array[Tensor[Rank]], js.Array[Scalar]],
      ins: js.Array[Tensor[Rank]],
      outLabels: js.UndefOr[js.Array[String]],
      batchSize: js.UndefOr[Double],
      epochs: js.UndefOr[Double],
      verbose: js.UndefOr[Double],
      callbacks: js.UndefOr[js.Array[BaseCallback]],
      valF: js.UndefOr[js.Function1[/* data */ js.Array[Tensor[Rank]], js.Array[Scalar]]],
      valIns: js.UndefOr[js.Array[Tensor[Rank]]],
      shuffle: js.UndefOr[Boolean | String],
      callbackMetrics: js.UndefOr[js.Array[String]],
      initialEpoch: js.UndefOr[Double],
      stepsPerEpoch: js.UndefOr[Double],
      validationSteps: js.UndefOr[Double]
    ): js.Promise[History] = js.native
    
    /* protected */ def getDedupedMetricsNames(): js.Array[String] = js.native
    
    /* private */ var getLossIdentifiers: Any = js.native
    
    /* private */ var getMetricIdentifiers: Any = js.native
    
    /**
      * Extract weight values of the model.
      *
      * @param config: An instance of `io.SaveConfig`, which specifies
      * model-saving options such as whether only trainable weights are to be
      * saved.
      * @returns A `NamedTensorMap` mapping original weight names (i.e.,
      *   non-uniqueified weight names) to their values.
      */
    /* protected */ def getNamedWeights(): js.Array[NamedTensor] = js.native
    /* protected */ def getNamedWeights(config: SaveConfig): js.Array[NamedTensor] = js.native
    
    /* protected */ def getTrainingConfig(): TrainingConfig = js.native
    
    /**
      * Get user-defined metadata.
      *
      * The metadata is supplied via one of the two routes:
      *   1. By calling `setUserDefinedMetadata()`.
      *   2. Loaded during model loading (if the model is constructed
      *      via `tf.loadLayersModel()`.)
      *
      * If no user-defined metadata is available from either of the
      * two routes, this function will return `undefined`.
      */
    def getUserDefinedMetadata(): js.Object = js.native
    
    var history: History = js.native
    
    /* protected */ var isOptimizerOwned: Boolean = js.native
    
    /* protected */ var isTraining: Boolean = js.native
    
    def loadTrainingConfig(trainingConfig: TrainingConfig): Unit = js.native
    
    var loss: String | (js.Array[LossOrMetricFn | String]) | (StringDictionary[LossOrMetricFn | String]) | LossOrMetricFn = js.native
    
    var lossFunctions: js.Array[LossOrMetricFn] = js.native
    
    /**
      * Create a function which, when invoked with an array of `tf.Tensor`s as a
      * batch of inputs, returns the prespecified loss and metrics of the model
      * under the batch of input data.
      */
    /* private */ var makeTestFunction: Any = js.native
    
    /**
      * Creates a function that performs the following actions:
      *
      * 1. computes the losses
      * 2. sums them to get the total loss
      * 3. call the optimizer computes the gradients of the LayersModel's
      *    trainable weights w.r.t. the total loss and update the variables
      * 4. calculates the metrics
      * 5. returns the values of the losses and metrics.
      */
    /* protected */ def makeTrainFunction(): js.Function1[/* data */ js.Array[Tensor[Rank]], js.Array[Scalar]] = js.native
    
    var metrics: String | LossOrMetricFn | (js.Array[String | LossOrMetricFn]) | (StringDictionary[String | LossOrMetricFn]) = js.native
    
    var metricsNames: js.Array[String] = js.native
    
    var metricsTensors: js.Array[js.Tuple2[LossOrMetricFn, Double]] = js.native
    
    def optimizer: Optimizer = js.native
    
    /* protected */ var optimizer_ : Optimizer = js.native
    
    def optimizer_=(optimizer: Optimizer): Unit = js.native
    
    def predict(inputs: NamedTensorMap, config: ModelPredictConfig): Tensor[Rank] | js.Array[Tensor[Rank]] | NamedTensorMap = js.native
    def predict(x: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    def predict(x: js.Array[Tensor[Rank]], args: ModelPredictConfig): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    /**
      * Generates output predictions for the input samples.
      *
      * Computation is done in batches.
      *
      * Note: the "step" mode of predict() is currently not supported.
      *   This is because the TensorFlow.js core backend is imperative only.
      *
      * ```js
      * const model = tf.sequential({
      *   layers: [tf.layers.dense({units: 1, inputShape: [10]})]
      * });
      * model.predict(tf.ones([8, 10]), {batchSize: 4}).print();
      * ```
      *
      * @param x The input data, as a Tensor, or an `Array` of `tf.Tensor`s if
      *   the model has multiple inputs.
      * @param args A `ModelPredictArgs` object containing optional fields.
      *
      * @return Prediction results as a `tf.Tensor`(s).
      *
      * @exception ValueError In case of mismatch between the provided input data
      *   and the model's expectations, or in case a stateful model receives a
      *   number of samples that is not a multiple of the batch size.
      *
      * @doc {heading: 'Models', subheading: 'Classes'}
      */
    def predict(x: Tensor[Rank]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    /**
      * Execute the inference for the input tensors.
      *
      * @param input The input tensors, when there is single input for the model,
      * inputs param should be a Tensor. For models with multiple inputs, inputs
      * params should be in either Tensor[] if the input order is fixed, or
      * otherwise NamedTensorMap format.
      * For batch inference execution, the tensors for each input need to be
      * concatenated together. For example with mobilenet, the required input shape
      * is [1, 244, 244, 3], which represents the [batch, height, width, channel].
      * If we are provide a batched data of 100 images, the input tensor should be
      * in the shape of [100, 244, 244, 3].
      *
      * @param config Prediction configuration for specifying the batch size.
      *
      * @returns Inference result tensors. The output would be single Tensor if
      * model has single output node, otherwise Tensor[] or NamedTensorMap[] will
      * be returned for model with multiple outputs.
      */
    def predict(x: Tensor[Rank], args: ModelPredictConfig): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    
    /**
      * Helper method to loop over some data in batches.
      *
      * Porting Note: Not using the functional approach in the Python equivalent
      *   due to the imperative backend.
      * Porting Note: Does not support step mode currently.
      *
      * @param ins: input data
      * @param batchSize: integer batch size.
      * @param verbose: verbosity model
      * @returns: Predictions as `tf.Tensor` (if a single output) or an `Array` of
      *   `tf.Tensor` (if multipe outputs).
      */
    /* private */ var predictLoop: Any = js.native
    
    def predictOnBatch(x: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    /**
      * Returns predictions for a single batch of samples.
      *
      * ```js
      * const model = tf.sequential({
      *   layers: [tf.layers.dense({units: 1, inputShape: [10]})]
      * });
      * model.predictOnBatch(tf.ones([8, 10])).print();
      * ```
      * @param x: Input samples, as a Tensor (for models with exactly one
      *   input) or an array of Tensors (for models with more than one input).
      * @return Tensor(s) of predictions
      *
      * @doc {heading: 'Models', subheading: 'Classes'}
      */
    def predictOnBatch(x: Tensor[Rank]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
    
    /**
      * Retrieve the model's internal symbolic tensors from symbolic-tensor names.
      */
    /* private */ var retrieveSymbolicTensors: Any = js.native
    
    def save(handlerOrURL: String): js.Promise[SaveResult] = js.native
    def save(handlerOrURL: String, config: SaveConfig): js.Promise[SaveResult] = js.native
    /**
      * Save the configuration and/or weights of the LayersModel.
      *
      * An `IOHandler` is an object that has a `save` method of the proper
      * signature defined. The `save` method manages the storing or
      * transmission of serialized data ("artifacts") that represent the
      * model's topology and weights onto or via a specific medium, such as
      * file downloads, local storage, IndexedDB in the web browser and HTTP
      * requests to a server. TensorFlow.js provides `IOHandler`
      * implementations for a number of frequently used saving mediums, such as
      * `tf.io.browserDownloads` and `tf.io.browserLocalStorage`. See `tf.io`
      * for more details.
      *
      * This method also allows you to refer to certain types of `IOHandler`s
      * as URL-like string shortcuts, such as 'localstorage://' and
      * 'indexeddb://'.
      *
      * Example 1: Save `model`'s topology and weights to browser [local
      * storage](https://developer.mozilla.org/en-US/docs/Web/API/Window/localStorage);
      * then load it back.
      *
      * ```js
      * const model = tf.sequential(
      *     {layers: [tf.layers.dense({units: 1, inputShape: [3]})]});
      * console.log('Prediction from original model:');
      * model.predict(tf.ones([1, 3])).print();
      *
      * const saveResults = await model.save('localstorage://my-model-1');
      *
      * const loadedModel = await tf.loadLayersModel('localstorage://my-model-1');
      * console.log('Prediction from loaded model:');
      * loadedModel.predict(tf.ones([1, 3])).print();
      * ```
      *
      * Example 2. Saving `model`'s topology and weights to browser
      * [IndexedDB](https://developer.mozilla.org/en-US/docs/Web/API/IndexedDB_API);
      * then load it back.
      *
      * ```js
      * const model = tf.sequential(
      *     {layers: [tf.layers.dense({units: 1, inputShape: [3]})]});
      * console.log('Prediction from original model:');
      * model.predict(tf.ones([1, 3])).print();
      *
      * const saveResults = await model.save('indexeddb://my-model-1');
      *
      * const loadedModel = await tf.loadLayersModel('indexeddb://my-model-1');
      * console.log('Prediction from loaded model:');
      * loadedModel.predict(tf.ones([1, 3])).print();
      * ```
      *
      * Example 3. Saving `model`'s topology and weights as two files
      * (`my-model-1.json` and `my-model-1.weights.bin`) downloaded from
      * browser.
      *
      * ```js
      * const model = tf.sequential(
      *     {layers: [tf.layers.dense({units: 1, inputShape: [3]})]});
      * const saveResults = await model.save('downloads://my-model-1');
      * ```
      *
      * Example 4. Send  `model`'s topology and weights to an HTTP server.
      * See the documentation of `tf.io.http` for more details
      * including specifying request parameters and implementation of the
      * server.
      *
      * ```js
      * const model = tf.sequential(
      *     {layers: [tf.layers.dense({units: 1, inputShape: [3]})]});
      * const saveResults = await model.save('http://my-server/model/upload');
      * ```
      *
      * @param handlerOrURL An instance of `IOHandler` or a URL-like,
      * scheme-based string shortcut for `IOHandler`.
      * @param config Options for saving the model.
      * @returns A `Promise` of `SaveResult`, which summarizes the result of
      * the saving, such as byte sizes of the saved artifacts for the model's
      *   topology and weight values.
      *
      * @doc {heading: 'Models', subheading: 'Classes', ignoreCI: true}
      */
    def save(handlerOrURL: IOHandler): js.Promise[SaveResult] = js.native
    def save(handlerOrURL: IOHandler, config: SaveConfig): js.Promise[SaveResult] = js.native
    
    /**
      * Set user-defined metadata.
      *
      * The set metadata will be serialized together with the topology
      * and weights of the model during `save()` calls.
      *
      * @param setUserDefinedMetadata
      */
    def setUserDefinedMetadata(userDefinedMetadata: js.Object): Unit = js.native
    
    /* protected */ def standardizeUserData(
      x: Tensor[Rank] | js.Array[Tensor[Rank]] | StringDictionary[Tensor[Rank]],
      y: Tensor[Rank] | js.Array[Tensor[Rank]] | StringDictionary[Tensor[Rank]],
      sampleWeight: js.UndefOr[Tensor[Rank] | js.Array[Tensor[Rank]] | StringDictionary[Tensor[Rank]]],
      classWeight: js.UndefOr[ClassWeight | js.Array[ClassWeight] | ClassWeightMap],
      checkBatchAxis: js.UndefOr[Boolean],
      batchSize: js.UndefOr[Double]
    ): js.Promise[
        js.Tuple3[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]]
      ] = js.native
    
    /* protected */ def standardizeUserDataXY(x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]]): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]], checkBatchAxis: Boolean): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]], checkBatchAxis: Boolean, batchSize: Double): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]], checkBatchAxis: Unit, batchSize: Double): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: js.Array[Tensor[Rank]], y: StringDictionary[Tensor[Rank]]): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: js.Array[Tensor[Rank]], y: StringDictionary[Tensor[Rank]], checkBatchAxis: Boolean): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(
      x: js.Array[Tensor[Rank]],
      y: StringDictionary[Tensor[Rank]],
      checkBatchAxis: Boolean,
      batchSize: Double
    ): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(
      x: js.Array[Tensor[Rank]],
      y: StringDictionary[Tensor[Rank]],
      checkBatchAxis: Unit,
      batchSize: Double
    ): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: js.Array[Tensor[Rank]], y: Tensor[Rank]): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: js.Array[Tensor[Rank]], y: Tensor[Rank], checkBatchAxis: Boolean): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: js.Array[Tensor[Rank]], y: Tensor[Rank], checkBatchAxis: Boolean, batchSize: Double): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: js.Array[Tensor[Rank]], y: Tensor[Rank], checkBatchAxis: Unit, batchSize: Double): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: StringDictionary[Tensor[Rank]], y: js.Array[Tensor[Rank]]): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: StringDictionary[Tensor[Rank]], y: js.Array[Tensor[Rank]], checkBatchAxis: Boolean): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(
      x: StringDictionary[Tensor[Rank]],
      y: js.Array[Tensor[Rank]],
      checkBatchAxis: Boolean,
      batchSize: Double
    ): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(
      x: StringDictionary[Tensor[Rank]],
      y: js.Array[Tensor[Rank]],
      checkBatchAxis: Unit,
      batchSize: Double
    ): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: StringDictionary[Tensor[Rank]], y: StringDictionary[Tensor[Rank]]): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: StringDictionary[Tensor[Rank]], y: StringDictionary[Tensor[Rank]], checkBatchAxis: Boolean): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(
      x: StringDictionary[Tensor[Rank]],
      y: StringDictionary[Tensor[Rank]],
      checkBatchAxis: Boolean,
      batchSize: Double
    ): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(
      x: StringDictionary[Tensor[Rank]],
      y: StringDictionary[Tensor[Rank]],
      checkBatchAxis: Unit,
      batchSize: Double
    ): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: StringDictionary[Tensor[Rank]], y: Tensor[Rank]): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: StringDictionary[Tensor[Rank]], y: Tensor[Rank], checkBatchAxis: Boolean): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: StringDictionary[Tensor[Rank]], y: Tensor[Rank], checkBatchAxis: Boolean, batchSize: Double): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: StringDictionary[Tensor[Rank]], y: Tensor[Rank], checkBatchAxis: Unit, batchSize: Double): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: Tensor[Rank], y: js.Array[Tensor[Rank]]): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: Tensor[Rank], y: js.Array[Tensor[Rank]], checkBatchAxis: Boolean): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: Tensor[Rank], y: js.Array[Tensor[Rank]], checkBatchAxis: Boolean, batchSize: Double): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: Tensor[Rank], y: js.Array[Tensor[Rank]], checkBatchAxis: Unit, batchSize: Double): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: Tensor[Rank], y: StringDictionary[Tensor[Rank]]): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: Tensor[Rank], y: StringDictionary[Tensor[Rank]], checkBatchAxis: Boolean): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: Tensor[Rank], y: StringDictionary[Tensor[Rank]], checkBatchAxis: Boolean, batchSize: Double): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: Tensor[Rank], y: StringDictionary[Tensor[Rank]], checkBatchAxis: Unit, batchSize: Double): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: Tensor[Rank], y: Tensor[Rank]): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: Tensor[Rank], y: Tensor[Rank], checkBatchAxis: Boolean): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: Tensor[Rank], y: Tensor[Rank], checkBatchAxis: Boolean, batchSize: Double): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    /* protected */ def standardizeUserDataXY(x: Tensor[Rank], y: Tensor[Rank], checkBatchAxis: Unit, batchSize: Double): js.Tuple2[js.Array[Tensor[Rank]], js.Array[Tensor[Rank]]] = js.native
    
    def stopTraining: Boolean = js.native
    
    /* protected */ var stopTraining_ : Boolean = js.native
    
    /**
      * Setter used for force stopping of LayersModel.fit() (i.e., training).
      *
      * Example:
      *
      * ```js
      * const input = tf.input({shape: [10]});
      * const output = tf.layers.dense({units: 1}).apply(input);
      * const model = tf.model({inputs: [input], outputs: [output]});
      * model.compile({loss: 'meanSquaredError', optimizer: 'sgd'});
      * const xs = tf.ones([8, 10]);
      * const ys = tf.zeros([8, 1]);
      *
      * const history = await model.fit(xs, ys, {
      *   epochs: 10,
      *   callbacks: {
      *     onEpochEnd: async (epoch, logs) => {
      *       if (epoch === 2) {
      *         model.stopTraining = true;
      *       }
      *     }
      *   }
      * });
      *
      * // There should be only 3 values in the loss array, instead of 10
      * values,
      * // due to the stopping after 3 epochs.
      * console.log(history.history.loss);
      * ```
      */
    def stopTraining_=(stop: Boolean): Unit = js.native
    
    /**
      * Print a text summary of the model's layers.
      *
      * The summary includes
      * - Name and type of all layers that comprise the model.
      * - Output shape(s) of the layers
      * - Number of weight parameters of each layer
      * - If the model has non-sequential-like topology, the inputs each layer
      *   receives
      * - The total number of trainable and non-trainable parameters of the model.
      *
      * ```js
      * const input1 = tf.input({shape: [10]});
      * const input2 = tf.input({shape: [20]});
      * const dense1 = tf.layers.dense({units: 4}).apply(input1);
      * const dense2 = tf.layers.dense({units: 8}).apply(input2);
      * const concat = tf.layers.concatenate().apply([dense1, dense2]);
      * const output =
      *     tf.layers.dense({units: 3, activation: 'softmax'}).apply(concat);
      *
      * const model = tf.model({inputs: [input1, input2], outputs: output});
      * model.summary();
      * ```
      *
      * @param lineLength Custom line length, in number of characters.
      * @param positions Custom widths of each of the columns, as either
      *   fractions of `lineLength` (e.g., `[0.5, 0.75, 1]`) or absolute number
      *   of characters (e.g., `[30, 50, 65]`). Each number corresponds to
      *   right-most (i.e., ending) position of a column.
      * @param printFn Custom print function. Can be used to replace the default
      *   `console.log`. For example, you can use `x => {}` to mute the printed
      *   messages in the console.
      *
      * @doc {heading: 'Models', subheading: 'Classes'}
      */
    def summary(): Unit = js.native
    def summary(lineLength: Double): Unit = js.native
    def summary(lineLength: Double, positions: js.Array[Double]): Unit = js.native
    def summary(
      lineLength: Double,
      positions: js.Array[Double],
      printFn: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
    ): Unit = js.native
    def summary(
      lineLength: Double,
      positions: Unit,
      printFn: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
    ): Unit = js.native
    def summary(lineLength: Unit, positions: js.Array[Double]): Unit = js.native
    def summary(
      lineLength: Unit,
      positions: js.Array[Double],
      printFn: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
    ): Unit = js.native
    def summary(
      lineLength: Unit,
      positions: Unit,
      printFn: js.Function2[/* message */ js.UndefOr[Any], /* repeated */ Any, Unit]
    ): Unit = js.native
    
    /* private */ var testFunction: Any = js.native
    
    /**
      * Loop over some test data in batches.
      * @param f A Function returning a list of tensors.
      * @param ins Array of tensors to be fed to `f`.
      * @param batchSize Integer batch size or `null` / `undefined`.
      * @param verbose verbosity mode.
      * @param steps Total number of steps (batches of samples) before
      * declaring test finished. Ignored with the default value of `null` /
      * `undefined`.
      * @returns Array of Scalars.
      */
    /* private */ var testLoop: Any = js.native
    
    def trainOnBatch(x: js.Array[Tensor[Rank]], y: js.Array[Tensor[Rank]]): js.Promise[Double | js.Array[Double]] = js.native
    def trainOnBatch(x: js.Array[Tensor[Rank]], y: StringDictionary[Tensor[Rank]]): js.Promise[Double | js.Array[Double]] = js.native
    def trainOnBatch(x: js.Array[Tensor[Rank]], y: Tensor[Rank]): js.Promise[Double | js.Array[Double]] = js.native
    def trainOnBatch(x: StringDictionary[Tensor[Rank]], y: js.Array[Tensor[Rank]]): js.Promise[Double | js.Array[Double]] = js.native
    def trainOnBatch(x: StringDictionary[Tensor[Rank]], y: StringDictionary[Tensor[Rank]]): js.Promise[Double | js.Array[Double]] = js.native
    def trainOnBatch(x: StringDictionary[Tensor[Rank]], y: Tensor[Rank]): js.Promise[Double | js.Array[Double]] = js.native
    def trainOnBatch(x: Tensor[Rank], y: js.Array[Tensor[Rank]]): js.Promise[Double | js.Array[Double]] = js.native
    def trainOnBatch(x: Tensor[Rank], y: StringDictionary[Tensor[Rank]]): js.Promise[Double | js.Array[Double]] = js.native
    /**
      * Runs a single gradient update on a single batch of data.
      *
      * This method differs from `fit()` and `fitDataset()` in the following
      * regards:
      *   - It operates on exactly one batch of data.
      *   - It returns only the loss and metric values, instead of
      *     returning the batch-by-batch loss and metric values.
      *   - It doesn't support fine-grained options such as verbosity and
      *     callbacks.
      *
      * @param x Input data. It could be one of the following:
      *   - A `tf.Tensor`, or an Array of `tf.Tensor`s (in case the model has
      *     multiple inputs).
      *   - An Object mapping input names to corresponding `tf.Tensor` (if the
      *     model has named inputs).
      * @param y Target data. It could be either a `tf.Tensor` or multiple
      *   `tf.Tensor`s. It should be consistent with `x`.
      * @returns Training loss or losses (in case the model has
      *   multiple outputs), along with metrics (if any), as numbers.
      *
      * @doc {heading: 'Models', subheading: 'Classes'}
      */
    def trainOnBatch(x: Tensor[Rank], y: Tensor[Rank]): js.Promise[Double | js.Array[Double]] = js.native
    
    /* private */ var userDefinedMetadata: Any = js.native
  }
  /* static members */
  object LayersModel {
    
    @JSImport("@tensorflow/tfjs-layers/dist/engine/training", "LayersModel")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/engine/training", "LayersModel.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  inline def checkArrayLengths(inputs: js.Array[Tensor[Rank]], targets: js.Array[Tensor[Rank]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArrayLengths")(inputs.asInstanceOf[js.Any], targets.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def checkArrayLengths(inputs: js.Array[Tensor[Rank]], targets: js.Array[Tensor[Rank]], weights: js.Array[Tensor[Rank]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArrayLengths")(inputs.asInstanceOf[js.Any], targets.asInstanceOf[js.Any], weights.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def collectMetrics(metrics: String, outputNames: js.Array[String]): js.Array[js.Array[String | LossOrMetricFn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectMetrics")(metrics.asInstanceOf[js.Any], outputNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | LossOrMetricFn]]]
  inline def collectMetrics(metrics: js.Array[String | LossOrMetricFn], outputNames: js.Array[String]): js.Array[js.Array[String | LossOrMetricFn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectMetrics")(metrics.asInstanceOf[js.Any], outputNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | LossOrMetricFn]]]
  inline def collectMetrics(metrics: StringDictionary[String | LossOrMetricFn], outputNames: js.Array[String]): js.Array[js.Array[String | LossOrMetricFn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectMetrics")(metrics.asInstanceOf[js.Any], outputNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | LossOrMetricFn]]]
  inline def collectMetrics(metrics: LossOrMetricFn, outputNames: js.Array[String]): js.Array[js.Array[String | LossOrMetricFn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("collectMetrics")(metrics.asInstanceOf[js.Any], outputNames.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[String | LossOrMetricFn]]]
  
  inline def isDataArray(x: js.Array[Tensor[Rank]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataArray")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDataArray(x: StringDictionary[Tensor[Rank]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataArray")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDataArray(x: Tensor[Rank]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataArray")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDataDict(x: js.Array[Tensor[Rank]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataDict")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDataDict(x: StringDictionary[Tensor[Rank]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataDict")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDataDict(x: Tensor[Rank]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataDict")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDataTensor(x: js.Array[Tensor[Rank]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataTensor")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDataTensor(x: StringDictionary[js.Array[Tensor[Rank]] | Tensor[Rank]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataTensor")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDataTensor(x: Tensor[Rank]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataTensor")(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def standardizeInputData(data: js.Array[Tensor[Rank]], names: js.Array[String]): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(data: js.Array[Tensor[Rank]], names: js.Array[String], shapes: js.Array[Shape]): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: js.Array[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: js.Array[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any], exceptionPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: js.Array[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Unit,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any], exceptionPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(data: js.Array[Tensor[Rank]], names: js.Array[String], shapes: Unit, checkBatchAxis: Boolean): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: js.Array[Tensor[Rank]],
    names: js.Array[String],
    shapes: Unit,
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any], exceptionPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: js.Array[Tensor[Rank]],
    names: js.Array[String],
    shapes: Unit,
    checkBatchAxis: Unit,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any], exceptionPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(data: StringDictionary[Tensor[Rank]], names: js.Array[String]): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(data: StringDictionary[Tensor[Rank]], names: js.Array[String], shapes: js.Array[Shape]): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: StringDictionary[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: StringDictionary[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any], exceptionPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: StringDictionary[Tensor[Rank]],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Unit,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any], exceptionPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: StringDictionary[Tensor[Rank]],
    names: js.Array[String],
    shapes: Unit,
    checkBatchAxis: Boolean
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: StringDictionary[Tensor[Rank]],
    names: js.Array[String],
    shapes: Unit,
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any], exceptionPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: StringDictionary[Tensor[Rank]],
    names: js.Array[String],
    shapes: Unit,
    checkBatchAxis: Unit,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any], exceptionPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(data: Tensor[Rank], names: js.Array[String]): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(data: Tensor[Rank], names: js.Array[String], shapes: js.Array[Shape]): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(data: Tensor[Rank], names: js.Array[String], shapes: js.Array[Shape], checkBatchAxis: Boolean): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: Tensor[Rank],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any], exceptionPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: Tensor[Rank],
    names: js.Array[String],
    shapes: js.Array[Shape],
    checkBatchAxis: Unit,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any], exceptionPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(data: Tensor[Rank], names: js.Array[String], shapes: Unit, checkBatchAxis: Boolean): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: Tensor[Rank],
    names: js.Array[String],
    shapes: Unit,
    checkBatchAxis: Boolean,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any], exceptionPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  inline def standardizeInputData(
    data: Tensor[Rank],
    names: js.Array[String],
    shapes: Unit,
    checkBatchAxis: Unit,
    exceptionPrefix: String
  ): js.Array[Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("standardizeInputData")(data.asInstanceOf[js.Any], names.asInstanceOf[js.Any], shapes.asInstanceOf[js.Any], checkBatchAxis.asInstanceOf[js.Any], exceptionPrefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[Tensor[Rank]]]
  
  trait ModelCompileArgs extends StObject {
    
    /**
      * Object function(s) or name(s) of object function(s).
      * If the model has multiple outputs, you can use a different loss
      * on each output by passing a dictionary or an Array of losses.
      * The loss value that will be minimized by the model will then be the sum
      * of all individual losses.
      */
    var loss: String | (js.Array[LossOrMetricFn | String]) | (StringDictionary[LossOrMetricFn | String]) | LossOrMetricFn
    
    /**
      * List of metrics to be evaluated by the model during training and testing.
      * Typically you will use `metrics=['accuracy']`.
      * To specify different metrics for different outputs of a multi-output
      * model, you could also pass a dictionary.
      */
    var metrics: js.UndefOr[
        String | LossOrMetricFn | (js.Array[String | LossOrMetricFn]) | (StringDictionary[String | LossOrMetricFn])
      ] = js.undefined
    
    /**
      * An instance of `tf.train.Optimizer` or a string name for an Optimizer.
      */
    var optimizer: String | Optimizer
  }
  object ModelCompileArgs {
    
    inline def apply(
      loss: String | (js.Array[LossOrMetricFn | String]) | (StringDictionary[LossOrMetricFn | String]) | LossOrMetricFn,
      optimizer: String | Optimizer
    ): ModelCompileArgs = {
      val __obj = js.Dynamic.literal(loss = loss.asInstanceOf[js.Any], optimizer = optimizer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelCompileArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelCompileArgs] (val x: Self) extends AnyVal {
      
      inline def setLoss(
        value: String | (js.Array[LossOrMetricFn | String]) | (StringDictionary[LossOrMetricFn | String]) | LossOrMetricFn
      ): Self = StObject.set(x, "loss", value.asInstanceOf[js.Any])
      
      inline def setLossFunction2(value: (/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank]) => Tensor[Rank]): Self = StObject.set(x, "loss", js.Any.fromFunction2(value))
      
      inline def setLossVarargs(value: (LossOrMetricFn | String)*): Self = StObject.set(x, "loss", js.Array(value*))
      
      inline def setMetrics(
        value: String | LossOrMetricFn | (js.Array[String | LossOrMetricFn]) | (StringDictionary[String | LossOrMetricFn])
      ): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsFunction2(value: (/* yTrue */ Tensor[Rank], /* yPred */ Tensor[Rank]) => Tensor[Rank]): Self = StObject.set(x, "metrics", js.Any.fromFunction2(value))
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setMetricsVarargs(value: (String | LossOrMetricFn)*): Self = StObject.set(x, "metrics", js.Array(value*))
      
      inline def setOptimizer(value: String | Optimizer): Self = StObject.set(x, "optimizer", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModelEvaluateArgs extends StObject {
    
    /**
      * Batch size (Integer). If unspecified, it will default to 32.
      */
    var batchSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Tensor of weights to weight the contribution of different samples to the
      * loss and metrics.
      */
    var sampleWeight: js.UndefOr[Tensor[Rank]] = js.undefined
    
    /**
      * integer: total number of steps (batches of samples)
      * before declaring the evaluation round finished. Ignored with the default
      * value of `undefined`.
      */
    var steps: js.UndefOr[Double] = js.undefined
    
    /**
      * Verbosity mode.
      */
    var verbose: js.UndefOr[ModelLoggingVerbosity] = js.undefined
  }
  object ModelEvaluateArgs {
    
    inline def apply(): ModelEvaluateArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelEvaluateArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelEvaluateArgs] (val x: Self) extends AnyVal {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setSampleWeight(value: Tensor[Rank]): Self = StObject.set(x, "sampleWeight", value.asInstanceOf[js.Any])
      
      inline def setSampleWeightUndefined: Self = StObject.set(x, "sampleWeight", js.undefined)
      
      inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
      
      inline def setVerbose(value: ModelLoggingVerbosity): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
}
