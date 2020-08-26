package typings.vueCropperjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasData extends js.Object {
  /**
    * the height of the canvas
    */
  var height: Double = js.native
  /**
    * the offset left of the canvas
    */
  var left: Double = js.native
  /**
    * the natural height of the canvas (read only)
    */
  var naturalHeight: Double = js.native
  /**
    * the natural width of the canvas (read only)
    */
  var naturalWidth: Double = js.native
  /**
    * the offset top of the canvas
    */
  var top: Double = js.native
  /**
    * the width of the canvas
    */
  var width: Double = js.native
}

object CanvasData {
  @scala.inline
  def apply(
    height: Double,
    left: Double,
    naturalHeight: Double,
    naturalWidth: Double,
    top: Double,
    width: Double
  ): CanvasData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasData]
  }
  @scala.inline
  implicit class CanvasDataOps[Self <: CanvasData] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setNaturalHeight(value: Double): Self = this.set("naturalHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setNaturalWidth(value: Double): Self = this.set("naturalWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

