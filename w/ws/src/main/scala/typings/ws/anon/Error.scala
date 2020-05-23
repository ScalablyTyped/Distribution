package typings.ws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.Any
  var message: js.Any
  var target: this.type
  var `type`: String
}

object Error {
  @scala.inline
  def apply(error: js.Any, message: js.Any, target: Error, `type`: String): Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

