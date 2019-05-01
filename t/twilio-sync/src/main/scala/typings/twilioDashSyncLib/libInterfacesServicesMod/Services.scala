package typings
package twilioDashSyncLib.libInterfacesServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Services extends js.Object {
  var config: Configuration
  var network: Network
  var notifications: Notifications
  var router: twilioDashSyncLib.libRouterMod.Router
  var storage: Storage
  var subscriptions: twilioDashSyncLib.libSubscriptionsMod.Subscriptions
  var twilsock: twilsockLib.twilsockMod.Twilsock
}

object Services {
  @scala.inline
  def apply(
    config: Configuration,
    network: Network,
    notifications: Notifications,
    router: twilioDashSyncLib.libRouterMod.Router,
    storage: Storage,
    subscriptions: twilioDashSyncLib.libSubscriptionsMod.Subscriptions,
    twilsock: twilsockLib.twilsockMod.Twilsock
  ): Services = {
    val __obj = js.Dynamic.literal(config = config, network = network, notifications = notifications, router = router, storage = storage, subscriptions = subscriptions, twilsock = twilsock)
  
    __obj.asInstanceOf[Services]
  }
}

