package typings.tensorflowTfjsData.typesMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.tensorTypesMod.TensorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnConfig extends js.Object {
  var default: js.UndefOr[TensorContainer] = js.native
  var dtype: js.UndefOr[DataType] = js.native
  var isLabel: js.UndefOr[Boolean] = js.native
  var required: js.UndefOr[Boolean] = js.native
}

object ColumnConfig {
  @scala.inline
  def apply(): ColumnConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnConfig]
  }
  @scala.inline
  implicit class ColumnConfigOps[Self <: ColumnConfig] (val x: Self) extends AnyVal {
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
    def setDefault(value: TensorContainer): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDtype(value: DataType): Self = this.set("dtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtype: Self = this.set("dtype", js.undefined)
    @scala.inline
    def setIsLabel(value: Boolean): Self = this.set("isLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLabel: Self = this.set("isLabel", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
  }
  
}

