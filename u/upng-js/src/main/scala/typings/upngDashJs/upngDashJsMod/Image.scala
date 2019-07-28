package typings.upngDashJs.upngDashJsMod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var ctype: Double
  var data: ArrayBuffer
  var depth: Double
  var frames: js.Array[ImageFrame]
  var height: Double
  var tabs: ImageTabs
  var width: Double
}

object Image {
  @scala.inline
  def apply(
    ctype: Double,
    data: ArrayBuffer,
    depth: Double,
    frames: js.Array[ImageFrame],
    height: Double,
    tabs: ImageTabs,
    width: Double
  ): Image = {
    val __obj = js.Dynamic.literal(ctype = ctype, data = data, depth = depth, frames = frames, height = height, tabs = tabs, width = width)
  
    __obj.asInstanceOf[Image]
  }
}

