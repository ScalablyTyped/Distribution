package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a line of text that is displayed with a TimedTextCue . */
trait TimedTextLine extends js.Object {
  /** Gets a list of TimedTextSubformat objects that provide formatting for substrings within the TimedTextLine . */
  var subformats: IVector[TimedTextSubformat]
  /** Gets or sets the text content of the TimedTextLine . */
  var text: String
}

object TimedTextLine {
  @scala.inline
  def apply(subformats: IVector[TimedTextSubformat], text: String): TimedTextLine = {
    val __obj = js.Dynamic.literal(subformats = subformats.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimedTextLine]
  }
}

