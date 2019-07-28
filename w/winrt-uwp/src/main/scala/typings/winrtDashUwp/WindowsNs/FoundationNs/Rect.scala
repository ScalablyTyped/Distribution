package typings.winrtDashUwp.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains number values that represent the location and size of a rectangle. */
trait Rect extends js.Object {
  /** The height of the rectangle, in pixels. */
  var height: Double
  /** The width of the rectangle, in pixels. */
  var width: Double
  /** The x-coordinate of the upper-left corner of the rectangle. */
  var x: Double
  /** The y-coordinate of the upper-left corner of the rectangle. */
  var y: Double
}

object Rect {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): Rect = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Rect]
  }
}

