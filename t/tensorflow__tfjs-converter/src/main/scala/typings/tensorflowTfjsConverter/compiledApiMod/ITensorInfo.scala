package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.TensorInfo.ICooSparse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITensorInfo extends js.Object {
  /** TensorInfo cooSparse */
  var cooSparse: js.UndefOr[ICooSparse | Null] = js.native
  /** TensorInfo dtype */
  var dtype: js.UndefOr[DataType | Null] = js.native
  /** TensorInfo name */
  var name: js.UndefOr[String | Null] = js.native
  /** TensorInfo tensorShape */
  var tensorShape: js.UndefOr[ITensorShape | Null] = js.native
}

object ITensorInfo {
  @scala.inline
  def apply(): ITensorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensorInfo]
  }
  @scala.inline
  implicit class ITensorInfoOps[Self <: ITensorInfo] (val x: Self) extends AnyVal {
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
    def setCooSparse(value: ICooSparse): Self = this.set("cooSparse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCooSparse: Self = this.set("cooSparse", js.undefined)
    @scala.inline
    def setCooSparseNull: Self = this.set("cooSparse", null)
    @scala.inline
    def setDtype(value: DataType): Self = this.set("dtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtype: Self = this.set("dtype", js.undefined)
    @scala.inline
    def setDtypeNull: Self = this.set("dtype", null)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setTensorShape(value: ITensorShape): Self = this.set("tensorShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTensorShape: Self = this.set("tensorShape", js.undefined)
    @scala.inline
    def setTensorShapeNull: Self = this.set("tensorShape", null)
  }
  
}

