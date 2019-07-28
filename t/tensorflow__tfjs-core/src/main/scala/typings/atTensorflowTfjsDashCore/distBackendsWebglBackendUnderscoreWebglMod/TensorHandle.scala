package typings.atTensorflowTfjsDashCore.distBackendsWebglBackendUnderscoreWebglMod

import typings.atTensorflowTfjsDashCore.distTensorMod.DataId
import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorHandle extends js.Object {
  var dataId: DataId
  var dtype: DataType
  var shape: js.Array[Double]
}

object TensorHandle {
  @scala.inline
  def apply(dataId: DataId, dtype: DataType, shape: js.Array[Double]): TensorHandle = {
    val __obj = js.Dynamic.literal(dataId = dataId, dtype = dtype, shape = shape)
  
    __obj.asInstanceOf[TensorHandle]
  }
}

