package typings.tensorflowTfjsLayers.convolutionalMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.mod.Tensor_
import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.DataFormat
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.PaddingMode
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
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
  var depthMultiplier: js.UndefOr[Double] = js.undefined
  /**
    * Constraint function applied to the depthwise kernel matrix.
    */
  var depthwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  /**
    * Initializer for the depthwise kernel matrix.
    */
  var depthwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  /**
    * Regularizer function applied to the depthwise kernel matrix.
    */
  var depthwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
  /**
    * Constraint function applied to the pointwise kernel matrix.
    */
  var pointwiseConstraint: js.UndefOr[ConstraintIdentifier | Constraint] = js.undefined
  /**
    * Initializer for the pointwise kernel matrix.
    */
  var pointwiseInitializer: js.UndefOr[InitializerIdentifier | Initializer] = js.undefined
  /**
    * Regularizer function applied to the pointwise kernel matrix.
    */
  var pointwiseRegularizer: js.UndefOr[RegularizerIdentifier | Regularizer] = js.undefined
}

object SeparableConvLayerArgs {
  @scala.inline
  def apply(
    filters: Double,
    kernelSize: Double | js.Array[Double],
    activation: ActivationIdentifier = null,
    activityRegularizer: RegularizerIdentifier | Regularizer = null,
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    biasConstraint: ConstraintIdentifier | Constraint = null,
    biasInitializer: InitializerIdentifier | Initializer = null,
    biasRegularizer: RegularizerIdentifier | Regularizer = null,
    dataFormat: DataFormat = null,
    depthMultiplier: Int | Double = null,
    depthwiseConstraint: ConstraintIdentifier | Constraint = null,
    depthwiseInitializer: InitializerIdentifier | Initializer = null,
    depthwiseRegularizer: RegularizerIdentifier | Regularizer = null,
    dilationRate: Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    kernelConstraint: ConstraintIdentifier | Constraint = null,
    kernelInitializer: InitializerIdentifier | Initializer = null,
    kernelRegularizer: RegularizerIdentifier | Regularizer = null,
    name: String = null,
    padding: PaddingMode = null,
    pointwiseConstraint: ConstraintIdentifier | Constraint = null,
    pointwiseInitializer: InitializerIdentifier | Initializer = null,
    pointwiseRegularizer: RegularizerIdentifier | Regularizer = null,
    strides: Double | js.Array[Double] = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    useBias: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor_[Rank]] = null
  ): SeparableConvLayerArgs = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], kernelSize = kernelSize.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (activityRegularizer != null) __obj.updateDynamic("activityRegularizer")(activityRegularizer.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (biasConstraint != null) __obj.updateDynamic("biasConstraint")(biasConstraint.asInstanceOf[js.Any])
    if (biasInitializer != null) __obj.updateDynamic("biasInitializer")(biasInitializer.asInstanceOf[js.Any])
    if (biasRegularizer != null) __obj.updateDynamic("biasRegularizer")(biasRegularizer.asInstanceOf[js.Any])
    if (dataFormat != null) __obj.updateDynamic("dataFormat")(dataFormat.asInstanceOf[js.Any])
    if (depthMultiplier != null) __obj.updateDynamic("depthMultiplier")(depthMultiplier.asInstanceOf[js.Any])
    if (depthwiseConstraint != null) __obj.updateDynamic("depthwiseConstraint")(depthwiseConstraint.asInstanceOf[js.Any])
    if (depthwiseInitializer != null) __obj.updateDynamic("depthwiseInitializer")(depthwiseInitializer.asInstanceOf[js.Any])
    if (depthwiseRegularizer != null) __obj.updateDynamic("depthwiseRegularizer")(depthwiseRegularizer.asInstanceOf[js.Any])
    if (dilationRate != null) __obj.updateDynamic("dilationRate")(dilationRate.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (kernelConstraint != null) __obj.updateDynamic("kernelConstraint")(kernelConstraint.asInstanceOf[js.Any])
    if (kernelInitializer != null) __obj.updateDynamic("kernelInitializer")(kernelInitializer.asInstanceOf[js.Any])
    if (kernelRegularizer != null) __obj.updateDynamic("kernelRegularizer")(kernelRegularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pointwiseConstraint != null) __obj.updateDynamic("pointwiseConstraint")(pointwiseConstraint.asInstanceOf[js.Any])
    if (pointwiseInitializer != null) __obj.updateDynamic("pointwiseInitializer")(pointwiseInitializer.asInstanceOf[js.Any])
    if (pointwiseRegularizer != null) __obj.updateDynamic("pointwiseRegularizer")(pointwiseRegularizer.asInstanceOf[js.Any])
    if (strides != null) __obj.updateDynamic("strides")(strides.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.asInstanceOf[js.Any])
    if (!js.isUndefined(useBias)) __obj.updateDynamic("useBias")(useBias.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparableConvLayerArgs]
  }
}

