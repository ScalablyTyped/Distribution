package typings.atTensorflowTfjsDashCore.distBackendsCpuBackendUnderscoreCpuMod

import typings.atTensorflowTfjsDashCore.Anon_Imag
import typings.atTensorflowTfjsDashCore.distTypesMod.BackendValues
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorData[D /* <: DataType */] extends js.Object {
  var complexTensors: js.UndefOr[Anon_Imag] = js.undefined
  var dtype: D
  var values: js.UndefOr[BackendValues] = js.undefined
}

object TensorData {
  @scala.inline
  def apply[D /* <: DataType */](dtype: D, complexTensors: Anon_Imag = null, values: BackendValues = null): TensorData[D] = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
    if (complexTensors != null) __obj.updateDynamic("complexTensors")(complexTensors.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorData[D]]
  }
}

