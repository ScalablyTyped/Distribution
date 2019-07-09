package typings
package atTensorflowTfjsDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dtype extends js.Object {
  var dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.uint16 | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.uint8
  var min: scala.Double
  var scale: scala.Double
}

object Anon_Dtype {
  @scala.inline
  def apply(
    dtype: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.uint16 | atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreLibStrings.uint8,
    min: scala.Double,
    scale: scala.Double
  ): Anon_Dtype = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], min = min, scale = scale)
  
    __obj.asInstanceOf[Anon_Dtype]
  }
}

