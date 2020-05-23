package typings.twilioChat.channelMod.Channel

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
  def apply(index: js.UndefOr[Double] = js.undefined, timestamp: Date = null): LastMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastMessage]
  }
}

