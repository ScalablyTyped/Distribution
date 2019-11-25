package typings.winrtDashUwp.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a bounding rectangle. */
trait BitmapBounds extends js.Object {
  /** The Height, in pixels, of the bounding box */
  var height: Double
  /** The Width, in pixels, of the bounding box. */
  var width: Double
  /** The X coordinate, in pixels, of the top left corner of the bounding box. */
  var x: Double
  /** The Y coordinate, in pixels, of the top left corner of the bounding box. */
  var y: Double
}

object BitmapBounds {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): BitmapBounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BitmapBounds]
  }
}

