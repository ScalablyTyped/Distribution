package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebIDLParseError extends js.Object {
  /** a short peek at the text at the point where the error happened */
  var input: java.lang.String
  /** the line at which the error occurred. */
  var line: scala.Double
  /** the error message */
  var message: java.lang.String
  /** the five tokens at the point of error, as understood by the tokeniser */
  var tokens: js.Array[ValueDescription]
}

object WebIDLParseError {
  @scala.inline
  def apply(
    input: java.lang.String,
    line: scala.Double,
    message: java.lang.String,
    toString: () => java.lang.String,
    tokens: js.Array[ValueDescription]
  ): WebIDLParseError = {
    val __obj = js.Dynamic.literal(input = input, line = line, message = message, toString = js.Any.fromFunction0(toString), tokens = tokens)
  
    __obj.asInstanceOf[WebIDLParseError]
  }
}

