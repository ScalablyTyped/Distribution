package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents 2D coordinate that is used to convey the values of timed text style properties. */
@js.native
trait TimedTextPoint extends js.Object {
  /** The units of the coordinates, either pixels or percentage. */
  var unit: TimedTextUnit = js.native
  /** The X coordinate of the point. */
  var x: Double = js.native
  /** The Y coordinate of the point. */
  var y: Double = js.native
}

object TimedTextPoint {
  @scala.inline
  def apply(unit: TimedTextUnit, x: Double, y: Double): TimedTextPoint = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextPoint]
  }
  @scala.inline
  implicit class TimedTextPointOps[Self <: TimedTextPoint] (val x: Self) extends AnyVal {
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
    def setUnit(value: TimedTextUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

