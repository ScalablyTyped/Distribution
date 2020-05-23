package typings.tensorflowTfjsLayers.coreMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import typings.tensorflowTfjsLayers.topologyMod.LayerArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DenseLayerArgs extends LayerArgs {
  /**
    * Activation function to use.
    *
    * If unspecified, no activation is applied.
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
    * If specified, defines inputShape as `[inputDim]`.
    */
  var inputDim: js.UndefOr[Double] = js.undefined
  /**
    * Constraint for the kernel weights.
    */
  var kernelConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  /**
    * Initializer for the dense kernel weights matrix.
    */
  var kernelInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  /**
    * Regularizer function applied to the dense kernel weights matrix.
    */
  var kernelRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  /** Positive integer, dimensionality of the output space. */
  var units: Double
  /** Whether to apply a bias. */
  var useBias: js.UndefOr[Boolean] = js.undefined
}

object DenseLayerArgs {
  @scala.inline
  def apply(
    units: Double,
    activation: ActivationIdentifier = null,
    activityRegularizer: RegularizerIdentifier | Regularizer = null,
    batchInputShape: Shape = null,
    batchSize: js.UndefOr[Double] = js.undefined,
    biasConstraint: ConstraintIdentifier | Constraint = null,
    biasInitializer: InitializerIdentifier | Initializer = null,
    biasRegularizer: RegularizerIdentifier | Regularizer = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputDim: js.UndefOr[Double] = js.undefined,
    inputShape: Shape = null,
    kernelConstraint: ConstraintIdentifier | Constraint = null,
    kernelInitializer: InitializerIdentifier | Initializer = null,
    kernelRegularizer: RegularizerIdentifier | Regularizer = null,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    useBias: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor[Rank]] = null
  ): DenseLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (activityRegularizer != null) __obj.updateDynamic("activityRegularizer")(activityRegularizer.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (biasConstraint != null) __obj.updateDynamic("biasConstraint")(biasConstraint.asInstanceOf[js.Any])
    if (biasInitializer != null) __obj.updateDynamic("biasInitializer")(biasInitializer.asInstanceOf[js.Any])
    if (biasRegularizer != null) __obj.updateDynamic("biasRegularizer")(biasRegularizer.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (!js.isUndefined(inputDim)) __obj.updateDynamic("inputDim")(inputDim.get.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (kernelConstraint != null) __obj.updateDynamic("kernelConstraint")(kernelConstraint.asInstanceOf[js.Any])
    if (kernelInitializer != null) __obj.updateDynamic("kernelInitializer")(kernelInitializer.asInstanceOf[js.Any])
    if (kernelRegularizer != null) __obj.updateDynamic("kernelRegularizer")(kernelRegularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useBias)) __obj.updateDynamic("useBias")(useBias.get.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[DenseLayerArgs]
  }
}

