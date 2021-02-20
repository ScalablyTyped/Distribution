package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import typings.tensorflowTfjsLayers.advancedActivationsMod.ELULayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.LeakyReLULayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.PReLULayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.ReLULayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.SoftmaxLayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.ThresholdedReLULayerArgs
import typings.tensorflowTfjsLayers.baseCallbacksMod.BaseCallback
import typings.tensorflowTfjsLayers.baseCallbacksMod.BaseCallbackConstructor
import typings.tensorflowTfjsLayers.baseCallbacksMod.CustomCallbackArgs
import typings.tensorflowTfjsLayers.baseCallbacksMod.YieldEveryOptions
import typings.tensorflowTfjsLayers.callbacksMod.EarlyStoppingCallbackArgs
import typings.tensorflowTfjsLayers.callbacksMod.EarlyStopping_
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.MaxNormArgs
import typings.tensorflowTfjsLayers.constraintsMod.MinMaxNormArgs
import typings.tensorflowTfjsLayers.constraintsMod.UnitNormArgs
import typings.tensorflowTfjsLayers.containerMod.ContainerArgs
import typings.tensorflowTfjsLayers.convolutionalDepthwiseMod.DepthwiseConv2DLayerArgs
import typings.tensorflowTfjsLayers.convolutionalMod.ConvLayerArgs
import typings.tensorflowTfjsLayers.convolutionalMod.Cropping2DLayerArgs
import typings.tensorflowTfjsLayers.convolutionalMod.SeparableConvLayerArgs
import typings.tensorflowTfjsLayers.convolutionalMod.UpSampling2DLayerArgs
import typings.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvLSTM2D
import typings.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvLSTM2DArgs
import typings.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvLSTM2DCell
import typings.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvLSTM2DCellArgs
import typings.tensorflowTfjsLayers.coreMod.ActivationLayerArgs
import typings.tensorflowTfjsLayers.coreMod.DenseLayerArgs
import typings.tensorflowTfjsLayers.coreMod.DropoutLayerArgs
import typings.tensorflowTfjsLayers.coreMod.FlattenLayerArgs
import typings.tensorflowTfjsLayers.coreMod.MaskingArgs
import typings.tensorflowTfjsLayers.coreMod.PermuteLayerArgs
import typings.tensorflowTfjsLayers.coreMod.RepeatVectorLayerArgs
import typings.tensorflowTfjsLayers.coreMod.ReshapeLayerArgs
import typings.tensorflowTfjsLayers.coreMod.SpatialDropout1DLayerConfig
import typings.tensorflowTfjsLayers.distTypesMod.Kwargs
import typings.tensorflowTfjsLayers.embeddingsMod.EmbeddingLayerArgs
import typings.tensorflowTfjsLayers.initializersMod.ConstantArgs
import typings.tensorflowTfjsLayers.initializersMod.IdentityArgs
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.OrthogonalArgs
import typings.tensorflowTfjsLayers.initializersMod.RandomNormalArgs
import typings.tensorflowTfjsLayers.initializersMod.RandomUniformArgs
import typings.tensorflowTfjsLayers.initializersMod.SeedOnlyInitializerArgs
import typings.tensorflowTfjsLayers.initializersMod.TruncatedNormalArgs
import typings.tensorflowTfjsLayers.initializersMod.VarianceScalingArgs
import typings.tensorflowTfjsLayers.initializersMod.Zeros
import typings.tensorflowTfjsLayers.inputLayerMod.InputConfig
import typings.tensorflowTfjsLayers.inputLayerMod.InputLayerArgs
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.mergeMod.ConcatenateLayerArgs
import typings.tensorflowTfjsLayers.mergeMod.DotLayerArgs
import typings.tensorflowTfjsLayers.modelsMod.ModelAndWeightsConfig
import typings.tensorflowTfjsLayers.modelsMod.Sequential
import typings.tensorflowTfjsLayers.modelsMod.SequentialArgs
import typings.tensorflowTfjsLayers.noiseMod.AlphaDropout
import typings.tensorflowTfjsLayers.noiseMod.AlphaDropoutArgs
import typings.tensorflowTfjsLayers.noiseMod.GaussianDropout
import typings.tensorflowTfjsLayers.noiseMod.GaussianDropoutArgs
import typings.tensorflowTfjsLayers.noiseMod.GaussianNoise
import typings.tensorflowTfjsLayers.noiseMod.GaussianNoiseArgs
import typings.tensorflowTfjsLayers.normalizationMod.BatchNormalizationLayerArgs
import typings.tensorflowTfjsLayers.normalizationMod.LayerNormalizationLayerArgs
import typings.tensorflowTfjsLayers.paddingMod.ZeroPadding2DLayerArgs
import typings.tensorflowTfjsLayers.poolingMod.GlobalPooling2DLayerArgs
import typings.tensorflowTfjsLayers.poolingMod.Pooling1DLayerArgs
import typings.tensorflowTfjsLayers.poolingMod.Pooling2DLayerArgs
import typings.tensorflowTfjsLayers.poolingMod.Pooling3DLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.GRUCellLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.GRULayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.LSTMCellLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.LSTMLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.RNNLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.RNN_
import typings.tensorflowTfjsLayers.recurrentMod.SimpleRNNCellLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.SimpleRNNLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.StackedRNNCellsArgs
import typings.tensorflowTfjsLayers.regularizersMod.L1Args
import typings.tensorflowTfjsLayers.regularizersMod.L1L2Args
import typings.tensorflowTfjsLayers.regularizersMod.L2Args
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.topologyMod.InputSpecArgs
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import typings.tensorflowTfjsLayers.typesMod.PyJsonDict
import typings.tensorflowTfjsLayers.wrappersMod.Bidirectional
import typings.tensorflowTfjsLayers.wrappersMod.BidirectionalLayerArgs
import typings.tensorflowTfjsLayers.wrappersMod.WrapperLayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow/tfjs-layers", "Callback")
  @js.native
  abstract class Callback ()
    extends typings.tensorflowTfjsLayers.callbacksMod.Callback
  
  @JSImport("@tensorflow/tfjs-layers", "CallbackList")
  @js.native
  /**
    * Constructor of CallbackList.
    * @param callbacks Array of `Callback` instances.
    * @param queueLength Queue length for keeping running statistics over
    *   callback execution time.
    */
  class CallbackList ()
    extends typings.tensorflowTfjsLayers.baseCallbacksMod.CallbackList {
    def this(callbacks: js.Array[BaseCallback]) = this()
    def this(callbacks: js.UndefOr[scala.Nothing], queueLength: Double) = this()
    def this(callbacks: js.Array[BaseCallback], queueLength: Double) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "CustomCallback")
  @js.native
  class CustomCallback protected ()
    extends typings.tensorflowTfjsLayers.baseCallbacksMod.CustomCallback {
    def this(args: CustomCallbackArgs) = this()
    def this(args: CustomCallbackArgs, yieldEvery: YieldEveryOptions) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "EarlyStopping")
  @js.native
  class EarlyStopping () extends EarlyStopping_ {
    def this(args: EarlyStoppingCallbackArgs) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "History")
  @js.native
  class History ()
    extends typings.tensorflowTfjsLayers.baseCallbacksMod.History
  
  @JSImport("@tensorflow/tfjs-layers", "InputSpec")
  @js.native
  class InputSpec protected ()
    extends typings.tensorflowTfjsLayers.topologyMod.InputSpec {
    def this(args: InputSpecArgs) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "LayerVariable")
  @js.native
  class LayerVariable protected ()
    extends typings.tensorflowTfjsLayers.variablesMod.LayerVariable {
    /**
      * Construct Variable from a `tf.Tensor`.
      *
      * If not explicitly named, the Variable will be given a name with the
      * prefix 'Variable'. Variable names are unique. In the case of name
      * collision, suffixies '_<num>' will be added to the name.
      *
      * @param val Initial value of the Variable.
      * @param name Name of the variable. If `null` or `undefined` is provided, it
      *   will default a name with the prefix 'Variable'.
      * @param constraint Optional, projection function to be applied to the
      * variable after optimize updates
      * @throws ValueError if `name` is `null` or `undefined`.
      */
    def this(`val`: Tensor[Rank]) = this()
    def this(`val`: Tensor[Rank], dtype: DataType) = this()
    def this(`val`: Tensor[Rank], dtype: js.UndefOr[scala.Nothing], name: String) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      trainable: Boolean
    ) = this()
    def this(`val`: Tensor[Rank], dtype: js.UndefOr[scala.Nothing], name: String, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: js.UndefOr[scala.Nothing], trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      trainable: js.UndefOr[scala.Nothing],
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      trainable: Boolean,
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: String,
      trainable: js.UndefOr[scala.Nothing],
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: js.UndefOr[scala.Nothing],
      name: String,
      trainable: Boolean,
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: DataType,
      name: js.UndefOr[scala.Nothing],
      trainable: js.UndefOr[scala.Nothing],
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: DataType,
      name: js.UndefOr[scala.Nothing],
      trainable: Boolean,
      constraint: Constraint
    ) = this()
    def this(
      `val`: Tensor[Rank],
      dtype: DataType,
      name: String,
      trainable: js.UndefOr[scala.Nothing],
      constraint: Constraint
    ) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean, constraint: Constraint) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers", "LayersModel")
  @js.native
  class LayersModel protected ()
    extends typings.tensorflowTfjsLayers.trainingMod.LayersModel {
    def this(args: ContainerArgs) = this()
  }
  /* static members */
  object LayersModel {
    
    @JSImport("@tensorflow/tfjs-layers", "LayersModel")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "LayersModel.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers", "RNN")
  @js.native
  class RNN protected () extends RNN_ {
    def this(args: RNNLayerArgs) = this()
  }
  /* static members */
  object RNN {
    
    @JSImport("@tensorflow/tfjs-layers", "RNN")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "RNN.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "RNN.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
    @JSImport("@tensorflow/tfjs-layers", "RNN.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "Sequential")
  @js.native
  class Sequential_ () extends Sequential {
    def this(args: SequentialArgs) = this()
  }
  /* static members */
  object Sequential_ {
    
    @JSImport("@tensorflow/tfjs-layers", "Sequential")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "Sequential.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers", "Sequential.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
    @JSImport("@tensorflow/tfjs-layers", "Sequential.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](
      cls: SerializableConstructor[T],
      config: ConfigDict,
      customObjects: js.UndefOr[scala.Nothing],
      fastWeightInit: Boolean
    ): T = js.native
    @JSImport("@tensorflow/tfjs-layers", "Sequential.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
    @JSImport("@tensorflow/tfjs-layers", "Sequential.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](
      cls: SerializableConstructor[T],
      config: ConfigDict,
      customObjects: ConfigDict,
      fastWeightInit: Boolean
    ): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "SymbolicTensor")
  @js.native
  class SymbolicTensor protected ()
    extends typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor {
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
      inputs: js.Array[typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor],
      callArgs: Kwargs
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor],
      callArgs: Kwargs,
      name: String
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor],
      callArgs: Kwargs,
      name: js.UndefOr[scala.Nothing],
      outputTensorIndex: Double
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor],
      callArgs: Kwargs,
      name: String,
      outputTensorIndex: Double
    ) = this()
  }
  
  object callbacks {
    
    @JSImport("@tensorflow/tfjs-layers", "callbacks")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "callbacks.earlyStopping")
    @js.native
    def earlyStopping(): EarlyStopping_ = js.native
    @JSImport("@tensorflow/tfjs-layers", "callbacks.earlyStopping")
    @js.native
    def earlyStopping(args: EarlyStoppingCallbackArgs): EarlyStopping_ = js.native
    @JSImport("@tensorflow/tfjs-layers", "callbacks.earlyStopping")
    @js.native
    def earlyStopping_Fcallbacks: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_] = js.native
    
    @scala.inline
    def earlyStopping_Fcallbacks_=(x: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("earlyStopping")(x.asInstanceOf[js.Any])
  }
  
  object constraints {
    
    @JSImport("@tensorflow/tfjs-layers", "constraints.maxNorm")
    @js.native
    def maxNorm(args: MaxNormArgs): Constraint = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "constraints.minMaxNorm")
    @js.native
    def minMaxNorm(config: MinMaxNormArgs): Constraint = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "constraints.nonNeg")
    @js.native
    def nonNeg(): Constraint = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "constraints.unitNorm")
    @js.native
    def unitNorm(args: UnitNormArgs): Constraint = js.native
  }
  
  object initializers {
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.constant")
    @js.native
    def constant(args: ConstantArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.glorotNormal")
    @js.native
    def glorotNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.glorotUniform")
    @js.native
    def glorotUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.heNormal")
    @js.native
    def heNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.heUniform")
    @js.native
    def heUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.identity")
    @js.native
    def identity(args: IdentityArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.leCunNormal")
    @js.native
    def leCunNormal(args: SeedOnlyInitializerArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.leCunUniform")
    @js.native
    def leCunUniform(args: SeedOnlyInitializerArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.ones")
    @js.native
    def ones(): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.orthogonal")
    @js.native
    def orthogonal(args: OrthogonalArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.randomNormal")
    @js.native
    def randomNormal(args: RandomNormalArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.randomUniform")
    @js.native
    def randomUniform(args: RandomUniformArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.truncatedNormal")
    @js.native
    def truncatedNormal(args: TruncatedNormalArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.varianceScaling")
    @js.native
    def varianceScaling(config: VarianceScalingArgs): Initializer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "initializers.zeros")
    @js.native
    def zeros(): Zeros = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "input")
  @js.native
  def input(config: InputConfig): typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor = js.native
  
  object layers {
    
    @JSImport("@tensorflow/tfjs-layers", "layers.Layer")
    @js.native
    abstract class Layer ()
      extends typings.tensorflowTfjsLayers.exportsLayersMod.Layer {
      def this(args: LayerArgs) = this()
    }
    /* static members */
    object Layer {
      
      /**
        * Converts a layer and its index to a unique (immutable type) name.
        * This function is used internally with `this.containerNodes`.
        * @param layer The layer.
        * @param nodeIndex The layer's position (e.g. via enumerate) in a list of
        *   nodes.
        *
        * @returns The unique name.
        */
      @JSImport("@tensorflow/tfjs-layers", "layers.Layer.nodeKey")
      @js.native
      def nodeKey(layer: typings.tensorflowTfjsLayers.topologyMod.Layer, nodeIndex: Double): String = js.native
    }
    
    @JSImport("@tensorflow/tfjs-layers", "layers.RNNCell")
    @js.native
    abstract class RNNCell ()
      extends typings.tensorflowTfjsLayers.exportsLayersMod.RNNCell {
      def this(args: LayerArgs) = this()
    }
    
    @JSImport("@tensorflow/tfjs-layers", "layers.RNN")
    @js.native
    class RNN_ protected ()
      extends typings.tensorflowTfjsLayers.exportsLayersMod.RNN_ {
      def this(args: RNNLayerArgs) = this()
    }
    /* static members */
    object RNN_ {
      
      @JSImport("@tensorflow/tfjs-layers", "layers.RNN")
      @js.native
      val ^ : js.Any = js.native
      
      /** @nocollapse */
      @JSImport("@tensorflow/tfjs-layers", "layers.RNN.className")
      @js.native
      def className: String = js.native
      @scala.inline
      def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** @nocollapse */
      @JSImport("@tensorflow/tfjs-layers", "layers.RNN.fromConfig")
      @js.native
      def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
      @JSImport("@tensorflow/tfjs-layers", "layers.RNN.fromConfig")
      @js.native
      def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
    }
    
    @JSImport("@tensorflow/tfjs-layers", "layers.activation")
    @js.native
    def activation(args: ActivationLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.add")
    @js.native
    def add(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.add")
    @js.native
    def add(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.alphaDropout")
    @js.native
    def alphaDropout(args: AlphaDropoutArgs): AlphaDropout = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.average")
    @js.native
    def average(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.average")
    @js.native
    def average(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.averagePooling1d")
    @js.native
    def averagePooling1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.averagePooling2d")
    @js.native
    def averagePooling2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.averagePooling3d")
    @js.native
    def averagePooling3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.avgPool1d")
    @js.native
    def avgPool1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.avgPool2d")
    @js.native
    def avgPool2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.avgPool3d")
    @js.native
    def avgPool3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.avgPooling1d")
    @js.native
    def avgPooling1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.avgPooling2d")
    @js.native
    def avgPooling2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.avgPooling3d")
    @js.native
    def avgPooling3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.batchNormalization")
    @js.native
    def batchNormalization(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.batchNormalization")
    @js.native
    def batchNormalization(args: BatchNormalizationLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.bidirectional")
    @js.native
    def bidirectional(args: BidirectionalLayerArgs): Bidirectional = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.concatenate")
    @js.native
    def concatenate(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.concatenate")
    @js.native
    def concatenate(args: ConcatenateLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.conv1d")
    @js.native
    def conv1d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.conv2d")
    @js.native
    def conv2d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.conv2dTranspose")
    @js.native
    def conv2dTranspose(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.conv3d")
    @js.native
    def conv3d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.convLstm2d")
    @js.native
    def convLstm2d(args: ConvLSTM2DArgs): ConvLSTM2D = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.convLstm2dCell")
    @js.native
    def convLstm2dCell(args: ConvLSTM2DCellArgs): ConvLSTM2DCell = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.cropping2D")
    @js.native
    def cropping2D(args: Cropping2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.dense")
    @js.native
    def dense(args: DenseLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.depthwiseConv2d")
    @js.native
    def depthwiseConv2d(args: DepthwiseConv2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.dot")
    @js.native
    def dot(args: DotLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.dropout")
    @js.native
    def dropout(args: DropoutLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.elu")
    @js.native
    def elu(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.elu")
    @js.native
    def elu(args: ELULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.embedding")
    @js.native
    def embedding(args: EmbeddingLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.flatten")
    @js.native
    def flatten(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.flatten")
    @js.native
    def flatten(args: FlattenLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.gaussianDropout")
    @js.native
    def gaussianDropout(args: GaussianDropoutArgs): GaussianDropout = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.gaussianNoise")
    @js.native
    def gaussianNoise(args: GaussianNoiseArgs): GaussianNoise = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalAveragePooling1d")
    @js.native
    def globalAveragePooling1d(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.globalAveragePooling1d")
    @js.native
    def globalAveragePooling1d(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalAveragePooling2d")
    @js.native
    def globalAveragePooling2d(args: GlobalPooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPool1d")
    @js.native
    val globalMaxPool1d: js.Function1[/* args */ js.UndefOr[LayerArgs], typings.tensorflowTfjsLayers.topologyMod.Layer] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPool2d")
    @js.native
    val globalMaxPool2d: js.Function1[
        /* args */ GlobalPooling2DLayerArgs, 
        typings.tensorflowTfjsLayers.topologyMod.Layer
      ] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPooling1d")
    @js.native
    def globalMaxPooling1d(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPooling1d")
    @js.native
    def globalMaxPooling1d(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPooling2d")
    @js.native
    def globalMaxPooling2d(args: GlobalPooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.gru")
    @js.native
    def gru(args: GRULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.gruCell")
    @js.native
    def gruCell(args: GRUCellLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.input")
    @js.native
    def input(config: InputConfig): typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.inputLayer")
    @js.native
    def inputLayer(args: InputLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.layerNormalization")
    @js.native
    def layerNormalization(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.layerNormalization")
    @js.native
    def layerNormalization(args: LayerNormalizationLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.leakyReLU")
    @js.native
    def leakyReLU(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.leakyReLU")
    @js.native
    def leakyReLU(args: LeakyReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.lstm")
    @js.native
    def lstm(args: LSTMLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.lstmCell")
    @js.native
    def lstmCell(args: LSTMCellLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.masking")
    @js.native
    def masking(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.masking")
    @js.native
    def masking(args: MaskingArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPool1d")
    @js.native
    val maxPool1d: js.Function1[/* args */ Pooling1DLayerArgs, typings.tensorflowTfjsLayers.topologyMod.Layer] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPool2d")
    @js.native
    val maxPool2d: js.Function1[/* args */ Pooling2DLayerArgs, typings.tensorflowTfjsLayers.topologyMod.Layer] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPooling1d")
    @js.native
    def maxPooling1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPooling2d")
    @js.native
    def maxPooling2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPooling3d")
    @js.native
    def maxPooling3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maximum")
    @js.native
    def maximum(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.maximum")
    @js.native
    def maximum(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.minimum")
    @js.native
    def minimum(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.minimum")
    @js.native
    def minimum(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.multiply")
    @js.native
    def multiply(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.multiply")
    @js.native
    def multiply(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.permute")
    @js.native
    def permute(args: PermuteLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.prelu")
    @js.native
    def prelu(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.prelu")
    @js.native
    def prelu(args: PReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.reLU")
    @js.native
    def reLU(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.reLU")
    @js.native
    def reLU(args: ReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.repeatVector")
    @js.native
    def repeatVector(args: RepeatVectorLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.reshape")
    @js.native
    def reshape(args: ReshapeLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.rnn")
    @js.native
    def rnn(args: RNNLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.separableConv2d")
    @js.native
    def separableConv2d(args: SeparableConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.simpleRNN")
    @js.native
    def simpleRNN(args: SimpleRNNLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.simpleRNNCell")
    @js.native
    def simpleRNNCell(args: SimpleRNNCellLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.softmax")
    @js.native
    def softmax(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.softmax")
    @js.native
    def softmax(args: SoftmaxLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.spatialDropout1d")
    @js.native
    def spatialDropout1d(args: SpatialDropout1DLayerConfig): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.stackedRNNCells")
    @js.native
    def stackedRNNCells(args: StackedRNNCellsArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.thresholdedReLU")
    @js.native
    def thresholdedReLU(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.thresholdedReLU")
    @js.native
    def thresholdedReLU(args: ThresholdedReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.timeDistributed")
    @js.native
    def timeDistributed(args: WrapperLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.upSampling2d")
    @js.native
    def upSampling2d(args: UpSampling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.zeroPadding2d")
    @js.native
    def zeroPadding2d(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
    @JSImport("@tensorflow/tfjs-layers", "layers.zeroPadding2d")
    @js.native
    def zeroPadding2d(args: ZeroPadding2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "loadLayersModel")
  @js.native
  def loadLayersModel(pathOrIOHandler: String): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers", "loadLayersModel")
  @js.native
  def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers", "loadLayersModel")
  @js.native
  def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  @JSImport("@tensorflow/tfjs-layers", "loadLayersModel")
  @js.native
  def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  
  object metrics {
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.MAPE")
    @js.native
    def MAPE_(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.MSE")
    @js.native
    def MSE_(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.binaryAccuracy")
    @js.native
    def binaryAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.binaryCrossentropy")
    @js.native
    def binaryCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.categoricalAccuracy")
    @js.native
    def categoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.categoricalCrossentropy")
    @js.native
    def categoricalCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.cosineProximity")
    @js.native
    def cosineProximity(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.mape")
    @js.native
    def mape(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.meanAbsoluteError")
    @js.native
    def meanAbsoluteError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.meanAbsolutePercentageError")
    @js.native
    def meanAbsolutePercentageError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.meanSquaredError")
    @js.native
    def meanSquaredError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.mse")
    @js.native
    def mse(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.precision")
    @js.native
    def precision(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.recall")
    @js.native
    def recall(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "metrics.sparseCategoricalAccuracy")
    @js.native
    def sparseCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "model")
  @js.native
  def model(args: ContainerArgs): typings.tensorflowTfjsLayers.trainingMod.LayersModel = js.native
  
  object models {
    
    @JSImport("@tensorflow/tfjs-layers", "models.modelFromJSON")
    @js.native
    def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
    @JSImport("@tensorflow/tfjs-layers", "models.modelFromJSON")
    @js.native
    def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
    @JSImport("@tensorflow/tfjs-layers", "models.modelFromJSON")
    @js.native
    def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
    @JSImport("@tensorflow/tfjs-layers", "models.modelFromJSON")
    @js.native
    def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "registerCallbackConstructor")
  @js.native
  def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = js.native
  
  object regularizers {
    
    @JSImport("@tensorflow/tfjs-layers", "regularizers.l1")
    @js.native
    def l1(): Regularizer = js.native
    @JSImport("@tensorflow/tfjs-layers", "regularizers.l1")
    @js.native
    def l1(config: L1Args): Regularizer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "regularizers.l1l2")
    @js.native
    def l1l2(): Regularizer = js.native
    @JSImport("@tensorflow/tfjs-layers", "regularizers.l1l2")
    @js.native
    def l1l2(config: L1L2Args): Regularizer = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "regularizers.l2")
    @js.native
    def l2(): Regularizer = js.native
    @JSImport("@tensorflow/tfjs-layers", "regularizers.l2")
    @js.native
    def l2(config: L2Args): Regularizer = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers", "sequential")
  @js.native
  def sequential(): Sequential = js.native
  @JSImport("@tensorflow/tfjs-layers", "sequential")
  @js.native
  def sequential(config: SequentialArgs): Sequential = js.native
  
  @JSImport("@tensorflow/tfjs-layers", "version_layers")
  @js.native
  val versionLayers: /* "2.7.0" */ String = js.native
}
