package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodePoint extends js.Object {
  var code: java.lang.String
  var point: scala.Double
  var x_shift: scala.Double
  var y_shift: scala.Double
}

object Anon_CodePoint {
  @scala.inline
  def apply(code: java.lang.String, point: scala.Double, x_shift: scala.Double, y_shift: scala.Double): Anon_CodePoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("point")(point)
    __obj.updateDynamic("x_shift")(x_shift)
    __obj.updateDynamic("y_shift")(y_shift)
    __obj.asInstanceOf[Anon_CodePoint]
  }
}

