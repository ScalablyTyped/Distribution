package typings.tryghostContentApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorType extends js.Object {
  var errorType: String
  var message: String
}

object ErrorType {
  @scala.inline
  def apply(errorType: String, message: String): ErrorType = {
    val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorType]
  }
}

