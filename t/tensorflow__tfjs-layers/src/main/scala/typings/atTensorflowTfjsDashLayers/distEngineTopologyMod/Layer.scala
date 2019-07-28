package typings.atTensorflowTfjsDashLayers.distEngineTopologyMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serializationNs.Serializable
import typings.atTensorflowTfjsDashCore.distTensorMod.Scalar
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distConstraintsMod.Constraint
import typings.atTensorflowTfjsDashLayers.distInitializersMod.Initializer
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import typings.atTensorflowTfjsDashLayers.distRegularizersMod.Regularizer
import typings.atTensorflowTfjsDashLayers.distTypesMod.Kwargs
import typings.atTensorflowTfjsDashLayers.distTypesMod.RegularizerFn
import typings.atTensorflowTfjsDashLayers.distVariablesMod.LayerVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/engine/topology", "Layer")
@js.native
abstract class Layer protected () extends Serializable {
  def this(args: LayerArgs) = this()
  var _addedWeightNames: js.Any = js.native
  var _built: js.Any = js.native
  var _callHook: js.Any = js.native
  var _losses: js.Any = js.native
  var _nonTrainableWeights: js.Any = js.native
  var _refCount: Double | Null = js.native
  var _stateful: Boolean = js.native
  var _trainableWeights: js.Array[LayerVariable] = js.native
  var _updates: js.Any = js.native
  var activityRegularizer: Regularizer = js.native
  /**
    * Internal method to create an inbound node for the layer.
    *
    * @param inputTensors List of input tensors.
    * @param outputTensors List of output tensors.
    * @param inputMasks List of input masks (a mask can be a tensor, or null).
    * @param outputMasks List of output masks (a mask can be a tensor, or null).
    * @param inputShapes List of input shape tuples.
    * @param outputShapes List of output shape tuples.
    * @param kwargs Dictionary of keyword arguments that were passed to the
    *   `call` method of the layer at the call that created the node.
    */
  var addInboundNode: js.Any = js.native
  var batchInputShape: Shape = js.native
  var built: Boolean = js.native
  var dtype: DataType = js.native
  var fastWeightInitDuringBuild: js.Any = js.native
  /**
    * Returns this.inboundNode at index nodeIndex.
    *
    * Porting note: This is a replacement for _get_node_attribute_at_index()
    * @param nodeIndex
    * @param attrName The name of the attribute related to request for this node.
    */
  var getNodeAtIndex: js.Any = js.native
  val id: Double = js.native
  var inboundNodes: js.Array[Node] = js.native
  var initialWeights: js.Array[Tensor[Rank]] = js.native
  /**
    * Retrieves the input tensor(s) of a layer.
    *
    * Only applicable if the layer has exactly one inbound node,
    * i.e. if it is connected to one incoming layer.
    *
    * @return Input tensor or list of input tensors.
    *
    * @exception AttributeError if the layer is connected to more than one
    *   incoming layers.
    */
  val input: SymbolicTensor | js.Array[SymbolicTensor] = js.native
  /**
    * List of InputSpec class instances.
    *
    * Each entry describes one required input:
    * - ndim
    * - dtype
    * A layer with `n` input tensors must have an `inputSpec` of length `n`.
    */
  var inputSpec: js.Array[InputSpec] = js.native
  val losses: js.Array[RegularizerFn] = js.native
  /** Name for this layer. Must be unique within a model. */
  var name: String = js.native
  var nonTrainableWeights: js.Array[LayerVariable] = js.native
  var outboundNodes: js.Array[Node] = js.native
  /**
    * Retrieves the output tensor(s) of a layer.
    *
    * Only applicable if the layer has exactly one inbound node,
    * i.e. if it is connected to one incoming layer.
    *
    * @return Output tensor or list of output tensors.
    *
    * @exception AttributeError if the layer is connected to more than one
    *   incoming layers.
    */
  val output: SymbolicTensor | js.Array[SymbolicTensor] = js.native
  /**
    * Retrieves the output shape(s) of a layer.
    *
    * Only applicable if the layer has only one inbound node, or if all inbound
    * nodes have the same output shape.
    *
    * @returns Output shape or shapes.
    * @throws AttributeError: if the layer is connected to more than one incoming
    *   nodes.
    */
  /** @doc {heading: 'Models', 'subheading': 'Classes'} */
  val outputShape: Shape | js.Array[Shape] = js.native
  val stateful: Boolean = js.native
  var supportsMasking: Boolean = js.native
  var trainable: Boolean = js.native
  var trainableWeights: js.Array[LayerVariable] = js.native
  /** Whether the layer weights will be updated during training. */
  var trainable_ : Boolean = js.native
  val updates: js.Array[Tensor[Rank]] = js.native
  /**
    * The concatenation of the lists trainableWeights and nonTrainableWeights
    * (in this order).
    */
  val weights: js.Array[LayerVariable] = js.native
  def addLoss(losses: js.Array[RegularizerFn]): Unit = js.native
  /**
    * Add losses to the layer.
    *
    * The loss may potentionally be conditional on some inputs tensors,
    * for instance activity losses are conditional on the layer's inputs.
    */
  /** @doc {heading: 'Models', 'subheading': 'Classes'} */
  def addLoss(losses: RegularizerFn): Unit = js.native
  /**
    * Adds a weight variable to the layer.
    *
    * @param name Name of the new weight variable.
    * @param shape The shape of the weight.
    * @param dtype The dtype of the weight.
    * @param initializer An initializer instance.
    * @param regularizer A regularizer instance.
    * @param trainable Whether the weight should be trained via backprop or not
    *   (assuming that the layer itself is also trainable).
    * @param constraint An optional trainable.
    * @return The created weight variable.
    */
  /** @doc {heading: 'Models', 'subheading': 'Classes'} */
  /* protected */ def addWeight(name: String, shape: Shape): LayerVariable = js.native
  /* protected */ def addWeight(name: String, shape: Shape, dtype: DataType): LayerVariable = js.native
  /* protected */ def addWeight(name: String, shape: Shape, dtype: DataType, initializer: Initializer): LayerVariable = js.native
  /* protected */ def addWeight(name: String, shape: Shape, dtype: DataType, initializer: Initializer, regularizer: Regularizer): LayerVariable = js.native
  /* protected */ def addWeight(
    name: String,
    shape: Shape,
    dtype: DataType,
    initializer: Initializer,
    regularizer: Regularizer,
    trainable: Boolean
  ): LayerVariable = js.native
  /* protected */ def addWeight(
    name: String,
    shape: Shape,
    dtype: DataType,
    initializer: Initializer,
    regularizer: Regularizer,
    trainable: Boolean,
    constraint: Constraint
  ): LayerVariable = js.native
  @JSName("apply")
  def apply(inputs: js.Array[SymbolicTensor | Tensor[Rank]]): Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor = js.native
  @JSName("apply")
  def apply(inputs: js.Array[SymbolicTensor | Tensor[Rank]], kwargs: Kwargs): Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor = js.native
  /**
    * Builds or executes a `Layer's logic.
    *
    * When called with `tf.Tensor`(s), execute the `Layer`s computation and
    * return Tensor(s). For example:
    *
    * ```js
    * const denseLayer = tf.layers.dense({
    *   units: 1,
    *   kernelInitializer: 'zeros',
    *   useBias: false
    * });
    *
    * // Invoke the layer's apply() method with a `tf.Tensor` (with concrete
    * // numeric values).
    * const input = tf.ones([2, 2]);
    * const output = denseLayer.apply(input);
    *
    * // The output's value is expected to be [[0], [0]], due to the fact that
    * // the dense layer has a kernel initialized to all-zeros and does not have
    * // a bias.
    * output.print();
    * ```
    *
    * When called with `tf.SymbolicTensor`(s), this will prepare the layer for
    * future execution.  This entails internal book-keeping on shapes of
    * expected Tensors, wiring layers together, and initializing weights.
    *
    * Calling `apply` with `tf.SymbolicTensor`s are typically used during the
    * building of non-`tf.Sequential` models. For example:
    *
    * ```js
    * const flattenLayer = tf.layers.flatten();
    * const denseLayer = tf.layers.dense({units: 1});
    *
    * // Use tf.layers.input() to obtain a SymbolicTensor as input to apply().
    * const input = tf.input({shape: [2, 2]});
    * const output1 = flattenLayer.apply(input);
    *
    * // output1.shape is [null, 4]. The first dimension is the undetermined
    * // batch size. The second dimension comes from flattening the [2, 2]
    * // shape.
    * console.log(JSON.stringify(output1.shape));
    *
    * // The output SymbolicTensor of the flatten layer can be used to call
    * // the apply() of the dense layer:
    * const output2 = denseLayer.apply(output1);
    *
    * // output2.shape is [null, 1]. The first dimension is the undetermined
    * // batch size. The second dimension matches the number of units of the
    * // dense layer.
    * console.log(JSON.stringify(output2.shape));
    *
    * // The input and output and be used to construct a model that consists
    * // of the flatten and dense layers.
    * const model = tf.model({inputs: input, outputs: output2});
    * ```
    *
    * @param inputs a `tf.Tensor` or `tf.SymbolicTensor` or an Array of them.
    * @param kwargs Additional keyword arguments to be passed to `call()`.
    *
    * @return Output of the layer's `call` method.
    *
    * @exception ValueError error in case the layer is missing shape information
    *   for its `build` call.
    */
  /** @doc {heading: 'Models', 'subheading': 'Classes'} */
  @JSName("apply")
  def apply(inputs: Tensor[Rank]): Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor = js.native
  @JSName("apply")
  def apply(inputs: Tensor[Rank], kwargs: Kwargs): Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor = js.native
  @JSName("apply")
  def apply(inputs: SymbolicTensor): Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor = js.native
  @JSName("apply")
  def apply(inputs: SymbolicTensor, kwargs: Kwargs): Tensor[Rank] | (js.Array[SymbolicTensor | Tensor[Rank]]) | SymbolicTensor = js.native
  /* protected */ def assertInputCompatibility(inputs: js.Array[SymbolicTensor | Tensor[Rank]]): Unit = js.native
  /**
    * Checks compatibility between the layer and provided inputs.
    *
    * This checks that the tensor(s) `input`
    * verify the input assumptions of the layer
    * (if any). If not, exceptions are raised.
    *
    * @param inputs Input tensor or list of input tensors.
    *
    * @exception ValueError in case of mismatch between
    *   the provided inputs and the expectations of the layer.
    */
  /* protected */ def assertInputCompatibility(inputs: Tensor[Rank]): Unit = js.native
  /* protected */ def assertInputCompatibility(inputs: SymbolicTensor): Unit = js.native
  /* protected */ def assertNotDisposed(): Unit = js.native
  /**
    * Creates the layer weights.
    *
    * Must be implemented on all layers that have weights.
    *
    * Called when apply() is called to construct the weights.
    *
    * @param inputShape A `Shape` or array of `Shape` (unused).
    */
  /** @doc {heading: 'Models', 'subheading': 'Classes'} */
  def build(inputShape: js.Array[Shape] | Shape): Unit = js.native
  /**
    * Retrieves the Layer's current loss values.
    *
    * Used for regularizers during training.
    */
  def calculateLosses(): js.Array[Scalar] = js.native
  def call(inputs: js.Array[Tensor[Rank]], kwargs: Kwargs): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  /**
    * This is where the layer's logic lives.
    *
    * @param inputs Input tensor, or list/tuple of input tensors.
    * @param kwargs Additional keyword arguments.
    *
    * @return A tensor or list/tuple of tensors.
    */
  def call(inputs: Tensor[Rank], kwargs: Kwargs): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  /**
    * Clear call hook.
    * This is currently used for testing only.
    */
  def clearCallHook(): Unit = js.native
  def computeMask(inputs: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def computeMask(inputs: js.Array[Tensor[Rank]], mask: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def computeMask(inputs: js.Array[Tensor[Rank]], mask: Tensor[Rank]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  /**
    * Computes an output mask tensor.
    *
    * @param inputs Tensor or list of tensors.
    * @param mask Tensor or list of tensors.
    *
    * @return null or a tensor (or list of tensors, one per output tensor of the
    * layer).
    */
  def computeMask(inputs: Tensor[Rank]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def computeMask(inputs: Tensor[Rank], mask: js.Array[Tensor[Rank]]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  def computeMask(inputs: Tensor[Rank], mask: Tensor[Rank]): Tensor[Rank] | js.Array[Tensor[Rank]] = js.native
  /**
    * Computes the output shape of the layer.
    *
    * Assumes that the layer will be built to match that input shape provided.
    *
    * @param inputShape A shape (tuple of integers) or a list of shape tuples
    *   (one per output tensor of the layer). Shape tuples can include null for
    *   free dimensions, instead of an integer.
    */
  /** @doc {heading: 'Models', 'subheading': 'Classes'} */
  def computeOutputShape(inputShape: js.Array[Shape] | Shape): Shape | js.Array[Shape] = js.native
  /**
    * Counts the total number of numbers (e.g., float32, int32) in the
    * weights.
    *
    * @returns An integer count.
    * @throws RuntimeError: If the layer is not built yet (in which case its
    *   weights are not defined yet.)
    */
  /** @doc {heading: 'Models', 'subheading': 'Classes'} */
  def countParams(): Double = js.native
  /**
    * Attempt to dispose layer's weights.
    *
    * This method decrease the reference count of the Layer object by 1.
    *
    * A Layer is reference-counted. Its reference count is incremented by 1
    * the first item its `apply()` method is called and when it becomes a part
    * of a new `Node` (through calling the `apply()`) method on a
    * `tf.SymbolicTensor`).
    *
    * If the reference count of a Layer becomes 0, all the weights will be
    * disposed and the underlying memory (e.g., the textures allocated in WebGL)
    * will be freed.
    *
    * Note: If the reference count is greater than 0 after the decrement, the
    * weights of the Layer will *not* be disposed.
    *
    * After a Layer is disposed, it cannot be used in calls such as `apply()`,
    * `getWeights()` or `setWeights()` anymore.
    *
    * @returns A DisposeResult Object with the following fields:
    *   - refCountAfterDispose: The reference count of the Container after this
    *     `dispose()` call.
    *   - numDisposedVariables: Number of `tf.Variable`s (i.e., weights) disposed
    *     during this `dispose()` call.
    * @throws {Error} If the layer is not built yet, or if the layer has already
    *   been disposed.
    */
  /** @doc {heading: 'Models', 'subheading': 'Classes'} */
  def dispose(): DisposeResult = js.native
  /**
    * Dispose the weight variables that this Layer instance holds.
    *
    * @returns {number} Number of disposed variables.
    */
  /* protected */ def disposeWeights(): Double = js.native
  /**
    * Retrieves the input tensor(s) of a layer at a given node.
    *
    * @param nodeIndex Integer, index of the node from which to retrieve the
    *   attribute. E.g. `nodeIndex=0` will correspond to the first time the layer
    *   was called.
    *
    * @return A tensor (or list of tensors if the layer has multiple inputs).
    */
  def getInputAt(nodeIndex: Double): SymbolicTensor | js.Array[SymbolicTensor] = js.native
  /**
    * Retrieves the output tensor(s) of a layer at a given node.
    *
    * @param nodeIndex Integer, index of the node from which to retrieve the
    *   attribute. E.g. `nodeIndex=0` will correspond to the first time the layer
    *   was called.
    *
    * @return A tensor (or list of tensors if the layer has multiple outputs).
    */
  def getOutputAt(nodeIndex: Double): SymbolicTensor | js.Array[SymbolicTensor] = js.native
  /**
    * Returns the current values of the weights of the layer.
    *
    * @param trainableOnly Whether to get the values of only trainable weights.
    * @returns Weight values as an `Array` of `tf.Tensor`s.
    */
  /** @doc {heading: 'Models', 'subheading': 'Classes'} */
  def getWeights(): js.Array[Tensor[Rank]] = js.native
  def getWeights(trainableOnly: Boolean): js.Array[Tensor[Rank]] = js.native
  /* protected */ def invokeCallHook(inputs: js.Array[Tensor[Rank]], kwargs: Kwargs): Unit = js.native
  /* protected */ def invokeCallHook(inputs: Tensor[Rank], kwargs: Kwargs): Unit = js.native
  /**
    * Reset the states of the layer.
    *
    * This method of the base Layer class is essentially a no-op.
    * Subclasses that are stateful (e.g., stateful RNNs) should override this
    * method.
    */
  def resetStates(): Unit = js.native
  /**
    * Set call hook.
    * This is currently used for testing only.
    * @param callHook
    */
  def setCallHook(callHook: CallHook): Unit = js.native
  /**
    * Set the fast-weight-initialization flag.
    *
    * In cases where the initialized weight values will be immediately
    * overwritten by loaded weight values during model loading, setting
    * the flag to `true` saves unnecessary calls to potentially expensive
    * initializers and speeds up the loading process.
    *
    * @param value Target value of the flag.
    */
  def setFastWeightInitDuringBuild(value: Boolean): Unit = js.native
  /**
    * Sets the weights of the layer, from Tensors.
    *
    * @param weights a list of Tensors. The number of arrays and their shape
    *   must match number of the dimensions of the weights of the layer (i.e.
    *   it should match the output of `getWeights`).
    *
    * @exception ValueError If the provided weights list does not match the
    *   layer's specifications.
    */
  /** @doc {heading: 'Models', 'subheading': 'Classes'} */
  def setWeights(weights: js.Array[Tensor[Rank]]): Unit = js.native
  /**
    * Check compatibility between input shape and this layer's batchInputShape.
    *
    * Print warning if any incompatibility is found.
    *
    * @param inputShape Input shape to be checked.
    */
  /* protected */ def warnOnIncompatibleInputShape(inputShape: Shape): Unit = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/engine/topology", "Layer")
@js.native
object Layer extends js.Object {
  /**
    * Converts a layer and its index to a unique (immutable type) name.
    * This function is used internally with `this.containerNodes`.
    * @param layer The layer.
    * @param nodeIndex The layer's position (e.g. via enumerate) in a list of
    *   nodes.
    *
    * @returns The unique name.
    */
  /* protected */ def nodeKey(layer: Layer, nodeIndex: Double): String = js.native
}

