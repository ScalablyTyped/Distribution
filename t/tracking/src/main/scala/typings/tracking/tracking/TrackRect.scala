package typings.tracking.tracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bounding box data for individal tracking rectangles.
  */
@js.native
trait TrackRect extends js.Object {
  /** Color being tracked (for ColorTracker only) */
  var color: js.UndefOr[String] = js.native
  /** Rectange height. */
  var height: Double = js.native
  /** Rectange width. */
  var width: Double = js.native
  /** Horizontal position of top-left corner. */
  var x: Double = js.native
  /** Vertical position of top-left corner */
  var y: Double = js.native
}

object TrackRect {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): TrackRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackRect]
  }
  @scala.inline
  implicit class TrackRectOps[Self <: TrackRect] (val x: Self) extends AnyVal {
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
  
}

