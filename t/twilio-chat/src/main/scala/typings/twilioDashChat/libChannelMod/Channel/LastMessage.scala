package typings.twilioDashChat.libChannelMod.Channel

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastMessage extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var timestamp: js.UndefOr[Date] = js.undefined
}

object LastMessage {
  @scala.inline
  def apply(index: Int | Double = null, timestamp: Date = null): LastMessage = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[LastMessage]
  }
}

