package typings.tensorflowTfjsBackendCpu.backendCpuMod

import typings.std.Uint8Array
import typings.tensorflowTfjsBackendCpu.anon.Imag
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorData[D /* <: DataType */] extends js.Object {
  var complexTensors: js.UndefOr[Imag] = js.native
  var dtype: D = js.native
  var values: js.UndefOr[BackendValues] = js.native
}

object TensorData {
  @scala.inline
  def apply[/* <: typings.tensorflowTfjsCore.distTypesMod.DataType */ D](dtype: D): TensorData[D] = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
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
    def setDtype(value: D): Self = this.set("dtype", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplexTensors(value: Imag): Self = this.set("complexTensors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplexTensors: Self = this.set("complexTensors", js.undefined)
    @scala.inline
    def setValuesVarargs(value: Uint8Array*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: BackendValues): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

