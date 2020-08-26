package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a TimedTextStyle for a substring in a TimedTextLine . of the cue, which defines the style of the rendered text. */
@js.native
trait TimedTextSubformat extends js.Object {
  /** Gets or sets the length of the substring to which the SubformatStyle applies. */
  var length: Double = js.native
  /** Gets or sets the staring index of the substring to which the SubformatStyle applies. */
  var startIndex: Double = js.native
  /** Gets or sets the TimedTextStyle object that conveys the formatting of a substring in a TimedTextLine . */
  var subformatStyle: TimedTextStyle = js.native
}

object TimedTextSubformat {
  @scala.inline
  def apply(length: Double, startIndex: Double, subformatStyle: TimedTextStyle): TimedTextSubformat = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], subformatStyle = subformatStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextSubformat]
  }
  @scala.inline
  implicit class TimedTextSubformatOps[Self <: TimedTextSubformat] (val x: Self) extends AnyVal {
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubformatStyle(value: TimedTextStyle): Self = this.set("subformatStyle", value.asInstanceOf[js.Any])
  }
  
}

