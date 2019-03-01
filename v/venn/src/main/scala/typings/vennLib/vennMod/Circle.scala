package typings
package vennLib.vennMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Circle extends js.Object {
  var radius: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Circle {
  @scala.inline
  def apply(radius: scala.Double, x: scala.Double, y: scala.Double): Circle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Circle]
  }
}

