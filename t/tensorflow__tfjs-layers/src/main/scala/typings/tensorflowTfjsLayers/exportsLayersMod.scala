package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.mod.serialization.Serializable
import typings.tensorflowTfjsCore.serializationMod.ConfigDict
import typings.tensorflowTfjsCore.serializationMod.SerializableConstructor
import typings.tensorflowTfjsLayers.advancedActivationsMod.ELULayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.LeakyReLULayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.PReLULayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.ReLULayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.SoftmaxLayerArgs
import typings.tensorflowTfjsLayers.advancedActivationsMod.ThresholdedReLULayerArgs
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
import typings.tensorflowTfjsLayers.embeddingsMod.EmbeddingLayerArgs
import typings.tensorflowTfjsLayers.inputLayerMod.InputConfig
import typings.tensorflowTfjsLayers.inputLayerMod.InputLayerArgs
import typings.tensorflowTfjsLayers.mergeMod.ConcatenateLayerArgs
import typings.tensorflowTfjsLayers.mergeMod.DotLayerArgs
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
import typings.tensorflowTfjsLayers.recurrentMod.SimpleRNNCellLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.SimpleRNNLayerArgs
import typings.tensorflowTfjsLayers.recurrentMod.StackedRNNCellsArgs
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import typings.tensorflowTfjsLayers.wrappersMod.Bidirectional
import typings.tensorflowTfjsLayers.wrappersMod.BidirectionalLayerArgs
import typings.tensorflowTfjsLayers.wrappersMod.WrapperLayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportsLayersMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "Layer")
  @js.native
  abstract class Layer ()
    extends typings.tensorflowTfjsLayers.topologyMod.Layer {
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
    @scala.inline
    def nodeKey(layer: typings.tensorflowTfjsLayers.topologyMod.Layer, nodeIndex: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("nodeKey")(layer.asInstanceOf[js.Any], nodeIndex.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "RNNCell")
  @js.native
  abstract class RNNCell ()
    extends typings.tensorflowTfjsLayers.recurrentMod.RNNCell {
    def this(args: LayerArgs) = this()
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "RNN")
  @js.native
  class RNN_ protected ()
    extends typings.tensorflowTfjsLayers.recurrentMod.RNN_ {
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
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @scala.inline
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[T]
    @scala.inline
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = (^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(cls.asInstanceOf[js.Any], config.asInstanceOf[js.Any], customObjects.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @scala.inline
  def activation(args: ActivationLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("activation")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def add(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("add")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def add(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def alphaDropout(args: AlphaDropoutArgs): AlphaDropout = ^.asInstanceOf[js.Dynamic].applyDynamic("alphaDropout")(args.asInstanceOf[js.Any]).asInstanceOf[AlphaDropout]
  
  @scala.inline
  def average(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("average")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def average(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def averagePooling1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("averagePooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def averagePooling2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("averagePooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def averagePooling3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("averagePooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def avgPool1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def avgPool2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def avgPool3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPool3d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def avgPooling1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def avgPooling2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def avgPooling3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("avgPooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def batchNormalization(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def batchNormalization(args: BatchNormalizationLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def bidirectional(args: BidirectionalLayerArgs): Bidirectional = ^.asInstanceOf[js.Dynamic].applyDynamic("bidirectional")(args.asInstanceOf[js.Any]).asInstanceOf[Bidirectional]
  
  @scala.inline
  def concatenate(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def concatenate(args: ConcatenateLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenate")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def conv1d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def conv2d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def conv2dTranspose(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2dTranspose")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def conv3d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def convLstm2d(args: ConvLSTM2DArgs): ConvLSTM2D = ^.asInstanceOf[js.Dynamic].applyDynamic("convLstm2d")(args.asInstanceOf[js.Any]).asInstanceOf[ConvLSTM2D]
  
  @scala.inline
  def convLstm2dCell(args: ConvLSTM2DCellArgs): ConvLSTM2DCell = ^.asInstanceOf[js.Dynamic].applyDynamic("convLstm2dCell")(args.asInstanceOf[js.Any]).asInstanceOf[ConvLSTM2DCell]
  
  @scala.inline
  def cropping2D(args: Cropping2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("cropping2D")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def dense(args: DenseLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("dense")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def depthwiseConv2d(args: DepthwiseConv2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def dot(args: DotLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("dot")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def dropout(args: DropoutLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("dropout")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def elu(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("elu")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def elu(args: ELULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("elu")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def embedding(args: EmbeddingLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("embedding")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def flatten(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def flatten(args: FlattenLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def gaussianDropout(args: GaussianDropoutArgs): GaussianDropout = ^.asInstanceOf[js.Dynamic].applyDynamic("gaussianDropout")(args.asInstanceOf[js.Any]).asInstanceOf[GaussianDropout]
  
  @scala.inline
  def gaussianNoise(args: GaussianNoiseArgs): GaussianNoise = ^.asInstanceOf[js.Dynamic].applyDynamic("gaussianNoise")(args.asInstanceOf[js.Any]).asInstanceOf[GaussianNoise]
  
  @scala.inline
  def globalAveragePooling1d(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalAveragePooling1d")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def globalAveragePooling1d(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalAveragePooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def globalAveragePooling2d(args: GlobalPooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalAveragePooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "globalMaxPool1d")
  @js.native
  val globalMaxPool1d: js.Function1[/* args */ js.UndefOr[LayerArgs], typings.tensorflowTfjsLayers.topologyMod.Layer] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "globalMaxPool2d")
  @js.native
  val globalMaxPool2d: js.Function1[
    /* args */ GlobalPooling2DLayerArgs, 
    typings.tensorflowTfjsLayers.topologyMod.Layer
  ] = js.native
  
  @scala.inline
  def globalMaxPooling1d(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling1d")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def globalMaxPooling1d(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def globalMaxPooling2d(args: GlobalPooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("globalMaxPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def gru(args: GRULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("gru")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def gruCell(args: GRUCellLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = ^.asInstanceOf[js.Dynamic].applyDynamic("gruCell")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.recurrentMod.RNNCell]
  
  @scala.inline
  def input(config: InputConfig): SymbolicTensor = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(config.asInstanceOf[js.Any]).asInstanceOf[SymbolicTensor]
  
  @scala.inline
  def inputLayer(args: InputLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("inputLayer")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def layerNormalization(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("layerNormalization")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def layerNormalization(args: LayerNormalizationLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("layerNormalization")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def leakyReLU(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyReLU")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def leakyReLU(args: LeakyReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("leakyReLU")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def lstm(args: LSTMLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("lstm")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def lstmCell(args: LSTMCellLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = ^.asInstanceOf[js.Dynamic].applyDynamic("lstmCell")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.recurrentMod.RNNCell]
  
  @scala.inline
  def masking(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("masking")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def masking(args: MaskingArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("masking")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "maxPool1d")
  @js.native
  val maxPool1d: js.Function1[/* args */ Pooling1DLayerArgs, typings.tensorflowTfjsLayers.topologyMod.Layer] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/exports_layers", "maxPool2d")
  @js.native
  val maxPool2d: js.Function1[/* args */ Pooling2DLayerArgs, typings.tensorflowTfjsLayers.topologyMod.Layer] = js.native
  
  @scala.inline
  def maxPooling1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def maxPooling2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def maxPooling3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPooling3d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def maximum(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def maximum(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("maximum")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def minimum(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def minimum(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("minimum")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def multiply(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def multiply(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def permute(args: PermuteLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("permute")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def prelu(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def prelu(args: PReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("prelu")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def reLU(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("reLU")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def reLU(args: ReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("reLU")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def repeatVector(args: RepeatVectorLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatVector")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def reshape(args: ReshapeLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("reshape")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def rnn(args: RNNLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("rnn")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def separableConv2d(args: SeparableConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("separableConv2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def simpleRNN(args: SimpleRNNLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleRNN")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def simpleRNNCell(args: SimpleRNNCellLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleRNNCell")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.recurrentMod.RNNCell]
  
  @scala.inline
  def softmax(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def softmax(args: SoftmaxLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("softmax")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def spatialDropout1d(args: SpatialDropout1DLayerConfig): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("spatialDropout1d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def stackedRNNCells(args: StackedRNNCellsArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = ^.asInstanceOf[js.Dynamic].applyDynamic("stackedRNNCells")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.recurrentMod.RNNCell]
  
  @scala.inline
  def thresholdedReLU(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("thresholdedReLU")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def thresholdedReLU(args: ThresholdedReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("thresholdedReLU")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def timeDistributed(args: WrapperLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("timeDistributed")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def upSampling2d(args: UpSampling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("upSampling2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  
  @scala.inline
  def zeroPadding2d(): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadding2d")().asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
  @scala.inline
  def zeroPadding2d(args: ZeroPadding2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroPadding2d")(args.asInstanceOf[js.Any]).asInstanceOf[typings.tensorflowTfjsLayers.topologyMod.Layer]
}
