package typings.tensorflowTfjsCore.backendCpuMod

import typings.tensorflowTfjsCore.AnonImagRealRank
import typings.tensorflowTfjsCore.distTypesMod.BackendValues
import typings.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorData[D /* <: DataType */] extends js.Object {
  var complexTensors: js.UndefOr[AnonImagRealRank] = js.undefined
  var dtype: D
  var values: js.UndefOr[BackendValues] = js.undefined
}

object TensorData {
  @scala.inline
  def apply[D /* <: DataType */](dtype: D, complexTensors: AnonImagRealRank = null, values: BackendValues = null): TensorData[D] = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any])
    if (complexTensors != null) __obj.updateDynamic("complexTensors")(complexTensors.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorData[D]]
  }
}

