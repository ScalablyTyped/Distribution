package typings.tracking.tracking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bounding box data for individal tracking rectangles.
  */
trait TrackRect extends js.Object {
  /** Color being tracked (for ColorTracker only) */
  var color: js.UndefOr[String] = js.undefined
  /** Rectange height. */
  var height: Double
  /** Rectange width. */
  var width: Double
  /** Horizontal position of top-left corner. */
  var x: Double
  /** Vertical position of top-left corner */
  var y: Double
}

object TrackRect {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double, color: String = null): TrackRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackRect]
  }
}

