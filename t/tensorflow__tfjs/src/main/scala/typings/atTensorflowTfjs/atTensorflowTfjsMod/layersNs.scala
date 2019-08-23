package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.serializationNs.Serializable
import typings.atTensorflowTfjsDashCore.distSerializationMod.ConfigDict
import typings.atTensorflowTfjsDashCore.distSerializationMod.SerializableConstructor
import typings.atTensorflowTfjsDashLayers.distEngineInputUnderscoreLayerMod.InputConfig
import typings.atTensorflowTfjsDashLayers.distEngineInputUnderscoreLayerMod.InputLayerArgs
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod.ELULayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod.LeakyReLULayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod.PReLULayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod.ReLULayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod.SoftmaxLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod.ThresholdedReLULayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersConvolutionalMod.ConvLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersConvolutionalMod.Cropping2DLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersConvolutionalMod.SeparableConvLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersConvolutionalMod.UpSampling2DLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersConvolutionalUnderscoreDepthwiseMod.DepthwiseConv2DLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersCoreMod.ActivationLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersCoreMod.DenseLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersCoreMod.DropoutLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersCoreMod.MaskingArgs
import typings.atTensorflowTfjsDashLayers.distLayersCoreMod.PermuteLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersCoreMod.RepeatVectorLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersCoreMod.ReshapeLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersEmbeddingsMod.EmbeddingLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersMergeMod.ConcatenateLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersMergeMod.DotLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersNoiseMod.AlphaDropout
import typings.atTensorflowTfjsDashLayers.distLayersNoiseMod.AlphaDropoutArgs
import typings.atTensorflowTfjsDashLayers.distLayersNoiseMod.GaussianDropout
import typings.atTensorflowTfjsDashLayers.distLayersNoiseMod.GaussianDropoutArgs
import typings.atTensorflowTfjsDashLayers.distLayersNoiseMod.GaussianNoise
import typings.atTensorflowTfjsDashLayers.distLayersNoiseMod.GaussianNoiseArgs
import typings.atTensorflowTfjsDashLayers.distLayersNormalizationMod.BatchNormalizationLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersPaddingMod.ZeroPadding2DLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersPoolingMod.GlobalPooling2DLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersPoolingMod.Pooling1DLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersPoolingMod.Pooling2DLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersPoolingMod.Pooling3DLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.GRUCellLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.GRULayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.LSTMCellLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.LSTMLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNNLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.SimpleRNNCellLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.SimpleRNNLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.StackedRNNCellsArgs
import typings.atTensorflowTfjsDashLayers.distLayersWrappersMod.Bidirectional
import typings.atTensorflowTfjsDashLayers.distLayersWrappersMod.BidirectionalLayerArgs
import typings.atTensorflowTfjsDashLayers.distLayersWrappersMod.WrapperLayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "layers")
@js.native
object layersNs extends js.Object {
  @js.native
  abstract class Layer protected ()
    extends typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersMod.layersNs.Layer {
    def this(args: LayerArgs) = this()
  }
  
  @js.native
  class RNN protected ()
    extends typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersMod.layersNs.RNN {
    def this(args: RNNLayerArgs) = this()
  }
  
  @js.native
  abstract class RNNCell ()
    extends typings.atTensorflowTfjsDashLayers.atTensorflowTfjsDashLayersMod.layersNs.RNNCell
  
  val globalMaxPool1d: js.Function1[
    /* args */ js.UndefOr[LayerArgs], 
    typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
  ] = js.native
  val globalMaxPool2d: js.Function1[
    /* args */ GlobalPooling2DLayerArgs, 
    typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
  ] = js.native
  val maxPool1d: js.Function1[
    /* args */ Pooling1DLayerArgs, 
    typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
  ] = js.native
  val maxPool2d: js.Function1[
    /* args */ Pooling2DLayerArgs, 
    typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer
  ] = js.native
  def activation(args: ActivationLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def add(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def add(args: LayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def alphaDropout(args: AlphaDropoutArgs): AlphaDropout = js.native
  def average(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def average(args: LayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def averagePooling1d(args: Pooling1DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def averagePooling2d(args: Pooling2DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def averagePooling3d(args: Pooling3DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def avgPool1d(args: Pooling1DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def avgPool2d(args: Pooling2DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def avgPool3d(args: Pooling3DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def avgPooling1d(args: Pooling1DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def avgPooling2d(args: Pooling2DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def avgPooling3d(args: Pooling3DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def batchNormalization(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def batchNormalization(args: BatchNormalizationLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def bidirectional(args: BidirectionalLayerArgs): Bidirectional = js.native
  def concatenate(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def concatenate(args: ConcatenateLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def conv1d(args: ConvLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def conv2d(args: ConvLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def conv2dTranspose(args: ConvLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def conv3d(args: ConvLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def cropping2D(args: Cropping2DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def dense(args: DenseLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def depthwiseConv2d(args: DepthwiseConv2DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def dot(args: DotLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def dropout(args: DropoutLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def elu(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def elu(args: ELULayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def embedding(args: EmbeddingLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def flatten(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def flatten(args: LayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def gaussianDropout(args: GaussianDropoutArgs): GaussianDropout = js.native
  def gaussianNoise(args: GaussianNoiseArgs): GaussianNoise = js.native
  def globalAveragePooling1d(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def globalAveragePooling1d(args: LayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def globalAveragePooling2d(args: GlobalPooling2DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def globalMaxPooling1d(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def globalMaxPooling1d(args: LayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def globalMaxPooling2d(args: GlobalPooling2DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def gru(args: GRULayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def gruCell(args: GRUCellLayerArgs): typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNNCell = js.native
  def input(config: InputConfig): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.SymbolicTensor = js.native
  def inputLayer(args: InputLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def leakyReLU(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def leakyReLU(args: LeakyReLULayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def lstm(args: LSTMLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def lstmCell(args: LSTMCellLayerArgs): typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNNCell = js.native
  def masking(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def masking(args: MaskingArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def maxPooling1d(args: Pooling1DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def maxPooling2d(args: Pooling2DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def maxPooling3d(args: Pooling3DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def maximum(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def maximum(args: LayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def minimum(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def minimum(args: LayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def multiply(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def multiply(args: LayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def permute(args: PermuteLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def prelu(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def prelu(args: PReLULayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def reLU(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def reLU(args: ReLULayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def repeatVector(args: RepeatVectorLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def reshape(args: ReshapeLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def rnn(args: RNNLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def separableConv2d(args: SeparableConvLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def simpleRNN(args: SimpleRNNLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def simpleRNNCell(args: SimpleRNNCellLayerArgs): typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNNCell = js.native
  def softmax(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def softmax(args: SoftmaxLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def stackedRNNCells(args: StackedRNNCellsArgs): typings.atTensorflowTfjsDashLayers.distLayersRecurrentMod.RNNCell = js.native
  def thresholdedReLU(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def thresholdedReLU(args: ThresholdedReLULayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def timeDistributed(args: WrapperLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def upSampling2d(args: UpSampling2DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def zeroPadding2d(): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  def zeroPadding2d(args: ZeroPadding2DLayerArgs): typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer = js.native
  /* static members */
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
    /* protected */ def nodeKey(layer: typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.Layer, nodeIndex: Double): String = js.native
  }
  
  /* static members */
  @js.native
  object RNN extends js.Object {
    /** @nocollapse */
    var className: String = js.native
    /** @nocollapse */
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict): T = js.native
    def fromConfig[T /* <: Serializable */](cls: SerializableConstructor[T], config: ConfigDict, customObjects: ConfigDict): T = js.native
  }
  
}

