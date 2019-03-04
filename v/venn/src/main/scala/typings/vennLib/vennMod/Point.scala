package typings
package vennLib.vennMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object Point {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): Point = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[Point]
  }
}

