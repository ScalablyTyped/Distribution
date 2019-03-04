package typings
package upngDashJsLib.upngDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var ctype: scala.Double
  var data: stdLib.ArrayBuffer
  var depth: scala.Double
  var frames: js.Array[ImageFrame]
  var height: scala.Double
  var tabs: ImageTabs
  var width: scala.Double
}

object Image {
  @scala.inline
  def apply(
    ctype: scala.Double,
    data: stdLib.ArrayBuffer,
    depth: scala.Double,
    frames: js.Array[ImageFrame],
    height: scala.Double,
    tabs: ImageTabs,
    width: scala.Double
  ): Image = {
    val __obj = js.Dynamic.literal(ctype = ctype, data = data, depth = depth, frames = frames, height = height, tabs = tabs, width = width)
  
    __obj.asInstanceOf[Image]
  }
}

