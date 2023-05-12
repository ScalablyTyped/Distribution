package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typings.tensorflowTfjsCore.distSerializationMod.SerializableConstructor
import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsLayers.distEngineInputLayerMod.InputConfig
import typings.tensorflowTfjsLayers.distEngineInputLayerMod.InputLayer
import typings.tensorflowTfjsLayers.distEngineInputLayerMod.InputLayerArgs
import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typings.tensorflowTfjsLayers.distEngineTopologyMod.SymbolicTensor
import typings.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.ELU
import typings.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.ELULayerArgs
import typings.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.LeakyReLU
import typings.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.LeakyReLULayerArgs
import typings.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.PReLU
import typings.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.PReLULayerArgs
import typings.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.ReLU
import typings.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.ReLULayerArgs
import typings.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.Softmax
import typings.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.SoftmaxLayerArgs
import typings.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.ThresholdedReLU
import typings.tensorflowTfjsLayers.distLayersAdvancedActivationsMod.ThresholdedReLULayerArgs
import typings.tensorflowTfjsLayers.distLayersConvolutionalDepthwiseMod.DepthwiseConv2DLayerArgs
import typings.tensorflowTfjsLayers.distLayersConvolutionalDepthwiseMod.DepthwiseConv2D_
import typings.tensorflowTfjsLayers.distLayersConvolutionalMod.Conv1D_
import typings.tensorflowTfjsLayers.distLayersConvolutionalMod.Conv2DTranspose
import typings.tensorflowTfjsLayers.distLayersConvolutionalMod.Conv2D_
import typings.tensorflowTfjsLayers.distLayersConvolutionalMod.Conv3D_
import typings.tensorflowTfjsLayers.distLayersConvolutionalMod.ConvLayerArgs
import typings.tensorflowTfjsLayers.distLayersConvolutionalMod.Cropping2D
import typings.tensorflowTfjsLayers.distLayersConvolutionalMod.Cropping2DLayerArgs
import typings.tensorflowTfjsLayers.distLayersConvolutionalMod.SeparableConv2D
import typings.tensorflowTfjsLayers.distLayersConvolutionalMod.SeparableConvLayerArgs
import typings.tensorflowTfjsLayers.distLayersConvolutionalMod.UpSampling2D
import typings.tensorflowTfjsLayers.distLayersConvolutionalMod.UpSampling2DLayerArgs
import typings.tensorflowTfjsLayers.distLayersConvolutionalRecurrentMod.ConvLSTM2D
import typings.tensorflowTfjsLayers.distLayersConvolutionalRecurrentMod.ConvLSTM2DArgs
import typings.tensorflowTfjsLayers.distLayersConvolutionalRecurrentMod.ConvLSTM2DCell
import typings.tensorflowTfjsLayers.distLayersConvolutionalRecurrentMod.ConvLSTM2DCellArgs
import typings.tensorflowTfjsLayers.distLayersCoreMod.Activation
import typings.tensorflowTfjsLayers.distLayersCoreMod.ActivationLayerArgs
import typings.tensorflowTfjsLayers.distLayersCoreMod.Dense
import typings.tensorflowTfjsLayers.distLayersCoreMod.DenseLayerArgs
import typings.tensorflowTfjsLayers.distLayersCoreMod.Dropout
import typings.tensorflowTfjsLayers.distLayersCoreMod.DropoutLayerArgs
import typings.tensorflowTfjsLayers.distLayersCoreMod.Flatten
import typings.tensorflowTfjsLayers.distLayersCoreMod.FlattenLayerArgs
import typings.tensorflowTfjsLayers.distLayersCoreMod.Masking
import typings.tensorflowTfjsLayers.distLayersCoreMod.MaskingArgs
import typings.tensorflowTfjsLayers.distLayersCoreMod.Permute
import typings.tensorflowTfjsLayers.distLayersCoreMod.PermuteLayerArgs
import typings.tensorflowTfjsLayers.distLayersCoreMod.RepeatVector
import typings.tensorflowTfjsLayers.distLayersCoreMod.RepeatVectorLayerArgs
import typings.tensorflowTfjsLayers.distLayersCoreMod.Reshape
import typings.tensorflowTfjsLayers.distLayersCoreMod.ReshapeLayerArgs
import typings.tensorflowTfjsLayers.distLayersCoreMod.SpatialDropout1D
import typings.tensorflowTfjsLayers.distLayersCoreMod.SpatialDropout1DLayerConfig
import typings.tensorflowTfjsLayers.distLayersEmbeddingsMod.Embedding
import typings.tensorflowTfjsLayers.distLayersEmbeddingsMod.EmbeddingLayerArgs
import typings.tensorflowTfjsLayers.distLayersMergeMod.Add_
import typings.tensorflowTfjsLayers.distLayersMergeMod.Average_
import typings.tensorflowTfjsLayers.distLayersMergeMod.ConcatenateLayerArgs
import typings.tensorflowTfjsLayers.distLayersMergeMod.Concatenate_
import typings.tensorflowTfjsLayers.distLayersMergeMod.Dot
import typings.tensorflowTfjsLayers.distLayersMergeMod.DotLayerArgs
import typings.tensorflowTfjsLayers.distLayersMergeMod.Maximum_
import typings.tensorflowTfjsLayers.distLayersMergeMod.Minimum_
import typings.tensorflowTfjsLayers.distLayersMergeMod.Multiply_
import typings.tensorflowTfjsLayers.distLayersNoiseMod.AlphaDropout
import typings.tensorflowTfjsLayers.distLayersNoiseMod.AlphaDropoutArgs
import typings.tensorflowTfjsLayers.distLayersNoiseMod.GaussianDropout
import typings.tensorflowTfjsLayers.distLayersNoiseMod.GaussianDropoutArgs
import typings.tensorflowTfjsLayers.distLayersNoiseMod.GaussianNoise
import typings.tensorflowTfjsLayers.distLayersNoiseMod.GaussianNoiseArgs
import typings.tensorflowTfjsLayers.distLayersNormalizationMod.BatchNormalizationLayerArgs
import typings.tensorflowTfjsLayers.distLayersNormalizationMod.BatchNormalization_
import typings.tensorflowTfjsLayers.distLayersNormalizationMod.LayerNormalization
import typings.tensorflowTfjsLayers.distLayersNormalizationMod.LayerNormalizationLayerArgs
import typings.tensorflowTfjsLayers.distLayersPaddingMod.ZeroPadding2D
import typings.tensorflowTfjsLayers.distLayersPaddingMod.ZeroPadding2DLayerArgs
import typings.tensorflowTfjsLayers.distLayersPoolingMod.AveragePooling1D
import typings.tensorflowTfjsLayers.distLayersPoolingMod.AveragePooling2D
import typings.tensorflowTfjsLayers.distLayersPoolingMod.AveragePooling3D
import typings.tensorflowTfjsLayers.distLayersPoolingMod.GlobalAveragePooling1D
import typings.tensorflowTfjsLayers.distLayersPoolingMod.GlobalAveragePooling2D
import typings.tensorflowTfjsLayers.distLayersPoolingMod.GlobalMaxPooling1D
import typings.tensorflowTfjsLayers.distLayersPoolingMod.GlobalMaxPooling2D
import typings.tensorflowTfjsLayers.distLayersPoolingMod.GlobalPooling2DLayerArgs
import typings.tensorflowTfjsLayers.distLayersPoolingMod.MaxPooling1D
import typings.tensorflowTfjsLayers.distLayersPoolingMod.MaxPooling2D
import typings.tensorflowTfjsLayers.distLayersPoolingMod.MaxPooling3D
import typings.tensorflowTfjsLayers.distLayersPoolingMod.Pooling1DLayerArgs
import typings.tensorflowTfjsLayers.distLayersPoolingMod.Pooling2DLayerArgs
import typings.tensorflowTfjsLayers.distLayersPoolingMod.Pooling3DLayerArgs
import typings.tensorflowTfjsLayers.distLayersPreprocessingCategoryEncodingMod.CategoryEncoding
import typings.tensorflowTfjsLayers.distLayersPreprocessingCategoryEncodingMod.CategoryEncodingArgs
import typings.tensorflowTfjsLayers.distLayersPreprocessingCenterCropMod.CenterCrop
import typings.tensorflowTfjsLayers.distLayersPreprocessingCenterCropMod.CenterCropArgs
import typings.tensorflowTfjsLayers.distLayersPreprocessingImagePreprocessingMod.Rescaling
import typings.tensorflowTfjsLayers.distLayersPreprocessingImagePreprocessingMod.RescalingArgs
import typings.tensorflowTfjsLayers.distLayersPreprocessingImageResizingMod.Resizing
import typings.tensorflowTfjsLayers.distLayersPreprocessingImageResizingMod.ResizingArgs
import typings.tensorflowTfjsLayers.distLayersPreprocessingRandomWidthMod.RandomWidth
import typings.tensorflowTfjsLayers.distLayersPreprocessingRandomWidthMod.RandomWidthArgs
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.GRU
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.GRUCell
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.GRUCellLayerArgs
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.GRULayerArgs
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.LSTM
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.LSTMCell
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.LSTMCellLayerArgs
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.LSTMLayerArgs
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.RNNLayerArgs
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.SimpleRNN
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.SimpleRNNCell
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.SimpleRNNCellLayerArgs
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.SimpleRNNLayerArgs
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.StackedRNNCells
import typings.tensorflowTfjsLayers.distLayersRecurrentMod.StackedRNNCellsArgs
import typings.tensorflowTfjsLayers.distLayersWrappersMod.Bidirectional
import typings.tensorflowTfjsLayers.distLayersWrappersMod.BidirectionalLayerArgs
import typings.tensorflowTfjsLayers.distLayersWrappersMod.TimeDistributed
import typings.tensorflowTfjsLayers.distLayersWrappersMod.WrapperLayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExportsLayersMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "Layer")
  @js.native
  open class Layer ()
    extends typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer {
    def this(args: LayerArgs) = this()
  }
  /* static members */
  object Layer {
    
    @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "Layer")
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
    inline def nodeKey(layer: typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer, nodeIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeKey")(layer.asInstanceOf[js.Any], nodeIndex.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "RNNCell")
  @js.native
  open class RNNCell ()
    extends typings.tensorflowTfjsLayers.distLayersRecurrentMod.RNNCell {
    def this(args: LayerArgs) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "RNN")
  @js.native
  open class RNN_ protected ()
    extends typings.tensorflowTfjsLayers.distLayersRecurrentMod.RNN_ {
    def this(args: RNNLayerArgs) = this()
  }
  /* static members */
  object RNN_ {
    
    @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "RNN")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "RNN.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
    inline def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  inline def activation(args: ActivationLayerArgs): Activation = ^.asInstanceOf[js.Dynamic].applyDynamic("activation")(args.asInstanceOf[js.Any]).asInstanceOf[Activation]
  
  inline def add(): Add_ = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[Add_]
  inline def add(args: LayerArgs): Add_ = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(args.asInstanceOf[js.Any]).asInstanceOf[Add_]
  
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
  
  inline def categoryEncoding(args: CategoryEncodingArgs): CategoryEncoding = ^.asInstanceOf[js.Dynamic].applyDynamic("categoryEncoding")(args.asInstanceOf[js.Any]).asInstanceOf[CategoryEncoding]
  
  inline def centerCrop(): CenterCrop = ^.asInstanceOf[js.Dynamic].applyDynamic("centerCrop")().asInstanceOf[CenterCrop]
  inline def centerCrop(args: CenterCropArgs): CenterCrop = ^.asInstanceOf[js.Dynamic].applyDynamic("centerCrop")(args.asInstanceOf[js.Any]).asInstanceOf[CenterCrop]
  
  inline def concatenate(): Concatenate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")().asInstanceOf[Concatenate_]
  inline def concatenate(args: ConcatenateLayerArgs): Concatenate_ = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(args.asInstanceOf[js.Any]).asInstanceOf[Concatenate_]
  
  inline def conv1d(args: ConvLayerArgs): Conv1D_ = ^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(args.asInstanceOf[js.Any]).asInstanceOf[Conv1D_]
  
  inline def conv2d(args: ConvLayerArgs): Conv2D_ = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(args.asInstanceOf[js.Any]).asInstanceOf[Conv2D_]
  
  inline def conv2dTranspose(args: ConvLayerArgs): Conv2DTranspose = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2dTranspose")(args.asInstanceOf[js.Any]).asInstanceOf[Conv2DTranspose]
  
  inline def conv3d(args: ConvLayerArgs): Conv3D_ = ^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(args.asInstanceOf[js.Any]).asInstanceOf[Conv3D_]
  
  inline def conv3dTranspose(args: ConvLayerArgs): typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("conv3dTranspose")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer]
  
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
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "globalMaxPool1d")
  @js.native
  val globalMaxPool1d: js.Function1[/* args */ js.UndefOr[LayerArgs], GlobalMaxPooling1D] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "globalMaxPool2d")
  @js.native
  val globalMaxPool2d: js.Function1[/* args */ GlobalPooling2DLayerArgs, GlobalMaxPooling2D] = js.native
  
  inline def globalMaxPooling1d(): GlobalMaxPooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling1d")().asInstanceOf[GlobalMaxPooling1D]
  inline def globalMaxPooling1d(args: LayerArgs): GlobalMaxPooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[GlobalMaxPooling1D]
  
  inline def globalMaxPooling2d(args: GlobalPooling2DLayerArgs): GlobalMaxPooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[GlobalMaxPooling2D]
  
  inline def gru(args: GRULayerArgs): GRU = ^.asInstanceOf[js.Dynamic].applyDynamic("gru")(args.asInstanceOf[js.Any]).asInstanceOf[GRU]
  
  inline def gruCell(args: GRUCellLayerArgs): GRUCell = ^.asInstanceOf[js.Dynamic].applyDynamic("gruCell")(args.asInstanceOf[js.Any]).asInstanceOf[GRUCell]
  
  inline def input(config: InputConfig): SymbolicTensor = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(config.asInstanceOf[js.Any]).asInstanceOf[SymbolicTensor]
  
  inline def inputLayer(args: InputLayerArgs): InputLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("inputLayer")(args.asInstanceOf[js.Any]).asInstanceOf[InputLayer]
  
  inline def layerNormalization(): LayerNormalization = ^.asInstanceOf[js.Dynamic].applyDynamic("layerNormalization")().asInstanceOf[LayerNormalization]
  inline def layerNormalization(args: LayerNormalizationLayerArgs): LayerNormalization = ^.asInstanceOf[js.Dynamic].applyDynamic("layerNormalization")(args.asInstanceOf[js.Any]).asInstanceOf[LayerNormalization]
  
  inline def leakyReLU(): LeakyReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyReLU")().asInstanceOf[LeakyReLU]
  inline def leakyReLU(args: LeakyReLULayerArgs): LeakyReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyReLU")(args.asInstanceOf[js.Any]).asInstanceOf[LeakyReLU]
  
  inline def lstm(args: LSTMLayerArgs): LSTM = ^.asInstanceOf[js.Dynamic].applyDynamic("lstm")(args.asInstanceOf[js.Any]).asInstanceOf[LSTM]
  
  inline def lstmCell(args: LSTMCellLayerArgs): LSTMCell = ^.asInstanceOf[js.Dynamic].applyDynamic("lstmCell")(args.asInstanceOf[js.Any]).asInstanceOf[LSTMCell]
  
  inline def masking(): Masking = ^.asInstanceOf[js.Dynamic].applyDynamic("masking")().asInstanceOf[Masking]
  inline def masking(args: MaskingArgs): Masking = ^.asInstanceOf[js.Dynamic].applyDynamic("masking")(args.asInstanceOf[js.Any]).asInstanceOf[Masking]
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "maxPool1d")
  @js.native
  val maxPool1d: js.Function1[/* args */ Pooling1DLayerArgs, MaxPooling1D] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "maxPool2d")
  @js.native
  val maxPool2d: js.Function1[/* args */ Pooling2DLayerArgs, MaxPooling2D] = js.native
  
  inline def maxPooling1d(args: Pooling1DLayerArgs): MaxPooling1D = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[MaxPooling1D]
  
  inline def maxPooling2d(args: Pooling2DLayerArgs): MaxPooling2D = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[MaxPooling2D]
  
  inline def maxPooling3d(args: Pooling3DLayerArgs): MaxPooling3D = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[MaxPooling3D]
  
  inline def maximum(): Maximum_ = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")().asInstanceOf[Maximum_]
  inline def maximum(args: LayerArgs): Maximum_ = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(args.asInstanceOf[js.Any]).asInstanceOf[Maximum_]
  
  inline def minimum(): Minimum_ = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")().asInstanceOf[Minimum_]
  inline def minimum(args: LayerArgs): Minimum_ = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(args.asInstanceOf[js.Any]).asInstanceOf[Minimum_]
  
  inline def multiply(): Multiply_ = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")().asInstanceOf[Multiply_]
  inline def multiply(args: LayerArgs): Multiply_ = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(args.asInstanceOf[js.Any]).asInstanceOf[Multiply_]
  
  inline def permute(args: PermuteLayerArgs): Permute = ^.asInstanceOf[js.Dynamic].applyDynamic("permute")(args.asInstanceOf[js.Any]).asInstanceOf[Permute]
  
  inline def prelu(): PReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")().asInstanceOf[PReLU]
  inline def prelu(args: PReLULayerArgs): PReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")(args.asInstanceOf[js.Any]).asInstanceOf[PReLU]
  
  inline def randomWidth(args: RandomWidthArgs): RandomWidth = ^.asInstanceOf[js.Dynamic].applyDynamic("randomWidth")(args.asInstanceOf[js.Any]).asInstanceOf[RandomWidth]
  
  inline def reLU(): ReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("reLU")().asInstanceOf[ReLU]
  inline def reLU(args: ReLULayerArgs): ReLU = ^.asInstanceOf[js.Dynamic].applyDynamic("reLU")(args.asInstanceOf[js.Any]).asInstanceOf[ReLU]
  
  inline def repeatVector(args: RepeatVectorLayerArgs): RepeatVector = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatVector")(args.asInstanceOf[js.Any]).asInstanceOf[RepeatVector]
  
  inline def rescaling(): Rescaling = ^.asInstanceOf[js.Dynamic].applyDynamic("rescaling")().asInstanceOf[Rescaling]
  inline def rescaling(args: RescalingArgs): Rescaling = ^.asInstanceOf[js.Dynamic].applyDynamic("rescaling")(args.asInstanceOf[js.Any]).asInstanceOf[Rescaling]
  
  inline def reshape(args: ReshapeLayerArgs): Reshape = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(args.asInstanceOf[js.Any]).asInstanceOf[Reshape]
  
  inline def resizing(): Resizing = ^.asInstanceOf[js.Dynamic].applyDynamic("resizing")().asInstanceOf[Resizing]
  inline def resizing(args: ResizingArgs): Resizing = ^.asInstanceOf[js.Dynamic].applyDynamic("resizing")(args.asInstanceOf[js.Any]).asInstanceOf[Resizing]
  
  inline def rnn(args: RNNLayerArgs): typings.tensorflowTfjsLayers.distLayersRecurrentMod.RNN_ = ^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.distLayersRecurrentMod.RNN_]
  
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
