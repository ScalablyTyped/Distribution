package typings.tensorflowTfjsConverter.typesMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorInfo extends js.Object {
  var dtype: DataType = js.native
  var name: String = js.native
  var shape: js.UndefOr[js.Array[Double]] = js.native
}

object TensorInfo {
  @scala.inline
  def apply(dtype: DataType, name: String): TensorInfo = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorInfo]
  }
  @scala.inline
  implicit class TensorInfoOps[Self <: TensorInfo] (val x: Self) extends AnyVal {
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
    def setDtype(value: DataType): Self = this.set("dtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeVarargs(value: Double*): Self = this.set("shape", js.Array(value :_*))
    @scala.inline
    def setShape(value: js.Array[Double]): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
  
}

