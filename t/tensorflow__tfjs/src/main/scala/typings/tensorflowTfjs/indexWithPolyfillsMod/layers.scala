package typings.tensorflowTfjs.indexWithPolyfillsMod

import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typings.tensorflowTfjsLayers.advancedActivationsMod.ELU
import typings.tensorflowTfjsLayers.advancedActivationsMod.ELULayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.LeakyReLU
import typings.tensorflowTfjsLayers.advancedActivationsMod.LeakyReLULayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.PReLU
import typings.tensorflowTfjsLayers.advancedActivationsMod.PReLULayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.ReLU
import typings.tensorflowTfjsLayers.advancedActivationsMod.ReLULayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.Softmax
import typings.tensorflowTfjsLayers.advancedActivationsMod.SoftmaxLayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.ThresholdedReLU
import typings.tensorflowTfjsLayers.advancedActivationsMod.ThresholdedReLULayerArgs
import typings.tensorflowTfjsLayers.convolutionalDepthwiseMod.DepthwiseConv2DLayerArgs
import typings.tensorflowTfjsLayers.convolutionalDepthwiseMod.DepthwiseConv2D_
import typings.tensorflowTfjsLayers.convolutionalMod.Conv1D_
import typings.tensorflowTfjsLayers.convolutionalMod.Conv2DTranspose
import typings.tensorflowTfjsLayers.convolutionalMod.ConvLayerArgs
import typings.tensorflowTfjsLayers.convolutionalMod.Cropping2D
import typings.tensorflowTfjsLayers.convolutionalMod.Cropping2DLayerArgs
import typings.tensorflowTfjsLayers.convolutionalMod.SeparableConv2D
import typings.tensorflowTfjsLayers.convolutionalMod.SeparableConvLayerArgs
import typings.tensorflowTfjsLayers.convolutionalMod.UpSampling2D
import typings.tensorflowTfjsLayers.convolutionalMod.UpSampling2DLayerArgs
import typings.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvLSTM2D
import typings.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvLSTM2DArgs
import typings.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvLSTM2DCell
import typings.tensorflowTfjsLayers.convolutionalRecurrentMod.ConvLSTM2DCellArgs
import typings.tensorflowTfjsLayers.coreMod.Activation
import typings.tensorflowTfjsLayers.coreMod.ActivationLayerArgs
import typings.tensorflowTfjsLayers.coreMod.Dense
import typings.tensorflowTfjsLayers.coreMod.DenseLayerArgs
import typings.tensorflowTfjsLayers.coreMod.Dropout
import typings.tensorflowTfjsLayers.coreMod.DropoutLayerArgs
import typings.tensorflowTfjsLayers.coreMod.Flatten
import typings.tensorflowTfjsLayers.coreMod.FlattenLayerArgs
import typings.tensorflowTfjsLayers.coreMod.Masking
import typings.tensorflowTfjsLayers.coreMod.MaskingArgs
import typings.tensorflowTfjsLayers.coreMod.Permute
import typings.tensorflowTfjsLayers.coreMod.PermuteLayerArgs
import typings.tensorflowTfjsLayers.coreMod.RepeatVector
import typings.tensorflowTfjsLayers.coreMod.RepeatVectorLayerArgs
import typings.tensorflowTfjsLayers.coreMod.Reshape
import typings.tensorflowTfjsLayers.coreMod.ReshapeLayerArgs
import typings.tensorflowTfjsLayers.coreMod.SpatialDropout1D
import typings.tensorflowTfjsLayers.coreMod.SpatialDropout1DLayerConfig
import typings.tensorflowTfjsLayers.embeddingsMod.Embedding
import typings.tensorflowTfjsLayers.embeddingsMod.EmbeddingLayerArgs
import typings.tensorflowTfjsLayers.inputLayerMod.InputConfig
import typings.tensorflowTfjsLayers.inputLayerMod.InputLayer
import typings.tensorflowTfjsLayers.inputLayerMod.InputLayerArgs
import typings.tensorflowTfjsLayers.mergeMod.Average_
import typings.tensorflowTfjsLayers.mergeMod.ConcatenateLayerArgs
import typings.tensorflowTfjsLayers.mergeMod.Concatenate_
import typings.tensorflowTfjsLayers.mergeMod.Dot
import typings.tensorflowTfjsLayers.mergeMod.DotLayerArgs
import typings.tensorflowTfjsLayers.mergeMod.Multiply_
import typings.tensorflowTfjsLayers.noiseMod.AlphaDropout
import typings.tensorflowTfjsLayers.noiseMod.AlphaDropoutArgs
import typings.tensorflowTfjsLayers.noiseMod.GaussianDropout
import typings.tensorflowTfjsLayers.noiseMod.GaussianDropoutArgs
import typings.tensorflowTfjsLayers.noiseMod.GaussianNoise
import typings.tensorflowTfjsLayers.noiseMod.GaussianNoiseArgs
import typings.tensorflowTfjsLayers.normalizationMod.BatchNormalizationLayerArgs
import typings.tensorflowTfjsLayers.normalizationMod.BatchNormalization_
import typings.tensorflowTfjsLayers.normalizationMod.LayerNormalization
import typings.tensorflowTfjsLayers.normalizationMod.LayerNormalizationLayerArgs
import typings.tensorflowTfjsLayers.paddingMod.ZeroPadding2D
import typings.tensorflowTfjsLayers.paddingMod.ZeroPadding2DLayerArgs
import typings.tensorflowTfjsLayers.poolingMod.AveragePooling1D
import typings.tensorflowTfjsLayers.poolingMod.AveragePooling2D
import typings.tensorflowTfjsLayers.poolingMod.AveragePooling3D
import typings.tensorflowTfjsLayers.poolingMod.GlobalAveragePooling1D
import typings.tensorflowTfjsLayers.poolingMod.GlobalAveragePooling2D
import typings.tensorflowTfjsLayers.poolingMod.GlobalMaxPooling1D
import typings.tensorflowTfjsLayers.poolingMod.GlobalMaxPooling2D
import typings.tensorflowTfjsLayers.poolingMod.GlobalPooling2DLayerArgs
import typings.tensorflowTfjsLayers.poolingMod.MaxPooling1D
import typings.tensorflowTfjsLayers.poolingMod.MaxPooling2D
import typings.tensorflowTfjsLayers.poolingMod.MaxPooling3D
import typings.tensorflowTfjsLayers.poolingMod.Pooling1DLayerArgs
import typings.tensorflowTfjsLayers.poolingMod.Pooling2DLayerArgs
import typings.tensorflowTfjsLayers.poolingMod.Pooling3DLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.GRU
import typings.tensorflowTfjsLayers.recurrentMod.GRUCell
import typings.tensorflowTfjsLayers.recurrentMod.GRUCellLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.GRULayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.LSTM
import typings.tensorflowTfjsLayers.recurrentMod.LSTMCell
import typings.tensorflowTfjsLayers.recurrentMod.LSTMCellLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.LSTMLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.RNNLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.SimpleRNN
import typings.tensorflowTfjsLayers.recurrentMod.SimpleRNNCell
import typings.tensorflowTfjsLayers.recurrentMod.SimpleRNNCellLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.SimpleRNNLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.StackedRNNCells
import typings.tensorflowTfjsLayers.recurrentMod.StackedRNNCellsArgs
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import typings.tensorflowTfjsLayers.wrappersMod.Bidirectional
import typings.tensorflowTfjsLayers.wrappersMod.BidirectionalLayerArgs
import typings.tensorflowTfjsLayers.wrappersMod.TimeDistributed
import typings.tensorflowTfjsLayers.wrappersMod.WrapperLayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layers {
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "layers")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "layers.Layer")
  @js.native
  abstract class Layer ()
    extends typings.tensorflowTfjs.mod.layers.Layer {
    def this(args: LayerArgs) = this()
  }
  /* static members */
  object Layer {
    
    @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "layers.Layer")
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
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "layers.RNNCell")
  @js.native
  abstract class RNNCell ()
    extends typings.tensorflowTfjs.mod.layers.RNNCell {
    def this(args: LayerArgs) = this()
  }
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "layers.RNN")
  @js.native
  open class RNN_ protected ()
    extends typings.tensorflowTfjs.mod.layers.RNN_ {
    def this(args: RNNLayerArgs) = this()
  }
  /* static members */
  object RNN_ {
    
    @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "layers.RNN")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "layers.RNN.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  inline def activation(args: ActivationLayerArgs): Activation = ^.asInstanceOf[js.Dynamic].applyDynamic("activation")(args.asInstanceOf[js.Any]).asInstanceOf[Activation]
  
  inline def add(): typings.tensorflowTfjsLayers.mergeMod.Add_ = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[typings.tensorflowTfjsLayers.mergeMod.Add_]
  inline def add(args: LayerArgs): typings.tensorflowTfjsLayers.mergeMod.Add_ = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.mergeMod.Add_]
  
  inline def alphaDropout(args: AlphaDropoutArgs): AlphaDropout = ^.asInstanceOf[js.Dynamic].applyDynamic("alphaDropout")(args.asInstanceOf[js.Any]).asInstanceOf[AlphaDropout]
  
  inline def average(): Average_ = ^.asInstanceOf[js.Dynamic].applyDynamic("average")().asInstanceOf[Average_]
  inline def average(args: LayerArgs): Average_ = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(args.asInstanceOf[js.Any]).asInstanceOf[Average_]
  
  inline def averagePooling1d(args: Pooling1DLayerArgs): AveragePooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("averagePooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling1D]
  
  inline def averagePooling2d(args: Pooling2DLayerArgs): AveragePooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("averagePooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling2D]
  
  inline def averagePooling3d(args: Pooling3DLayerArgs): AveragePooling3D = ^.asInstanceOf[js.Dynamic].applyDynamic("averagePooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling3D]
  
  inline def avgPool1d(args: Pooling1DLayerArgs): AveragePooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool1d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling1D]
  
  inline def avgPool2d(args: Pooling2DLayerArgs): AveragePooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool2d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling2D]
  
  inline def avgPool3d(args: Pooling3DLayerArgs): AveragePooling3D = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool3d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling3D]
  
  inline def avgPooling1d(args: Pooling1DLayerArgs): AveragePooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling1D]
  
  inline def avgPooling2d(args: Pooling2DLayerArgs): AveragePooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling2D]
  
  inline def avgPooling3d(args: Pooling3DLayerArgs): AveragePooling3D = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[AveragePooling3D]
  
  inline def batchNormalization(): BatchNormalization_ = ^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")().asInstanceOf[BatchNormalization_]
  inline def batchNormalization(args: BatchNormalizationLayerArgs): BatchNormalization_ = ^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")(args.asInstanceOf[js.Any]).asInstanceOf[BatchNormalization_]
  
  inline def bidirectional(args: BidirectionalLayerArgs): Bidirectional = ^.asInstanceOf[js.Dynamic].applyDynamic("bidirectional")(args.asInstanceOf[js.Any]).asInstanceOf[Bidirectional]
  
  inline def concatenate(): Concatenate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")().asInstanceOf[Concatenate_]
  inline def concatenate(args: ConcatenateLayerArgs): Concatenate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(args.asInstanceOf[js.Any]).asInstanceOf[Concatenate_]
  
  inline def conv1d(args: ConvLayerArgs): Conv1D_ = ^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(args.asInstanceOf[js.Any]).asInstanceOf[Conv1D_]
  
  inline def conv2d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.convolutionalMod.Conv2D_ = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.convolutionalMod.Conv2D_]
  
  inline def conv2dTranspose(args: ConvLayerArgs): Conv2DTranspose = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2dTranspose")(args.asInstanceOf[js.Any]).asInstanceOf[Conv2DTranspose]
  
  inline def conv3d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.convolutionalMod.Conv3D_ = ^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.convolutionalMod.Conv3D_]
  
  inline def conv3dTranspose(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  inline def convLstm2d(args: ConvLSTM2DArgs): ConvLSTM2D = ^.asInstanceOf[js.Dynamic].applyDynamic("convLstm2d")(args.asInstanceOf[js.Any]).asInstanceOf[ConvLSTM2D]
  
  inline def convLstm2dCell(args: ConvLSTM2DCellArgs): ConvLSTM2DCell = ^.asInstanceOf[js.Dynamic].applyDynamic("convLstm2dCell")(args.asInstanceOf[js.Any]).asInstanceOf[ConvLSTM2DCell]
  
  inline def cropping2D(args: Cropping2DLayerArgs): Cropping2D = ^.asInstanceOf[js.Dynamic].applyDynamic("cropping2D")(args.asInstanceOf[js.Any]).asInstanceOf[Cropping2D]
  
  inline def dense(args: DenseLayerArgs): Dense = ^.asInstanceOf[js.Dynamic].applyDynamic("dense")(args.asInstanceOf[js.Any]).asInstanceOf[Dense]
  
  inline def depthwiseConv2d(args: DepthwiseConv2DLayerArgs): DepthwiseConv2D_ = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(args.asInstanceOf[js.Any]).asInstanceOf[DepthwiseConv2D_]
  
  inline def dot(args: DotLayerArgs): Dot = ^.asInstanceOf[js.Dynamic].applyDynamic("dot")(args.asInstanceOf[js.Any]).asInstanceOf[Dot]
  
  inline def dropout(args: DropoutLayerArgs): Dropout = ^.asInstanceOf[js.Dynamic].applyDynamic("dropout")(args.asInstanceOf[js.Any]).asInstanceOf[Dropout]
  
  inline def elu(): ELU = ^.asInstanceOf[js.Dynamic].applyDynamic("elu")().asInstanceOf[ELU]
  inline def elu(args: ELULayerArgs): ELU = ^.asInstanceOf[js.Dynamic].applyDynamic("elu")(args.asInstanceOf[js.Any]).asInstanceOf[ELU]
  
  inline def embedding(args: EmbeddingLayerArgs): Embedding = ^.asInstanceOf[js.Dynamic].applyDynamic("embedding")(args.asInstanceOf[js.Any]).asInstanceOf[Embedding]
  
  inline def flatten(): Flatten = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[Flatten]
  inline def flatten(args: FlattenLayerArgs): Flatten = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(args.asInstanceOf[js.Any]).asInstanceOf[Flatten]
  
  inline def gaussianDropout(args: GaussianDropoutArgs): GaussianDropout = ^.asInstanceOf[js.Dynamic].applyDynamic("gaussianDropout")(args.asInstanceOf[js.Any]).asInstanceOf[GaussianDropout]
  
  inline def gaussianNoise(args: GaussianNoiseArgs): GaussianNoise = ^.asInstanceOf[js.Dynamic].applyDynamic("gaussianNoise")(args.asInstanceOf[js.Any]).asInstanceOf[GaussianNoise]
  
  inline def globalAveragePooling1d(): GlobalAveragePooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalAveragePooling1d")().asInstanceOf[GlobalAveragePooling1D]
  inline def globalAveragePooling1d(args: LayerArgs): GlobalAveragePooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalAveragePooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[GlobalAveragePooling1D]
  
  inline def globalAveragePooling2d(args: GlobalPooling2DLayerArgs): GlobalAveragePooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalAveragePooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[GlobalAveragePooling2D]
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "layers.globalMaxPool1d")
  @js.native
  val globalMaxPool1d: js.Function1[/* args */ js.UndefOr[LayerArgs], GlobalMaxPooling1D] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "layers.globalMaxPool2d")
  @js.native
  val globalMaxPool2d: js.Function1[/* args */ GlobalPooling2DLayerArgs, GlobalMaxPooling2D] = js.native
  
  inline def globalMaxPooling1d(): GlobalMaxPooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling1d")().asInstanceOf[GlobalMaxPooling1D]
  inline def globalMaxPooling1d(args: LayerArgs): GlobalMaxPooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[GlobalMaxPooling1D]
  
  inline def globalMaxPooling2d(args: GlobalPooling2DLayerArgs): GlobalMaxPooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[GlobalMaxPooling2D]
  
  inline def gru(args: GRULayerArgs): GRU = ^.asInstanceOf[js.Dynamic].applyDynamic("gru")(args.asInstanceOf[js.Any]).asInstanceOf[GRU]
  
  inline def gruCell(args: GRUCellLayerArgs): GRUCell = ^.asInstanceOf[js.Dynamic].applyDynamic("gruCell")(args.asInstanceOf[js.Any]).asInstanceOf[GRUCell]
  
  inline def input(config: InputConfig): typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(config.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor]
  
  inline def inputLayer(args: InputLayerArgs): InputLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("inputLayer")(args.asInstanceOf[js.Any]).asInstanceOf[InputLayer]
  
  inline def layerNormalization(): LayerNormalization = ^.asInstanceOf[js.Dynamic].applyDynamic("layerNormalization")().asInstanceOf[LayerNormalization]
  inline def layerNormalization(args: LayerNormalizationLayerArgs): LayerNormalization = ^.asInstanceOf[js.Dynamic].applyDynamic("layerNormalization")(args.asInstanceOf[js.Any]).asInstanceOf[LayerNormalization]
  
  inline def leakyReLU(): LeakyReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyReLU")().asInstanceOf[LeakyReLU]
  inline def leakyReLU(args: LeakyReLULayerArgs): LeakyReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyReLU")(args.asInstanceOf[js.Any]).asInstanceOf[LeakyReLU]
  
  inline def lstm(args: LSTMLayerArgs): LSTM = ^.asInstanceOf[js.Dynamic].applyDynamic("lstm")(args.asInstanceOf[js.Any]).asInstanceOf[LSTM]
  
  inline def lstmCell(args: LSTMCellLayerArgs): LSTMCell = ^.asInstanceOf[js.Dynamic].applyDynamic("lstmCell")(args.asInstanceOf[js.Any]).asInstanceOf[LSTMCell]
  
  inline def masking(): Masking = ^.asInstanceOf[js.Dynamic].applyDynamic("masking")().asInstanceOf[Masking]
  inline def masking(args: MaskingArgs): Masking = ^.asInstanceOf[js.Dynamic].applyDynamic("masking")(args.asInstanceOf[js.Any]).asInstanceOf[Masking]
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "layers.maxPool1d")
  @js.native
  val maxPool1d: js.Function1[/* args */ Pooling1DLayerArgs, MaxPooling1D] = js.native
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "layers.maxPool2d")
  @js.native
  val maxPool2d: js.Function1[/* args */ Pooling2DLayerArgs, MaxPooling2D] = js.native
  
  inline def maxPooling1d(args: Pooling1DLayerArgs): MaxPooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[MaxPooling1D]
  
  inline def maxPooling2d(args: Pooling2DLayerArgs): MaxPooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[MaxPooling2D]
  
  inline def maxPooling3d(args: Pooling3DLayerArgs): MaxPooling3D = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[MaxPooling3D]
  
  inline def maximum(): typings.tensorflowTfjsLayers.mergeMod.Maximum_ = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")().asInstanceOf[typings.tensorflowTfjsLayers.mergeMod.Maximum_]
  inline def maximum(args: LayerArgs): typings.tensorflowTfjsLayers.mergeMod.Maximum_ = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.mergeMod.Maximum_]
  
  inline def minimum(): typings.tensorflowTfjsLayers.mergeMod.Minimum_ = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")().asInstanceOf[typings.tensorflowTfjsLayers.mergeMod.Minimum_]
  inline def minimum(args: LayerArgs): typings.tensorflowTfjsLayers.mergeMod.Minimum_ = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.mergeMod.Minimum_]
  
  inline def multiply(): Multiply_ = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")().asInstanceOf[Multiply_]
  inline def multiply(args: LayerArgs): Multiply_ = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(args.asInstanceOf[js.Any]).asInstanceOf[Multiply_]
  
  inline def permute(args: PermuteLayerArgs): Permute = ^.asInstanceOf[js.Dynamic].applyDynamic("permute")(args.asInstanceOf[js.Any]).asInstanceOf[Permute]
  
  inline def prelu(): PReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")().asInstanceOf[PReLU]
  inline def prelu(args: PReLULayerArgs): PReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")(args.asInstanceOf[js.Any]).asInstanceOf[PReLU]
  
  inline def reLU(): ReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("reLU")().asInstanceOf[ReLU]
  inline def reLU(args: ReLULayerArgs): ReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("reLU")(args.asInstanceOf[js.Any]).asInstanceOf[ReLU]
  
  inline def repeatVector(args: RepeatVectorLayerArgs): RepeatVector = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatVector")(args.asInstanceOf[js.Any]).asInstanceOf[RepeatVector]
  
  inline def reshape(args: ReshapeLayerArgs): Reshape = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(args.asInstanceOf[js.Any]).asInstanceOf[Reshape]
  
  inline def rnn(args: RNNLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNN_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.recurrentMod.RNN_]
  
  inline def separableConv2d(args: SeparableConvLayerArgs): SeparableConv2D = ^.asInstanceOf[js.Dynamic].applyDynamic("separableConv2d")(args.asInstanceOf[js.Any]).asInstanceOf[SeparableConv2D]
  
  inline def simpleRNN(args: SimpleRNNLayerArgs): SimpleRNN = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleRNN")(args.asInstanceOf[js.Any]).asInstanceOf[SimpleRNN]
  
  inline def simpleRNNCell(args: SimpleRNNCellLayerArgs): SimpleRNNCell = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleRNNCell")(args.asInstanceOf[js.Any]).asInstanceOf[SimpleRNNCell]
  
  inline def softmax(): Softmax = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")().asInstanceOf[Softmax]
  inline def softmax(args: SoftmaxLayerArgs): Softmax = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(args.asInstanceOf[js.Any]).asInstanceOf[Softmax]
  
  inline def spatialDropout1d(args: SpatialDropout1DLayerConfig): SpatialDropout1D = ^.asInstanceOf[js.Dynamic].applyDynamic("spatialDropout1d")(args.asInstanceOf[js.Any]).asInstanceOf[SpatialDropout1D]
  
  inline def stackedRNNCells(args: StackedRNNCellsArgs): StackedRNNCells = ^.asInstanceOf[js.Dynamic].applyDynamic("stackedRNNCells")(args.asInstanceOf[js.Any]).asInstanceOf[StackedRNNCells]
  
  inline def thresholdedReLU(): ThresholdedReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("thresholdedReLU")().asInstanceOf[ThresholdedReLU]
  inline def thresholdedReLU(args: ThresholdedReLULayerArgs): ThresholdedReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("thresholdedReLU")(args.asInstanceOf[js.Any]).asInstanceOf[ThresholdedReLU]
  
  inline def timeDistributed(args: WrapperLayerArgs): TimeDistributed = ^.asInstanceOf[js.Dynamic].applyDynamic("timeDistributed")(args.asInstanceOf[js.Any]).asInstanceOf[TimeDistributed]
  
  inline def upSampling2d(args: UpSampling2DLayerArgs): UpSampling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("upSampling2d")(args.asInstanceOf[js.Any]).asInstanceOf[UpSampling2D]
  
  inline def zeroPadding2d(): ZeroPadding2D = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadding2d")().asInstanceOf[ZeroPadding2D]
  inline def zeroPadding2d(args: ZeroPadding2DLayerArgs): ZeroPadding2D = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadding2d")(args.asInstanceOf[js.Any]).asInstanceOf[ZeroPadding2D]
}
