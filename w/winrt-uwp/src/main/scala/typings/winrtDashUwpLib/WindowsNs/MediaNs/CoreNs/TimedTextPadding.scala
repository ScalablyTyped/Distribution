package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the size of padding around a timed text region. */
trait TimedTextPadding extends js.Object {
  /** The padding after the timed text region. */
  var after: scala.Double
  /** The padding before the timed text region. */
  var before: scala.Double
  /** The padding towards the end of the timed text. */
  var end: scala.Double
  /** The padding towards the start of the timed text. */
  var start: scala.Double
  /** The units in which the other members of the structure are expressed. */
  var unit: TimedTextUnit
}

object TimedTextPadding {
  @scala.inline
  def apply(
    after: scala.Double,
    before: scala.Double,
    end: scala.Double,
    start: scala.Double,
    unit: TimedTextUnit
  ): TimedTextPadding = {
    val __obj = js.Dynamic.literal(after = after, before = before, end = end, start = start, unit = unit)
  
    __obj.asInstanceOf[TimedTextPadding]
  }
}

