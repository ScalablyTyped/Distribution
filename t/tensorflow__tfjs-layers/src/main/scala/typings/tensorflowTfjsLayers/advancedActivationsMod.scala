package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object advancedActivationsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ELU")
  @js.native
  class ELU () extends Layer {
    def this(args: ELULayerArgs) = this()
    
    val DEFAULT_ALPHA: /* 1 */ Double = js.native
    
    val alpha: Double = js.native
  }
  /* static members */
  object ELU {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ELU")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ELU.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "LeakyReLU")
  @js.native
  class LeakyReLU () extends Layer {
    def this(args: LeakyReLULayerArgs) = this()
    
    val DEFAULT_ALPHA: /* 0.3 */ Double = js.native
    
    val alpha: Double = js.native
  }
  /* static members */
  object LeakyReLU {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "LeakyReLU")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "LeakyReLU.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "PReLU")
  @js.native
  class PReLU () extends Layer {
    def this(args: PReLULayerArgs) = this()
    
    val DEFAULT_ALPHA_INITIALIZER: InitializerIdentifier = js.native
    
    var alpha: js.Any = js.native
    
    val alphaConstraint: js.Any = js.native
    
    val alphaInitializer: js.Any = js.native
    
    val alphaRegularizer: js.Any = js.native
    
    val sharedAxes: js.Any = js.native
  }
  /* static members */
  object PReLU {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "PReLU")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "PReLU.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ReLU")
  @js.native
  class ReLU () extends Layer {
    def this(args: ReLULayerArgs) = this()
    
    var maxValue: Double = js.native
  }
  /* static members */
  object ReLU {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ReLU")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ReLU.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "Softmax")
  @js.native
  class Softmax () extends Layer {
    def this(args: SoftmaxLayerArgs) = this()
    
    val DEFAULT_AXIS: /* 1 */ Double = js.native
    
    val axis: Double = js.native
    
    def softmax(t: Tensor[Rank]): Tensor[Rank] = js.native
    def softmax(t: Tensor[Rank], a: Double): Tensor[Rank] = js.native
  }
  /* static members */
  object Softmax {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "Softmax")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "Softmax.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ThresholdedReLU")
  @js.native
  class ThresholdedReLU () extends Layer {
    def this(args: ThresholdedReLULayerArgs) = this()
    
    val DEFAULT_THETA: /* 1 */ Double = js.native
    
    val theta: Double = js.native
  }
  /* static members */
  object ThresholdedReLU {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ThresholdedReLU")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ThresholdedReLU.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ELULayerArgs extends LayerArgs {
    
    /**
      * Float `>= 0`. Negative slope coefficient. Defaults to `1.0`.
      */
    var alpha: js.UndefOr[Double] = js.native
  }
  object ELULayerArgs {
    
    @scala.inline
    def apply(): ELULayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ELULayerArgs]
    }
    
    @scala.inline
    implicit class ELULayerArgsMutableBuilder[Self <: ELULayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    }
  }
  
  @js.native
  trait LeakyReLULayerArgs extends LayerArgs {
    
    /**
      * Float `>= 0`. Negative slope coefficient. Defaults to `0.3`.
      */
    var alpha: js.UndefOr[Double] = js.native
  }
  object LeakyReLULayerArgs {
    
    @scala.inline
    def apply(): LeakyReLULayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LeakyReLULayerArgs]
    }
    
    @scala.inline
    implicit class LeakyReLULayerArgsMutableBuilder[Self <: LeakyReLULayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    }
  }
  
  @js.native
  trait PReLULayerArgs extends LayerArgs {
    
    /**
      * Constraint for the learnable alpha.
      */
    var alphaConstraint: js.UndefOr[Constraint] = js.native
    
    /**
      * Initializer for the learnable alpha.
      */
    var alphaInitializer: js.UndefOr[Initializer | InitializerIdentifier] = js.native
    
    /**
      * Regularizer for the learnable alpha.
      */
    var alphaRegularizer: js.UndefOr[Regularizer] = js.native
    
    /**
      * The axes along which to share learnable parameters for the activation
      * function. For example, if the incoming feature maps are from a 2D
      * convolution with output shape `[numExamples, height, width, channels]`,
      * and you wish to share parameters across space (height and width) so that
      * each filter channels has only one set of parameters, set
      * `shared_axes: [1, 2]`.
      */
    var sharedAxes: js.UndefOr[Double | js.Array[Double]] = js.native
  }
  object PReLULayerArgs {
    
    @scala.inline
    def apply(): PReLULayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PReLULayerArgs]
    }
    
    @scala.inline
    implicit class PReLULayerArgsMutableBuilder[Self <: PReLULayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphaConstraint(value: Constraint): Self = StObject.set(x, "alphaConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaConstraintUndefined: Self = StObject.set(x, "alphaConstraint", js.undefined)
      
      @scala.inline
      def setAlphaInitializer(value: Initializer | InitializerIdentifier): Self = StObject.set(x, "alphaInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaInitializerUndefined: Self = StObject.set(x, "alphaInitializer", js.undefined)
      
      @scala.inline
      def setAlphaRegularizer(value: Regularizer): Self = StObject.set(x, "alphaRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaRegularizerUndefined: Self = StObject.set(x, "alphaRegularizer", js.undefined)
      
      @scala.inline
      def setSharedAxes(value: Double | js.Array[Double]): Self = StObject.set(x, "sharedAxes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedAxesUndefined: Self = StObject.set(x, "sharedAxes", js.undefined)
      
      @scala.inline
      def setSharedAxesVarargs(value: Double*): Self = StObject.set(x, "sharedAxes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ReLULayerArgs extends LayerArgs {
    
    /**
      * Float, the maximum output value.
      */
    var maxValue: js.UndefOr[Double] = js.native
  }
  object ReLULayerArgs {
    
    @scala.inline
    def apply(): ReLULayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReLULayerArgs]
    }
    
    @scala.inline
    implicit class ReLULayerArgsMutableBuilder[Self <: ReLULayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    }
  }
  
  @js.native
  trait SoftmaxLayerArgs extends LayerArgs {
    
    /**
      * Integer, axis along which the softmax normalization is applied.
      * Defaults to `-1` (i.e., the last axis).
      */
    var axis: js.UndefOr[Double] = js.native
  }
  object SoftmaxLayerArgs {
    
    @scala.inline
    def apply(): SoftmaxLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoftmaxLayerArgs]
    }
    
    @scala.inline
    implicit class SoftmaxLayerArgsMutableBuilder[Self <: SoftmaxLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  @js.native
  trait ThresholdedReLULayerArgs extends LayerArgs {
    
    /**
      * Float >= 0. Threshold location of activation.
      */
    var theta: js.UndefOr[Double] = js.native
  }
  object ThresholdedReLULayerArgs {
    
    @scala.inline
    def apply(): ThresholdedReLULayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThresholdedReLULayerArgs]
    }
    
    @scala.inline
    implicit class ThresholdedReLULayerArgsMutableBuilder[Self <: ThresholdedReLULayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    }
  }
}
