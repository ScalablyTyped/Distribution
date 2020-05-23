package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharsToEscape extends js.Object {
  /**
    * The characters to escape.
    */
  var charsToEscape: String
  /**
    * The escape character.
    */
  var escapeChar: String
}

object CharsToEscape {
  @scala.inline
  def apply(charsToEscape: String, escapeChar: String): CharsToEscape = {
    val __obj = js.Dynamic.literal(charsToEscape = charsToEscape.asInstanceOf[js.Any], escapeChar = escapeChar.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharsToEscape]
  }
}

