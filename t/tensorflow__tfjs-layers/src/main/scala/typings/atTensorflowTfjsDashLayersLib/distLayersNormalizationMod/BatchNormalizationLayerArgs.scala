package typings
package atTensorflowTfjsDashLayersLib.distLayersNormalizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchNormalizationLayerArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /**
    * The integer axis that should be normalized (typically the features axis).
    * Defaults to -1.
    *
    * For instance, after a `Conv2D` layer with `data_format="channels_first"`,
    * set `axis=1` in `batchNormalization`.
    */
  var axis: js.UndefOr[scala.Double] = js.undefined
  /**
    * Constraint for the beta weight.
    */
  var betaConstraint: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint
  ] = js.undefined
  /**
    * Initializer for the beta weight.
    *  Defaults to 'zeros'.
    */
  var betaInitializer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer
  ] = js.undefined
  /**
    * Regularizer for the beta weight.
    */
  var betaRegularizer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer
  ] = js.undefined
  /**
    * If `true`, add offset of `beta` to normalized tensor.
    * If `false`, `beta` is ignored.
    * Defaults to `true`.
    */
  var center: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Small float added to the variance to avoid dividing by zero. Defaults to
    * 1e-3.
    */
  var epsilon: js.UndefOr[scala.Double] = js.undefined
  /**
    * Constraint for gamma weight.
    */
  var gammaConstraint: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint
  ] = js.undefined
  /**
    * Initializer for the gamma weight.
    *  Defaults to `ones`.
    */
  var gammaInitializer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer
  ] = js.undefined
  /**
    * Regularizer for the gamma weight.
    */
  var gammaRegularizer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer
  ] = js.undefined
  /**
    * Momentum of the moving average. Defaults to 0.99.
    */
  var momentum: js.UndefOr[scala.Double] = js.undefined
  /**
    * Initializer for the moving mean.
    * Defaults to `zeros`
    */
  var movingMeanInitializer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer
  ] = js.undefined
  /**
    * Initializer for the moving variance.
    *  Defaults to 'Ones'.
    */
  var movingVarianceInitializer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer
  ] = js.undefined
  /**
    * If `true`, multiply by `gamma`.
    * If `false`, `gamma` is not used.
    * When the next layer is linear (also e.g. `nn.relu`),
    * this can be disabled since the scaling will be done by the next layer.
    * Defaults to `true`.
    */
  var scale: js.UndefOr[scala.Boolean] = js.undefined
}

object BatchNormalizationLayerArgs {
  @scala.inline
  def apply(
    axis: scala.Int | scala.Double = null,
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    betaConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    betaInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    betaRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    epsilon: scala.Int | scala.Double = null,
    gammaConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    gammaInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    gammaRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    momentum: scala.Int | scala.Double = null,
    movingMeanInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    movingVarianceInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    name: java.lang.String = null,
    scale: js.UndefOr[scala.Boolean] = js.undefined,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): BatchNormalizationLayerArgs = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (betaConstraint != null) __obj.updateDynamic("betaConstraint")(betaConstraint.asInstanceOf[js.Any])
    if (betaInitializer != null) __obj.updateDynamic("betaInitializer")(betaInitializer.asInstanceOf[js.Any])
    if (betaRegularizer != null) __obj.updateDynamic("betaRegularizer")(betaRegularizer.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (epsilon != null) __obj.updateDynamic("epsilon")(epsilon.asInstanceOf[js.Any])
    if (gammaConstraint != null) __obj.updateDynamic("gammaConstraint")(gammaConstraint.asInstanceOf[js.Any])
    if (gammaInitializer != null) __obj.updateDynamic("gammaInitializer")(gammaInitializer.asInstanceOf[js.Any])
    if (gammaRegularizer != null) __obj.updateDynamic("gammaRegularizer")(gammaRegularizer.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (momentum != null) __obj.updateDynamic("momentum")(momentum.asInstanceOf[js.Any])
    if (movingMeanInitializer != null) __obj.updateDynamic("movingMeanInitializer")(movingMeanInitializer.asInstanceOf[js.Any])
    if (movingVarianceInitializer != null) __obj.updateDynamic("movingVarianceInitializer")(movingVarianceInitializer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[BatchNormalizationLayerArgs]
  }
}

