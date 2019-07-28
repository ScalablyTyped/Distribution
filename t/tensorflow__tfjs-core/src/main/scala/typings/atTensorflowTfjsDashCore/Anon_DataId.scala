package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.distTypesMod.DataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataId extends js.Object {
  var dtype: DataType
  var shape: js.Array[Double]
  var size: Double
}

object Anon_DataId {
  @scala.inline
  def apply(dtype: DataType, shape: js.Array[Double], size: Double): Anon_DataId = {
    val __obj = js.Dynamic.literal(dtype = dtype, shape = shape, size = size)
  
    __obj.asInstanceOf[Anon_DataId]
  }
}

