package typings.tensorflowTfjsCore.anon

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.uint16
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.uint8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dtype extends js.Object {
  var dtype: uint16 | uint8
  var min: Double
  var scale: Double
}

object Dtype {
  @scala.inline
  def apply(dtype: uint16 | uint8, min: Double, scale: Double): Dtype = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dtype]
  }
}

