package typings.workboxWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannelName extends js.Object {
  var channelName: js.UndefOr[String] = js.undefined
}

object AnonChannelName {
  @scala.inline
  def apply(channelName: String = null): AnonChannelName = {
    val __obj = js.Dynamic.literal()
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannelName]
  }
}

