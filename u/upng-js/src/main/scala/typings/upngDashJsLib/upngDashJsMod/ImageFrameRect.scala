package typings
package upngDashJsLib.upngDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageFrameRect extends js.Object {
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object ImageFrameRect {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): ImageFrameRect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[ImageFrameRect]
  }
}

