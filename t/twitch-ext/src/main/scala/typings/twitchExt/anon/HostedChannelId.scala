package typings.twitchExt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedChannelId extends js.Object {
  /**
    * Numeric ID of the channel being hosted by the currently visible channel
    */
  var hostedChannelId: String = js.native
  /**
    * Numeric ID of the host channel
    */
  var hostingChannelId: String = js.native
}

object HostedChannelId {
  @scala.inline
  def apply(hostedChannelId: String, hostingChannelId: String): HostedChannelId = {
    val __obj = js.Dynamic.literal(hostedChannelId = hostedChannelId.asInstanceOf[js.Any], hostingChannelId = hostingChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedChannelId]
  }
  @scala.inline
  implicit class HostedChannelIdOps[Self <: HostedChannelId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHostedChannelId(value: String): Self = this.set("hostedChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostingChannelId(value: String): Self = this.set("hostingChannelId", value.asInstanceOf[js.Any])
  }
  
}

