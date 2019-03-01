package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeXshift extends js.Object {
  var code: java.lang.String
  var x_shift: scala.Double
  var y_shift: scala.Double
}

object Anon_CodeXshift {
  @scala.inline
  def apply(code: java.lang.String, x_shift: scala.Double, y_shift: scala.Double): Anon_CodeXshift = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("x_shift")(x_shift)
    __obj.updateDynamic("y_shift")(y_shift)
    __obj.asInstanceOf[Anon_CodeXshift]
  }
}

