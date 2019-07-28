package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharsToEscape extends js.Object {
  /**
  			 * The characters to escape.
  			 */
  var charsToEscape: String
  /**
  			 * The escape character.
  			 */
  var escapeChar: String
}

object Anon_CharsToEscape {
  @scala.inline
  def apply(charsToEscape: String, escapeChar: String): Anon_CharsToEscape = {
    val __obj = js.Dynamic.literal(charsToEscape = charsToEscape, escapeChar = escapeChar)
  
    __obj.asInstanceOf[Anon_CharsToEscape]
  }
}

