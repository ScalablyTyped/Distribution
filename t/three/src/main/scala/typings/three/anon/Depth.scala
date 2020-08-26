package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Depth extends js.Object {
  var depth: Double = js.native
  var depthSegments: Double = js.native
  var height: Double = js.native
  var heightSegments: Double = js.native
  var width: Double = js.native
  var widthSegments: Double = js.native
}

object Depth {
  @scala.inline
  def apply(
    depth: Double,
    depthSegments: Double,
    height: Double,
    heightSegments: Double,
    width: Double,
    widthSegments: Double
  ): Depth = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], depthSegments = depthSegments.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightSegments = heightSegments.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthSegments = widthSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Depth]
  }
  @scala.inline
  implicit class DepthOps[Self <: Depth] (val x: Self) extends AnyVal {
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
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepthSegments(value: Double): Self = this.set("depthSegments", value.asInstanceOf[js.Any])
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

