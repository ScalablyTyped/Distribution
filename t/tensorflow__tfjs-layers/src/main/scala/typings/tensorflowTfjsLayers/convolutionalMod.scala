package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.activationsMod.Activation
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import typings.tensorflowTfjsLayers.variablesMod.LayerVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convolutionalMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "BaseConv")
  @js.native
  abstract class BaseConv protected () extends Layer {
    def this(rank: Double, args: BaseConvLayerArgs) = this()
    
    val DEFAULT_BIAS_INITIALIZER: InitializerIdentifier = js.native
    
    val DEFAULT_KERNEL_INITIALIZER: InitializerIdentifier = js.native
    
    val activation: Activation = js.native
    
    var bias: LayerVariable = js.native
    
    val biasConstraint: js.UndefOr[Constraint] = js.native
    
    val biasInitializer: js.UndefOr[Initializer] = js.native
    
    val biasRegularizer: js.UndefOr[Regularizer] = js.native
    
    val dataFormat: DataFormat = js.native
    
    val dilationRate: js.Array[Double] = js.native
    
    val kernelSize: js.Array[Double] = js.native
    
    val padding: PaddingMode = js.native
    
    val rank: Double = js.native
    
    val strides: js.Array[Double] = js.native
    
    val useBias: Boolean = js.native
  }
  /* static members */
  object BaseConv {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "BaseConv.verifyArgs")
    @js.native
    def verifyArgs(args: BaseConvLayerArgs): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv")
  @js.native
  abstract class Conv protected () extends BaseConv {
    def this(rank: Double, args: ConvLayerArgs) = this()
    
    val filters: Double = js.native
    
    var kernel: LayerVariable = js.native
    
    val kernelConstraint: js.UndefOr[Constraint] = js.native
    
    val kernelInitializer: js.UndefOr[Initializer] = js.native
    
    val kernelRegularizer: js.UndefOr[Regularizer] = js.native
  }
  /* static members */
  object Conv {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv.verifyArgs")
    @js.native
    def verifyArgs(args: ConvLayerArgs): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv1D")
  @js.native
  class Conv1D_ protected () extends Conv {
    def this(args: ConvLayerArgs) = this()
  }
  /* static members */
  object Conv1D_ {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv1D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv1D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv1D.verifyArgs")
    @js.native
    def verifyArgs(args: ConvLayerArgs): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv2DTranspose")
  @js.native
  class Conv2DTranspose protected () extends Conv2D_ {
    def this(args: ConvLayerArgs) = this()
  }
  /* static members */
  object Conv2DTranspose {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv2DTranspose")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv2DTranspose.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv2D")
  @js.native
  class Conv2D_ protected () extends Conv {
    def this(args: ConvLayerArgs) = this()
  }
  /* static members */
  object Conv2D_ {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv2D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv2D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv2D.verifyArgs")
    @js.native
    def verifyArgs(args: ConvLayerArgs): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv3D")
  @js.native
  class Conv3D_ protected () extends Conv {
    def this(args: ConvLayerArgs) = this()
  }
  /* static members */
  object Conv3D_ {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv3D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv3D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv3D.verifyArgs")
    @js.native
    def verifyArgs(args: ConvLayerArgs): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Cropping2D")
  @js.native
  class Cropping2D protected () extends Layer {
    def this(args: Cropping2DLayerArgs) = this()
    
    def computeOutputShape(inputShape: Shape): Shape = js.native
    
    val cropping: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
    
    val dataFormat: DataFormat = js.native
  }
  /* static members */
  object Cropping2D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Cropping2D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Cropping2D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "SeparableConv")
  @js.native
  class SeparableConv protected () extends Conv {
    def this(rank: Double) = this()
    def this(rank: Double, config: SeparableConvLayerArgs) = this()
    
    val DEFAULT_DEPTHWISE_INITIALIZER: InitializerIdentifier = js.native
    
    val DEFAULT_POINTWISE_INITIALIZER: InitializerIdentifier = js.native
    
    val depthMultiplier: Double = js.native
    
    val depthwiseConstraint: js.UndefOr[Constraint] = js.native
    
    val depthwiseInitializer: js.UndefOr[Initializer] = js.native
    
    var depthwiseKernel: LayerVariable = js.native
    
    val depthwiseRegularizer: js.UndefOr[Regularizer] = js.native
    
    val pointwiseConstraint: js.UndefOr[Constraint] = js.native
    
    val pointwiseInitializer: js.UndefOr[Initializer] = js.native
    
    var pointwiseKernel: LayerVariable = js.native
    
    val pointwiseRegularizer: js.UndefOr[Regularizer] = js.native
  }
  /* static members */
  object SeparableConv {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "SeparableConv")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "SeparableConv.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "SeparableConv2D")
  @js.native
  class SeparableConv2D () extends SeparableConv {
    def this(args: SeparableConvLayerArgs) = this()
  }
  /* static members */
  object SeparableConv2D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "SeparableConv2D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "SeparableConv2D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "UpSampling2D")
  @js.native
  class UpSampling2D protected () extends Layer {
    def this(args: UpSampling2DLayerArgs) = this()
    
    val DEFAULT_SIZE: js.Array[Double] = js.native
    
    def computeOutputShape(inputShape: Shape): Shape = js.native
    
    val dataFormat: DataFormat = js.native
    
    val size: js.Array[Double] = js.native
  }
  /* static members */
  object UpSampling2D {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "UpSampling2D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "UpSampling2D.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(x: Tensor[Rank], kernel: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.UndefOr[scala.Nothing], padding: String): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Double,
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Double,
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Double,
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double, padding: String): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double, padding: String, dataFormat: DataFormat): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1d")
  @js.native
  def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: Double): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: Double, padding: String): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv1dWithBias")
  @js.native
  def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(x: Tensor[Rank], kernel: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.UndefOr[scala.Nothing], padding: String): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double], padding: String): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2d")
  @js.native
  def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.UndefOr[scala.Nothing],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.UndefOr[scala.Nothing],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.UndefOr[scala.Nothing],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.UndefOr[scala.Nothing],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.UndefOr[scala.Nothing],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.UndefOr[scala.Nothing],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.UndefOr[scala.Nothing],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.UndefOr[scala.Nothing],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv2dWithBiasActivation")
  @js.native
  def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.fusedTypesMod.Activation
  ): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(x: Tensor[Rank], kernel: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.UndefOr[scala.Nothing], padding: String): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double], padding: String): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3d")
  @js.native
  def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "conv3dWithBias")
  @js.native
  def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "preprocessConv2DInput")
  @js.native
  def preprocessConv2DInput(x: Tensor[Rank], dataFormat: DataFormat): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "preprocessConv3DInput")
  @js.native
  def preprocessConv3DInput(x: Tensor[Rank], dataFormat: DataFormat): Tensor[Rank] = js.native
  
  @js.native
  trait BaseConvLayerArgs extends LayerArgs {
    
    /**
      * Activation function of the layer.
      *
      * If you don't specify the activation, none is applied.
      */
    var activation: js.UndefOr[ActivationIdentifier] = js.native
    
    /**
      * Regularizer function applied to the activation.
      */
    var activityRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * Constraint for the bias vector.
      */
    var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    /**
      * Initializer for the bias vector.
      */
    var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    /**
      * Regularizer function applied to the bias vector.
      */
    var biasRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
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
    var dataFormat: js.UndefOr[DataFormat] = js.native
    
    /**
      * The dilation rate to use for the dilated convolution in each dimension.
      * Should be an integer or array of two or three integers.
      *
      * Currently, specifying any `dilationRate` value != 1 is incompatible with
      * specifying any `strides` value != 1.
      */
    var dilationRate: js.UndefOr[
        Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double])
      ] = js.native
    
    /**
      * Constraint for the convolutional kernel weights.
      */
    var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    /**
      * Initializer for the convolutional kernel weights matrix.
      */
    var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    /**
      * Regularizer function applied to the kernel weights matrix.
      */
    var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * The dimensions of the convolution window. If kernelSize is a number, the
      * convolutional window will be square.
      */
    var kernelSize: Double | js.Array[Double] = js.native
    
    /**
      * Padding mode.
      */
    var padding: js.UndefOr[PaddingMode] = js.native
    
    /**
      * The strides of the convolution in each dimension. If strides is a number,
      * strides in both dimensions are equal.
      *
      * Specifying any stride value != 1 is incompatible with specifying any
      * `dilationRate` value != 1.
      */
    var strides: js.UndefOr[Double | js.Array[Double]] = js.native
    
    /**
      * Whether the layer uses a bias vector. Defaults to `true`.
      */
    var useBias: js.UndefOr[Boolean] = js.native
  }
  object BaseConvLayerArgs {
    
    @scala.inline
    def apply(kernelSize: Double | js.Array[Double]): BaseConvLayerArgs = {
      val __obj = js.Dynamic.literal(kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseConvLayerArgs]
    }
    
    @scala.inline
    implicit class BaseConvLayerArgsMutableBuilder[Self <: BaseConvLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      @scala.inline
      def setActivityRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "activityRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityRegularizerUndefined: Self = StObject.set(x, "activityRegularizer", js.undefined)
      
      @scala.inline
      def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
      
      @scala.inline
      def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
      
      @scala.inline
      def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
      
      @scala.inline
      def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      @scala.inline
      def setDilationRate(
        value: Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double])
      ): Self = StObject.set(x, "dilationRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDilationRateUndefined: Self = StObject.set(x, "dilationRate", js.undefined)
      
      @scala.inline
      def setDilationRateVarargs(value: Double*): Self = StObject.set(x, "dilationRate", js.Array(value :_*))
      
      @scala.inline
      def setKernelConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "kernelConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelConstraintUndefined: Self = StObject.set(x, "kernelConstraint", js.undefined)
      
      @scala.inline
      def setKernelInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "kernelInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelInitializerUndefined: Self = StObject.set(x, "kernelInitializer", js.undefined)
      
      @scala.inline
      def setKernelRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "kernelRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelRegularizerUndefined: Self = StObject.set(x, "kernelRegularizer", js.undefined)
      
      @scala.inline
      def setKernelSize(value: Double | js.Array[Double]): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelSizeVarargs(value: Double*): Self = StObject.set(x, "kernelSize", js.Array(value :_*))
      
      @scala.inline
      def setPadding(value: PaddingMode): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      @scala.inline
      def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value :_*))
      
      @scala.inline
      def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
    }
  }
  
  @js.native
  trait ConvLayerArgs extends BaseConvLayerArgs {
    
    /**
      * The dimensionality of the output space (i.e. the number of filters in the
      * convolution).
      */
    var filters: Double = js.native
  }
  object ConvLayerArgs {
    
    @scala.inline
    def apply(filters: Double, kernelSize: Double | js.Array[Double]): ConvLayerArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvLayerArgs]
    }
    
    @scala.inline
    implicit class ConvLayerArgsMutableBuilder[Self <: ConvLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Cropping2DLayerArgs extends LayerArgs {
    
    /**
      * Dimension of the cropping along the width and the height.
      * - If integer: the same symmetric cropping
      *  is applied to width and height.
      * - If list of 2 integers:
      *   interpreted as two different
      *   symmetric cropping values for height and width:
      *   `[symmetric_height_crop, symmetric_width_crop]`.
      * - If a list of 2 list of 2 integers:
      *   interpreted as
      *   `[[top_crop, bottom_crop], [left_crop, right_crop]]`
      */
    var cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])]) = js.native
    
    /**
      * Format of the data, which determines the ordering of the dimensions in
      * the inputs.
      *
      * `channels_last` corresponds to inputs with shape
      *   `(batch, ..., channels)`
      *
      * `channels_first` corresponds to inputs with shape
      *   `(batch, channels, ...)`
      *
      * Defaults to `channels_last`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.native
  }
  object Cropping2DLayerArgs {
    
    @scala.inline
    def apply(
      cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
    ): Cropping2DLayerArgs = {
      val __obj = js.Dynamic.literal(cropping = cropping.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cropping2DLayerArgs]
    }
    
    @scala.inline
    implicit class Cropping2DLayerArgsMutableBuilder[Self <: Cropping2DLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCropping(
        value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
      ): Self = StObject.set(x, "cropping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    }
  }
  
  @js.native
  trait SeparableConvLayerArgs extends ConvLayerArgs {
    
    /**
      * The number of depthwise convolution output channels for each input
      * channel.
      * The total number of depthwise convolution output channels will be equal
      * to `filtersIn * depthMultiplier`. Default: 1.
      */
    var depthMultiplier: js.UndefOr[Double] = js.native
    
    /**
      * Constraint function applied to the depthwise kernel matrix.
      */
    var depthwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    /**
      * Initializer for the depthwise kernel matrix.
      */
    var depthwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    /**
      * Regularizer function applied to the depthwise kernel matrix.
      */
    var depthwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * Constraint function applied to the pointwise kernel matrix.
      */
    var pointwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    /**
      * Initializer for the pointwise kernel matrix.
      */
    var pointwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    /**
      * Regularizer function applied to the pointwise kernel matrix.
      */
    var pointwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
  }
  object SeparableConvLayerArgs {
    
    @scala.inline
    def apply(filters: Double, kernelSize: Double | js.Array[Double]): SeparableConvLayerArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeparableConvLayerArgs]
    }
    
    @scala.inline
    implicit class SeparableConvLayerArgsMutableBuilder[Self <: SeparableConvLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDepthMultiplier(value: Double): Self = StObject.set(x, "depthMultiplier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthMultiplierUndefined: Self = StObject.set(x, "depthMultiplier", js.undefined)
      
      @scala.inline
      def setDepthwiseConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "depthwiseConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthwiseConstraintUndefined: Self = StObject.set(x, "depthwiseConstraint", js.undefined)
      
      @scala.inline
      def setDepthwiseInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "depthwiseInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthwiseInitializerUndefined: Self = StObject.set(x, "depthwiseInitializer", js.undefined)
      
      @scala.inline
      def setDepthwiseRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "depthwiseRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthwiseRegularizerUndefined: Self = StObject.set(x, "depthwiseRegularizer", js.undefined)
      
      @scala.inline
      def setPointwiseConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "pointwiseConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointwiseConstraintUndefined: Self = StObject.set(x, "pointwiseConstraint", js.undefined)
      
      @scala.inline
      def setPointwiseInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "pointwiseInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointwiseInitializerUndefined: Self = StObject.set(x, "pointwiseInitializer", js.undefined)
      
      @scala.inline
      def setPointwiseRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "pointwiseRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointwiseRegularizerUndefined: Self = StObject.set(x, "pointwiseRegularizer", js.undefined)
    }
  }
  
  @js.native
  trait UpSampling2DLayerArgs extends LayerArgs {
    
    /**
      * Format of the data, which determines the ordering of the dimensions in
      * the inputs.
      *
      * `"channelsLast"` corresponds to inputs with shape
      *   `[batch, ..., channels]`
      *
      *  `"channelsFirst"` corresponds to inputs with shape `[batch, channels,
      * ...]`.
      *
      * Defaults to `"channelsLast"`.
      */
    var dataFormat: js.UndefOr[DataFormat] = js.native
    
    /**
      * The upsampling factors for rows and columns.
      *
      * Defaults to `[2, 2]`.
      */
    var size: js.UndefOr[js.Array[Double]] = js.native
  }
  object UpSampling2DLayerArgs {
    
    @scala.inline
    def apply(): UpSampling2DLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpSampling2DLayerArgs]
    }
    
    @scala.inline
    implicit class UpSampling2DLayerArgsMutableBuilder[Self <: UpSampling2DLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      @scala.inline
      def setSize(value: js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value :_*))
    }
  }
}
