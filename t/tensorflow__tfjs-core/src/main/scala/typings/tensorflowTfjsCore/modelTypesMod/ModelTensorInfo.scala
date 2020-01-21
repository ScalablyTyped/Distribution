package typings.tensorflowTfjsCore.modelTypesMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelTensorInfo extends js.Object {
  var dtype: DataType
  var name: String
  var shape: js.UndefOr[js.Array[Double]] = js.undefined
}

object ModelTensorInfo {
  @scala.inline
  def apply(dtype: DataType, name: String, shape: js.Array[Double] = null): ModelTensorInfo = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelTensorInfo]
  }
}

