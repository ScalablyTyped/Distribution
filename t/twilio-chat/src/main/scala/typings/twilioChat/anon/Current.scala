package typings.twilioChat.anon

import typings.std.Date
import typings.twilioChat.twilioChatStrings.active
import typings.twilioChat.twilioChatStrings.closed
import typings.twilioChat.twilioChatStrings.inactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Current extends js.Object {
  var current: active | inactive | closed
  var dateUpdated: Date
}

object Current {
  @scala.inline
  def apply(current: active | inactive | closed, dateUpdated: Date): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
}

