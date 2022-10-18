package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.distConstraintsMod.Constraint
import typings.tensorflowTfjsLayers.distEngineTopologyMod.Layer
import typings.tensorflowTfjsLayers.distEngineTopologyMod.LayerArgs
import typings.tensorflowTfjsLayers.distInitializersMod.Initializer
import typings.tensorflowTfjsLayers.distInitializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.distRegularizersMod.Regularizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLayersAdvancedActivationsMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ELU")
  @js.native
  open class ELU () extends Layer {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "LeakyReLU")
  @js.native
  open class LeakyReLU () extends Layer {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "PReLU")
  @js.native
  open class PReLU () extends Layer {
    def this(args: PReLULayerArgs) = this()
    
    val DEFAULT_ALPHA_INITIALIZER: InitializerIdentifier = js.native
    
    /* private */ var alpha: Any = js.native
    
    /* private */ val alphaConstraint: Any = js.native
    
    /* private */ val alphaInitializer: Any = js.native
    
    /* private */ val alphaRegularizer: Any = js.native
    
    /* private */ val sharedAxes: Any = js.native
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ReLU")
  @js.native
  open class ReLU () extends Layer {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "Softmax")
  @js.native
  open class Softmax () extends Layer {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/advanced_activations", "ThresholdedReLU")
  @js.native
  open class ThresholdedReLU () extends Layer {
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  trait ELULayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * Float `>= 0`. Negative slope coefficient. Defaults to `1.0`.
      */
    var alpha: js.UndefOr[Double] = js.undefined
  }
  object ELULayerArgs {
    
    inline def apply(): ELULayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ELULayerArgs]
    }
    
    extension [Self <: ELULayerArgs](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    }
  }
  
  trait LeakyReLULayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * Float `>= 0`. Negative slope coefficient. Defaults to `0.3`.
      */
    var alpha: js.UndefOr[Double] = js.undefined
  }
  object LeakyReLULayerArgs {
    
    inline def apply(): LeakyReLULayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LeakyReLULayerArgs]
    }
    
    extension [Self <: LeakyReLULayerArgs](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    }
  }
  
  trait PReLULayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * Constraint for the learnable alpha.
      */
    var alphaConstraint: js.UndefOr[Constraint] = js.undefined
    
    /**
      * Initializer for the learnable alpha.
      */
    var alphaInitializer: js.UndefOr[Initializer | InitializerIdentifier] = js.undefined
    
    /**
      * Regularizer for the learnable alpha.
      */
    var alphaRegularizer: js.UndefOr[Regularizer] = js.undefined
    
    /**
      * The axes along which to share learnable parameters for the activation
      * function. For example, if the incoming feature maps are from a 2D
      * convolution with output shape `[numExamples, height, width, channels]`,
      * and you wish to share parameters across space (height and width) so that
      * each filter channels has only one set of parameters, set
      * `shared_axes: [1, 2]`.
      */
    var sharedAxes: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object PReLULayerArgs {
    
    inline def apply(): PReLULayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PReLULayerArgs]
    }
    
    extension [Self <: PReLULayerArgs](x: Self) {
      
      inline def setAlphaConstraint(value: Constraint): Self = StObject.set(x, "alphaConstraint", value.asInstanceOf[js.Any])
      
      inline def setAlphaConstraintUndefined: Self = StObject.set(x, "alphaConstraint", js.undefined)
      
      inline def setAlphaInitializer(value: Initializer | InitializerIdentifier): Self = StObject.set(x, "alphaInitializer", value.asInstanceOf[js.Any])
      
      inline def setAlphaInitializerUndefined: Self = StObject.set(x, "alphaInitializer", js.undefined)
      
      inline def setAlphaRegularizer(value: Regularizer): Self = StObject.set(x, "alphaRegularizer", value.asInstanceOf[js.Any])
      
      inline def setAlphaRegularizerUndefined: Self = StObject.set(x, "alphaRegularizer", js.undefined)
      
      inline def setSharedAxes(value: Double | js.Array[Double]): Self = StObject.set(x, "sharedAxes", value.asInstanceOf[js.Any])
      
      inline def setSharedAxesUndefined: Self = StObject.set(x, "sharedAxes", js.undefined)
      
      inline def setSharedAxesVarargs(value: Double*): Self = StObject.set(x, "sharedAxes", js.Array(value*))
    }
  }
  
  trait ReLULayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * Float, the maximum output value.
      */
    var maxValue: js.UndefOr[Double] = js.undefined
  }
  object ReLULayerArgs {
    
    inline def apply(): ReLULayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReLULayerArgs]
    }
    
    extension [Self <: ReLULayerArgs](x: Self) {
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    }
  }
  
  trait SoftmaxLayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * Integer, axis along which the softmax normalization is applied.
      * Defaults to `-1` (i.e., the last axis).
      */
    var axis: js.UndefOr[Double] = js.undefined
  }
  object SoftmaxLayerArgs {
    
    inline def apply(): SoftmaxLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SoftmaxLayerArgs]
    }
    
    extension [Self <: SoftmaxLayerArgs](x: Self) {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    }
  }
  
  trait ThresholdedReLULayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * Float >= 0. Threshold location of activation.
      */
    var theta: js.UndefOr[Double] = js.undefined
  }
  object ThresholdedReLULayerArgs {
    
    inline def apply(): ThresholdedReLULayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThresholdedReLULayerArgs]
    }
    
    extension [Self <: ThresholdedReLULayerArgs](x: Self) {
      
      inline def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      inline def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
    }
  }
}
