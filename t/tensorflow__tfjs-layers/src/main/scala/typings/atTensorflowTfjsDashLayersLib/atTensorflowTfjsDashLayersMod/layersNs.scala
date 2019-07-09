package typings
package atTensorflowTfjsDashLayersLib.atTensorflowTfjsDashLayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers", "layers")
@js.native
object layersNs extends js.Object {
  @js.native
  abstract class Layer protected ()
    extends atTensorflowTfjsDashLayersLib.distExportsUnderscoreLayersMod.Layer {
    def this(args: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs) = this()
  }
  
  @js.native
  class RNN protected ()
    extends atTensorflowTfjsDashLayersLib.distExportsUnderscoreLayersMod.RNN {
    def this(args: atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.RNNLayerArgs) = this()
  }
  
  @js.native
  abstract class RNNCell ()
    extends atTensorflowTfjsDashLayersLib.distExportsUnderscoreLayersMod.RNNCell
  
  val globalMaxPool1d: js.Function1[
    /* args */ js.UndefOr[atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs], 
    atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer
  ] = js.native
  val globalMaxPool2d: js.Function1[
    /* args */ atTensorflowTfjsDashLayersLib.distLayersPoolingMod.GlobalPooling2DLayerArgs, 
    atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer
  ] = js.native
  val maxPool1d: js.Function1[
    /* args */ atTensorflowTfjsDashLayersLib.distLayersPoolingMod.Pooling1DLayerArgs, 
    atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer
  ] = js.native
  val maxPool2d: js.Function1[
    /* args */ atTensorflowTfjsDashLayersLib.distLayersPoolingMod.Pooling2DLayerArgs, 
    atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer
  ] = js.native
  def activation(args: atTensorflowTfjsDashLayersLib.distLayersCoreMod.ActivationLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def add(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def add(args: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def alphaDropout(args: atTensorflowTfjsDashLayersLib.distLayersNoiseMod.AlphaDropoutArgs): atTensorflowTfjsDashLayersLib.distLayersNoiseMod.AlphaDropout = js.native
  def average(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def average(args: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def averagePooling1d(args: atTensorflowTfjsDashLayersLib.distLayersPoolingMod.Pooling1DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def averagePooling2d(args: atTensorflowTfjsDashLayersLib.distLayersPoolingMod.Pooling2DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def avgPool1d(args: atTensorflowTfjsDashLayersLib.distLayersPoolingMod.Pooling1DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def avgPool2d(args: atTensorflowTfjsDashLayersLib.distLayersPoolingMod.Pooling2DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def avgPooling1d(args: atTensorflowTfjsDashLayersLib.distLayersPoolingMod.Pooling1DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def avgPooling2d(args: atTensorflowTfjsDashLayersLib.distLayersPoolingMod.Pooling2DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def batchNormalization(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def batchNormalization(args: atTensorflowTfjsDashLayersLib.distLayersNormalizationMod.BatchNormalizationLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def bidirectional(args: atTensorflowTfjsDashLayersLib.distLayersWrappersMod.BidirectionalLayerArgs): atTensorflowTfjsDashLayersLib.distLayersWrappersMod.Bidirectional = js.native
  def concatenate(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def concatenate(args: atTensorflowTfjsDashLayersLib.distLayersMergeMod.ConcatenateLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def conv1d(args: atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod.ConvLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def conv2d(args: atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod.ConvLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def conv2dTranspose(args: atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod.ConvLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def conv3d(args: atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod.ConvLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def cropping2D(args: atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod.Cropping2DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def dense(args: atTensorflowTfjsDashLayersLib.distLayersCoreMod.DenseLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def depthwiseConv2d(
    args: atTensorflowTfjsDashLayersLib.distLayersConvolutionalUnderscoreDepthwiseMod.DepthwiseConv2DLayerArgs
  ): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def dot(args: atTensorflowTfjsDashLayersLib.distLayersMergeMod.DotLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def dropout(args: atTensorflowTfjsDashLayersLib.distLayersCoreMod.DropoutLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def elu(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def elu(args: atTensorflowTfjsDashLayersLib.distLayersAdvancedUnderscoreActivationsMod.ELULayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def embedding(args: atTensorflowTfjsDashLayersLib.distLayersEmbeddingsMod.EmbeddingLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def flatten(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def flatten(args: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def gaussianDropout(args: atTensorflowTfjsDashLayersLib.distLayersNoiseMod.GaussianDropoutArgs): atTensorflowTfjsDashLayersLib.distLayersNoiseMod.GaussianDropout = js.native
  def gaussianNoise(args: atTensorflowTfjsDashLayersLib.distLayersNoiseMod.GaussianNoiseArgs): atTensorflowTfjsDashLayersLib.distLayersNoiseMod.GaussianNoise = js.native
  def globalAveragePooling1d(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def globalAveragePooling1d(args: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def globalAveragePooling2d(args: atTensorflowTfjsDashLayersLib.distLayersPoolingMod.GlobalPooling2DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def globalMaxPooling1d(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def globalMaxPooling1d(args: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def globalMaxPooling2d(args: atTensorflowTfjsDashLayersLib.distLayersPoolingMod.GlobalPooling2DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def gru(args: atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.GRULayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def gruCell(args: atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.GRUCellLayerArgs): atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.RNNCell = js.native
  def input(config: atTensorflowTfjsDashLayersLib.distEngineInputUnderscoreLayerMod.InputConfig): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.SymbolicTensor = js.native
  def inputLayer(args: atTensorflowTfjsDashLayersLib.distEngineInputUnderscoreLayerMod.InputLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def leakyReLU(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def leakyReLU(args: atTensorflowTfjsDashLayersLib.distLayersAdvancedUnderscoreActivationsMod.LeakyReLULayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def lstm(args: atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.LSTMLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def lstmCell(args: atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.LSTMCellLayerArgs): atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.RNNCell = js.native
  def masking(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def masking(args: atTensorflowTfjsDashLayersLib.distLayersCoreMod.MaskingArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def maxPooling1d(args: atTensorflowTfjsDashLayersLib.distLayersPoolingMod.Pooling1DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def maxPooling2d(args: atTensorflowTfjsDashLayersLib.distLayersPoolingMod.Pooling2DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def maximum(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def maximum(args: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def minimum(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def minimum(args: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def multiply(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def multiply(args: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def permute(args: atTensorflowTfjsDashLayersLib.distLayersCoreMod.PermuteLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def prelu(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def prelu(args: atTensorflowTfjsDashLayersLib.distLayersAdvancedUnderscoreActivationsMod.PReLULayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def reLU(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def reLU(args: atTensorflowTfjsDashLayersLib.distLayersAdvancedUnderscoreActivationsMod.ReLULayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def repeatVector(args: atTensorflowTfjsDashLayersLib.distLayersCoreMod.RepeatVectorLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def reshape(args: atTensorflowTfjsDashLayersLib.distLayersCoreMod.ReshapeLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def rnn(args: atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.RNNLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def separableConv2d(args: atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod.SeparableConvLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def simpleRNN(args: atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.SimpleRNNLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def simpleRNNCell(args: atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.SimpleRNNCellLayerArgs): atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.RNNCell = js.native
  def softmax(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def softmax(args: atTensorflowTfjsDashLayersLib.distLayersAdvancedUnderscoreActivationsMod.SoftmaxLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def stackedRNNCells(args: atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.StackedRNNCellsArgs): atTensorflowTfjsDashLayersLib.distLayersRecurrentMod.RNNCell = js.native
  def thresholdedReLU(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def thresholdedReLU(
    args: atTensorflowTfjsDashLayersLib.distLayersAdvancedUnderscoreActivationsMod.ThresholdedReLULayerArgs
  ): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def timeDistributed(args: atTensorflowTfjsDashLayersLib.distLayersWrappersMod.WrapperLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def upSampling2d(args: atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod.UpSampling2DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def zeroPadding2d(): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
  def zeroPadding2d(args: atTensorflowTfjsDashLayersLib.distLayersPaddingMod.ZeroPadding2DLayerArgs): atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer = js.native
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
    /* protected */ def nodeKey(layer: atTensorflowTfjsDashLayersLib.distEngineTopologyMod.Layer, nodeIndex: scala.Double): java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object RNN extends js.Object {
    /** @nocollapse */
    var className: java.lang.String = js.native
    /** @nocollapse */
    def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable */](
      cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
      config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
    ): T = js.native
    def fromConfig[T /* <: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.serializationNs.Serializable */](
      cls: atTensorflowTfjsDashCoreLib.distSerializationMod.SerializableConstructor[T],
      config: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict,
      customObjects: atTensorflowTfjsDashCoreLib.distSerializationMod.ConfigDict
    ): T = js.native
  }
  
}

