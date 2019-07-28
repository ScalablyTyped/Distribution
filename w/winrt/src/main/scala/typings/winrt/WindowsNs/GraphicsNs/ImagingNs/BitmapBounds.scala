package typings.winrt.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BitmapBounds extends js.Object {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object BitmapBounds {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): BitmapBounds = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[BitmapBounds]
  }
}

