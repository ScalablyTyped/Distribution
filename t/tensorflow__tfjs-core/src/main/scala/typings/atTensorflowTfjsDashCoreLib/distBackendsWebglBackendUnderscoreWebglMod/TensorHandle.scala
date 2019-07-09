package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglBackendUnderscoreWebglMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TensorHandle extends js.Object {
  var dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId
  var dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  var shape: js.Array[scala.Double]
}

object TensorHandle {
  @scala.inline
  def apply(
    dataId: atTensorflowTfjsDashCoreLib.distTensorMod.DataId,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    shape: js.Array[scala.Double]
  ): TensorHandle = {
    val __obj = js.Dynamic.literal(dataId = dataId, dtype = dtype, shape = shape)
  
    __obj.asInstanceOf[TensorHandle]
  }
}

