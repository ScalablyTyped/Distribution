package typings.tensorflowTfjsCore.tensorMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorData[D /* <: DataType */] extends js.Object {
  var dataId: js.UndefOr[DataId] = js.native
  var values: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any
  ] = js.native
}

object TensorData {
  @scala.inline
  def apply[/* <: typings.tensorflowTfjsCore.distTypesMod.DataType */ D](): TensorData[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TensorData[D]]
  }
  @scala.inline
  implicit class TensorDataOps[Self <: TensorData[_], /* <: typings.tensorflowTfjsCore.distTypesMod.DataType */ D] (val x: Self with TensorData[D]) extends AnyVal {
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
    def setDataId(value: DataId): Self = this.set("dataId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataId: Self = this.set("dataId", js.undefined)
    @scala.inline
    def setValues(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any
    ): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

