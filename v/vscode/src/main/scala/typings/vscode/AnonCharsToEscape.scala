package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharsToEscape extends js.Object {
  /**
  			 * The characters to escape.
  			 */
  var charsToEscape: String
  /**
  			 * The escape character.
  			 */
  var escapeChar: String
}

object AnonCharsToEscape {
  @scala.inline
  def apply(charsToEscape: String, escapeChar: String): AnonCharsToEscape = {
    val __obj = js.Dynamic.literal(charsToEscape = charsToEscape.asInstanceOf[js.Any], escapeChar = escapeChar.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCharsToEscape]
  }
}

