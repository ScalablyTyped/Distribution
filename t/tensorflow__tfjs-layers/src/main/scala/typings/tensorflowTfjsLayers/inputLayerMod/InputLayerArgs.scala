package typings.tensorflowTfjsLayers.inputLayerMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputLayerArgs extends js.Object {
  /** Batch input shape, including the batch axis. */
  var batchInputShape: js.UndefOr[Shape] = js.native
  /** Optional input batch size (integer or null). */
  var batchSize: js.UndefOr[Double] = js.native
  /** Datatype of the input.  */
  var dtype: js.UndefOr[DataType] = js.native
  /** Input shape, not including the batch axis. */
  var inputShape: js.UndefOr[Shape] = js.native
  /** Name of the layer. */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether the placeholder created is meant to be sparse.
    */
  var sparse: js.UndefOr[Boolean] = js.native
}

object InputLayerArgs {
  @scala.inline
  def apply(): InputLayerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLayerArgs]
  }
  @scala.inline
  implicit class InputLayerArgsOps[Self <: InputLayerArgs] (val x: Self) extends AnyVal {
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
    def setSparse(value: Boolean): Self = this.set("sparse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSparse: Self = this.set("sparse", js.undefined)
  }
  
}

