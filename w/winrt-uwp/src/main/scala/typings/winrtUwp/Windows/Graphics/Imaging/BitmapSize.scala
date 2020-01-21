package typings.winrtUwp.Windows.Graphics.Imaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the size of a bitmap, in pixels. */
trait BitmapSize extends js.Object {
  /** The height of a bitmap, in pixels. */
  var height: Double
  /** The width of a bitmap, in pixels. */
  var width: Double
}

object BitmapSize {
  @scala.inline
  def apply(height: Double, width: Double): BitmapSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BitmapSize]
  }
}

