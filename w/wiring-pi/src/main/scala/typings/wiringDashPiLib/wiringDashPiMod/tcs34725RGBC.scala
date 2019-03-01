package typings
package wiringDashPiLib.wiringDashPiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait tcs34725RGBC extends js.Object {
  var b: scala.Double
  var c: scala.Double
  var g: scala.Double
  var r: scala.Double
}

object tcs34725RGBC {
  @scala.inline
  def apply(b: scala.Double, c: scala.Double, g: scala.Double, r: scala.Double): tcs34725RGBC = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("c")(c)
    __obj.updateDynamic("g")(g)
    __obj.updateDynamic("r")(r)
    __obj.asInstanceOf[tcs34725RGBC]
  }
}

