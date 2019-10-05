package typings.winrtDashUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines a TimedTextStyle for a substring in a TimedTextLine . of the cue, which defines the style of the rendered text. */
@JSGlobal("Windows.Media.Core.TimedTextSubformat")
@js.native
/** Initializes a new instance of the TimedTextSubformat class. */
class TimedTextSubformat () extends js.Object {
  /** Gets or sets the length of the substring to which the SubformatStyle applies. */
  var length: Double = js.native
  /** Gets or sets the staring index of the substring to which the SubformatStyle applies. */
  var startIndex: Double = js.native
  /** Gets or sets the TimedTextStyle object that conveys the formatting of a substring in a TimedTextLine . */
  var subformatStyle: TimedTextStyle = js.native
}

