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
    val __obj = js.Dynamic.literal(radius = radius, x = x, y = y)
  
    __obj.asInstanceOf[Circle]
  }
}

