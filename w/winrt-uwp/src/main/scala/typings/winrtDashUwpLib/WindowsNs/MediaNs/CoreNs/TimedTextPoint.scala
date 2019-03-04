package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents 2D coordinate that is used to convey the values of timed text style properties. */
trait TimedTextPoint extends js.Object {
  /** The units of the coordinates, either pixels or percentage. */
  var unit: TimedTextUnit
  /** The X coordinate of the point. */
  var x: scala.Double
  /** The Y coordinate of the point. */
  var y: scala.Double
}

object TimedTextPoint {
  @scala.inline
  def apply(unit: TimedTextUnit, x: scala.Double, y: scala.Double): TimedTextPoint = {
    val __obj = js.Dynamic.literal(unit = unit, x = x, y = y)
  
    __obj.asInstanceOf[TimedTextPoint]
  }
}

