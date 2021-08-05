package typings.tensorflowTfjsLayers

import org.scalablytyped.runtime.NumberDictionary
import typings.tensorflowTfjsCore.distTensorMod.Scalar
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.distTypesMod.Kwargs
import typings.tensorflowTfjsLayers.distTypesMod.RegularizerFn
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.variablesMod.LayerVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topologyMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/topology", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/topology", "InputSpec")
  @js.native
  class InputSpec protected () extends StObject {
    def this(args: InputSpecArgs) = this()
    
    /** Dictionary mapping integer axes to a specific dimension value. */
    var axes: js.UndefOr[NumberDictionary[Double]] = js.native
    
    /** Expected datatype of the input. */
    var dtype: js.UndefOr[DataType] = js.native
    
    /** Maximum rank of the input. */
    var maxNDim: js.UndefOr[Double] = js.native
    
    /** Minimum rank of the input. */
    var minNDim: js.UndefOr[Double] = js.native
    
    /** Expected rank of the input. */
    var ndim: js.UndefOr[Double] = js.native
    
    /** Expected shape of the input (may include null for unchecked axes). */
    var shape: js.UndefOr[Shape] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/topology", "Layer")
  @js.native
  abstract class Layer () extends Serializable {
    def this(args: LayerArgs) = this()
    
    /* private */ var _addedWeightNames: js.Any = js.native
    
    /* private */ var _built: js.Any = js.native
    
    /* private */ var _callHook: js.Any = js.native
    
    /* private */ var _losses: js.Any = js.native
    
    /* private */ var _nonTrainableWeights: js.Any = js.native
    
    /* protected */ var _refCount: Double | Null = js.native
    
    /* protected */ var _stateful: Boolean = js.native
    
    /* protected */ var _trainableWeights: js.Array[LayerVariable] = js.native
    
    /* private */ var _updates: js.Any = js.native
    
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
    /* private */ var addInboundNode: js.Any = js.native
    
    def addLoss(losses: js.Array[RegularizerFn]): Unit = js.native
    /**
      * Add losses to the layer.
      *
      * The loss may potentionally be conditional on some inputs tensors,
      * for instance activity losses are conditional on the layer's inputs.
      *
      * @doc {heading: 'Models', 'subheading': 'Classes'}
      */
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
      *
      * @doc {heading: 'Models', 'subheading': 'Classes'}
      */
    /* protected */ def addWeight(name: String, shape: Shape): LayerVariable = js.native
    /* protected */ def addWeight(name: String, shape: Shape, dtype: Unit, initializer: Unit, regularizer: Unit, trainable: Boolean): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: Unit,
      initializer: Unit,
      regularizer: Unit,
      trainable: Boolean,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: Unit,
      initializer: Unit,
      regularizer: Unit,
      trainable: Unit,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(name: String, shape: Shape, dtype: Unit, initializer: Unit, regularizer: Regularizer): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: Unit,
      initializer: Unit,
      regularizer: Regularizer,
      trainable: Boolean
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: Unit,
      initializer: Unit,
      regularizer: Regularizer,
      trainable: Boolean,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: Unit,
      initializer: Unit,
      regularizer: Regularizer,
      trainable: Unit,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(name: String, shape: Shape, dtype: Unit, initializer: Initializer): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: Unit,
      initializer: Initializer,
      regularizer: Unit,
      trainable: Boolean
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: Unit,
      initializer: Initializer,
      regularizer: Unit,
      trainable: Boolean,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: Unit,
      initializer: Initializer,
      regularizer: Unit,
      trainable: Unit,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(name: String, shape: Shape, dtype: Unit, initializer: Initializer, regularizer: Regularizer): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: Unit,
      initializer: Initializer,
      regularizer: Regularizer,
      trainable: Boolean
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: Unit,
      initializer: Initializer,
      regularizer: Regularizer,
      trainable: Boolean,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: Unit,
      initializer: Initializer,
      regularizer: Regularizer,
      trainable: Unit,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(name: String, shape: Shape, dtype: DataType): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: DataType,
      initializer: Unit,
      regularizer: Unit,
      trainable: Boolean
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: DataType,
      initializer: Unit,
      regularizer: Unit,
      trainable: Boolean,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: DataType,
      initializer: Unit,
      regularizer: Unit,
      trainable: Unit,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(name: String, shape: Shape, dtype: DataType, initializer: Unit, regularizer: Regularizer): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: DataType,
      initializer: Unit,
      regularizer: Regularizer,
      trainable: Boolean
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: DataType,
      initializer: Unit,
      regularizer: Regularizer,
      trainable: Boolean,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: DataType,
      initializer: Unit,
      regularizer: Regularizer,
      trainable: Unit,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(name: String, shape: Shape, dtype: DataType, initializer: Initializer): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: DataType,
      initializer: Initializer,
      regularizer: Unit,
      trainable: Boolean
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: DataType,
      initializer: Initializer,
      regularizer: Unit,
      trainable: Boolean,
      constraint: Constraint
    ): LayerVariable = js.native
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: DataType,
      initializer: Initializer,
      regularizer: Unit,
      trainable: Unit,
      constraint: Constraint
    ): LayerVariable = js.native
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
    /* protected */ def addWeight(
      name: String,
      shape: Shape,
      dtype: DataType,
      initializer: Initializer,
      regularizer: Regularizer,
      trainable: Unit,
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
      *
      * @doc {heading: 'Models', 'subheading': 'Classes'}
      */
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
    
    var batchInputShape: Shape = js.native
    
    /**
      * Creates the layer weights.
      *
      * Must be implemented on all layers that have weights.
      *
      * Called when apply() is called to construct the weights.
      *
      * @param inputShape A `Shape` or array of `Shape` (unused).
      *
      * @doc {heading: 'Models', 'subheading': 'Classes'}
      */
    def build(inputShape: js.Array[Shape] | Shape): Unit = js.native
    
    var built: Boolean = js.native
    
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
      *
      * @doc {heading: 'Models', 'subheading': 'Classes'}
      */
    def computeOutputShape(inputShape: js.Array[Shape] | Shape): Shape | js.Array[Shape] = js.native
    
    /**
      * Counts the total number of numbers (e.g., float32, int32) in the
      * weights.
      *
      * @returns An integer count.
      * @throws RuntimeError: If the layer is not built yet (in which case its
      *   weights are not defined yet.)
      *
      * @doc {heading: 'Models', 'subheading': 'Classes'}
      */
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
      *
      * @doc {heading: 'Models', 'subheading': 'Classes'}
      */
    def dispose(): DisposeResult = js.native
    
    /**
      * Dispose the weight variables that this Layer instance holds.
      *
      * @returns {number} Number of disposed variables.
      */
    /* protected */ def disposeWeights(): Double = js.native
    
    var dtype: DataType = js.native
    
    /* private */ var fastWeightInitDuringBuild: js.Any = js.native
    
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
      * Returns this.inboundNode at index nodeIndex.
      *
      * Porting note: This is a replacement for _get_node_attribute_at_index()
      * @param nodeIndex
      * @param attrName The name of the attribute related to request for this node.
      */
    /* private */ var getNodeAtIndex: js.Any = js.native
    
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
      *
      * @doc {heading: 'Models', 'subheading': 'Classes'}
      */
    def getWeights(): js.Array[Tensor[Rank]] = js.native
    def getWeights(trainableOnly: Boolean): js.Array[Tensor[Rank]] = js.native
    
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
    
    /* protected */ def invokeCallHook(inputs: js.Array[Tensor[Rank]], kwargs: Kwargs): Unit = js.native
    /* protected */ def invokeCallHook(inputs: Tensor[Rank], kwargs: Kwargs): Unit = js.native
    
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
      *
      * @doc {heading: 'Models', 'subheading': 'Classes'}
      */
    val outputShape: Shape | js.Array[Shape] = js.native
    
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
      *
      * @doc {heading: 'Models', 'subheading': 'Classes'}
      */
    def setWeights(weights: js.Array[Tensor[Rank]]): Unit = js.native
    
    val stateful: Boolean = js.native
    
    var supportsMasking: Boolean = js.native
    
    var trainable: Boolean = js.native
    
    var trainableWeights: js.Array[LayerVariable] = js.native
    
    /** Whether the layer weights will be updated during training. */
    /* protected */ var trainable_ : Boolean = js.native
    
    val updates: js.Array[Tensor[Rank]] = js.native
    
    /**
      * Check compatibility between input shape and this layer's batchInputShape.
      *
      * Print warning if any incompatibility is found.
      *
      * @param inputShape Input shape to be checked.
      */
    /* protected */ def warnOnIncompatibleInputShape(inputShape: Shape): Unit = js.native
    
    /**
      * The concatenation of the lists trainableWeights and nonTrainableWeights
      * (in this order).
      */
    val weights: js.Array[LayerVariable] = js.native
  }
  /* static members */
  object Layer {
    
    @JSImport("@tensorflow/tfjs-layers/dist/engine/topology", "Layer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts a layer and its index to a unique (immutable type) name.
      * This function is used internally with `this.containerNodes`.
      * @param layer The layer.
      * @param nodeIndex The layer's position (e.g. via enumerate) in a list of
      *   nodes.
      *
      * @returns The unique name.
      */
    inline def nodeKey(layer: Layer, nodeIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeKey")(layer.asInstanceOf[js.Any], nodeIndex.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/topology", "Node")
  @js.native
  class Node protected () extends StObject {
    def this(args: NodeArgs) = this()
    def this(args: NodeArgs, callArgs: Kwargs) = this()
    
    var callArgs: js.UndefOr[Kwargs] = js.native
    
    def getConfig(): ConfigDict = js.native
    
    val id: Double = js.native
    
    /**
      * A list of layers, the same length as `inputTensors`, the layers from where
      * `inputTensors` originate.
      */
    var inboundLayers: js.Array[Layer] = js.native
    
    /** List of input masks (a mask can be a tensor, or null). */
    var inputMasks: js.Array[Tensor[Rank]] = js.native
    
    /** List of input shape tuples. */
    var inputShapes: Shape | js.Array[Shape] = js.native
    
    /** List of input tensors. */
    var inputTensors: js.Array[SymbolicTensor] = js.native
    
    /**
      * A list of integers, the same length as `inboundLayers`. `nodeIndices[i]` is
      * the origin node of `inputTensors[i]` (necessary since each inbound layer
      * might have several nodes, e.g. if the layer is being shared with a
      * different data stream).
      */
    var nodeIndices: js.Array[Double] = js.native
    
    /**
      * The layer that takes `inputTensors` and turns them into `outputTensors`
      * (the node gets created when the `call` method of the layer is called).
      */
    var outboundLayer: Layer = js.native
    
    /** List of output masks (a mask can be a tensor, or null). */
    var outputMasks: js.Array[Tensor[Rank]] = js.native
    
    /** List of output shape tuples. */
    var outputShapes: Shape | js.Array[Shape] = js.native
    
    /** List of output tensors. */
    var outputTensors: js.Array[SymbolicTensor] = js.native
    
    /**
      * A list of integers, the same length as `inboundLayers`. `tensorIndices[i]`
      * is the index of `inputTensors[i]` within the output of the inbound layer
      * (necessary since each inbound layer might have multiple tensor outputs,
      * with each one being independently manipulable).
      */
    var tensorIndices: js.Array[Double] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/topology", "SymbolicTensor")
  @js.native
  class SymbolicTensor protected () extends StObject {
    /**
      *
      * @param dtype
      * @param shape
      * @param sourceLayer The Layer that produced this symbolic tensor.
      * @param inputs The inputs passed to sourceLayer's __call__() method.
      * @param nodeIndex
      * @param tensorIndex
      * @param callArgs The keyword arguments passed to the __call__() method.
      * @param name
      * @param outputTensorIndex The index of this tensor in the list of outputs
      *   returned by apply().
      */
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[SymbolicTensor],
      callArgs: Kwargs
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[SymbolicTensor],
      callArgs: Kwargs,
      name: String
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[SymbolicTensor],
      callArgs: Kwargs,
      name: String,
      outputTensorIndex: Double
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[SymbolicTensor],
      callArgs: Kwargs,
      name: Unit,
      outputTensorIndex: Double
    ) = this()
    
    val callArgs: Kwargs = js.native
    
    val dtype: DataType = js.native
    
    val id: Double = js.native
    
    val inputs: js.Array[SymbolicTensor] = js.native
    
    val name: String = js.native
    
    /**
      * Replacement for _keras_history.
      */
    var nodeIndex: Double = js.native
    
    val originalName: js.UndefOr[String] = js.native
    
    val outputTensorIndex: js.UndefOr[Double] = js.native
    
    /**
      * Rank/dimensionality of the tensor.
      */
    val rank: Double = js.native
    
    val shape: Shape = js.native
    
    var sourceLayer: Layer = js.native
    
    /**
      * Replacement for _keras_history.
      */
    var tensorIndex: Double = js.native
  }
  
  inline def getSourceInputs(tensor: SymbolicTensor): js.Array[SymbolicTensor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSourceInputs")(tensor.asInstanceOf[js.Any]).asInstanceOf[js.Array[SymbolicTensor]]
  inline def getSourceInputs(tensor: SymbolicTensor, layer: Unit, nodeIndex: Double): js.Array[SymbolicTensor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceInputs")(tensor.asInstanceOf[js.Any], layer.asInstanceOf[js.Any], nodeIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[SymbolicTensor]]
  inline def getSourceInputs(tensor: SymbolicTensor, layer: Layer): js.Array[SymbolicTensor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceInputs")(tensor.asInstanceOf[js.Any], layer.asInstanceOf[js.Any])).asInstanceOf[js.Array[SymbolicTensor]]
  inline def getSourceInputs(tensor: SymbolicTensor, layer: Layer, nodeIndex: Double): js.Array[SymbolicTensor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSourceInputs")(tensor.asInstanceOf[js.Any], layer.asInstanceOf[js.Any], nodeIndex.asInstanceOf[js.Any])).asInstanceOf[js.Array[SymbolicTensor]]
  
  type CallHook = js.Function2[/* inputs */ Tensor[Rank] | js.Array[Tensor[Rank]], /* kwargs */ Kwargs, Unit]
  
  trait DisposeResult extends StObject {
    
    /**
      * Number of variables dispose in this dispose call.
      */
    var numDisposedVariables: Double
    
    /**
      * Reference count after the dispose call.
      */
    var refCountAfterDispose: Double
  }
  object DisposeResult {
    
    inline def apply(numDisposedVariables: Double, refCountAfterDispose: Double): DisposeResult = {
      val __obj = js.Dynamic.literal(numDisposedVariables = numDisposedVariables.asInstanceOf[js.Any], refCountAfterDispose = refCountAfterDispose.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisposeResult]
    }
    
    extension [Self <: DisposeResult](x: Self) {
      
      inline def setNumDisposedVariables(value: Double): Self = StObject.set(x, "numDisposedVariables", value.asInstanceOf[js.Any])
      
      inline def setRefCountAfterDispose(value: Double): Self = StObject.set(x, "refCountAfterDispose", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputSpecArgs extends StObject {
    
    /** Dictionary mapping integer axes to a specific dimension value. */
    var axes: js.UndefOr[NumberDictionary[Double]] = js.undefined
    
    /** Expected datatype of the input. */
    var dtype: js.UndefOr[DataType] = js.undefined
    
    /** Maximum rank of the input. */
    var maxNDim: js.UndefOr[Double] = js.undefined
    
    /** Minimum rank of the input. */
    var minNDim: js.UndefOr[Double] = js.undefined
    
    /** Expected rank of the input. */
    var ndim: js.UndefOr[Double] = js.undefined
    
    /** Expected shape of the input (may include null for unchecked axes). */
    var shape: js.UndefOr[Shape] = js.undefined
  }
  object InputSpecArgs {
    
    inline def apply(): InputSpecArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputSpecArgs]
    }
    
    extension [Self <: InputSpecArgs](x: Self) {
      
      inline def setAxes(value: NumberDictionary[Double]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
      
      inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      inline def setMaxNDim(value: Double): Self = StObject.set(x, "maxNDim", value.asInstanceOf[js.Any])
      
      inline def setMaxNDimUndefined: Self = StObject.set(x, "maxNDim", js.undefined)
      
      inline def setMinNDim(value: Double): Self = StObject.set(x, "minNDim", value.asInstanceOf[js.Any])
      
      inline def setMinNDimUndefined: Self = StObject.set(x, "minNDim", js.undefined)
      
      inline def setNdim(value: Double): Self = StObject.set(x, "ndim", value.asInstanceOf[js.Any])
      
      inline def setNdimUndefined: Self = StObject.set(x, "ndim", js.undefined)
      
      inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "shape", js.Array(value :_*))
    }
  }
  
  trait LayerArgs extends StObject {
    
    /**
      * If defined, will be used to create an input layer to insert before this
      * layer. If both `inputShape` and `batchInputShape` are defined,
      * `batchInputShape` will be used. This argument is only applicable to input
      * layers (the first layer of a model).
      */
    var batchInputShape: js.UndefOr[Shape] = js.undefined
    
    /**
      * If `inputShape` is specified and `batchInputShape` is *not* specified,
      * `batchSize` is used to construct the `batchInputShape`: `[batchSize,
      * ...inputShape]`
      */
    var batchSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The data-type for this layer. Defaults to 'float32'.
      * This argument is only applicable to input layers (the first layer of a
      * model).
      */
    var dtype: js.UndefOr[DataType] = js.undefined
    
    /** Legacy support. Do not use for new code. */
    var inputDType: js.UndefOr[DataType] = js.undefined
    
    /**
      * If defined, will be used to create an input layer to insert before this
      * layer. If both `inputShape` and `batchInputShape` are defined,
      * `batchInputShape` will be used. This argument is only applicable to input
      * layers (the first layer of a model).
      */
    var inputShape: js.UndefOr[Shape] = js.undefined
    
    /** Name for this layer. */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the weights of this layer are updatable by `fit`.
      * Defaults to true.
      */
    var trainable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Initial weight values of the layer.
      */
    var weights: js.UndefOr[js.Array[Tensor[Rank]]] = js.undefined
  }
  object LayerArgs {
    
    inline def apply(): LayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerArgs]
    }
    
    extension [Self <: LayerArgs](x: Self) {
      
      inline def setBatchInputShape(value: Shape): Self = StObject.set(x, "batchInputShape", value.asInstanceOf[js.Any])
      
      inline def setBatchInputShapeUndefined: Self = StObject.set(x, "batchInputShape", js.undefined)
      
      inline def setBatchInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "batchInputShape", js.Array(value :_*))
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      inline def setInputDType(value: DataType): Self = StObject.set(x, "inputDType", value.asInstanceOf[js.Any])
      
      inline def setInputDTypeUndefined: Self = StObject.set(x, "inputDType", js.undefined)
      
      inline def setInputShape(value: Shape): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
      
      inline def setInputShapeUndefined: Self = StObject.set(x, "inputShape", js.undefined)
      
      inline def setInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "inputShape", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTrainable(value: Boolean): Self = StObject.set(x, "trainable", value.asInstanceOf[js.Any])
      
      inline def setTrainableUndefined: Self = StObject.set(x, "trainable", js.undefined)
      
      inline def setWeights(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      inline def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
      
      inline def setWeightsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "weights", js.Array(value :_*))
    }
  }
  
  trait NodeArgs extends StObject {
    
    /**
      * A list of layers, the same length as `inputTensors`, the layers from where
      * `inputTensors` originate.
      */
    var inboundLayers: js.Array[Layer]
    
    /** List of input masks (a mask can be a tensor, or null). */
    var inputMasks: js.Array[Tensor[Rank]]
    
    /** List of input shape tuples. */
    var inputShapes: Shape | js.Array[Shape]
    
    /** List of input tensors. */
    var inputTensors: js.Array[SymbolicTensor]
    
    /**
      * A list of integers, the same length as `inboundLayers`. `nodeIndices[i]` is
      * the origin node of `inputTensors[i]` (necessary since each inbound layer
      * might have several nodes, e.g. if the layer is being shared with a
      * different data stream).
      */
    var nodeIndices: js.Array[Double]
    
    /**
      * The layer that takes `inputTensors` and turns them into `outputTensors`.
      * (the node gets created when the `call` method of the layer is called).
      */
    var outboundLayer: Layer
    
    /** List of output masks (a mask can be a tensor, or null). */
    var outputMasks: js.Array[Tensor[Rank]]
    
    /** List of output shape tuples. */
    var outputShapes: Shape | js.Array[Shape]
    
    /** List of output tensors. */
    var outputTensors: js.Array[SymbolicTensor]
    
    /**
      * A list of integers, the same length as `inboundLayers`. `tensorIndices[i]`
      * is the index of `inputTensors[i]` within the output of the inbound layer
      * (necessary since each inbound layer might have multiple tensor outputs,
      * with each one being independently manipulable).
      */
    var tensorIndices: js.Array[Double]
  }
  object NodeArgs {
    
    inline def apply(
      inboundLayers: js.Array[Layer],
      inputMasks: js.Array[Tensor[Rank]],
      inputShapes: Shape | js.Array[Shape],
      inputTensors: js.Array[SymbolicTensor],
      nodeIndices: js.Array[Double],
      outboundLayer: Layer,
      outputMasks: js.Array[Tensor[Rank]],
      outputShapes: Shape | js.Array[Shape],
      outputTensors: js.Array[SymbolicTensor],
      tensorIndices: js.Array[Double]
    ): NodeArgs = {
      val __obj = js.Dynamic.literal(inboundLayers = inboundLayers.asInstanceOf[js.Any], inputMasks = inputMasks.asInstanceOf[js.Any], inputShapes = inputShapes.asInstanceOf[js.Any], inputTensors = inputTensors.asInstanceOf[js.Any], nodeIndices = nodeIndices.asInstanceOf[js.Any], outboundLayer = outboundLayer.asInstanceOf[js.Any], outputMasks = outputMasks.asInstanceOf[js.Any], outputShapes = outputShapes.asInstanceOf[js.Any], outputTensors = outputTensors.asInstanceOf[js.Any], tensorIndices = tensorIndices.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeArgs]
    }
    
    extension [Self <: NodeArgs](x: Self) {
      
      inline def setInboundLayers(value: js.Array[Layer]): Self = StObject.set(x, "inboundLayers", value.asInstanceOf[js.Any])
      
      inline def setInboundLayersVarargs(value: Layer*): Self = StObject.set(x, "inboundLayers", js.Array(value :_*))
      
      inline def setInputMasks(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "inputMasks", value.asInstanceOf[js.Any])
      
      inline def setInputMasksVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "inputMasks", js.Array(value :_*))
      
      inline def setInputShapes(value: Shape | js.Array[Shape]): Self = StObject.set(x, "inputShapes", value.asInstanceOf[js.Any])
      
      inline def setInputShapesVarargs(value: (Double | Null | Shape)*): Self = StObject.set(x, "inputShapes", js.Array(value :_*))
      
      inline def setInputTensors(value: js.Array[SymbolicTensor]): Self = StObject.set(x, "inputTensors", value.asInstanceOf[js.Any])
      
      inline def setInputTensorsVarargs(value: SymbolicTensor*): Self = StObject.set(x, "inputTensors", js.Array(value :_*))
      
      inline def setNodeIndices(value: js.Array[Double]): Self = StObject.set(x, "nodeIndices", value.asInstanceOf[js.Any])
      
      inline def setNodeIndicesVarargs(value: Double*): Self = StObject.set(x, "nodeIndices", js.Array(value :_*))
      
      inline def setOutboundLayer(value: Layer): Self = StObject.set(x, "outboundLayer", value.asInstanceOf[js.Any])
      
      inline def setOutputMasks(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "outputMasks", value.asInstanceOf[js.Any])
      
      inline def setOutputMasksVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "outputMasks", js.Array(value :_*))
      
      inline def setOutputShapes(value: Shape | js.Array[Shape]): Self = StObject.set(x, "outputShapes", value.asInstanceOf[js.Any])
      
      inline def setOutputShapesVarargs(value: (Double | Null | Shape)*): Self = StObject.set(x, "outputShapes", js.Array(value :_*))
      
      inline def setOutputTensors(value: js.Array[SymbolicTensor]): Self = StObject.set(x, "outputTensors", value.asInstanceOf[js.Any])
      
      inline def setOutputTensorsVarargs(value: SymbolicTensor*): Self = StObject.set(x, "outputTensors", js.Array(value :_*))
      
      inline def setTensorIndices(value: js.Array[Double]): Self = StObject.set(x, "tensorIndices", value.asInstanceOf[js.Any])
      
      inline def setTensorIndicesVarargs(value: Double*): Self = StObject.set(x, "tensorIndices", js.Array(value :_*))
    }
  }
  
  type Op = js.Function1[/* x */ LayerVariable, LayerVariable]
}
