package typings
package atTensorflowTfjsDashConverterLib.distSrcDataTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorInfo extends js.Object {
  var dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  var name: java.lang.String
  var shape: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object TensorInfo {
  @scala.inline
  def apply(
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    name: java.lang.String,
    shape: js.Array[scala.Double] = null
  ): TensorInfo = {
    val __obj = js.Dynamic.literal(dtype = dtype, name = name)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[TensorInfo]
  }
}

