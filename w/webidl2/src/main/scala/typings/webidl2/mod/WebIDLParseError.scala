package typings.webidl2.mod

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
  def apply(input: String, line: Double, message: String, tokens: js.Array[ValueDescription]): WebIDLParseError = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebIDLParseError]
  }
}

