package typings
package atTensorflowTfjsDashLayersLib.distLayersRecurrentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleRNNCellLayerArgs
  extends atTensorflowTfjsDashLayersLib.distEngineTopologyMod.LayerArgs {
  /**
    * Activation function to use.
    * Default: hyperbolic tangent ('tanh').
    * If you pass `null`,  'linear' activation will be applied.
    */
  var activation: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatActivationUnderscoreConfigMod.ActivationIdentifier
  ] = js.undefined
  /**
    * Constraintfunction applied to the bias vector.
    */
  var biasConstraint: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint
  ] = js.undefined
  /**
    * Initializer for the bias vector.
    */
  var biasInitializer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer
  ] = js.undefined
  /**
    * Regularizer function applied to the bias vector.
    */
  var biasRegularizer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer
  ] = js.undefined
  /**
    * Float number between 0 and 1. Fraction of the units to drop for the linear
    * transformation of the inputs.
    */
  var dropout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Constraint function applied to the `kernel` weights matrix.
    */
  var kernelConstraint: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint
  ] = js.undefined
  /**
    * Initializer for the `kernel` weights matrix, used for the linear
    * transformation of the inputs.
    */
  var kernelInitializer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer
  ] = js.undefined
  /**
    * Regularizer function applied to the `kernel` weights matrix.
    */
  var kernelRegularizer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer
  ] = js.undefined
  /**
    * Constraint function applied to the `recurrentKernel` weights matrix.
    */
  var recurrentConstraint: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint
  ] = js.undefined
  /**
    * Float number between 0 and 1. Fraction of the units to drop for the linear
    * transformation of the recurrent state.
    */
  var recurrentDropout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Initializer for the `recurrentKernel` weights matrix, used for
    * linear transformation of the recurrent state.
    */
  var recurrentInitializer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer
  ] = js.undefined
  /**
    * Regularizer function applied to the `recurrent_kernel` weights matrix.
    */
  var recurrentRegularizer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer
  ] = js.undefined
  /**
    * units: Positive integer, dimensionality of the output space.
    */
  var units: scala.Double
  /**
    * Whether the layer uses a bias vector.
    */
  var useBias: js.UndefOr[scala.Boolean] = js.undefined
}

object SimpleRNNCellLayerArgs {
  @scala.inline
  def apply(
    units: scala.Double,
    activation: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatActivationUnderscoreConfigMod.ActivationIdentifier = null,
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    biasConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    biasInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    biasRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    dropout: scala.Int | scala.Double = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    kernelConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    kernelInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    kernelRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    name: java.lang.String = null,
    recurrentConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    recurrentDropout: scala.Int | scala.Double = null,
    recurrentInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    recurrentRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    useBias: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): SimpleRNNCellLayerArgs = {
    val __obj = js.Dynamic.literal(units = units)
    if (activation != null) __obj.updateDynamic("activation")(activation)
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (biasConstraint != null) __obj.updateDynamic("biasConstraint")(biasConstraint.asInstanceOf[js.Any])
    if (biasInitializer != null) __obj.updateDynamic("biasInitializer")(biasInitializer.asInstanceOf[js.Any])
    if (biasRegularizer != null) __obj.updateDynamic("biasRegularizer")(biasRegularizer.asInstanceOf[js.Any])
    if (dropout != null) __obj.updateDynamic("dropout")(dropout.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (kernelConstraint != null) __obj.updateDynamic("kernelConstraint")(kernelConstraint.asInstanceOf[js.Any])
    if (kernelInitializer != null) __obj.updateDynamic("kernelInitializer")(kernelInitializer.asInstanceOf[js.Any])
    if (kernelRegularizer != null) __obj.updateDynamic("kernelRegularizer")(kernelRegularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (recurrentConstraint != null) __obj.updateDynamic("recurrentConstraint")(recurrentConstraint.asInstanceOf[js.Any])
    if (recurrentDropout != null) __obj.updateDynamic("recurrentDropout")(recurrentDropout.asInstanceOf[js.Any])
    if (recurrentInitializer != null) __obj.updateDynamic("recurrentInitializer")(recurrentInitializer.asInstanceOf[js.Any])
    if (recurrentRegularizer != null) __obj.updateDynamic("recurrentRegularizer")(recurrentRegularizer.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (!js.isUndefined(useBias)) __obj.updateDynamic("useBias")(useBias)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[SimpleRNNCellLayerArgs]
  }
}

