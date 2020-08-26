package typings.tensorflowTfjsLayers.topologyMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerArgs extends js.Object {
  /**
    * If defined, will be used to create an input layer to insert before this
    * layer. If both `inputShape` and `batchInputShape` are defined,
    * `batchInputShape` will be used. This argument is only applicable to input
    * layers (the first layer of a model).
    */
  var batchInputShape: js.UndefOr[Shape] = js.native
  /**
    * If `inputShape` is specified and `batchInputShape` is *not* specified,
    * `batchSize` is used to construct the `batchInputShape`: `[batchSize,
    * ...inputShape]`
    */
  var batchSize: js.UndefOr[Double] = js.native
  /**
    * The data-type for this layer. Defaults to 'float32'.
    * This argument is only applicable to input layers (the first layer of a
    * model).
    */
  var dtype: js.UndefOr[DataType] = js.native
  /** Legacy support. Do not use for new code. */
  var inputDType: js.UndefOr[DataType] = js.native
  /**
    * If defined, will be used to create an input layer to insert before this
    * layer. If both `inputShape` and `batchInputShape` are defined,
    * `batchInputShape` will be used. This argument is only applicable to input
    * layers (the first layer of a model).
    */
  var inputShape: js.UndefOr[Shape] = js.native
  /** Name for this layer. */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the weights of this layer are updatable by `fit`.
    * Defaults to true.
    */
  var trainable: js.UndefOr[Boolean] = js.native
  /**
    * Initial weight values of the layer.
    */
  var weights: js.UndefOr[js.Array[Tensor[Rank]]] = js.native
}

object LayerArgs {
  @scala.inline
  def apply(): LayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerArgs]
  }
  @scala.inline
  implicit class LayerArgsOps[Self <: LayerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBatchInputShapeVarargs(value: (Null | Double)*): Self = this.set("batchInputShape", js.Array(value :_*))
    @scala.inline
    def setBatchInputShape(value: Shape): Self = this.set("batchInputShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchInputShape: Self = this.set("batchInputShape", js.undefined)
    @scala.inline
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    @scala.inline
    def setDtype(value: DataType): Self = this.set("dtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtype: Self = this.set("dtype", js.undefined)
    @scala.inline
    def setInputDType(value: DataType): Self = this.set("inputDType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputDType: Self = this.set("inputDType", js.undefined)
    @scala.inline
    def setInputShapeVarargs(value: (Null | Double)*): Self = this.set("inputShape", js.Array(value :_*))
    @scala.inline
    def setInputShape(value: Shape): Self = this.set("inputShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputShape: Self = this.set("inputShape", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTrainable(value: Boolean): Self = this.set("trainable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrainable: Self = this.set("trainable", js.undefined)
    @scala.inline
    def setWeightsVarargs(value: Tensor[Rank]*): Self = this.set("weights", js.Array(value :_*))
    @scala.inline
    def setWeights(value: js.Array[Tensor[Rank]]): Self = this.set("weights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeights: Self = this.set("weights", js.undefined)
  }
  
}

