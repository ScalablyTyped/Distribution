package typings.atTensorflowTfjsDashCore.distTensorMod

import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorData[D /* <: DataType */] extends js.Object {
  var dataId: js.UndefOr[DataId] = js.undefined
  var values: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any
  ] = js.undefined
}

object TensorData {
  @scala.inline
  def apply[D /* <: DataType */](
    dataId: DataId = null,
    values: /* import warning: importer.ImportType#apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any = null
  ): TensorData[D] = {
    val __obj = js.Dynamic.literal()
    if (dataId != null) __obj.updateDynamic("dataId")(dataId.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorData[D]]
  }
}

