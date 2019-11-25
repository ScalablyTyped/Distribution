package typings.atTensorflowTfjsDashLayers.distLayersNormalizationMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distConstraintsMod.Constraint
import typings.atTensorflowTfjsDashLayers.distConstraintsMod.ConstraintIdentifier
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typings.atTensorflowTfjsDashLayers.distInitializersMod.Initializer
import typings.atTensorflowTfjsDashLayers.distInitializersMod.InitializerIdentifier
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import typings.atTensorflowTfjsDashLayers.distRegularizersMod.Regularizer
import typings.atTensorflowTfjsDashLayers.distRegularizersMod.RegularizerIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchNormalizationLayerArgs extends LayerArgs {
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
  @scala.inline
  def apply(
    axis: Int | Double = null,
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    betaConstraint: ConstraintIdentifier | Constraint = null,
    betaInitializer: InitializerIdentifier | Initializer = null,
    betaRegularizer: RegularizerIdentifier | Regularizer = null,
    center: js.UndefOr[Boolean] = js.undefined,
    dtype: DataType = null,
    epsilon: Int | Double = null,
    gammaConstraint: ConstraintIdentifier | Constraint = null,
    gammaInitializer: InitializerIdentifier | Initializer = null,
    gammaRegularizer: RegularizerIdentifier | Regularizer = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    momentum: Int | Double = null,
    movingMeanInitializer: InitializerIdentifier | Initializer = null,
    movingVarianceInitializer: InitializerIdentifier | Initializer = null,
    name: String = null,
    scale: js.UndefOr[Boolean] = js.undefined,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor[Rank]] = null
  ): BatchNormalizationLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (betaConstraint != null) __obj.updateDynamic("betaConstraint")(betaConstraint.asInstanceOf[js.Any])
    if (betaInitializer != null) __obj.updateDynamic("betaInitializer")(betaInitializer.asInstanceOf[js.Any])
    if (betaRegularizer != null) __obj.updateDynamic("betaRegularizer")(betaRegularizer.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (epsilon != null) __obj.updateDynamic("epsilon")(epsilon.asInstanceOf[js.Any])
    if (gammaConstraint != null) __obj.updateDynamic("gammaConstraint")(gammaConstraint.asInstanceOf[js.Any])
    if (gammaInitializer != null) __obj.updateDynamic("gammaInitializer")(gammaInitializer.asInstanceOf[js.Any])
    if (gammaRegularizer != null) __obj.updateDynamic("gammaRegularizer")(gammaRegularizer.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (momentum != null) __obj.updateDynamic("momentum")(momentum.asInstanceOf[js.Any])
    if (movingMeanInitializer != null) __obj.updateDynamic("movingMeanInitializer")(movingMeanInitializer.asInstanceOf[js.Any])
    if (movingVarianceInitializer != null) __obj.updateDynamic("movingVarianceInitializer")(movingVarianceInitializer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchNormalizationLayerArgs]
  }
}

