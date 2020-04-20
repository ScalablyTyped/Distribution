package typings.venn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Circle extends js.Object {
  var radius: Double
  var x: Double
  var y: Double
}

object Circle {
  @scala.inline
  def apply(radius: Double, x: Double, y: Double): Circle = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
}

