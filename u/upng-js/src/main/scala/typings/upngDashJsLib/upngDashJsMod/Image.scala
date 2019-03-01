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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ctype")(ctype)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("frames")(frames)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("tabs")(tabs)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Image]
  }
}

