package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsLayers.distActivationsMod.Activation
import typings.tensorflowTfjsLayers.distConstraintsMod.Constraint
import typings.tensorflowTfjsLayers.distConstraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.distInitializersMod.Initializer
import typings.tensorflowTfjsLayers.distInitializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.distKerasFormatActivationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.BaseRNNLayerArgs
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.LSTMCell
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.RNNCell
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.RNN_
import typings.tensorflowTfjsLayers.distRegularizersMod.Regularizer
import typings.tensorflowTfjsLayers.distRegularizersMod.RegularizerIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersConvolutionalRecurrentMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2D")
  @js.native
  open class ConvLSTM2D protected () extends ConvRNN2D {
    def this(args: ConvLSTM2DArgs) = this()
  }
  /* static members */
  object ConvLSTM2D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2D.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.tensorflowTfjsCore.distSerializationMod.Serializable because Already inherited
  - typings.tensorflowTfjsCore.distBaseMod.serialization.Serializable because Already inherited
  - typings.tensorflowTfjsCore.mod.serialization.Serializable because Already inherited
  - typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer because Already inherited
  - typings.tensorflowTfjsLayers.distLayersRecurrentMod.RNNCell because Already inherited
  - typings.tensorflowTfjsLayers.distLayersConvolutionalRecurrentMod.ConvRNN2DCell because var conflicts: _addedWeightNames, _built, _callHook, _losses, _nonTrainableWeights, _refCount, _stateful, _trainableWeights, _updates, activityRegularizer, addInboundNode, batchInputShape, dropoutMask, dtype, fastWeightInitDuringBuild, getNodeAtIndex, inboundNodes, initialWeights, inputSpec, name, outboundNodes, recurrentDropoutMask, stateSize, supportsMasking, trainable_. Inlined filters, kernelSize, strides, padding, dataFormat, dilationRate */ @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2DCell")
  @js.native
  open class ConvLSTM2DCell protected () extends LSTMCell {
    def this(args: ConvLSTM2DCellArgs) = this()
    
    val dataFormat: DataFormat = js.native
    
    val dilationRate: js.Array[Double] = js.native
    
    val filters: Double = js.native
    
    def inputConv(x: Tensor[Rank], w: Tensor[Rank]): Tensor3D = js.native
    def inputConv(x: Tensor[Rank], w: Tensor[Rank], b: Unit, padding: PaddingMode): Tensor3D = js.native
    def inputConv(x: Tensor[Rank], w: Tensor[Rank], b: Tensor[Rank]): Tensor3D = js.native
    def inputConv(x: Tensor[Rank], w: Tensor[Rank], b: Tensor[Rank], padding: PaddingMode): Tensor3D = js.native
    
    val kernelSize: js.Array[Double] = js.native
    
    val padding: PaddingMode = js.native
    
    def recurrentConv(x: Tensor[Rank], w: Tensor[Rank]): Tensor3D = js.native
    
    val strides: js.Array[Double] = js.native
  }
  /* static members */
  object ConvLSTM2DCell {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2DCell")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent", "ConvLSTM2DCell.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined parent std.Omit<@tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/layers/recurrent.LSTMLayerArgs, 'units' | 'cell'> */
  /* Inlined parent @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent.ConvRNN2DLayerArgs */
  trait ConvLSTM2DArgs extends StObject {
    
    var activation: js.UndefOr[ActivationIdentifier] = js.undefined
    
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
    
    var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
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
      *       which due to its `Tensor|Tensor[]` argument and return value is
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
      * Format of the data, which determines the ordering of the dimensions in
      * the inputs.
      *
      * `channels_last` corresponds to inputs with shape
      *   `(batch, ..., channels)`
      *
      *  `channels_first` corresponds to inputs with shape `(batch, channels,
      * ...)`.
      *
      * Defaults to `channels_last`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.undefined
    
    /**
      * The dilation rate to use for the dilated convolution in each dimension.
      * Should be an integer or array of two or three integers.
      *
      * Currently, specifying any `dilationRate` value != 1 is incompatible with
      * specifying any `strides` value != 1.
      */
    var dilationRate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.undefined
    
    var dropout: js.UndefOr[Double] = js.undefined
    
    var dropoutFunc: js.UndefOr[js.Function] = js.undefined
    
    /**
      * The data-type for this layer. Defaults to 'float32'.
      * This argument is only applicable to input layers (the first layer of a
      * model).
      */
    var dtype: js.UndefOr[DataType] = js.undefined
    
    /**
      * The dimensionality of the output space (i.e. the number of filters in the
      * convolution).
      */
    var filters: Double
    
    /**
      * If `true`, process the input sequence backwards and return the reversed
      * sequence (default: `false`).
      */
    var goBackwards: js.UndefOr[Boolean] = js.undefined
    
    var implementation: js.UndefOr[Double] = js.undefined
    
    /** Legacy support. Do not use for new code. */
    var inputDType: js.UndefOr[DataType] = js.undefined
    
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
      * If defined, will be used to create an input layer to insert before this
      * layer. If both `inputShape` and `batchInputShape` are defined,
      * `batchInputShape` will be used. This argument is only applicable to input
      * layers (the first layer of a model).
      */
    var inputShape: js.UndefOr[Shape] = js.undefined
    
    var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * The dimensions of the convolution window. If kernelSize is a number, the
      * convolutional window will be square.
      */
    var kernelSize: Double | js.Array[Double]
    
    /** Name for this layer. */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Padding mode.
      */
    var padding: js.UndefOr[PaddingMode] = js.undefined
    
    var recurrentActivation: js.UndefOr[ActivationIdentifier] = js.undefined
    
    var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    var recurrentDropout: js.UndefOr[Double] = js.undefined
    
    var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
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
      * The strides of the convolution in each dimension. If strides is a number,
      * strides in both dimensions are equal.
      *
      * Specifying any stride value != 1 is incompatible with specifying any
      * `dilationRate` value != 1.
      */
    var strides: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * Whether the weights of this layer are updatable by `fit`.
      * Defaults to true.
      */
    var trainable: js.UndefOr[Boolean] = js.undefined
    
    var unitForgetBias: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the network will be unrolled, else a symbolic loop will be
      * used. Unrolling can speed up a RNN, although it tends to be more
      * memory-intensive. Unrolling is only suitable for short sequences (default:
      * `false`).
      * Porting Note: tfjs-layers has an imperative backend. RNNs are executed with
      *   normal TypeScript control flow. Hence this property is inapplicable and
      *   ignored in tfjs-layers.
      */
    var unroll: js.UndefOr[Boolean] = js.undefined
    
    var useBias: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Initial weight values of the layer.
      */
    var weights: js.UndefOr[js.Array[Tensor[Rank]]] = js.undefined
  }
  object ConvLSTM2DArgs {
    
    inline def apply(filters: Double, kernelSize: Double | js.Array[Double]): ConvLSTM2DArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvLSTM2DArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvLSTM2DArgs] (val x: Self) extends AnyVal {
      
      inline def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setBatchInputShape(value: Shape): Self = StObject.set(x, "batchInputShape", value.asInstanceOf[js.Any])
      
      inline def setBatchInputShapeUndefined: Self = StObject.set(x, "batchInputShape", js.undefined)
      
      inline def setBatchInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "batchInputShape", js.Array(value*))
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
      
      inline def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
      
      inline def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
      
      inline def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
      
      inline def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
      
      inline def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
      
      inline def setCell(value: RNNCell | js.Array[RNNCell]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setCellVarargs(value: RNNCell*): Self = StObject.set(x, "cell", js.Array(value*))
      
      inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      inline def setDilationRate(value: Double | js.Array[Double] | (js.Tuple2[Double, Double])): Self = StObject.set(x, "dilationRate", value.asInstanceOf[js.Any])
      
      inline def setDilationRateUndefined: Self = StObject.set(x, "dilationRate", js.undefined)
      
      inline def setDilationRateVarargs(value: Double*): Self = StObject.set(x, "dilationRate", js.Array(value*))
      
      inline def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
      
      inline def setDropoutFunc(value: js.Function): Self = StObject.set(x, "dropoutFunc", value.asInstanceOf[js.Any])
      
      inline def setDropoutFuncUndefined: Self = StObject.set(x, "dropoutFunc", js.undefined)
      
      inline def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      inline def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setGoBackwards(value: Boolean): Self = StObject.set(x, "goBackwards", value.asInstanceOf[js.Any])
      
      inline def setGoBackwardsUndefined: Self = StObject.set(x, "goBackwards", js.undefined)
      
      inline def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      inline def setInputDType(value: DataType): Self = StObject.set(x, "inputDType", value.asInstanceOf[js.Any])
      
      inline def setInputDTypeUndefined: Self = StObject.set(x, "inputDType", js.undefined)
      
      inline def setInputDim(value: Double): Self = StObject.set(x, "inputDim", value.asInstanceOf[js.Any])
      
      inline def setInputDimUndefined: Self = StObject.set(x, "inputDim", js.undefined)
      
      inline def setInputLength(value: Double): Self = StObject.set(x, "inputLength", value.asInstanceOf[js.Any])
      
      inline def setInputLengthUndefined: Self = StObject.set(x, "inputLength", js.undefined)
      
      inline def setInputShape(value: Shape): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
      
      inline def setInputShapeUndefined: Self = StObject.set(x, "inputShape", js.undefined)
      
      inline def setInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "inputShape", js.Array(value*))
      
      inline def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "kernelConstraint", value.asInstanceOf[js.Any])
      
      inline def setKernelConstraintUndefined: Self = StObject.set(x, "kernelConstraint", js.undefined)
      
      inline def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "kernelInitializer", value.asInstanceOf[js.Any])
      
      inline def setKernelInitializerUndefined: Self = StObject.set(x, "kernelInitializer", js.undefined)
      
      inline def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "kernelRegularizer", value.asInstanceOf[js.Any])
      
      inline def setKernelRegularizerUndefined: Self = StObject.set(x, "kernelRegularizer", js.undefined)
      
      inline def setKernelSize(value: Double | js.Array[Double]): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
      
      inline def setKernelSizeVarargs(value: Double*): Self = StObject.set(x, "kernelSize", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRecurrentActivation(value: ActivationIdentifier): Self = StObject.set(x, "recurrentActivation", value.asInstanceOf[js.Any])
      
      inline def setRecurrentActivationUndefined: Self = StObject.set(x, "recurrentActivation", js.undefined)
      
      inline def setRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "recurrentConstraint", value.asInstanceOf[js.Any])
      
      inline def setRecurrentConstraintUndefined: Self = StObject.set(x, "recurrentConstraint", js.undefined)
      
      inline def setRecurrentDropout(value: Double): Self = StObject.set(x, "recurrentDropout", value.asInstanceOf[js.Any])
      
      inline def setRecurrentDropoutUndefined: Self = StObject.set(x, "recurrentDropout", js.undefined)
      
      inline def setRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "recurrentInitializer", value.asInstanceOf[js.Any])
      
      inline def setRecurrentInitializerUndefined: Self = StObject.set(x, "recurrentInitializer", js.undefined)
      
      inline def setRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "recurrentRegularizer", value.asInstanceOf[js.Any])
      
      inline def setRecurrentRegularizerUndefined: Self = StObject.set(x, "recurrentRegularizer", js.undefined)
      
      inline def setReturnSequences(value: Boolean): Self = StObject.set(x, "returnSequences", value.asInstanceOf[js.Any])
      
      inline def setReturnSequencesUndefined: Self = StObject.set(x, "returnSequences", js.undefined)
      
      inline def setReturnState(value: Boolean): Self = StObject.set(x, "returnState", value.asInstanceOf[js.Any])
      
      inline def setReturnStateUndefined: Self = StObject.set(x, "returnState", js.undefined)
      
      inline def setStateful(value: Boolean): Self = StObject.set(x, "stateful", value.asInstanceOf[js.Any])
      
      inline def setStatefulUndefined: Self = StObject.set(x, "stateful", js.undefined)
      
      inline def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
      
      inline def setTrainable(value: Boolean): Self = StObject.set(x, "trainable", value.asInstanceOf[js.Any])
      
      inline def setTrainableUndefined: Self = StObject.set(x, "trainable", js.undefined)
      
      inline def setUnitForgetBias(value: Boolean): Self = StObject.set(x, "unitForgetBias", value.asInstanceOf[js.Any])
      
      inline def setUnitForgetBiasUndefined: Self = StObject.set(x, "unitForgetBias", js.undefined)
      
      inline def setUnroll(value: Boolean): Self = StObject.set(x, "unroll", value.asInstanceOf[js.Any])
      
      inline def setUnrollUndefined: Self = StObject.set(x, "unroll", js.undefined)
      
      inline def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
      
      inline def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
      
      inline def setWeights(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      inline def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
      
      inline def setWeightsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "weights", js.Array(value*))
    }
  }
  
  /* Inlined parent std.Omit<@tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/layers/recurrent.LSTMCellLayerArgs, 'units'> */
  /* Inlined parent @tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/layers/convolutional_recurrent.ConvRNN2DCellArgs */
  trait ConvLSTM2DCellArgs extends StObject {
    
    var activation: js.UndefOr[ActivationIdentifier] = js.undefined
    
    var batchInputShape: js.UndefOr[Shape] = js.undefined
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * Format of the data, which determines the ordering of the dimensions in
      * the inputs.
      *
      * `channels_last` corresponds to inputs with shape
      *   `(batch, ..., channels)`
      *
      *  `channels_first` corresponds to inputs with shape `(batch, channels,
      * ...)`.
      *
      * Defaults to `channels_last`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.undefined
    
    /**
      * The dilation rate to use for the dilated convolution in each dimension.
      * Should be an integer or array of two or three integers.
      *
      * Currently, specifying any `dilationRate` value != 1 is incompatible with
      * specifying any `strides` value != 1.
      */
    var dilationRate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.undefined
    
    var dropout: js.UndefOr[Double] = js.undefined
    
    var dropoutFunc: js.UndefOr[js.Function] = js.undefined
    
    var dtype: js.UndefOr[DataType] = js.undefined
    
    /**
      * The dimensionality of the output space (i.e. the number of filters in the
      * convolution).
      */
    var filters: Double
    
    var implementation: js.UndefOr[Double] = js.undefined
    
    var inputDType: js.UndefOr[DataType] = js.undefined
    
    var inputShape: js.UndefOr[Shape] = js.undefined
    
    var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * The dimensions of the convolution window. If kernelSize is a number, the
      * convolutional window will be square.
      */
    var kernelSize: Double | js.Array[Double]
    
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Padding mode.
      */
    var padding: js.UndefOr[PaddingMode] = js.undefined
    
    var recurrentActivation: js.UndefOr[ActivationIdentifier] = js.undefined
    
    var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    var recurrentDropout: js.UndefOr[Double] = js.undefined
    
    var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * The strides of the convolution in each dimension. If strides is a number,
      * strides in both dimensions are equal.
      *
      * Specifying any stride value != 1 is incompatible with specifying any
      * `dilationRate` value != 1.
      */
    var strides: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var trainable: js.UndefOr[Boolean] = js.undefined
    
    var unitForgetBias: js.UndefOr[Boolean] = js.undefined
    
    var useBias: js.UndefOr[Boolean] = js.undefined
    
    var weights: js.UndefOr[js.Array[Tensor[Rank]]] = js.undefined
  }
  object ConvLSTM2DCellArgs {
    
    inline def apply(filters: Double, kernelSize: Double | js.Array[Double]): ConvLSTM2DCellArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvLSTM2DCellArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvLSTM2DCellArgs] (val x: Self) extends AnyVal {
      
      inline def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setBatchInputShape(value: Shape): Self = StObject.set(x, "batchInputShape", value.asInstanceOf[js.Any])
      
      inline def setBatchInputShapeUndefined: Self = StObject.set(x, "batchInputShape", js.undefined)
      
      inline def setBatchInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "batchInputShape", js.Array(value*))
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
      
      inline def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
      
      inline def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
      
      inline def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
      
      inline def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
      
      inline def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
      
      inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      inline def setDilationRate(value: Double | js.Array[Double] | (js.Tuple2[Double, Double])): Self = StObject.set(x, "dilationRate", value.asInstanceOf[js.Any])
      
      inline def setDilationRateUndefined: Self = StObject.set(x, "dilationRate", js.undefined)
      
      inline def setDilationRateVarargs(value: Double*): Self = StObject.set(x, "dilationRate", js.Array(value*))
      
      inline def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
      
      inline def setDropoutFunc(value: js.Function): Self = StObject.set(x, "dropoutFunc", value.asInstanceOf[js.Any])
      
      inline def setDropoutFuncUndefined: Self = StObject.set(x, "dropoutFunc", js.undefined)
      
      inline def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      inline def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setImplementation(value: Double): Self = StObject.set(x, "implementation", value.asInstanceOf[js.Any])
      
      inline def setImplementationUndefined: Self = StObject.set(x, "implementation", js.undefined)
      
      inline def setInputDType(value: DataType): Self = StObject.set(x, "inputDType", value.asInstanceOf[js.Any])
      
      inline def setInputDTypeUndefined: Self = StObject.set(x, "inputDType", js.undefined)
      
      inline def setInputShape(value: Shape): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
      
      inline def setInputShapeUndefined: Self = StObject.set(x, "inputShape", js.undefined)
      
      inline def setInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "inputShape", js.Array(value*))
      
      inline def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "kernelConstraint", value.asInstanceOf[js.Any])
      
      inline def setKernelConstraintUndefined: Self = StObject.set(x, "kernelConstraint", js.undefined)
      
      inline def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "kernelInitializer", value.asInstanceOf[js.Any])
      
      inline def setKernelInitializerUndefined: Self = StObject.set(x, "kernelInitializer", js.undefined)
      
      inline def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "kernelRegularizer", value.asInstanceOf[js.Any])
      
      inline def setKernelRegularizerUndefined: Self = StObject.set(x, "kernelRegularizer", js.undefined)
      
      inline def setKernelSize(value: Double | js.Array[Double]): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
      
      inline def setKernelSizeVarargs(value: Double*): Self = StObject.set(x, "kernelSize", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRecurrentActivation(value: ActivationIdentifier): Self = StObject.set(x, "recurrentActivation", value.asInstanceOf[js.Any])
      
      inline def setRecurrentActivationUndefined: Self = StObject.set(x, "recurrentActivation", js.undefined)
      
      inline def setRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "recurrentConstraint", value.asInstanceOf[js.Any])
      
      inline def setRecurrentConstraintUndefined: Self = StObject.set(x, "recurrentConstraint", js.undefined)
      
      inline def setRecurrentDropout(value: Double): Self = StObject.set(x, "recurrentDropout", value.asInstanceOf[js.Any])
      
      inline def setRecurrentDropoutUndefined: Self = StObject.set(x, "recurrentDropout", js.undefined)
      
      inline def setRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "recurrentInitializer", value.asInstanceOf[js.Any])
      
      inline def setRecurrentInitializerUndefined: Self = StObject.set(x, "recurrentInitializer", js.undefined)
      
      inline def setRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "recurrentRegularizer", value.asInstanceOf[js.Any])
      
      inline def setRecurrentRegularizerUndefined: Self = StObject.set(x, "recurrentRegularizer", js.undefined)
      
      inline def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
      
      inline def setTrainable(value: Boolean): Self = StObject.set(x, "trainable", value.asInstanceOf[js.Any])
      
      inline def setTrainableUndefined: Self = StObject.set(x, "trainable", js.undefined)
      
      inline def setUnitForgetBias(value: Boolean): Self = StObject.set(x, "unitForgetBias", value.asInstanceOf[js.Any])
      
      inline def setUnitForgetBiasUndefined: Self = StObject.set(x, "unitForgetBias", js.undefined)
      
      inline def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
      
      inline def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
      
      inline def setWeights(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      inline def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
      
      inline def setWeightsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "weights", js.Array(value*))
    }
  }
  
  /**
    * Base class for convolutional-recurrent layers.
    */
  @js.native
  trait ConvRNN2D extends RNN_ {
    
    @JSName("cell")
    val cell_ConvRNN2D: ConvRNN2DCell = js.native
    
    /* protected */ def computeSingleOutputShape(inputShape: Shape): Shape = js.native
  }
  
  @js.native
  trait ConvRNN2DCell extends RNNCell {
    
    val activation: Activation = js.native
    
    val biasConstraint: Constraint = js.native
    
    val biasInitializer: Initializer = js.native
    
    val biasRegularizer: Regularizer = js.native
    
    val dataFormat: DataFormat = js.native
    
    val dilationRate: js.Array[Double] = js.native
    
    val dropout: Double = js.native
    
    val filters: Double = js.native
    
    val kernelConstraint: Constraint = js.native
    
    val kernelInitializer: Initializer = js.native
    
    val kernelRegularizer: Regularizer = js.native
    
    val kernelSize: js.Array[Double] = js.native
    
    val padding: PaddingMode = js.native
    
    val recurrentConstraint: Constraint = js.native
    
    val recurrentDropout: Double = js.native
    
    val recurrentInitializer: Initializer = js.native
    
    val recurrentRegularizer: Regularizer = js.native
    
    val strides: js.Array[Double] = js.native
    
    val useBias: Boolean = js.native
  }
  
  /* Inlined parent std.Omit<@tensorflow/tfjs-layers.@tensorflow/tfjs-layers/dist/layers/recurrent.SimpleRNNCellLayerArgs, 'units'> */
  trait ConvRNN2DCellArgs extends StObject {
    
    var activation: js.UndefOr[ActivationIdentifier] = js.undefined
    
    var batchInputShape: js.UndefOr[Shape] = js.undefined
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * Format of the data, which determines the ordering of the dimensions in
      * the inputs.
      *
      * `channels_last` corresponds to inputs with shape
      *   `(batch, ..., channels)`
      *
      *  `channels_first` corresponds to inputs with shape `(batch, channels,
      * ...)`.
      *
      * Defaults to `channels_last`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.undefined
    
    /**
      * The dilation rate to use for the dilated convolution in each dimension.
      * Should be an integer or array of two or three integers.
      *
      * Currently, specifying any `dilationRate` value != 1 is incompatible with
      * specifying any `strides` value != 1.
      */
    var dilationRate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.undefined
    
    var dropout: js.UndefOr[Double] = js.undefined
    
    var dropoutFunc: js.UndefOr[js.Function] = js.undefined
    
    var dtype: js.UndefOr[DataType] = js.undefined
    
    /**
      * The dimensionality of the output space (i.e. the number of filters in the
      * convolution).
      */
    var filters: Double
    
    var inputDType: js.UndefOr[DataType] = js.undefined
    
    var inputShape: js.UndefOr[Shape] = js.undefined
    
    var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * The dimensions of the convolution window. If kernelSize is a number, the
      * convolutional window will be square.
      */
    var kernelSize: Double | js.Array[Double]
    
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Padding mode.
      */
    var padding: js.UndefOr[PaddingMode] = js.undefined
    
    var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    var recurrentDropout: js.UndefOr[Double] = js.undefined
    
    var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * The strides of the convolution in each dimension. If strides is a number,
      * strides in both dimensions are equal.
      *
      * Specifying any stride value != 1 is incompatible with specifying any
      * `dilationRate` value != 1.
      */
    var strides: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var trainable: js.UndefOr[Boolean] = js.undefined
    
    var useBias: js.UndefOr[Boolean] = js.undefined
    
    var weights: js.UndefOr[js.Array[Tensor[Rank]]] = js.undefined
  }
  object ConvRNN2DCellArgs {
    
    inline def apply(filters: Double, kernelSize: Double | js.Array[Double]): ConvRNN2DCellArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvRNN2DCellArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvRNN2DCellArgs] (val x: Self) extends AnyVal {
      
      inline def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setBatchInputShape(value: Shape): Self = StObject.set(x, "batchInputShape", value.asInstanceOf[js.Any])
      
      inline def setBatchInputShapeUndefined: Self = StObject.set(x, "batchInputShape", js.undefined)
      
      inline def setBatchInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "batchInputShape", js.Array(value*))
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
      
      inline def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
      
      inline def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
      
      inline def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
      
      inline def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
      
      inline def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
      
      inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      inline def setDilationRate(value: Double | js.Array[Double] | (js.Tuple2[Double, Double])): Self = StObject.set(x, "dilationRate", value.asInstanceOf[js.Any])
      
      inline def setDilationRateUndefined: Self = StObject.set(x, "dilationRate", js.undefined)
      
      inline def setDilationRateVarargs(value: Double*): Self = StObject.set(x, "dilationRate", js.Array(value*))
      
      inline def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
      
      inline def setDropoutFunc(value: js.Function): Self = StObject.set(x, "dropoutFunc", value.asInstanceOf[js.Any])
      
      inline def setDropoutFuncUndefined: Self = StObject.set(x, "dropoutFunc", js.undefined)
      
      inline def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
      
      inline def setDtype(value: DataType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      inline def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setInputDType(value: DataType): Self = StObject.set(x, "inputDType", value.asInstanceOf[js.Any])
      
      inline def setInputDTypeUndefined: Self = StObject.set(x, "inputDType", js.undefined)
      
      inline def setInputShape(value: Shape): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
      
      inline def setInputShapeUndefined: Self = StObject.set(x, "inputShape", js.undefined)
      
      inline def setInputShapeVarargs(value: (Null | Double)*): Self = StObject.set(x, "inputShape", js.Array(value*))
      
      inline def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "kernelConstraint", value.asInstanceOf[js.Any])
      
      inline def setKernelConstraintUndefined: Self = StObject.set(x, "kernelConstraint", js.undefined)
      
      inline def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "kernelInitializer", value.asInstanceOf[js.Any])
      
      inline def setKernelInitializerUndefined: Self = StObject.set(x, "kernelInitializer", js.undefined)
      
      inline def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "kernelRegularizer", value.asInstanceOf[js.Any])
      
      inline def setKernelRegularizerUndefined: Self = StObject.set(x, "kernelRegularizer", js.undefined)
      
      inline def setKernelSize(value: Double | js.Array[Double]): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
      
      inline def setKernelSizeVarargs(value: Double*): Self = StObject.set(x, "kernelSize", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "recurrentConstraint", value.asInstanceOf[js.Any])
      
      inline def setRecurrentConstraintUndefined: Self = StObject.set(x, "recurrentConstraint", js.undefined)
      
      inline def setRecurrentDropout(value: Double): Self = StObject.set(x, "recurrentDropout", value.asInstanceOf[js.Any])
      
      inline def setRecurrentDropoutUndefined: Self = StObject.set(x, "recurrentDropout", js.undefined)
      
      inline def setRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "recurrentInitializer", value.asInstanceOf[js.Any])
      
      inline def setRecurrentInitializerUndefined: Self = StObject.set(x, "recurrentInitializer", js.undefined)
      
      inline def setRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "recurrentRegularizer", value.asInstanceOf[js.Any])
      
      inline def setRecurrentRegularizerUndefined: Self = StObject.set(x, "recurrentRegularizer", js.undefined)
      
      inline def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
      
      inline def setTrainable(value: Boolean): Self = StObject.set(x, "trainable", value.asInstanceOf[js.Any])
      
      inline def setTrainableUndefined: Self = StObject.set(x, "trainable", js.undefined)
      
      inline def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
      
      inline def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
      
      inline def setWeights(value: js.Array[Tensor[Rank]]): Self = StObject.set(x, "weights", value.asInstanceOf[js.Any])
      
      inline def setWeightsUndefined: Self = StObject.set(x, "weights", js.undefined)
      
      inline def setWeightsVarargs(value: Tensor[Rank]*): Self = StObject.set(x, "weights", js.Array(value*))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.tensorflowTfjsLayers.distLayersConvolutionalRecurrentMod.ConvRNN2DCellArgs because var conflicts: batchInputShape, batchSize, dtype, inputDType, inputShape, name, trainable, weights. Inlined filters, kernelSize, strides, padding, dataFormat, dilationRate, recurrentRegularizer, useBias, biasInitializer, dropout, dropoutFunc, kernelRegularizer, recurrentInitializer, biasRegularizer, kernelConstraint, biasConstraint, kernelInitializer, recurrentConstraint, activation, recurrentDropout */ trait ConvRNN2DLayerArgs
    extends StObject
       with BaseRNNLayerArgs {
    
    var activation: js.UndefOr[ActivationIdentifier] = js.undefined
    
    var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * Format of the data, which determines the ordering of the dimensions in
      * the inputs.
      *
      * `channels_last` corresponds to inputs with shape
      *   `(batch, ..., channels)`
      *
      *  `channels_first` corresponds to inputs with shape `(batch, channels,
      * ...)`.
      *
      * Defaults to `channels_last`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.undefined
    
    /**
      * The dilation rate to use for the dilated convolution in each dimension.
      * Should be an integer or array of two or three integers.
      *
      * Currently, specifying any `dilationRate` value != 1 is incompatible with
      * specifying any `strides` value != 1.
      */
    var dilationRate: js.UndefOr[Double | js.Array[Double] | (js.Tuple2[Double, Double])] = js.undefined
    
    var dropout: js.UndefOr[Double] = js.undefined
    
    var dropoutFunc: js.UndefOr[js.Function] = js.undefined
    
    /**
      * The dimensionality of the output space (i.e. the number of filters in the
      * convolution).
      */
    var filters: Double
    
    var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * The dimensions of the convolution window. If kernelSize is a number, the
      * convolutional window will be square.
      */
    var kernelSize: Double | js.Array[Double]
    
    /**
      * Padding mode.
      */
    var padding: js.UndefOr[PaddingMode] = js.undefined
    
    var recurrentConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    var recurrentDropout: js.UndefOr[Double] = js.undefined
    
    var recurrentInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    var recurrentRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * The strides of the convolution in each dimension. If strides is a number,
      * strides in both dimensions are equal.
      *
      * Specifying any stride value != 1 is incompatible with specifying any
      * `dilationRate` value != 1.
      */
    var strides: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var useBias: js.UndefOr[Boolean] = js.undefined
  }
  object ConvRNN2DLayerArgs {
    
    inline def apply(filters: Double, kernelSize: Double | js.Array[Double]): ConvRNN2DLayerArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvRNN2DLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvRNN2DLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
      
      inline def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
      
      inline def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
      
      inline def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
      
      inline def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
      
      inline def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
      
      inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      inline def setDilationRate(value: Double | js.Array[Double] | (js.Tuple2[Double, Double])): Self = StObject.set(x, "dilationRate", value.asInstanceOf[js.Any])
      
      inline def setDilationRateUndefined: Self = StObject.set(x, "dilationRate", js.undefined)
      
      inline def setDilationRateVarargs(value: Double*): Self = StObject.set(x, "dilationRate", js.Array(value*))
      
      inline def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
      
      inline def setDropoutFunc(value: js.Function): Self = StObject.set(x, "dropoutFunc", value.asInstanceOf[js.Any])
      
      inline def setDropoutFuncUndefined: Self = StObject.set(x, "dropoutFunc", js.undefined)
      
      inline def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
      
      inline def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "kernelConstraint", value.asInstanceOf[js.Any])
      
      inline def setKernelConstraintUndefined: Self = StObject.set(x, "kernelConstraint", js.undefined)
      
      inline def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "kernelInitializer", value.asInstanceOf[js.Any])
      
      inline def setKernelInitializerUndefined: Self = StObject.set(x, "kernelInitializer", js.undefined)
      
      inline def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "kernelRegularizer", value.asInstanceOf[js.Any])
      
      inline def setKernelRegularizerUndefined: Self = StObject.set(x, "kernelRegularizer", js.undefined)
      
      inline def setKernelSize(value: Double | js.Array[Double]): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
      
      inline def setKernelSizeVarargs(value: Double*): Self = StObject.set(x, "kernelSize", js.Array(value*))
      
      inline def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setRecurrentConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "recurrentConstraint", value.asInstanceOf[js.Any])
      
      inline def setRecurrentConstraintUndefined: Self = StObject.set(x, "recurrentConstraint", js.undefined)
      
      inline def setRecurrentDropout(value: Double): Self = StObject.set(x, "recurrentDropout", value.asInstanceOf[js.Any])
      
      inline def setRecurrentDropoutUndefined: Self = StObject.set(x, "recurrentDropout", js.undefined)
      
      inline def setRecurrentInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "recurrentInitializer", value.asInstanceOf[js.Any])
      
      inline def setRecurrentInitializerUndefined: Self = StObject.set(x, "recurrentInitializer", js.undefined)
      
      inline def setRecurrentRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "recurrentRegularizer", value.asInstanceOf[js.Any])
      
      inline def setRecurrentRegularizerUndefined: Self = StObject.set(x, "recurrentRegularizer", js.undefined)
      
      inline def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
      
      inline def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
      
      inline def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
    }
  }
}
