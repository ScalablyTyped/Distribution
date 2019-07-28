package typings.ws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorMessage extends js.Object {
  var error: js.Any
  var message: js.Any
  var target: this.type
  var `type`: String
}

object Anon_ErrorMessage {
  @scala.inline
  def apply(error: js.Any, message: js.Any, target: Anon_ErrorMessage, `type`: String): Anon_ErrorMessage = {
    val __obj = js.Dynamic.literal(error = error, message = message, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ErrorMessage]
  }
}

