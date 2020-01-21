package typings.winrtUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents x- and y-coordinate values that define a point in a two-dimensional plane. */
trait Point extends js.Object {
  /** The horizontal position of the point. */
  var x: Double
  /** The vertical position of the point. */
  var y: Double
}

object Point {
  @scala.inline
  def apply(x: Double, y: Double): Point = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Point]
  }
}

