package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the size of padding around a timed text region. */
@js.native
trait TimedTextPadding extends js.Object {
  /** The padding after the timed text region. */
  var after: Double = js.native
  /** The padding before the timed text region. */
  var before: Double = js.native
  /** The padding towards the end of the timed text. */
  var end: Double = js.native
  /** The padding towards the start of the timed text. */
  var start: Double = js.native
  /** The units in which the other members of the structure are expressed. */
  var unit: TimedTextUnit = js.native
}

object TimedTextPadding {
  @scala.inline
  def apply(after: Double, before: Double, end: Double, start: Double, unit: TimedTextUnit): TimedTextPadding = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextPadding]
  }
  @scala.inline
  implicit class TimedTextPaddingOps[Self <: TimedTextPadding] (val x: Self) extends AnyVal {
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
    def setAfter(value: Double): Self = this.set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def setBefore(value: Double): Self = this.set("before", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit(value: TimedTextUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
  }
  
}

