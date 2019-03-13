package typings
package vscodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CharsToEscape extends js.Object {
  /**
  			 * The characters to escape.
  			 */
  var charsToEscape: java.lang.String
  /**
  			 * The escape character.
  			 */
  var escapeChar: java.lang.String
}

object Anon_CharsToEscape {
  @scala.inline
  def apply(charsToEscape: java.lang.String, escapeChar: java.lang.String): Anon_CharsToEscape = {
    val __obj = js.Dynamic.literal(charsToEscape = charsToEscape, escapeChar = escapeChar)
  
    __obj.asInstanceOf[Anon_CharsToEscape]
  }
}

