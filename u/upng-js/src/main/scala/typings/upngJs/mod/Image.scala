package typings.upngJs.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Image extends js.Object {
  var ctype: Double = js.native
  var data: ArrayBuffer = js.native
  var depth: Double = js.native
  var frames: js.Array[ImageFrame] = js.native
  var height: Double = js.native
  var tabs: ImageTabs = js.native
  var width: Double = js.native
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
    val __obj = js.Dynamic.literal(ctype = ctype.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  @scala.inline
  implicit class ImageOps[Self <: Image] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCtype(value: Double): Self = this.set("ctype", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setFramesVarargs(value: ImageFrame*): Self = this.set("frames", js.Array(value :_*))
    @scala.inline
    def setFrames(value: js.Array[ImageFrame]): Self = this.set("frames", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabs(value: ImageTabs): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

