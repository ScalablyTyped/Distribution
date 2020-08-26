package typings.twilioChat.publicchannelsMod

import typings.twilioChat.networkMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicChannelServices extends js.Object {
  var network: Network = js.native
}

object PublicChannelServices {
  @scala.inline
  def apply(network: Network): PublicChannelServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicChannelServices]
  }
  @scala.inline
  implicit class PublicChannelServicesOps[Self <: PublicChannelServices] (val x: Self) extends AnyVal {
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
    def setNetwork(value: Network): Self = this.set("network", value.asInstanceOf[js.Any])
  }
  
}

