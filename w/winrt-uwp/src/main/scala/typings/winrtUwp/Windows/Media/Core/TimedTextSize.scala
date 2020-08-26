package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a size that is used to convey the values of timed text style properties. */
@js.native
trait TimedTextSize extends js.Object {
  /** The height. */
  var height: Double = js.native
  /** The units of the size, either pixels or percentage. */
  var unit: TimedTextUnit = js.native
  /** The width. */
  var width: Double = js.native
}

object TimedTextSize {
  @scala.inline
  def apply(height: Double, unit: TimedTextUnit, width: Double): TimedTextSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextSize]
  }
  @scala.inline
  implicit class TimedTextSizeOps[Self <: TimedTextSize] (val x: Self) extends AnyVal {
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
    def setUnit(value: TimedTextUnit): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

