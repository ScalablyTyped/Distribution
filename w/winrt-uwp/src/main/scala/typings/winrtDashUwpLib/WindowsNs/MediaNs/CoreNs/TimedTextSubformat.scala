package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a TimedTextStyle for a substring in a TimedTextLine . of the cue, which defines the style of the rendered text. */
@JSGlobal("Windows.Media.Core.TimedTextSubformat")
@js.native
class TimedTextSubformat () extends js.Object {
  /** Gets or sets the length of the substring to which the SubformatStyle applies. */
  var length: scala.Double = js.native
  /** Gets or sets the staring index of the substring to which the SubformatStyle applies. */
  var startIndex: scala.Double = js.native
  /** Gets or sets the TimedTextStyle object that conveys the formatting of a substring in a TimedTextLine . */
  var subformatStyle: TimedTextStyle = js.native
}

