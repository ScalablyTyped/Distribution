package typings.twilioDashChat.libDataUserchannelsMod

import typings.twilioDashChat.libServicesNetworkMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserChannelServices extends js.Object {
  var network: Network
}

object UserChannelServices {
  @scala.inline
  def apply(network: Network): UserChannelServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserChannelServices]
  }
}

