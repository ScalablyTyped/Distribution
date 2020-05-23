package typings.workboxWebpackPlugin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelName extends js.Object {
  var channelName: js.UndefOr[String] = js.undefined
}

object ChannelName {
  @scala.inline
  def apply(channelName: String = null): ChannelName = {
    val __obj = js.Dynamic.literal()
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelName]
  }
}

