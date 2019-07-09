package typings
package atTensorflowTfjsDashCoreLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SingleValueMap extends js.Object {
  var bool: scala.Boolean
  var complex64: scala.Double
  var float32: scala.Double
  var int32: scala.Double
  var string: java.lang.String
}

object SingleValueMap {
  @scala.inline
  def apply(
    bool: scala.Boolean,
    complex64: scala.Double,
    float32: scala.Double,
    int32: scala.Double,
    string: java.lang.String
  ): SingleValueMap = {
    val __obj = js.Dynamic.literal(bool = bool, complex64 = complex64, float32 = float32, int32 = int32, string = string)
  
    __obj.asInstanceOf[SingleValueMap]
  }
}

