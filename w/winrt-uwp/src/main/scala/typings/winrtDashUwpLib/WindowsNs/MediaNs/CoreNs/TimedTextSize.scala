package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a size that is used to convey the values of timed text style properties. */
trait TimedTextSize extends js.Object {
  /** The height. */
  var height: scala.Double
  /** The units of the size, either pixels or percentage. */
  var unit: TimedTextUnit
  /** The width. */
  var width: scala.Double
}

object TimedTextSize {
  @scala.inline
  def apply(height: scala.Double, unit: TimedTextUnit, width: scala.Double): TimedTextSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("unit")(unit)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[TimedTextSize]
  }
}

