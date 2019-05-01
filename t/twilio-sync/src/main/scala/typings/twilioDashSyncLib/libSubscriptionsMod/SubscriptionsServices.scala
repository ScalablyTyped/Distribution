package typings
package twilioDashSyncLib.libSubscriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsServices extends js.Object {
  var config: twilioDashSyncLib.libInterfacesServicesMod.Configuration
  var network: twilioDashSyncLib.libInterfacesServicesMod.Network
}

object SubscriptionsServices {
  @scala.inline
  def apply(
    config: twilioDashSyncLib.libInterfacesServicesMod.Configuration,
    network: twilioDashSyncLib.libInterfacesServicesMod.Network
  ): SubscriptionsServices = {
    val __obj = js.Dynamic.literal(config = config, network = network)
  
    __obj.asInstanceOf[SubscriptionsServices]
  }
}

