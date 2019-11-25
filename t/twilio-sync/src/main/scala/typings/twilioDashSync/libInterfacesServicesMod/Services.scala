package typings.twilioDashSync.libInterfacesServicesMod

import typings.twilioDashSync.libSubscriptionsMod.Subscriptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Services extends js.Object {
  var config: Configuration
  var network: Network
  var notifications: Notifications
  var router: typings.twilioDashSync.libRouterMod.Router
  var storage: Storage
  var subscriptions: Subscriptions
  var twilsock: typings.twilsock.twilsockMod.Twilsock
}

object Services {
  @scala.inline
  def apply(
    config: Configuration,
    network: Network,
    notifications: Notifications,
    router: typings.twilioDashSync.libRouterMod.Router,
    storage: Storage,
    subscriptions: Subscriptions,
    twilsock: typings.twilsock.twilsockMod.Twilsock
  ): Services = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], twilsock = twilsock.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Services]
  }
}

