package typings.atTensorflowTfjsDashCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleValueMap extends js.Object {
  var bool: Boolean
  var complex64: Double
  var float32: Double
  var int32: Double
  var string: String
}

object SingleValueMap {
  @scala.inline
  def apply(bool: Boolean, complex64: Double, float32: Double, int32: Double, string: String): SingleValueMap = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], complex64 = complex64.asInstanceOf[js.Any], float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SingleValueMap]
  }
}

