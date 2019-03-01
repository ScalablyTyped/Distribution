package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtraLeft extends js.Object {
  var extraLeft: scala.Double
  var extraRight: scala.Double
  var left: scala.Double
  var right: scala.Double
}

object Anon_ExtraLeft {
  @scala.inline
  def apply(extraLeft: scala.Double, extraRight: scala.Double, left: scala.Double, right: scala.Double): Anon_ExtraLeft = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extraLeft")(extraLeft)
    __obj.updateDynamic("extraRight")(extraRight)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[Anon_ExtraLeft]
  }
}

