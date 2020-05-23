package typings.websql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 4.6 Errors and exceptions - asynchronous database API error
  */
trait SQLError extends js.Object {
   // = 7;
  var code: Double
  var message: DOMString
}

object SQLError {
  @scala.inline
  def apply(code: Double, message: DOMString): SQLError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLError]
  }
}

