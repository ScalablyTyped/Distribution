package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a TimedTextStyle for a substring in a TimedTextLine . of the cue, which defines the style of the rendered text. */
trait TimedTextSubformat extends js.Object {
  /** Gets or sets the length of the substring to which the SubformatStyle applies. */
  var length: Double
  /** Gets or sets the staring index of the substring to which the SubformatStyle applies. */
  var startIndex: Double
  /** Gets or sets the TimedTextStyle object that conveys the formatting of a substring in a TimedTextLine . */
  var subformatStyle: TimedTextStyle
}

object TimedTextSubformat {
  @scala.inline
  def apply(length: Double, startIndex: Double, subformatStyle: TimedTextStyle): TimedTextSubformat = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], subformatStyle = subformatStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextSubformat]
  }
}

