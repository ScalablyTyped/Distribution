package typings.twilioDashChat.libDataPublicchannelsMod

import typings.twilioDashChat.libServicesNetworkMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicChannelServices extends js.Object {
  var network: Network
}

object PublicChannelServices {
  @scala.inline
  def apply(network: Network): PublicChannelServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PublicChannelServices]
  }
}

