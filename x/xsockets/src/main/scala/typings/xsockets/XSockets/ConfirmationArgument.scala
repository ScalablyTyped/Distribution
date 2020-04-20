package typings.xsockets.XSockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmationArgument extends js.Object {
  var event: String
}

object ConfirmationArgument {
  @scala.inline
  def apply(event: String): ConfirmationArgument = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmationArgument]
  }
}

