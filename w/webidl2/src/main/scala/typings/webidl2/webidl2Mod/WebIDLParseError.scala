package typings.webidl2.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebIDLParseError extends js.Object {
  /** a short peek at the text at the point where the error happened */
  var input: String
  /** the line at which the error occurred. */
  var line: Double
  /** the error message */
  var message: String
  /** the five tokens at the point of error, as understood by the tokeniser */
  var tokens: js.Array[ValueDescription]
}

object WebIDLParseError {
  @scala.inline
  def apply(
    input: String,
    line: Double,
    message: String,
    toString: () => String,
    tokens: js.Array[ValueDescription]
  ): WebIDLParseError = {
    val __obj = js.Dynamic.literal(input = input, line = line, message = message, toString = js.Any.fromFunction0(toString), tokens = tokens)
  
    __obj.asInstanceOf[WebIDLParseError]
  }
}

