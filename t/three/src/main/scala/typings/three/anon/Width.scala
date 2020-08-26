package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Width extends js.Object {
  var height: Double = js.native
  var heightSegments: Double = js.native
  var width: Double = js.native
  var widthSegments: Double = js.native
}

object Width {
  @scala.inline
  def apply(height: Double, heightSegments: Double, width: Double, widthSegments: Double): Width = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightSegments = heightSegments.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthSegments = widthSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
  @scala.inline
  implicit class WidthOps[Self <: Width] (val x: Self) extends AnyVal {
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
    def setHeightSegments(value: Double): Self = this.set("heightSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidthSegments(value: Double): Self = this.set("widthSegments", value.asInstanceOf[js.Any])
  }
  
}

