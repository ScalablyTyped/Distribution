package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataId extends js.Object {
  var dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  var shape: js.Array[scala.Double]
  var size: scala.Double
}

object Anon_DataId {
  @scala.inline
  def apply(
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    shape: js.Array[scala.Double],
    size: scala.Double
  ): Anon_DataId = {
    val __obj = js.Dynamic.literal(dtype = dtype, shape = shape, size = size)
  
    __obj.asInstanceOf[Anon_DataId]
  }
}

