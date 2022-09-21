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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object normalizationMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "BatchNormalization")
  @js.native
  open class BatchNormalization_ () extends Layer {
    def this(args: BatchNormalizationLayerArgs) = this()
    
    /* private */ val axis: Any = js.native
    
    /* private */ var beta: Any = js.native
    
    /* private */ val betaConstraint: Any = js.native
    
    /* private */ val betaInitializer: Any = js.native
    
    /* private */ val betaRegularizer: Any = js.native
    
    /* private */ val center: Any = js.native
    
    /* private */ val epsilon: Any = js.native
    
    /* private */ var gamma: Any = js.native
    
    /* private */ val gammaConstraint: Any = js.native
    
    /* private */ val gammaInitializer: Any = js.native
    
    /* private */ val gammaRegularizer: Any = js.native
    
    /* private */ val momentum: Any = js.native
    
    /* private */ var movingMean: Any = js.native
    
    /* private */ val movingMeanInitializer: Any = js.native
    
    /* private */ var movingVariance: Any = js.native
    
    /* private */ val movingVarianceInitializer: Any = js.native
    
    /* private */ val scale: Any = js.native
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/layers/normalization", "LayerNormalization")
  @js.native
  open class LayerNormalization () extends Layer {
    def this(args: LayerNormalizationLayerArgs) = this()
    
    /* private */ var axis: Any = js.native
    
    /* private */ var beta: Any = js.native
    
    val betaInitializer: Initializer = js.native
    
    val betaRegularizer: Regularizer = js.native
    
    val center: Boolean = js.native
    
    val epsilon: Double = js.native
    
    /* private */ var gamma: Any = js.native
    
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
    inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
  }
  
  inline def batchNormalization(x: Tensor[Rank], mean: Tensor[Rank], variance: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def batchNormalization(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Unit,
    gamma: Unit,
    epsilon: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def batchNormalization(x: Tensor[Rank], mean: Tensor[Rank], variance: Tensor[Rank], beta: Unit, gamma: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def batchNormalization(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Unit,
    gamma: Tensor[Rank],
    epsilon: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def batchNormalization(x: Tensor[Rank], mean: Tensor[Rank], variance: Tensor[Rank], beta: Tensor[Rank]): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any], beta.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def batchNormalization(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Tensor[Rank],
    gamma: Unit,
    epsilon: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def batchNormalization(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Tensor[Rank],
    gamma: Tensor[Rank]
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  inline def batchNormalization(
    x: Tensor[Rank],
    mean: Tensor[Rank],
    variance: Tensor[Rank],
    beta: Tensor[Rank],
    gamma: Tensor[Rank],
    epsilon: Double
  ): Tensor[Rank] = (^.asInstanceOf[js.Dynamic].applyDynamic("batchNormalization")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], variance.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Tensor[Rank]]
  
  inline def normalizeBatchInTraining(x: Tensor[Rank], gamma: Tensor[Rank], beta: Tensor[Rank], reductionAxes: js.Array[Double]): js.Tuple3[Tensor[Rank], Tensor[Rank], Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBatchInTraining")(x.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], reductionAxes.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], Tensor[Rank]]]
  inline def normalizeBatchInTraining(
    x: Tensor[Rank],
    gamma: Tensor[Rank],
    beta: Tensor[Rank],
    reductionAxes: js.Array[Double],
    epsilon: Double
  ): js.Tuple3[Tensor[Rank], Tensor[Rank], Tensor[Rank]] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBatchInTraining")(x.asInstanceOf[js.Any], gamma.asInstanceOf[js.Any], beta.asInstanceOf[js.Any], reductionAxes.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Tensor[Rank], Tensor[Rank], Tensor[Rank]]]
  
  trait BatchNormalizationLayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * The integer axis that should be normalized (typically the features axis).
      * Defaults to -1.
      *
      * For instance, after a `Conv2D` layer with `data_format="channels_first"`,
      * set `axis=1` in `batchNormalization`.
      */
    var axis: js.UndefOr[Double] = js.undefined
    
    /**
      * Constraint for the beta weight.
      */
    var betaConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    /**
      * Initializer for the beta weight.
      *  Defaults to 'zeros'.
      */
    var betaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    /**
      * Regularizer for the beta weight.
      */
    var betaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * If `true`, add offset of `beta` to normalized tensor.
      * If `false`, `beta` is ignored.
      * Defaults to `true`.
      */
    var center: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Small float added to the variance to avoid dividing by zero. Defaults to
      * 1e-3.
      */
    var epsilon: js.UndefOr[Double] = js.undefined
    
    /**
      * Constraint for gamma weight.
      */
    var gammaConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
    
    /**
      * Initializer for the gamma weight.
      *  Defaults to `ones`.
      */
    var gammaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    /**
      * Regularizer for the gamma weight.
      */
    var gammaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * Momentum of the moving average. Defaults to 0.99.
      */
    var momentum: js.UndefOr[Double] = js.undefined
    
    /**
      * Initializer for the moving mean.
      * Defaults to `zeros`
      */
    var movingMeanInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    /**
      * Initializer for the moving variance.
      *  Defaults to 'Ones'.
      */
    var movingVarianceInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    /**
      * If `true`, multiply by `gamma`.
      * If `false`, `gamma` is not used.
      * When the next layer is linear (also e.g. `nn.relu`),
      * this can be disabled since the scaling will be done by the next layer.
      * Defaults to `true`.
      */
    var scale: js.UndefOr[Boolean] = js.undefined
  }
  object BatchNormalizationLayerArgs {
    
    inline def apply(): BatchNormalizationLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchNormalizationLayerArgs]
    }
    
    extension [Self <: BatchNormalizationLayerArgs](x: Self) {
      
      inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setBetaConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "betaConstraint", value.asInstanceOf[js.Any])
      
      inline def setBetaConstraintUndefined: Self = StObject.set(x, "betaConstraint", js.undefined)
      
      inline def setBetaInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "betaInitializer", value.asInstanceOf[js.Any])
      
      inline def setBetaInitializerUndefined: Self = StObject.set(x, "betaInitializer", js.undefined)
      
      inline def setBetaRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "betaRegularizer", value.asInstanceOf[js.Any])
      
      inline def setBetaRegularizerUndefined: Self = StObject.set(x, "betaRegularizer", js.undefined)
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      inline def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
      
      inline def setGammaConstraint(value: ConstraintIdentifier | Constraint): Self = StObject.set(x, "gammaConstraint", value.asInstanceOf[js.Any])
      
      inline def setGammaConstraintUndefined: Self = StObject.set(x, "gammaConstraint", js.undefined)
      
      inline def setGammaInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "gammaInitializer", value.asInstanceOf[js.Any])
      
      inline def setGammaInitializerUndefined: Self = StObject.set(x, "gammaInitializer", js.undefined)
      
      inline def setGammaRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "gammaRegularizer", value.asInstanceOf[js.Any])
      
      inline def setGammaRegularizerUndefined: Self = StObject.set(x, "gammaRegularizer", js.undefined)
      
      inline def setMomentum(value: Double): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
      
      inline def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
      
      inline def setMovingMeanInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "movingMeanInitializer", value.asInstanceOf[js.Any])
      
      inline def setMovingMeanInitializerUndefined: Self = StObject.set(x, "movingMeanInitializer", js.undefined)
      
      inline def setMovingVarianceInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "movingVarianceInitializer", value.asInstanceOf[js.Any])
      
      inline def setMovingVarianceInitializerUndefined: Self = StObject.set(x, "movingVarianceInitializer", js.undefined)
      
      inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  trait LayerNormalizationLayerArgs
    extends StObject
       with LayerArgs {
    
    /**
      * The axis or axes that should be normalized (typically, the feature axis.)
      * Defaults to -1 (the last axis.)
      */
    var axis: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    /**
      * Initializer for the beta weight.
      * Default: `'zeros'`.
      */
    var betaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    /** Regularizer for the beta weight. */
    var betaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * If `true`, add offset of `beta` to normalized tensor.
      * If `false`, `beta` is ignored.
      * Default: `true`.
      */
    var center: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A small positive float added to variance to avoid divison by zero.
      * Defaults to 1e-3.
      */
    var epsilon: js.UndefOr[Double] = js.undefined
    
    /**
      * Initializer for the gamma weight.
      * Default: `'ones'`.
      */
    var gammaInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
    
    /** Regularizer for the gamma weight. */
    var gammaRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
    
    /**
      * If `true`, multiply output by `gamma`.
      * If `false`, `gamma` is not used.
      * When the next layer is linear, this can be disabled since scaling will
      * be done by the next layer.
      * Default: `true`.
      */
    var scale: js.UndefOr[Boolean] = js.undefined
  }
  object LayerNormalizationLayerArgs {
    
    inline def apply(): LayerNormalizationLayerArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerNormalizationLayerArgs]
    }
    
    extension [Self <: LayerNormalizationLayerArgs](x: Self) {
      
      inline def setAxis(value: Double | js.Array[Double]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setAxisVarargs(value: Double*): Self = StObject.set(x, "axis", js.Array(value*))
      
      inline def setBetaInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "betaInitializer", value.asInstanceOf[js.Any])
      
      inline def setBetaInitializerUndefined: Self = StObject.set(x, "betaInitializer", js.undefined)
      
      inline def setBetaRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "betaRegularizer", value.asInstanceOf[js.Any])
      
      inline def setBetaRegularizerUndefined: Self = StObject.set(x, "betaRegularizer", js.undefined)
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setEpsilon(value: Double): Self = StObject.set(x, "epsilon", value.asInstanceOf[js.Any])
      
      inline def setEpsilonUndefined: Self = StObject.set(x, "epsilon", js.undefined)
      
      inline def setGammaInitializer(value: InitializerIdentifier | Initializer): Self = StObject.set(x, "gammaInitializer", value.asInstanceOf[js.Any])
      
      inline def setGammaInitializerUndefined: Self = StObject.set(x, "gammaInitializer", js.undefined)
      
      inline def setGammaRegularizer(value: RegularizerIdentifier | Regularizer): Self = StObject.set(x, "gammaRegularizer", value.asInstanceOf[js.Any])
      
      inline def setGammaRegularizerUndefined: Self = StObject.set(x, "gammaRegularizer", js.undefined)
      
      inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
}
