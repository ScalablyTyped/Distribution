package typings.tensorflowTfjsLayers.normalizationMod

import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class BatchNormalizationLayerArgsOps[Self <: BatchNormalizationLayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAxis(value: Double): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setBetaConstraint(value: ConstraintIdentifier | Constraint): Self = this.set("betaConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBetaConstraint: Self = this.set("betaConstraint", js.undefined)
    @scala.inline
    def setBetaInitializer(value: InitializerIdentifier | Initializer): Self = this.set("betaInitializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBetaInitializer: Self = this.set("betaInitializer", js.undefined)
    @scala.inline
    def setBetaRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("betaRegularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBetaRegularizer: Self = this.set("betaRegularizer", js.undefined)
    @scala.inline
    def setCenter(value: Boolean): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setEpsilon(value: Double): Self = this.set("epsilon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpsilon: Self = this.set("epsilon", js.undefined)
    @scala.inline
    def setGammaConstraint(value: ConstraintIdentifier | Constraint): Self = this.set("gammaConstraint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGammaConstraint: Self = this.set("gammaConstraint", js.undefined)
    @scala.inline
    def setGammaInitializer(value: InitializerIdentifier | Initializer): Self = this.set("gammaInitializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGammaInitializer: Self = this.set("gammaInitializer", js.undefined)
    @scala.inline
    def setGammaRegularizer(value: RegularizerIdentifier | Regularizer): Self = this.set("gammaRegularizer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGammaRegularizer: Self = this.set("gammaRegularizer", js.undefined)
    @scala.inline
    def setMomentum(value: Double): Self = this.set("momentum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMomentum: Self = this.set("momentum", js.undefined)
    @scala.inline
    def setMovingMeanInitializer(value: InitializerIdentifier | Initializer): Self = this.set("movingMeanInitializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingMeanInitializer: Self = this.set("movingMeanInitializer", js.undefined)
    @scala.inline
    def setMovingVarianceInitializer(value: InitializerIdentifier | Initializer): Self = this.set("movingVarianceInitializer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMovingVarianceInitializer: Self = this.set("movingVarianceInitializer", js.undefined)
    @scala.inline
    def setScale(value: Boolean): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
  }
  
}

