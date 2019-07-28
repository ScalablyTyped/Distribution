package typings.atTensorflowTfjsDashCore

import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.uint16
import typings.atTensorflowTfjsDashCore.atTensorflowTfjsDashCoreStrings.uint8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dtype extends js.Object {
  var dtype: uint16 | uint8
  var min: Double
  var scale: Double
}

object Anon_Dtype {
  @scala.inline
  def apply(dtype: uint16 | uint8, min: Double, scale: Double): Anon_Dtype = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], min = min, scale = scale)
  
    __obj.asInstanceOf[Anon_Dtype]
  }
}

