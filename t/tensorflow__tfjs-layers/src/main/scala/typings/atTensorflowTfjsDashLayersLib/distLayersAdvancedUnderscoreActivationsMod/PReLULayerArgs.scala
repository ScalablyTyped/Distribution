package typings
package atTensorflowTfjsDashLayersLib.distLayersAdvancedUnderscoreActivationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PReLULayerArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /**
    * Constraint for the learnable alpha.
    */
  var alphaConstraint: js.UndefOr[atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint] = js.undefined
  /**
    * Initializer for the learnable alpha.
    */
  var alphaInitializer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer | atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier
  ] = js.undefined
  /**
    * Regularizer for the learnable alpha.
    */
  var alphaRegularizer: js.UndefOr[atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer] = js.undefined
  /**
    * The axes along which to share learnable parameters for the activation
    * function. For example, if the incoming feature maps are from a 2D
    * convolution with output shape `[numExamples, height, width, channels]`,
    * and you wish to share parameters across space (height and width) so that
    * each filter channels has only one set of parameters, set
    * `shared_axes: [1, 2]`.
    */
  var sharedAxes: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

object PReLULayerArgs {
  @scala.inline
  def apply(
    alphaConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    alphaInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer | atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier = null,
    alphaRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    name: java.lang.String = null,
    sharedAxes: scala.Double | js.Array[scala.Double] = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
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

