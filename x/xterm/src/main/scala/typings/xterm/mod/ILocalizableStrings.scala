package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalizableStrings extends js.Object {
  /**
    * The aria label for the underlying input textarea for the terminal.
    */
  var promptLabel: String
  /**
    * Announcement for when line reading is suppressed due to too many lines
    * being printed to the terminal when `screenReaderMode` is enabled.
    */
  var tooMuchOutput: String
}

object ILocalizableStrings {
  @scala.inline
  def apply(promptLabel: String, tooMuchOutput: String): ILocalizableStrings = {
    val __obj = js.Dynamic.literal(promptLabel = promptLabel.asInstanceOf[js.Any], tooMuchOutput = tooMuchOutput.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILocalizableStrings]
  }
}

