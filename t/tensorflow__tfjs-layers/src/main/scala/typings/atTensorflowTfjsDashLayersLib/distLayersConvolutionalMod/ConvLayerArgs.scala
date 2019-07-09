package typings
package atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvLayerArgs extends BaseConvLayerArgs {
  /**
    * The dimensionality of the output space (i.e. the number of filters in the
    * convolution).
    */
  var filters: scala.Double
}

object ConvLayerArgs {
  @scala.inline
  def apply(
    filters: scala.Double,
    kernelSize: scala.Double | js.Array[scala.Double],
    activation: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatActivationUnderscoreConfigMod.ActivationIdentifier = null,
    activityRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    biasConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    biasInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    biasRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    dataFormat: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.DataFormat = null,
    dilationRate: scala.Double | js.Array[scala.Double] | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]) = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    kernelConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    kernelInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    kernelRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    name: java.lang.String = null,
    padding: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode = null,
    strides: scala.Double | js.Array[scala.Double] = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    useBias: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): ConvLayerArgs = {
    val __obj = js.Dynamic.literal(filters = filters, kernelSize = kernelSize.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation)
    if (activityRegularizer != null) __obj.updateDynamic("activityRegularizer")(activityRegularizer.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (biasConstraint != null) __obj.updateDynamic("biasConstraint")(biasConstraint.asInstanceOf[js.Any])
    if (biasInitializer != null) __obj.updateDynamic("biasInitializer")(biasInitializer.asInstanceOf[js.Any])
    if (biasRegularizer != null) __obj.updateDynamic("biasRegularizer")(biasRegularizer.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat)
    if (dilationRate != null) __obj.updateDynamic("dilationRate")(dilationRate.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (kernelConstraint != null) __obj.updateDynamic("kernelConstraint")(kernelConstraint.asInstanceOf[js.Any])
    if (kernelInitializer != null) __obj.updateDynamic("kernelInitializer")(kernelInitializer.asInstanceOf[js.Any])
    if (kernelRegularizer != null) __obj.updateDynamic("kernelRegularizer")(kernelRegularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (strides != null) __obj.updateDynamic("strides")(strides.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (!js.isUndefined(useBias)) __obj.updateDynamic("useBias")(useBias)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[ConvLayerArgs]
  }
}

