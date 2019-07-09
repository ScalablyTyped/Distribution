package typings
package atTensorflowTfjsDashLayersLib.distEngineTopologyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerArgs extends js.Object {
  /**
    * If defined, will be used to create an input layer to insert before this
    * layer. If both `inputShape` and `batchInputShape` are defined,
    * `batchInputShape` will be used. This argument is only applicable to input
    * layers (the first layer of a model).
    */
  var batchInputShape: js.UndefOr[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape] = js.undefined
  /**
    * If `inputShape` is specified and `batchInputShape` is *not* specified,
    * `batchSize` is used to construct the `batchInputShape`: `[batchSize,
    * ...inputShape]`
    */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The data-type for this layer. Defaults to 'float32'.
    * This argument is only applicable to input layers (the first layer of a
    * model).
    */
  var dtype: js.UndefOr[atTensorflowTfjsDashCoreLib.distTypesMod.DataType] = js.undefined
  /** Legacy support. Do not use for new code. */
  var inputDType: js.UndefOr[atTensorflowTfjsDashCoreLib.distTypesMod.DataType] = js.undefined
  /**
    * If defined, will be used to create an input layer to insert before this
    * layer. If both `inputShape` and `batchInputShape` are defined,
    * `batchInputShape` will be used. This argument is only applicable to input
    * layers (the first layer of a model).
    */
  var inputShape: js.UndefOr[atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape] = js.undefined
  /** Name for this layer. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the weights of this layer are updatable by `fit`.
    * Defaults to true.
    */
  var trainable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Initial weight values of the layer.
    */
  var weights: js.UndefOr[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.undefined
}

object LayerArgs {
  @scala.inline
  def apply(
    batchInputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    batchSize: scala.Int | scala.Double = null,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputDType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType = null,
    inputShape: atTensorflowTfjsDashLayersLib.distKerasUnderscoreFormatCommonMod.Shape = null,
    name: java.lang.String = null,
    trainable: js.UndefOr[scala.Boolean] = js.undefined,
    weights: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ] = null
  ): LayerArgs = {
    val __obj = js.Dynamic.literal()
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape)
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype)
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType)
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable)
    if (weights != null) __obj.updateDynamic("weights")(weights)
    __obj.asInstanceOf[LayerArgs]
  }
}

