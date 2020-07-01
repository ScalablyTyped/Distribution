package typings.twitchExt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedChannelId extends js.Object {
  /**
    * Numeric ID of the channel being hosted by the currently visible channel
    */
  var hostedChannelId: String
  /**
    * Numeric ID of the host channel
    */
  var hostingChannelId: String
}

object HostedChannelId {
  @scala.inline
  def apply(hostedChannelId: String, hostingChannelId: String): HostedChannelId = {
    val __obj = js.Dynamic.literal(hostedChannelId = hostedChannelId.asInstanceOf[js.Any], hostingChannelId = hostingChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedChannelId]
  }
}

