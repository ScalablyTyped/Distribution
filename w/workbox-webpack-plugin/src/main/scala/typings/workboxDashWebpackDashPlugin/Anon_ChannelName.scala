package typings.workboxDashWebpackDashPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelName extends js.Object {
  var channelName: js.UndefOr[String] = js.undefined
}

object Anon_ChannelName {
  @scala.inline
  def apply(channelName: String = null): Anon_ChannelName = {
    val __obj = js.Dynamic.literal()
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ChannelName]
  }
}

