package typings.tensorflowTfjsCore.kernelRegistryMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorInfo extends js.Object {
  var dataId: DataId
  var dtype: DataType
  var shape: js.Array[Double]
}

object TensorInfo {
  @scala.inline
  def apply(dataId: DataId, dtype: DataType, shape: js.Array[Double]): TensorInfo = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TensorInfo]
  }
}

