package typings
package trackingLib.trackingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bounding box data for individal tracking rectangles.
  */
trait TrackRect extends js.Object {
  /** Color being tracked (for ColorTracker only) */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** Rectange height. */
  var height: scala.Double
  /** Rectange width. */
  var width: scala.Double
  /** Horizontal position of top-left corner. */
  var x: scala.Double
  /** Vertical position of top-left corner */
  var y: scala.Double
}

