package typings.xterm.xtermMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalizableStrings extends js.Object {
  var blankLine: String
  var promptLabel: String
  var tooMuchOutput: String
}

object ILocalizableStrings {
  @scala.inline
  def apply(blankLine: String, promptLabel: String, tooMuchOutput: String): ILocalizableStrings = {
    val __obj = js.Dynamic.literal(blankLine = blankLine, promptLabel = promptLabel, tooMuchOutput = tooMuchOutput)
  
    __obj.asInstanceOf[ILocalizableStrings]
  }
}

