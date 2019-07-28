package typings.atTensorflowTfjsDashCore.distTensorUnderscoreTypesMod

import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorInfo extends js.Object {
  var dtype: DataType
  var name: String
  var shape: js.UndefOr[js.Array[Double]] = js.undefined
}

object TensorInfo {
  @scala.inline
  def apply(dtype: DataType, name: String, shape: js.Array[Double] = null): TensorInfo = {
    val __obj = js.Dynamic.literal(dtype = dtype, name = name)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[TensorInfo]
  }
}

