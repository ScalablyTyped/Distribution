package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a size that is used to convey the values of timed text style properties. */
trait TimedTextSize extends js.Object {
  /** The height. */
  var height: Double
  /** The units of the size, either pixels or percentage. */
  var unit: TimedTextUnit
  /** The width. */
  var width: Double
}

object TimedTextSize {
  @scala.inline
  def apply(height: Double, unit: TimedTextUnit, width: Double): TimedTextSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimedTextSize]
  }
}

