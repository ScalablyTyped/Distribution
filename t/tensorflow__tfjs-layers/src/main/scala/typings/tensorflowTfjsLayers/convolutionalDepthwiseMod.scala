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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convolutionalDepthwiseMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "DepthwiseConv2D")
  @js.native
  class DepthwiseConv2D_ protected () extends BaseConv {
    def this(args: DepthwiseConv2DLayerArgs) = this()
    
    val depthMultiplier: js.Any = js.native
    
    val depthwiseConstraint: js.Any = js.native
    
    val depthwiseInitializer: js.Any = js.native
    
    var depthwiseKernel: js.Any = js.native
    
    val depthwiseRegularizer: js.Any = js.native
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
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(x: Tensor[Rank], depthwiseKernel: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.UndefOr[scala.Nothing],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(x: Tensor[Rank], depthwiseKernel: Tensor[Rank], strides: js.Tuple2[Double, Double]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: js.UndefOr[scala.Nothing],
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: js.UndefOr[scala.Nothing],
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: DataFormat
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/convolutional_depthwise", "depthwiseConv2d")
  @js.native
  def depthwiseConv2d(
    x: Tensor[Rank],
    depthwiseKernel: Tensor[Rank],
    strides: js.Tuple2[Double, Double],
    padding: String,
    dataFormat: DataFormat,
    dilationRate: js.Tuple2[Double, Double]
  ): Tensor[Rank] = js.native
  
  @js.native
  trait DepthwiseConv2DLayerArgs extends BaseConvLayerArgs {
    
    /**
      * The number of depthwise convolution output channels for each input
      * channel.
      * The total number of depthwise convolution output channels will be equal to
      * `filtersIn * depthMultiplier`.
      * Default: 1.
      */
    var depthMultiplier: js.UndefOr[Double] = js.native
    
    /**
      * Constraint for the depthwise kernel matrix.
      */
    var depthwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    /**
      * Initializer for the depthwise kernel matrix.
      * Default: GlorotNormal.
      */
    var depthwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    /**
      * Regulzarizer function for the depthwise kernel matrix.
      */
    var depthwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * An integer or Array of 2 integers, specifying the width and height of the
      * 2D convolution window. Can be a single integer to specify the same value
      * for all spatial dimensions.
      */
    @JSName("kernelSize")
    var kernelSize_DepthwiseConv2DLayerArgs: Double | (js.Tuple2[Double, Double]) = js.native
  }
  object DepthwiseConv2DLayerArgs {
    
    @scala.inline
    def apply(kernelSize: Double | (js.Tuple2[Double, Double])): DepthwiseConv2DLayerArgs = {
      val __obj = js.Dynamic.literal(kernelSize = kernelSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[DepthwiseConv2DLayerArgs]
    }
    
    @scala.inline
    implicit class DepthwiseConv2DLayerArgsMutableBuilder[Self <: DepthwiseConv2DLayerArgs] (val x: Self) extends AnyVal {
      
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
      def setKernelSize(value: Double | (js.Tuple2[Double, Double])): Self = StObject.set(x, "kernelSize", value.asInstanceOf[js.Any])
    }
  }
}
