package typings
package atTensorflowTfjsDashLayersLib.distLayersRecurrentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GRULayerArgs extends SimpleRNNLayerArgs {
  /**
    * Implementation mode, either 1 or 2.
    *
    * Mode 1 will structure its operations as a larger number of
    * smaller dot products and additions.
    *
    * Mode 2 will batch them into fewer, larger operations. These modes will
    * have different performance profiles on different hardware and
    * for different applications.
    *
    * Note: For superior performance, TensorFlow.js always uses implementation
    * 2, regardless of the actual value of this configuration field.
    */
  var implementation: js.UndefOr[scala.Double] = js.undefined
  /**
    * Activation function to use for the recurrent step.
    *
    * Defaults to hard sigmoid (`hardSigmoid`).
    *
    * If `null`, no activation is applied.
    */
  var recurrentActivation: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatActivationUnderscoreConfigMod.ActivationIdentifier
  ] = js.undefined
}

object GRULayerArgs {
  @scala.inline
  def apply(
    units: scala.Double,
    activation: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatActivationUnderscoreConfigMod.ActivationIdentifier = null,
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    biasConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    biasInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    biasRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    cell: RNNCell | js.Array[RNNCell] = null,
    dropout: scala.Int | scala.Double = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    goBackwards: js.UndefOr[scala.Boolean] = js.undefined,
    implementation: scala.Int | scala.Double = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDim: scala.Int | scala.Double = null,
    inputLength: scala.Int | scala.Double = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    kernelConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    kernelInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    kernelRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    name: java.lang.String = null,
    recurrentActivation: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatActivationUnderscoreConfigMod.ActivationIdentifier = null,
    recurrentConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    recurrentDropout: scala.Int | scala.Double = null,
    recurrentInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    recurrentRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    returnSequences: js.UndefOr[scala.Boolean] = js.undefined,
    returnState: js.UndefOr[scala.Boolean] = js.undefined,
    stateful: js.UndefOr[scala.Boolean] = js.undefined,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    unroll: js.UndefOr[scala.Boolean] = js.undefined,
    useBias: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): GRULayerArgs = {
    val __obj = js.Dynamic.literal(units = units)
    if (activation != null) __obj.updateDynamic("activation")(activation)
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (biasConstraint != null) __obj.updateDynamic("biasConstraint")(biasConstraint.asInstanceOf[js.Any])
    if (biasInitializer != null) __obj.updateDynamic("biasInitializer")(biasInitializer.asInstanceOf[js.Any])
    if (biasRegularizer != null) __obj.updateDynamic("biasRegularizer")(biasRegularizer.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (dropout != null) __obj.updateDynamic("dropout")(dropout.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (!js.isUndefined(goBackwards)) __obj.updateDynamic("goBackwards")(goBackwards)
    if (implementation != null) __obj.updateDynamic("implementation")(implementation.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputDim != null) __obj.updateDynamic("inputDim")(inputDim.asInstanceOf[js.Any])
    if (inputLength != null) __obj.updateDynamic("inputLength")(inputLength.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (kernelConstraint != null) __obj.updateDynamic("kernelConstraint")(kernelConstraint.asInstanceOf[js.Any])
    if (kernelInitializer != null) __obj.updateDynamic("kernelInitializer")(kernelInitializer.asInstanceOf[js.Any])
    if (kernelRegularizer != null) __obj.updateDynamic("kernelRegularizer")(kernelRegularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (recurrentActivation != null) __obj.updateDynamic("recurrentActivation")(recurrentActivation)
    if (recurrentConstraint != null) __obj.updateDynamic("recurrentConstraint")(recurrentConstraint.asInstanceOf[js.Any])
    if (recurrentDropout != null) __obj.updateDynamic("recurrentDropout")(recurrentDropout.asInstanceOf[js.Any])
    if (recurrentInitializer != null) __obj.updateDynamic("recurrentInitializer")(recurrentInitializer.asInstanceOf[js.Any])
    if (recurrentRegularizer != null) __obj.updateDynamic("recurrentRegularizer")(recurrentRegularizer.asInstanceOf[js.Any])
    if (!js.isUndefined(returnSequences)) __obj.updateDynamic("returnSequences")(returnSequences)
    if (!js.isUndefined(returnState)) __obj.updateDynamic("returnState")(returnState)
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (!js.isUndefined(unroll)) __obj.updateDynamic("unroll")(unroll)
    if (!js.isUndefined(useBias)) __obj.updateDynamic("useBias")(useBias)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[GRULayerArgs]
  }
}

