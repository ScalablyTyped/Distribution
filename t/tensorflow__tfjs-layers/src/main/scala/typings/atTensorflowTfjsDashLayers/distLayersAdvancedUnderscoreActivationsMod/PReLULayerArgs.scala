package typings.atTensorflowTfjsDashLayers.distLayersAdvancedUnderscoreActivationsMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distConstraintsMod.Constraint
import typings.atTensorflowTfjsDashLayers.distEngineTopologyMod.LayerArgs
import typings.atTensorflowTfjsDashLayers.distInitializersMod.Initializer
import typings.atTensorflowTfjsDashLayers.distInitializersMod.InitializerIdentifier
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
import typings.atTensorflowTfjsDashLayers.distRegularizersMod.Regularizer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PReLULayerArgs extends LayerArgs {
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
  @scala.inline
  def apply(
    alphaConstraint: Constraint = null,
    alphaInitializer: Initializer | InitializerIdentifier = null,
    alphaRegularizer: Regularizer = null,
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    name: String = null,
    sharedAxes: Double | js.Array[Double] = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor[Rank]] = null
  ): PReLULayerArgs = {
    val __obj = js.Dynamic.literal()
    if (alphaConstraint != null) __obj.updateDynamic("alphaConstraint")(alphaConstraint)
    if (alphaInitializer != null) __obj.updateDynamic("alphaInitializer")(alphaInitializer.asInstanceOf[js.Any])
    if (alphaRegularizer != null) __obj.updateDynamic("alphaRegularizer")(alphaRegularizer)
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sharedAxes != null) __obj.updateDynamic("sharedAxes")(sharedAxes.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[PReLULayerArgs]
  }
}

