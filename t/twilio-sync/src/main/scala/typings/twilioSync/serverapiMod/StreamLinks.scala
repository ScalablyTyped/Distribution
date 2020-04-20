package typings.twilioSync.serverapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLinks extends js.Object {
  var messages: String
}

object StreamLinks {
  @scala.inline
  def apply(messages: String): StreamLinks = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamLinks]
  }
}

