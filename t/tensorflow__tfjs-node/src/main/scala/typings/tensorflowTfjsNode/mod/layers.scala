package typings.tensorflowTfjsNode.mod

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
import typings.tensorflowTfjsLayers.wrappersMod.Bidirectional
import typings.tensorflowTfjsLayers.wrappersMod.BidirectionalLayerArgs
import typings.tensorflowTfjsLayers.wrappersMod.WrapperLayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layers {
  
  @JSImport("@tensorflow/tfjs-node", "layers.Layer")
  @js.native
  abstract class Layer ()
    extends typings.tensorflowTfjs.mod.layers.Layer {
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
    @JSImport("@tensorflow/tfjs-node", "layers.Layer.nodeKey")
    @js.native
    def nodeKey(layer: typings.tensorflowTfjsLayers.topologyMod.Layer, nodeIndex: Double): String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node", "layers.RNNCell")
  @js.native
  abstract class RNNCell ()
    extends typings.tensorflowTfjs.mod.layers.RNNCell {
    def this(args: LayerArgs) = this()
  }
  
  @JSImport("@tensorflow/tfjs-node", "layers.RNN")
  @js.native
  class RNN_ protected ()
    extends typings.tensorflowTfjs.mod.layers.RNN_ {
    def this(args: RNNLayerArgs) = this()
  }
  /* static members */
  object RNN_ {
    
    @JSImport("@tensorflow/tfjs-node", "layers.RNN")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-node", "layers.RNN.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-node", "layers.RNN.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
    @JSImport("@tensorflow/tfjs-node", "layers.RNN.fromConfig")
    @js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node", "layers.activation")
  @js.native
  def activation(args: ActivationLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.add")
  @js.native
  def add(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.add")
  @js.native
  def add(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.alphaDropout")
  @js.native
  def alphaDropout(args: AlphaDropoutArgs): AlphaDropout = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.average")
  @js.native
  def average(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.average")
  @js.native
  def average(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.averagePooling1d")
  @js.native
  def averagePooling1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.averagePooling2d")
  @js.native
  def averagePooling2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.averagePooling3d")
  @js.native
  def averagePooling3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.avgPool1d")
  @js.native
  def avgPool1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.avgPool2d")
  @js.native
  def avgPool2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.avgPool3d")
  @js.native
  def avgPool3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.avgPooling1d")
  @js.native
  def avgPooling1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.avgPooling2d")
  @js.native
  def avgPooling2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.avgPooling3d")
  @js.native
  def avgPooling3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.batchNormalization")
  @js.native
  def batchNormalization(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.batchNormalization")
  @js.native
  def batchNormalization(args: BatchNormalizationLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.bidirectional")
  @js.native
  def bidirectional(args: BidirectionalLayerArgs): Bidirectional = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.concatenate")
  @js.native
  def concatenate(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.concatenate")
  @js.native
  def concatenate(args: ConcatenateLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.conv1d")
  @js.native
  def conv1d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.conv2d")
  @js.native
  def conv2d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.conv2dTranspose")
  @js.native
  def conv2dTranspose(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.conv3d")
  @js.native
  def conv3d(args: ConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.convLstm2d")
  @js.native
  def convLstm2d(args: ConvLSTM2DArgs): ConvLSTM2D = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.convLstm2dCell")
  @js.native
  def convLstm2dCell(args: ConvLSTM2DCellArgs): ConvLSTM2DCell = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.cropping2D")
  @js.native
  def cropping2D(args: Cropping2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.dense")
  @js.native
  def dense(args: DenseLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.depthwiseConv2d")
  @js.native
  def depthwiseConv2d(args: DepthwiseConv2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.dot")
  @js.native
  def dot(args: DotLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.dropout")
  @js.native
  def dropout(args: DropoutLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.elu")
  @js.native
  def elu(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.elu")
  @js.native
  def elu(args: ELULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.embedding")
  @js.native
  def embedding(args: EmbeddingLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.flatten")
  @js.native
  def flatten(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.flatten")
  @js.native
  def flatten(args: FlattenLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.gaussianDropout")
  @js.native
  def gaussianDropout(args: GaussianDropoutArgs): GaussianDropout = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.gaussianNoise")
  @js.native
  def gaussianNoise(args: GaussianNoiseArgs): GaussianNoise = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.globalAveragePooling1d")
  @js.native
  def globalAveragePooling1d(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.globalAveragePooling1d")
  @js.native
  def globalAveragePooling1d(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.globalAveragePooling2d")
  @js.native
  def globalAveragePooling2d(args: GlobalPooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.globalMaxPool1d")
  @js.native
  val globalMaxPool1d: js.Function1[/* args */ js.UndefOr[LayerArgs], typings.tensorflowTfjsLayers.topologyMod.Layer] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.globalMaxPool2d")
  @js.native
  val globalMaxPool2d: js.Function1[
    /* args */ GlobalPooling2DLayerArgs, 
    typings.tensorflowTfjsLayers.topologyMod.Layer
  ] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.globalMaxPooling1d")
  @js.native
  def globalMaxPooling1d(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.globalMaxPooling1d")
  @js.native
  def globalMaxPooling1d(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.globalMaxPooling2d")
  @js.native
  def globalMaxPooling2d(args: GlobalPooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.gru")
  @js.native
  def gru(args: GRULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.gruCell")
  @js.native
  def gruCell(args: GRUCellLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.input")
  @js.native
  def input(config: InputConfig): typings.tensorflowTfjsLayers.topologyMod.SymbolicTensor = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.inputLayer")
  @js.native
  def inputLayer(args: InputLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.layerNormalization")
  @js.native
  def layerNormalization(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.layerNormalization")
  @js.native
  def layerNormalization(args: LayerNormalizationLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.leakyReLU")
  @js.native
  def leakyReLU(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.leakyReLU")
  @js.native
  def leakyReLU(args: LeakyReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.lstm")
  @js.native
  def lstm(args: LSTMLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.lstmCell")
  @js.native
  def lstmCell(args: LSTMCellLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.masking")
  @js.native
  def masking(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.masking")
  @js.native
  def masking(args: MaskingArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.maxPool1d")
  @js.native
  val maxPool1d: js.Function1[/* args */ Pooling1DLayerArgs, typings.tensorflowTfjsLayers.topologyMod.Layer] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.maxPool2d")
  @js.native
  val maxPool2d: js.Function1[/* args */ Pooling2DLayerArgs, typings.tensorflowTfjsLayers.topologyMod.Layer] = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.maxPooling1d")
  @js.native
  def maxPooling1d(args: Pooling1DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.maxPooling2d")
  @js.native
  def maxPooling2d(args: Pooling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.maxPooling3d")
  @js.native
  def maxPooling3d(args: Pooling3DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.maximum")
  @js.native
  def maximum(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.maximum")
  @js.native
  def maximum(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.minimum")
  @js.native
  def minimum(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.minimum")
  @js.native
  def minimum(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.multiply")
  @js.native
  def multiply(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.multiply")
  @js.native
  def multiply(args: LayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.permute")
  @js.native
  def permute(args: PermuteLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.prelu")
  @js.native
  def prelu(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.prelu")
  @js.native
  def prelu(args: PReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.reLU")
  @js.native
  def reLU(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.reLU")
  @js.native
  def reLU(args: ReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.repeatVector")
  @js.native
  def repeatVector(args: RepeatVectorLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.reshape")
  @js.native
  def reshape(args: ReshapeLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.rnn")
  @js.native
  def rnn(args: RNNLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.separableConv2d")
  @js.native
  def separableConv2d(args: SeparableConvLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.simpleRNN")
  @js.native
  def simpleRNN(args: SimpleRNNLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.simpleRNNCell")
  @js.native
  def simpleRNNCell(args: SimpleRNNCellLayerArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.softmax")
  @js.native
  def softmax(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.softmax")
  @js.native
  def softmax(args: SoftmaxLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.spatialDropout1d")
  @js.native
  def spatialDropout1d(args: SpatialDropout1DLayerConfig): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.stackedRNNCells")
  @js.native
  def stackedRNNCells(args: StackedRNNCellsArgs): typings.tensorflowTfjsLayers.recurrentMod.RNNCell = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.thresholdedReLU")
  @js.native
  def thresholdedReLU(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.thresholdedReLU")
  @js.native
  def thresholdedReLU(args: ThresholdedReLULayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.timeDistributed")
  @js.native
  def timeDistributed(args: WrapperLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.upSampling2d")
  @js.native
  def upSampling2d(args: UpSampling2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  
  @JSImport("@tensorflow/tfjs-node", "layers.zeroPadding2d")
  @js.native
  def zeroPadding2d(): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
  @JSImport("@tensorflow/tfjs-node", "layers.zeroPadding2d")
  @js.native
  def zeroPadding2d(args: ZeroPadding2DLayerArgs): typings.tensorflowTfjsLayers.topologyMod.Layer = js.native
}
