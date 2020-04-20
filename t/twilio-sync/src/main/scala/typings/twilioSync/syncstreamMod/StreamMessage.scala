package typings.twilioSync.syncstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamMessage extends js.Object {
  var sid: String
  var value: js.Object
}

object StreamMessage {
  @scala.inline
  def apply(sid: String, value: js.Object): StreamMessage = {
    val __obj = js.Dynamic.literal(sid = sid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamMessage]
  }
}

