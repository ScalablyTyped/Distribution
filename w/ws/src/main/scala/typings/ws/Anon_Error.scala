package typings.ws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.Any
  var message: js.Any
  var target: this.type
  var `type`: String
}

object Anon_Error {
  @scala.inline
  def apply(error: js.Any, message: js.Any, target: Anon_Error, `type`: String): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Error]
  }
}

