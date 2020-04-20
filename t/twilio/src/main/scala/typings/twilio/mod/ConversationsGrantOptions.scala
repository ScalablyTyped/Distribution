package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationsGrantOptions extends js.Object {
  var configurationProfileSid: String
}

object ConversationsGrantOptions {
  @scala.inline
  def apply(configurationProfileSid: String): ConversationsGrantOptions = {
    val __obj = js.Dynamic.literal(configurationProfileSid = configurationProfileSid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConversationsGrantOptions]
  }
}

