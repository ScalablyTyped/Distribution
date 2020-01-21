package typings.ws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.Any
  var message: js.Any
  var target: this.type
  var `type`: String
}

object AnonError {
  @scala.inline
  def apply(error: js.Any, message: js.Any, target: AnonError, `type`: String): AnonError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

