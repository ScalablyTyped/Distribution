package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.convolutionalMod.BaseConv
import typings.tensorflowTfjsLayers.convolutionalMod.BaseConvLayerArgs
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convolutionalDepthwiseMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "DepthwiseConv2D")
  @js.native
  open class DepthwiseConv2D_ protected () extends BaseConv {
    def this(args: DepthwiseConv2DLayerArgs) = this()
    
    /* private */ val depthMultiplier: Any = js.native
    
    /* private */ val depthwiseConstraint: Any = js.native
    
    /* private */ val depthwiseInitializer: Any = js.native
    
    /* private */ var depthwiseKernel: Any = js.native
    
    /* private */ val depthwiseRegularizer: Any = js.native
  }
  /* static members */
  object DepthwiseConv2D_ {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "DepthwiseConv2D")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "DepthwiseConv2D.className")
    @js.native
    def className: String = js.native
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  inline def depthwiseConv2d(x: Tensor[Rank], depthwiseKernel: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(x: Tensor[Rank], depthwiseKernel: Tensor[Rank], strides: js.Tuple2[Double, Double]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: Unit,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(x: Tensor[Rank], depthwiseKernel: Tensor[Rank], strides: Unit, padding: String): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: Unit,
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: Unit,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: Unit,
    padding: Unit,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(x.asInstanceOf[js.Any], depthwiseKernel.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any], dilationRate.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  trait DepthwiseConv2DLayerArgs
    extends StObject
       with BaseConvLayerArgs {
    
    /**
      * The number of depthwise convolution output channels for each input
      * channel.
      * The total number of depthwise convolution output channels will be equal to
      * `filtersIn * depthMultiplier`.
      * Default: 1.
      */
    var depthMultiplier: js.UndefOr[Double] = js.undefined
    
    /**
      * Constraint for the depthwise kernel matrix.
      */
    var depthwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    /**
      * Initializer for the depthwise kernel matrix.
      * Default: GlorotNormal.
      */
    var depthwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    /**
      * Regulzarizer function for the depthwise kernel matrix.
      */
    var depthwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * An integer or Array of 2 integers, specifying the width and height of the
      * 2D convolution window. Can be a single integer to specify the same value
      * for all spatial dimensions.
      */
    @JSName("kernelSize")
    var kernelSize_DepthwiseConv2DLayerArgs: Double | (js.Tuple2[Double, Double])
  }
  object DepthwiseConv2DLayerArgs {
    
    inline def apply(kernelSize: Double | (js.Tuple2[Double, Double])): DepthwiseConv2DLayerArgs = {
      val __obj = js.Dynamic.literal(kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[DepthwiseConv2DLayerArgs]
    }
    
    extension [Self <: DepthwiseConv2DLayerArgs](x: Self) {
      
      inline def setDepthMultiplier(value: Double): Self = StObject.set(x, "depthMultiplier", value.asInstanceOf[js.Any])
      
      inline def setDepthMultiplierUndefined: Self = StObject.set(x, "depthMultiplier", js.undefined)
      
      inline def setDepthwiseConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "depthwiseConstraint", value.asInstanceOf[js.Any])
      
      inline def setDepthwiseConstraintUndefined: Self = StObject.set(x, "depthwiseConstraint", js.undefined)
      
      inline def setDepthwiseInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "depthwiseInitializer", value.asInstanceOf[js.Any])
      
      inline def setDepthwiseInitializerUndefined: Self = StObject.set(x, "depthwiseInitializer", js.undefined)
      
      inline def setDepthwiseRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "depthwiseRegularizer", value.asInstanceOf[js.Any])
      
      inline def setDepthwiseRegularizerUndefined: Self = StObject.set(x, "depthwiseRegularizer", js.undefined)
      
      inline def setKernelSize(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
    }
  }
}
