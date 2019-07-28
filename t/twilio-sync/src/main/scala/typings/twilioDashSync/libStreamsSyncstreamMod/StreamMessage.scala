package typings.twilioDashSync.libStreamsSyncstreamMod

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
    val __obj = js.Dynamic.literal(sid = sid, value = value)
  
    __obj.asInstanceOf[StreamMessage]
  }
}

