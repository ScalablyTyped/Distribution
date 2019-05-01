package typings
package twilioDashChatLib.libChannelMod.ChannelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastMessage extends js.Object {
  var index: js.UndefOr[scala.Double] = js.undefined
  var timestamp: js.UndefOr[stdLib.Date] = js.undefined
}

object LastMessage {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null, timestamp: stdLib.Date = null): LastMessage = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[LastMessage]
  }
}

