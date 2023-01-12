package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distActivationsMod.Activation
import typings.tensorflowTfjsLayers.distConstraintsMod.Constraint
import typings.tensorflowTfjsLayers.distConstraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typings.tensorflowTfjsLayers.distInitializersMod.Initializer
import typings.tensorflowTfjsLayers.distInitializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.distKerasFormatActivationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.InterpolationFormat
import typings.tensorflowTfjsLayers.distKerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.distRegularizersMod.Regularizer
import typings.tensorflowTfjsLayers.distRegularizersMod.RegularizerIdentifier
import typings.tensorflowTfjsLayers.distVariablesMod.LayerVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersConvolutionalMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "BaseConv")
  @js.native
  open class BaseConv protected () extends Layer {
    def this(rank: Double, args: BaseConvLayerArgs) = this()
    
    val DEFAULT_BIAS_INITIALIZER: InitializerIdentifier = js.native
    
    val DEFAULT_KERNEL_INITIALIZER: InitializerIdentifier = js.native
    
    /* protected */ val activation: Activation = js.native
    
    /* protected */ var bias: LayerVariable = js.native
    
    /* protected */ val biasConstraint: js.UndefOr[Constraint] = js.native
    
    /* protected */ val biasInitializer: js.UndefOr[Initializer] = js.native
    
    /* protected */ val biasRegularizer: js.UndefOr[Regularizer] = js.native
    
    /* protected */ val dataFormat: DataFormat = js.native
    
    /* protected */ val dilationRate: js.Array[Double] = js.native
    
    /* protected */ val kernelSize: js.Array[Double] = js.native
    
    /* protected */ val padding: PaddingMode = js.native
    
    /* protected */ val rank: Double = js.native
    
    /* protected */ val strides: js.Array[Double] = js.native
    
    /* protected */ val useBias: Boolean = js.native
  }
  /* static members */
  object BaseConv {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "BaseConv")
    @js.native
    val ^ : js.Any = js.native
    
    inline def verifyArgs(args: BaseConvLayerArgs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyArgs")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /* note: abstract class */ @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv")
  @js.native
  open class Conv protected () extends BaseConv {
    def this(rank: Double, args: ConvLayerArgs) = this()
    
    /* protected */ val filters: Double = js.native
    
    /* protected */ var kernel: LayerVariable = js.native
    
    /* protected */ val kernelConstraint: js.UndefOr[Constraint] = js.native
    
    /* protected */ val kernelInitializer: js.UndefOr[Initializer] = js.native
    
    /* protected */ val kernelRegularizer: js.UndefOr[Regularizer] = js.native
  }
  /* static members */
  object Conv {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv")
    @js.native
    val ^ : js.Any = js.native
    
    inline def verifyArgs(args: ConvLayerArgs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyArgs")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv1D")
  @js.native
  open class Conv1D_ protected () extends Conv {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    inline def verifyArgs(args: ConvLayerArgs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyArgs")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv2DTranspose")
  @js.native
  open class Conv2DTranspose protected () extends Conv2D_ {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv2D")
  @js.native
  open class Conv2D_ protected () extends Conv {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    inline def verifyArgs(args: ConvLayerArgs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyArgs")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv3DTranspose")
  @js.native
  open class Conv3DTranspose protected () extends Conv3D_ {
    def this(args: ConvLayerArgs) = this()
  }
  /* static members */
  object Conv3DTranspose {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv3DTranspose")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv3DTranspose.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Conv3D")
  @js.native
  open class Conv3D_ protected () extends Conv {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    inline def verifyArgs(args: ConvLayerArgs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyArgs")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "Cropping2D")
  @js.native
  open class Cropping2D protected () extends Layer {
    def this(args: Cropping2DLayerArgs) = this()
    
    /* protected */ val cropping: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]] = js.native
    
    /* protected */ val dataFormat: DataFormat = js.native
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "SeparableConv")
  @js.native
  open class SeparableConv protected () extends Conv {
    def this(rank: Double) = this()
    def this(rank: Double, config: SeparableConvLayerArgs) = this()
    
    val DEFAULT_DEPTHWISE_INITIALIZER: InitializerIdentifier = js.native
    
    val DEFAULT_POINTWISE_INITIALIZER: InitializerIdentifier = js.native
    
    val depthMultiplier: Double = js.native
    
    /* protected */ val depthwiseConstraint: js.UndefOr[Constraint] = js.native
    
    /* protected */ val depthwiseInitializer: js.UndefOr[Initializer] = js.native
    
    /* protected */ var depthwiseKernel: LayerVariable = js.native
    
    /* protected */ val depthwiseRegularizer: js.UndefOr[Regularizer] = js.native
    
    /* protected */ val pointwiseConstraint: js.UndefOr[Constraint] = js.native
    
    /* protected */ val pointwiseInitializer: js.UndefOr[Initializer] = js.native
    
    /* protected */ var pointwiseKernel: LayerVariable = js.native
    
    /* protected */ val pointwiseRegularizer: js.UndefOr[Regularizer] = js.native
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "SeparableConv2D")
  @js.native
  open class SeparableConv2D () extends SeparableConv {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional", "UpSampling2D")
  @js.native
  open class UpSampling2D protected () extends Layer {
    def this(args: UpSampling2DLayerArgs) = this()
    
    /* protected */ val DEFAULT_SIZE: js.Array[Double] = js.native
    
    /* protected */ val dataFormat: DataFormat = js.native
    
    /* protected */ val interpolation: InterpolationFormat = js.native
    
    /* protected */ val size: js.Array[Double] = js.native
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  inline def conv1d(x: Tensor[Rank], kernel: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double, padding: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: Unit,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double, padding: String, dataFormat: DataFormat): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Double,
    padding: Unit,
    dataFormat: Unit,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Double, padding: Unit, dataFormat: DataFormat): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Double,
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Unit, padding: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: Unit,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Unit, padding: String, dataFormat: DataFormat): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Unit, padding: Unit, dataFormat: DataFormat): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def conv1dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: Double): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: Double, padding: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: Unit,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: Unit,
    dataFormat: Unit,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Double,
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: Unit, padding: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: Unit,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv1dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv1dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def conv2d(x: Tensor[Rank], kernel: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double], padding: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Unit, padding: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Unit, padding: String, dataFormat: DataFormat): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Unit, padding: Unit, dataFormat: DataFormat): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def conv2dWithBiasActivation(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: Unit,
    dilationRate: Unit,
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Unit,
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: Unit,
    dilationRate: Unit,
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: Unit,
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: Unit, padding: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: Unit,
    dilationRate: Unit,
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: Unit,
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    dilationRate: Unit,
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double],
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv2dWithBiasActivation(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: Unit,
    activation: typings.tensorflowTfjsCore.distOpsFusedTypesMod.Activation
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv2dWithBiasActivation")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any], activation.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def conv3d(x: Tensor[Rank], kernel: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(x: Tensor[Rank], kernel: Tensor[Rank], strides: js.Array[Double], padding: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: Unit,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: Unit,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Unit, padding: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: Unit,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Unit, padding: String, dataFormat: DataFormat): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(x: Tensor[Rank], kernel: Tensor[Rank], strides: Unit, padding: Unit, dataFormat: DataFormat): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3d(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3d")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def conv3dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: js.Array[Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: Unit,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: Unit,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: js.Array[Double],
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(x: Tensor[Rank], kernel: Tensor[Rank], bias: Tensor[Rank], strides: Unit, padding: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: Unit,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def conv3dWithBias(
    x: Tensor[Rank],
    kernel: Tensor[Rank],
    bias: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: js.Tuple3[Double, Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("conv3dWithBias")(x.asInstanceOf[js.Any], kernel.asInstanceOf[js.Any], bias.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def preprocessConv2DInput(x: Tensor[Rank], dataFormat: DataFormat): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("preprocessConv2DInput")(x.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def preprocessConv3DInput(x: Tensor[Rank], dataFormat: DataFormat): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("preprocessConv3DInput")(x.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  trait BaseConvLayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * Activation function of the layer.
      *
      * If you don't specify the activation, none is applied.
      */
    var activation: js.UndefOr[ActivationIdentifier] = js.undefined
    
    /**
      * Regularizer function applied to the activation.
      */
    var activityRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * Constraint for the bias vector.
      */
    var biasConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    /**
      * Initializer for the bias vector.
      */
    var biasInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    /**
      * Regularizer function applied to the bias vector.
      */
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
    var dilationRate: js.UndefOr[
        Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double])
      ] = js.undefined
    
    /**
      * Constraint for the convolutional kernel weights.
      */
    var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    /**
      * Initializer for the convolutional kernel weights matrix.
      */
    var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    /**
      * Regularizer function applied to the kernel weights matrix.
      */
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
    
    /**
      * The strides of the convolution in each dimension. If strides is a number,
      * strides in both dimensions are equal.
      *
      * Specifying any stride value != 1 is incompatible with specifying any
      * `dilationRate` value != 1.
      */
    var strides: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * Whether the layer uses a bias vector. Defaults to `true`.
      */
    var useBias: js.UndefOr[Boolean] = js.undefined
  }
  object BaseConvLayerArgs {
    
    inline def apply(kernelSize: Double | js.Array[Double]): BaseConvLayerArgs = {
      val __obj = js.Dynamic.literal(kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseConvLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseConvLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setActivation(value: ActivationIdentifier): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
      
      inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
      
      inline def setActivityRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "activityRegularizer", value.asInstanceOf[js.Any])
      
      inline def setActivityRegularizerUndefined: Self = StObject.set(x, "activityRegularizer", js.undefined)
      
      inline def setBiasConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "biasConstraint", value.asInstanceOf[js.Any])
      
      inline def setBiasConstraintUndefined: Self = StObject.set(x, "biasConstraint", js.undefined)
      
      inline def setBiasInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "biasInitializer", value.asInstanceOf[js.Any])
      
      inline def setBiasInitializerUndefined: Self = StObject.set(x, "biasInitializer", js.undefined)
      
      inline def setBiasRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "biasRegularizer", value.asInstanceOf[js.Any])
      
      inline def setBiasRegularizerUndefined: Self = StObject.set(x, "biasRegularizer", js.undefined)
      
      inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      inline def setDilationRate(
        value: Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double])
      ): Self = StObject.set(x, "dilationRate", value.asInstanceOf[js.Any])
      
      inline def setDilationRateUndefined: Self = StObject.set(x, "dilationRate", js.undefined)
      
      inline def setDilationRateVarargs(value: Double*): Self = StObject.set(x, "dilationRate", js.Array(value*))
      
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
      
      inline def setStrides(value: Double | js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
      
      inline def setUseBias(value: Boolean): Self = StObject.set(x, "useBias", value.asInstanceOf[js.Any])
      
      inline def setUseBiasUndefined: Self = StObject.set(x, "useBias", js.undefined)
    }
  }
  
  trait ConvLayerArgs
    extends StObject
       with BaseConvLayerArgs {
    
    /**
      * The dimensionality of the output space (i.e. the number of filters in the
      * convolution).
      */
    var filters: Double
  }
  object ConvLayerArgs {
    
    inline def apply(filters: Double, kernelSize: Double | js.Array[Double]): ConvLayerArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConvLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConvLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setFilters(value: Double): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cropping2DLayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * Dimension of the cropping along the width and the height.
      * - If integer: the same symmetric cropping
      *  is applied to width and height.
      * - If list of 2 integers:
      *   interpreted as two different
      *   symmetric cropping values for height and width:
      *   `[symmetric_height_crop, symmetric_width_crop]`.
      * - If a list of 2 lists of 2 integers:
      *   interpreted as
      *   `[[top_crop, bottom_crop], [left_crop, right_crop]]`
      */
    var cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
    
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
    var dataFormat: js.UndefOr[DataFormat] = js.undefined
  }
  object Cropping2DLayerArgs {
    
    inline def apply(
      cropping: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
    ): Cropping2DLayerArgs = {
      val __obj = js.Dynamic.literal(cropping = cropping.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cropping2DLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cropping2DLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setCropping(
        value: Double | (js.Tuple2[Double | (js.Tuple2[Double, Double]), Double | (js.Tuple2[Double, Double])])
      ): Self = StObject.set(x, "cropping", value.asInstanceOf[js.Any])
      
      inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    }
  }
  
  trait SeparableConvLayerArgs
    extends StObject
       with ConvLayerArgs {
    
    /**
      * The number of depthwise convolution output channels for each input
      * channel.
      * The total number of depthwise convolution output channels will be equal
      * to `filtersIn * depthMultiplier`. Default: 1.
      */
    var depthMultiplier: js.UndefOr[Double] = js.undefined
    
    /**
      * Constraint function applied to the depthwise kernel matrix.
      */
    var depthwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    /**
      * Initializer for the depthwise kernel matrix.
      */
    var depthwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    /**
      * Regularizer function applied to the depthwise kernel matrix.
      */
    var depthwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * Constraint function applied to the pointwise kernel matrix.
      */
    var pointwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    /**
      * Initializer for the pointwise kernel matrix.
      */
    var pointwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    /**
      * Regularizer function applied to the pointwise kernel matrix.
      */
    var pointwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  }
  object SeparableConvLayerArgs {
    
    inline def apply(filters: Double, kernelSize: Double | js.Array[Double]): SeparableConvLayerArgs = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeparableConvLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SeparableConvLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setDepthMultiplier(value: Double): Self = StObject.set(x, "depthMultiplier", value.asInstanceOf[js.Any])
      
      inline def setDepthMultiplierUndefined: Self = StObject.set(x, "depthMultiplier", js.undefined)
      
      inline def setDepthwiseConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "depthwiseConstraint", value.asInstanceOf[js.Any])
      
      inline def setDepthwiseConstraintUndefined: Self = StObject.set(x, "depthwiseConstraint", js.undefined)
      
      inline def setDepthwiseInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "depthwiseInitializer", value.asInstanceOf[js.Any])
      
      inline def setDepthwiseInitializerUndefined: Self = StObject.set(x, "depthwiseInitializer", js.undefined)
      
      inline def setDepthwiseRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "depthwiseRegularizer", value.asInstanceOf[js.Any])
      
      inline def setDepthwiseRegularizerUndefined: Self = StObject.set(x, "depthwiseRegularizer", js.undefined)
      
      inline def setPointwiseConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "pointwiseConstraint", value.asInstanceOf[js.Any])
      
      inline def setPointwiseConstraintUndefined: Self = StObject.set(x, "pointwiseConstraint", js.undefined)
      
      inline def setPointwiseInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "pointwiseInitializer", value.asInstanceOf[js.Any])
      
      inline def setPointwiseInitializerUndefined: Self = StObject.set(x, "pointwiseInitializer", js.undefined)
      
      inline def setPointwiseRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "pointwiseRegularizer", value.asInstanceOf[js.Any])
      
      inline def setPointwiseRegularizerUndefined: Self = StObject.set(x, "pointwiseRegularizer", js.undefined)
    }
  }
  
  trait UpSampling2DLayerArgs
    extends StObject
       with LayerArgs {
    
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
    var dataFormat: js.UndefOr[DataFormat] = js.undefined
    
    /**
      * The interpolation mechanism, one of `"nearest"` or `"bilinear"`, default
      * to `"nearest"`.
      */
    var interpolation: js.UndefOr[InterpolationFormat] = js.undefined
    
    /**
      * The upsampling factors for rows and columns.
      *
      * Defaults to `[2, 2]`.
      */
    var size: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object UpSampling2DLayerArgs {
    
    inline def apply(): UpSampling2DLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpSampling2DLayerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpSampling2DLayerArgs] (val x: Self) extends AnyVal {
      
      inline def setDataFormat(value: DataFormat): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
      
      inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
      
      inline def setInterpolation(value: InterpolationFormat): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
      
      inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
      
      inline def setSize(value: js.Array[Double]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
    }
  }
}
