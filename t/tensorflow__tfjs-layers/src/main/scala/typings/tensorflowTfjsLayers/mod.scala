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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow/tfjs-layers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    def this(callbacks: js.Array[BaseCallback], queueLength: Double) = this()
    def this(callbacks: Unit, queueLength: Double) = this()
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
    def this(`val`: Tensor[Rank], dtype: Unit, name: String) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: String, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: Unit, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: Unit, trainable: Boolean) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: String, trainable: Boolean, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: String, trainable: Unit, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: Unit, trainable: Boolean, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: Unit, name: Unit, trainable: Unit, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Boolean, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: String, trainable: Unit, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: Unit, trainable: Boolean, constraint: Constraint) = this()
    def this(`val`: Tensor[Rank], dtype: DataType, name: Unit, trainable: Unit, constraint: Constraint) = this()
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: Unit, fastWeightInit: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](
      cls: SerializableConstructor[T],
      config: ConfigDict,
      customObjects: ConfigDict,
      fastWeightInit: Boolean
    ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any], fastWeightInit.asInstanceOf[js.Any])).asInstanceOf[T]
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
      name: String,
      outputTensorIndex: Double
    ) = this()
    def this(
      dtype: DataType,
      shape: Shape,
      sourceLayer: Layer,
      inputs: js.Array[typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor],
      callArgs: Kwargs,
      name: Unit,
      outputTensorIndex: Double
    ) = this()
  }
  
  object callbacks {
    
    @JSImport("@tensorflow/tfjs-layers", "callbacks")
    @js.native
    val ^ : js.Any = js.native
    
    inline def earlyStopping(): EarlyStopping_ = ^.asInstanceOf[js.Dynamic].applyDynamic("earlyStopping")().asInstanceOf[EarlyStopping_]
    inline def earlyStopping(args: EarlyStoppingCallbackArgs): EarlyStopping_ = ^.asInstanceOf[js.Dynamic].applyDynamic("earlyStopping")(args.asInstanceOf[js.Any]).asInstanceOf[EarlyStopping_]
    @JSImport("@tensorflow/tfjs-layers", "callbacks.earlyStopping")
    @js.native
    def earlyStopping_Fcallbacks: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_] = js.native
    
    inline def earlyStopping_Fcallbacks_=(x: js.Function1[/* args */ js.UndefOr[EarlyStoppingCallbackArgs], EarlyStopping_]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("earlyStopping")(x.asInstanceOf[js.Any])
  }
  
  object constraints {
    
    @JSImport("@tensorflow/tfjs-layers", "constraints")
    @js.native
    val ^ : js.Any = js.native
    
    inline def maxNorm(args: MaxNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("maxNorm")(args.asInstanceOf[js.Any]).asInstanceOf[Constraint]
    
    inline def minMaxNorm(config: MinMaxNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("minMaxNorm")(config.asInstanceOf[js.Any]).asInstanceOf[Constraint]
    
    inline def nonNeg(): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("nonNeg")().asInstanceOf[Constraint]
    
    inline def unitNorm(args: UnitNormArgs): Constraint = ^.asInstanceOf[js.Dynamic].applyDynamic("unitNorm")(args.asInstanceOf[js.Any]).asInstanceOf[Constraint]
  }
  
  object initializers {
    
    @JSImport("@tensorflow/tfjs-layers", "initializers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def constant(args: ConstantArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def glorotNormal(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("glorotNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def glorotUniform(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("glorotUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def heNormal(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("heNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def heUniform(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("heUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def identity(args: IdentityArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def leCunNormal(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("leCunNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def leCunUniform(args: SeedOnlyInitializerArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("leCunUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def ones(): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")().asInstanceOf[Initializer]
    
    inline def orthogonal(args: OrthogonalArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("orthogonal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def randomNormal(args: RandomNormalArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def randomUniform(args: RandomUniformArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUniform")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def truncatedNormal(args: TruncatedNormalArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("truncatedNormal")(args.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def varianceScaling(config: VarianceScalingArgs): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("varianceScaling")(config.asInstanceOf[js.Any]).asInstanceOf[Initializer]
    
    inline def zeros(): Zeros = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")().asInstanceOf[Zeros]
  }
  
  inline def input(config: InputConfig): typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(config.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor]
  
  object layers {
    
    @JSImport("@tensorflow/tfjs-layers", "layers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.Layer")
    @js.native
    abstract class Layer ()
      extends typings.tensorflowTfjsLayers.exportsLayersMod.Layer {
      def this(args: LayerArgs) = this()
    }
    /* static members */
    object Layer {
      
      @JSImport("@tensorflow/tfjs-layers", "layers.Layer")
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
      inline def nodeKey(layer: typings.tensorflowTfjsLayers.topologyMod.Layer, nodeIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeKey")(layer.asInstanceOf[js.Any], nodeIndex.asInstanceOf[js.Any])).asInstanceOf[String]
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
      inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** @nocollapse */
      inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
      inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
    }
    
    inline def activation(args: ActivationLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("activation")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def add(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def add(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def alphaDropout(args: AlphaDropoutArgs): AlphaDropout = ^.asInstanceOf[js.Dynamic].applyDynamic("alphaDropout")(args.asInstanceOf[js.Any]).asInstanceOf[AlphaDropout]
    
    inline def average(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("average")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def average(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def averagePooling1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("averagePooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def averagePooling2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("averagePooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def averagePooling3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("averagePooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def avgPool1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def avgPool2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def avgPool3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool3d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def avgPooling1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def avgPooling2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def avgPooling3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def batchNormalization(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def batchNormalization(args: BatchNormalizationLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def bidirectional(args: BidirectionalLayerArgs): Bidirectional = ^.asInstanceOf[js.Dynamic].applyDynamic("bidirectional")(args.asInstanceOf[js.Any]).asInstanceOf[Bidirectional]
    
    inline def concatenate(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def concatenate(args: ConcatenateLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def conv1d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def conv2d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def conv2dTranspose(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2dTranspose")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def conv3d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def convLstm2d(args: ConvLSTM2DArgs): ConvLSTM2D = ^.asInstanceOf[js.Dynamic].applyDynamic("convLstm2d")(args.asInstanceOf[js.Any]).asInstanceOf[ConvLSTM2D]
    
    inline def convLstm2dCell(args: ConvLSTM2DCellArgs): ConvLSTM2DCell = ^.asInstanceOf[js.Dynamic].applyDynamic("convLstm2dCell")(args.asInstanceOf[js.Any]).asInstanceOf[ConvLSTM2DCell]
    
    inline def cropping2D(args: Cropping2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("cropping2D")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def dense(args: DenseLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("dense")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def depthwiseConv2d(args: DepthwiseConv2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def dot(args: DotLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("dot")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def dropout(args: DropoutLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("dropout")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def elu(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("elu")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def elu(args: ELULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("elu")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def embedding(args: EmbeddingLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("embedding")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def flatten(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def flatten(args: FlattenLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def gaussianDropout(args: GaussianDropoutArgs): GaussianDropout = ^.asInstanceOf[js.Dynamic].applyDynamic("gaussianDropout")(args.asInstanceOf[js.Any]).asInstanceOf[GaussianDropout]
    
    inline def gaussianNoise(args: GaussianNoiseArgs): GaussianNoise = ^.asInstanceOf[js.Dynamic].applyDynamic("gaussianNoise")(args.asInstanceOf[js.Any]).asInstanceOf[GaussianNoise]
    
    inline def globalAveragePooling1d(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalAveragePooling1d")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def globalAveragePooling1d(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalAveragePooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def globalAveragePooling2d(args: GlobalPooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalAveragePooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPool1d")
    @js.native
    val globalMaxPool1d: js.Function1[/* args */ js.UndefOr[LayerArgs], typings.tensorflowTfjsLayers.topologyMod.Layer] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.globalMaxPool2d")
    @js.native
    val globalMaxPool2d: js.Function1[
        /* args */ GlobalPooling2DLayerArgs, 
        typings.tensorflowTfjsLayers.topologyMod.Layer
      ] = js.native
    
    inline def globalMaxPooling1d(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling1d")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def globalMaxPooling1d(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def globalMaxPooling2d(args: GlobalPooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def gru(args: GRULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("gru")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def gruCell(args: GRUCellLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = ^.asInstanceOf[js.Dynamic].applyDynamic("gruCell")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.recurrentMod.RNNCell]
    
    inline def input(config: InputConfig): typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(config.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor]
    
    inline def inputLayer(args: InputLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("inputLayer")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def layerNormalization(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("layerNormalization")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def layerNormalization(args: LayerNormalizationLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("layerNormalization")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def leakyReLU(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyReLU")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def leakyReLU(args: LeakyReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyReLU")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def lstm(args: LSTMLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("lstm")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def lstmCell(args: LSTMCellLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = ^.asInstanceOf[js.Dynamic].applyDynamic("lstmCell")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.recurrentMod.RNNCell]
    
    inline def masking(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("masking")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def masking(args: MaskingArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("masking")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPool1d")
    @js.native
    val maxPool1d: js.Function1[/* args */ Pooling1DLayerArgs, typings.tensorflowTfjsLayers.topologyMod.Layer] = js.native
    
    @JSImport("@tensorflow/tfjs-layers", "layers.maxPool2d")
    @js.native
    val maxPool2d: js.Function1[/* args */ Pooling2DLayerArgs, typings.tensorflowTfjsLayers.topologyMod.Layer] = js.native
    
    inline def maxPooling1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def maxPooling2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def maxPooling3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def maximum(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def maximum(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def minimum(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def minimum(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def multiply(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def multiply(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def permute(args: PermuteLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("permute")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def prelu(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def prelu(args: PReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def reLU(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("reLU")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def reLU(args: ReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("reLU")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def repeatVector(args: RepeatVectorLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatVector")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def reshape(args: ReshapeLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def rnn(args: RNNLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def separableConv2d(args: SeparableConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("separableConv2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def simpleRNN(args: SimpleRNNLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleRNN")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def simpleRNNCell(args: SimpleRNNCellLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleRNNCell")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.recurrentMod.RNNCell]
    
    inline def softmax(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def softmax(args: SoftmaxLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def spatialDropout1d(args: SpatialDropout1DLayerConfig): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("spatialDropout1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def stackedRNNCells(args: StackedRNNCellsArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = ^.asInstanceOf[js.Dynamic].applyDynamic("stackedRNNCells")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.recurrentMod.RNNCell]
    
    inline def thresholdedReLU(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("thresholdedReLU")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def thresholdedReLU(args: ThresholdedReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("thresholdedReLU")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def timeDistributed(args: WrapperLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("timeDistributed")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def upSampling2d(args: UpSampling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("upSampling2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    
    inline def zeroPadding2d(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadding2d")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
    inline def zeroPadding2d(args: ZeroPadding2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadding2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  }
  
  inline def loadLayersModel(pathOrIOHandler: String): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel]]
  inline def loadLayersModel(pathOrIOHandler: String, options: LoadOptions): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel]]
  inline def loadLayersModel(pathOrIOHandler: IOHandler): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel]]
  inline def loadLayersModel(pathOrIOHandler: IOHandler, options: LoadOptions): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadLayersModel")(pathOrIOHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel]]
  
  object metrics {
    
    @JSImport("@tensorflow/tfjs-layers", "metrics")
    @js.native
    val ^ : js.Any = js.native
    
    inline def MAPE_(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("MAPE")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def MSE_(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("MSE")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def binaryAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def binaryCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryCrossentropy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def categoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("categoricalAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def categoricalCrossentropy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("categoricalCrossentropy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def cosineProximity(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("cosineProximity")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def mape(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("mape")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def meanAbsoluteError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanAbsoluteError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def meanAbsolutePercentageError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanAbsolutePercentageError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def meanSquaredError(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("meanSquaredError")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def mse(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("mse")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def precision(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("precision")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def recall(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("recall")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
    
    inline def sparseCategoricalAccuracy(yTrue: Tensor[Rank], yPred: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("sparseCategoricalAccuracy")(yTrue.asInstanceOf[js.Any], yPred.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  }
  
  inline def model(args: ContainerArgs): typings.tensorflowTfjsLayers.trainingMod.LayersModel = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.trainingMod.LayersModel]
  
  object models {
    
    @JSImport("@tensorflow/tfjs-layers", "models")
    @js.native
    val ^ : js.Any = js.native
    
    inline def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel]]
    inline def modelFromJSON(modelAndWeightsConfig: ModelAndWeightsConfig, customObjects: ConfigDict): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel]]
    inline def modelFromJSON(modelAndWeightsConfig: PyJsonDict): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = ^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel]]
    inline def modelFromJSON(modelAndWeightsConfig: PyJsonDict, customObjects: ConfigDict): js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel] = (^.asInstanceOf[js.Dynamic].applyDynamic("modelFromJSON")(modelAndWeightsConfig.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tensorflowTfjsLayers.trainingMod.LayersModel]]
  }
  
  inline def registerCallbackConstructor(verbosityLevel: Double, callbackConstructor: BaseCallbackConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCallbackConstructor")(verbosityLevel.asInstanceOf[js.Any], callbackConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object regularizers {
    
    @JSImport("@tensorflow/tfjs-layers", "regularizers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def l1(): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l1")().asInstanceOf[Regularizer]
    inline def l1(config: L1Args): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l1")(config.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
    
    inline def l1l2(): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l1l2")().asInstanceOf[Regularizer]
    inline def l1l2(config: L1L2Args): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l1l2")(config.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
    
    inline def l2(): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l2")().asInstanceOf[Regularizer]
    inline def l2(config: L2Args): Regularizer = ^.asInstanceOf[js.Dynamic].applyDynamic("l2")(config.asInstanceOf[js.Any]).asInstanceOf[Regularizer]
  }
  
  inline def sequential(): Sequential = ^.asInstanceOf[js.Dynamic].applyDynamic("sequential")().asInstanceOf[Sequential]
  inline def sequential(config: SequentialArgs): Sequential = ^.asInstanceOf[js.Dynamic].applyDynamic("sequential")(config.asInstanceOf[js.Any]).asInstanceOf[Sequential]
  
  @JSImport("@tensorflow/tfjs-layers", "version_layers")
  @js.native
  val versionLayers: /* "2.7.0" */ String = js.native
}
