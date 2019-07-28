package typings.atTensorflowTfjsDashLayers.distEngineTopologyMod

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashLayers.distKerasUnderscoreFormatCommonMod.Shape
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
  var batchInputShape: js.UndefOr[Shape] = js.undefined
  /**
    * If `inputShape` is specified and `batchInputShape` is *not* specified,
    * `batchSize` is used to construct the `batchInputShape`: `[batchSize,
    * ...inputShape]`
    */
  var batchSize: js.UndefOr[Double] = js.undefined
  /**
    * The data-type for this layer. Defaults to 'float32'.
    * This argument is only applicable to input layers (the first layer of a
    * model).
    */
  var dtype: js.UndefOr[DataType] = js.undefined
  /** Legacy support. Do not use for new code. */
  var inputDType: js.UndefOr[DataType] = js.undefined
  /**
    * If defined, will be used to create an input layer to insert before this
    * layer. If both `inputShape` and `batchInputShape` are defined,
    * `batchInputShape` will be used. This argument is only applicable to input
    * layers (the first layer of a model).
    */
  var inputShape: js.UndefOr[Shape] = js.undefined
  /** Name for this layer. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Whether the weights of this layer are updatable by `fit`.
    * Defaults to true.
    */
  var trainable: js.UndefOr[Boolean] = js.undefined
  /**
    * Initial weight values of the layer.
    */
  var weights: js.UndefOr[js.Array[Tensor[Rank]]] = js.undefined
}

object LayerArgs {
  @scala.inline
  def apply(
    batchInputShape: Shape = null,
    batchSize: Int | Double = null,
    dtype: DataType = null,
    inputDType: DataType = null,
    inputShape: Shape = null,
    name: String = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor[Rank]] = null
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

