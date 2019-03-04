package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains number values that represent the location and size of a rectangle. */
trait Rect extends js.Object {
  /** The height of the rectangle, in pixels. */
  var height: scala.Double
  /** The width of the rectangle, in pixels. */
  var width: scala.Double
  /** The x-coordinate of the upper-left corner of the rectangle. */
  var x: scala.Double
  /** The y-coordinate of the upper-left corner of the rectangle. */
  var y: scala.Double
}

object Rect {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): Rect = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[Rect]
  }
}

