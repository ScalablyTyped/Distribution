package typings
package atTensorflowTfjsDashCoreLib.distTensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorData[D /* <: atTensorflowTfjsDashCoreLib.distTypesMod.DataType */] extends js.Object {
  var dataId: js.UndefOr[DataId] = js.undefined
  var values: js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any
  ] = js.undefined
}

object TensorData {
  @scala.inline
  def apply[D /* <: atTensorflowTfjsDashCoreLib.distTypesMod.DataType */](
    dataId: DataId = null,
    values: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any = null
  ): TensorData[D] = {
    val __obj = js.Dynamic.literal()
    if (dataId != null) __obj.updateDynamic("dataId")(dataId)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[TensorData[D]]
  }
}

