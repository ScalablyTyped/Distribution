package typings
package atTensorflowTfjsDashLayersLib.distLayersConvolutionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeparableConvLayerArgs extends ConvLayerArgs {
  /**
    * The number of depthwise convolution output channels for each input
    * channel.
    * The total number of depthwise convolution output channels will be equal
    * to `filtersIn * depthMultiplier`. Default: 1.
    */
  var depthMultiplier: js.UndefOr[scala.Double] = js.undefined
  /**
    * Constraint function applied to the depthwise kernel matrix.
    */
  var depthwiseConstraint: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint
  ] = js.undefined
  /**
    * Initializer for the depthwise kernel matrix.
    */
  var depthwiseInitializer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer
  ] = js.undefined
  /**
    * Regularizer function applied to the depthwise kernel matrix.
    */
  var depthwiseRegularizer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer
  ] = js.undefined
  /**
    * Constraint function applied to the pointwise kernel matrix.
    */
  var pointwiseConstraint: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint
  ] = js.undefined
  /**
    * Initializer for the pointwise kernel matrix.
    */
  var pointwiseInitializer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer
  ] = js.undefined
  /**
    * Regularizer function applied to the pointwise kernel matrix.
    */
  var pointwiseRegularizer: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer
  ] = js.undefined
}

object SeparableConvLayerArgs {
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
    depthMultiplier: scala.Int | scala.Double = null,
    depthwiseConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    depthwiseInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    depthwiseRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    dilationRate: scala.Double | js.Array[scala.Double] | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]) = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    kernelConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    kernelInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    kernelRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    name: java.lang.String = null,
    padding: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.PaddingMode = null,
    pointwiseConstraint: atTensorflowTfjsDashLayersLib.distConstraintsMod.ConstraintIdentifier | atTensorflowTfjsDashLayersLib.distConstraintsMod.Constraint = null,
    pointwiseInitializer: atTensorflowTfjsDashLayersLib.distInitializersMod.InitializerIdentifier | atTensorflowTfjsDashLayersLib.distInitializersMod.Initializer = null,
    pointwiseRegularizer: atTensorflowTfjsDashLayersLib.distRegularizersMod.RegularizerIdentifier | atTensorflowTfjsDashLayersLib.distRegularizersMod.Regularizer = null,
    strides: scala.Double | js.Array[scala.Double] = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    useBias: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): SeparableConvLayerArgs = {
    val __obj = js.Dynamic.literal(filters = filters, kernelSize = kernelSize.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation)
    if (activityRegularizer != null) __obj.updateDynamic("activityRegularizer")(activityRegularizer.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (biasConstraint != null) __obj.updateDynamic("biasConstraint")(biasConstraint.asInstanceOf[js.Any])
    if (biasInitializer != null) __obj.updateDynamic("biasInitializer")(biasInitializer.asInstanceOf[js.Any])
    if (biasRegularizer != null) __obj.updateDynamic("biasRegularizer")(biasRegularizer.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat)
    if (depthMultiplier != null) __obj.updateDynamic("depthMultiplier")(depthMultiplier.asInstanceOf[js.Any])
    if (depthwiseConstraint != null) __obj.updateDynamic("depthwiseConstraint")(depthwiseConstraint.asInstanceOf[js.Any])
    if (depthwiseInitializer != null) __obj.updateDynamic("depthwiseInitializer")(depthwiseInitializer.asInstanceOf[js.Any])
    if (depthwiseRegularizer != null) __obj.updateDynamic("depthwiseRegularizer")(depthwiseRegularizer.asInstanceOf[js.Any])
    if (dilationRate != null) __obj.updateDynamic("dilationRate")(dilationRate.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (kernelConstraint != null) __obj.updateDynamic("kernelConstraint")(kernelConstraint.asInstanceOf[js.Any])
    if (kernelInitializer != null) __obj.updateDynamic("kernelInitializer")(kernelInitializer.asInstanceOf[js.Any])
    if (kernelRegularizer != null) __obj.updateDynamic("kernelRegularizer")(kernelRegularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (pointwiseConstraint != null) __obj.updateDynamic("pointwiseConstraint")(pointwiseConstraint.asInstanceOf[js.Any])
    if (pointwiseInitializer != null) __obj.updateDynamic("pointwiseInitializer")(pointwiseInitializer.asInstanceOf[js.Any])
    if (pointwiseRegularizer != null) __obj.updateDynamic("pointwiseRegularizer")(pointwiseRegularizer.asInstanceOf[js.Any])
    if (strides != null) __obj.updateDynamic("strides")(strides.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (!js.isUndefined(useBias)) __obj.updateDynamic("useBias")(useBias)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[SeparableConvLayerArgs]
  }
}

