package typings.tensorflowTfjsLayers.inputConfigMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputLayerConfig extends js.Object {
  var batch_input_shape: js.UndefOr[Shape] = js.native
  var batch_size: js.UndefOr[Double] = js.native
  var dtype: js.UndefOr[DataType] = js.native
  var input_shape: js.UndefOr[Shape] = js.native
  var name: js.UndefOr[String] = js.native
  var sparse: js.UndefOr[Boolean] = js.native
}

object InputLayerConfig {
  @scala.inline
  def apply(): InputLayerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputLayerConfig]
  }
  @scala.inline
  implicit class InputLayerConfigOps[Self <: InputLayerConfig] (val x: Self) extends AnyVal {
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
    def setBatch_input_shapeVarargs(value: (Null | Double)*): Self = this.set("batch_input_shape", js.Array(value :_*))
    @scala.inline
    def setBatch_input_shape(value: Shape): Self = this.set("batch_input_shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatch_input_shape: Self = this.set("batch_input_shape", js.undefined)
    @scala.inline
    def setBatch_size(value: Double): Self = this.set("batch_size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatch_size: Self = this.set("batch_size", js.undefined)
    @scala.inline
    def setDtype(value: DataType): Self = this.set("dtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtype: Self = this.set("dtype", js.undefined)
    @scala.inline
    def setInput_shapeVarargs(value: (Null | Double)*): Self = this.set("input_shape", js.Array(value :_*))
    @scala.inline
    def setInput_shape(value: Shape): Self = this.set("input_shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput_shape: Self = this.set("input_shape", js.undefined)
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

