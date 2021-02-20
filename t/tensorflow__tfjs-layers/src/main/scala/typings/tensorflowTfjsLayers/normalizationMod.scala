package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.Layer
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "BatchNormalization")
  @js.native
  class BatchNormalization_ () extends Layer {
    def this(args: BatchNormalizationLayerArgs) = this()
    
    val axis: js.Any = js.native
    
    var beta: js.Any = js.native
    
    val betaConstraint: js.Any = js.native
    
    val betaInitializer: js.Any = js.native
    
    val betaRegularizer: js.Any = js.native
    
    val center: js.Any = js.native
    
    val epsilon: js.Any = js.native
    
    var gamma: js.Any = js.native
    
    val gammaConstraint: js.Any = js.native
    
    val gammaInitializer: js.Any = js.native
    
    val gammaRegularizer: js.Any = js.native
    
    val momentum: js.Any = js.native
    
    var movingMean: js.Any = js.native
    
    val movingMeanInitializer: js.Any = js.native
    
    var movingVariance: js.Any = js.native
    
    val movingVarianceInitializer: js.Any = js.native
    
    val scale: js.Any = js.native
  }
  /* static members */
  object BatchNormalization_ {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "BatchNormalization")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "BatchNormalization.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "LayerNormalization")
  @js.native
  class LayerNormalization () extends Layer {
    def this(args: LayerNormalizationLayerArgs) = this()
    
    var axis: js.Any = js.native
    
    var beta: js.Any = js.native
    
    val betaInitializer: Initializer = js.native
    
    val betaRegularizer: Regularizer = js.native
    
    val center: Boolean = js.native
    
    val epsilon: Double = js.native
    
    var gamma: js.Any = js.native
    
    val gammaInitializer: Initializer = js.native
    
    val gammaRegularizer: Regularizer = js.native
    
    val scale: Boolean = js.native
  }
  /* static members */
  object LayerNormalization {
    
    @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "LayerNormalization")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "LayerNormalization.className")
    @js.native
    def className: String = js.native
    @scala.inline
    def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "batchNormalization")
  @js.native
  def batchNormalization(x: Tensor[Rank], mean: Tensor[Rank], variance: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "batchNormalization")
  @js.native
  def batchNormalization(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: js.UndefOr[scala.Nothing],
    gamma: js.UndefOr[scala.Nothing],
    epsilon: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "batchNormalization")
  @js.native
  def batchNormalization(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: js.UndefOr[scala.Nothing],
    gamma: Tensor[Rank]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "batchNormalization")
  @js.native
  def batchNormalization(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: js.UndefOr[scala.Nothing],
    gamma: Tensor[Rank],
    epsilon: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "batchNormalization")
  @js.native
  def batchNormalization(x: Tensor[Rank], mean: Tensor[Rank], variance: Tensor[Rank], beta: Tensor[Rank]): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "batchNormalization")
  @js.native
  def batchNormalization(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Tensor[Rank],
    gamma: js.UndefOr[scala.Nothing],
    epsilon: Double
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "batchNormalization")
  @js.native
  def batchNormalization(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Tensor[Rank],
    gamma: Tensor[Rank]
  ): Tensor[Rank] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "batchNormalization")
  @js.native
  def batchNormalization(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Tensor[Rank],
    gamma: Tensor[Rank],
    epsilon: Double
  ): Tensor[Rank] = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "normalizeBatchInTraining")
  @js.native
  def normalizeBatchInTraining(x: Tensor[Rank], gamma: Tensor[Rank], beta: Tensor[Rank], reductionAxes: js.Array[Double]): js.Tuple3[Tensor[Rank], Tensor[Rank], Tensor[Rank]] = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "normalizeBatchInTraining")
  @js.native
  def normalizeBatchInTraining(
    x: Tensor[Rank],
    gamma: Tensor[Rank],
    beta: Tensor[Rank],
    reductionAxes: js.Array[Double],
    epsilon: Double
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], Tensor[Rank]] = js.native
  
  @js.native
  trait BatchNormalizationLayerArgs extends LayerArgs {
    
    /**
      * The integer axis that should be normalized (typically the features axis).
      * Defaults to -1.
      *
      * For instance, after a `Conv2D` layer with `data_format="channels_first"`,
      * set `axis=1` in `batchNormalization`.
      */
    var axis: js.UndefOr[Double] = js.native
    
    /**
      * Constraint for the beta weight.
      */
    var betaConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    /**
      * Initializer for the beta weight.
      *  Defaults to 'zeros'.
      */
    var betaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    /**
      * Regularizer for the beta weight.
      */
    var betaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * If `true`, add offset of `beta` to normalized tensor.
      * If `false`, `beta` is ignored.
      * Defaults to `true`.
      */
    var center: js.UndefOr[Boolean] = js.native
    
    /**
      * Small float added to the variance to avoid dividing by zero. Defaults to
      * 1e-3.
      */
    var epsilon: js.UndefOr[Double] = js.native
    
    /**
      * Constraint for gamma weight.
      */
    var gammaConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.native
    
    /**
      * Initializer for the gamma weight.
      *  Defaults to `ones`.
      */
    var gammaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    /**
      * Regularizer for the gamma weight.
      */
    var gammaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * Momentum of the moving average. Defaults to 0.99.
      */
    var momentum: js.UndefOr[Double] = js.native
    
    /**
      * Initializer for the moving mean.
      * Defaults to `zeros`
      */
    var movingMeanInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    /**
      * Initializer for the moving variance.
      *  Defaults to 'Ones'.
      */
    var movingVarianceInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    /**
      * If `true`, multiply by `gamma`.
      * If `false`, `gamma` is not used.
      * When the next layer is linear (also e.g. `nn.relu`),
      * this can be disabled since the scaling will be done by the next layer.
      * Defaults to `true`.
      */
    var scale: js.UndefOr[Boolean] = js.native
  }
  object BatchNormalizationLayerArgs {
    
    @scala.inline
    def apply(): BatchNormalizationLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchNormalizationLayerArgs]
    }
    
    @scala.inline
    implicit class BatchNormalizationLayerArgsMutableBuilder[Self <: BatchNormalizationLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setBetaConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "betaConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBetaConstraintUndefined: Self = StObject.set(x, "betaConstraint", js.undefined)
      
      @scala.inline
      def setBetaInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "betaInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBetaInitializerUndefined: Self = StObject.set(x, "betaInitializer", js.undefined)
      
      @scala.inline
      def setBetaRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "betaRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBetaRegularizerUndefined: Self = StObject.set(x, "betaRegularizer", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
      
      @scala.inline
      def setGammaConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "gammaConstraint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGammaConstraintUndefined: Self = StObject.set(x, "gammaConstraint", js.undefined)
      
      @scala.inline
      def setGammaInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "gammaInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGammaInitializerUndefined: Self = StObject.set(x, "gammaInitializer", js.undefined)
      
      @scala.inline
      def setGammaRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "gammaRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGammaRegularizerUndefined: Self = StObject.set(x, "gammaRegularizer", js.undefined)
      
      @scala.inline
      def setMomentum(value: Double): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
      
      @scala.inline
      def setMovingMeanInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "movingMeanInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovingMeanInitializerUndefined: Self = StObject.set(x, "movingMeanInitializer", js.undefined)
      
      @scala.inline
      def setMovingVarianceInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "movingVarianceInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMovingVarianceInitializerUndefined: Self = StObject.set(x, "movingVarianceInitializer", js.undefined)
      
      @scala.inline
      def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  @js.native
  trait LayerNormalizationLayerArgs extends LayerArgs {
    
    /**
      * The axis or axes that should be normalized (typically, the feature axis.)
      * Defaults to -1 (the last axis.)
      */
    var axis: js.UndefOr[Double | js.Array[Double]] = js.native
    
    /**
      * Initializer for the beta weight.
      * Default: `'zeros'`.
      */
    var betaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    /** Regularizer for the beta weight. */
    var betaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * If `true`, add offset of `beta` to normalized tensor.
      * If `false`, `beta` is ignored.
      * Default: `true`.
      */
    var center: js.UndefOr[Boolean] = js.native
    
    /**
      * A small positive float added to variance to avoid divison by zero.
      * Defaults to 1e-3.
      */
    var epsilon: js.UndefOr[Double] = js.native
    
    /**
      * Initializer for the gamma weight.
      * Default: `'ones'`.
      */
    var gammaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.native
    
    /** Regularizer for the gamma weight. */
    var gammaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.native
    
    /**
      * If `true`, multiply output by `gamma`.
      * If `false`, `gamma` is not used.
      * When the next layer is linear, this can be disabled since scaling will
      * be done by the next layer.
      * Default: `true`.
      */
    var scale: js.UndefOr[Boolean] = js.native
  }
  object LayerNormalizationLayerArgs {
    
    @scala.inline
    def apply(): LayerNormalizationLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerNormalizationLayerArgs]
    }
    
    @scala.inline
    implicit class LayerNormalizationLayerArgsMutableBuilder[Self <: LayerNormalizationLayerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: Double | js.Array[Double]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setAxisVarargs(value: Double*): Self = StObject.set(x, "axis", js.Array(value :_*))
      
      @scala.inline
      def setBetaInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "betaInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBetaInitializerUndefined: Self = StObject.set(x, "betaInitializer", js.undefined)
      
      @scala.inline
      def setBetaRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "betaRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBetaRegularizerUndefined: Self = StObject.set(x, "betaRegularizer", js.undefined)
      
      @scala.inline
      def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
      
      @scala.inline
      def setGammaInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "gammaInitializer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGammaInitializerUndefined: Self = StObject.set(x, "gammaInitializer", js.undefined)
      
      @scala.inline
      def setGammaRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "gammaRegularizer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGammaRegularizerUndefined: Self = StObject.set(x, "gammaRegularizer", js.undefined)
      
      @scala.inline
      def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
}
