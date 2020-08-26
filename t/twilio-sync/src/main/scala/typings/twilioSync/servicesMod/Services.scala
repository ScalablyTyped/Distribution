package typings.twilioSync.servicesMod

import typings.twilioSync.subscriptionsMod.Subscriptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Services extends js.Object {
  var config: Configuration = js.native
  var network: Network = js.native
  var notifications: Notifications = js.native
  var router: typings.twilioSync.routerMod.Router = js.native
  var storage: Storage = js.native
  var subscriptions: Subscriptions = js.native
  var twilsock: typings.twilsock.mod.Twilsock = js.native
}

object Services {
  @scala.inline
  def apply(
    config: Configuration,
    network: Network,
    notifications: Notifications,
    router: typings.twilioSync.routerMod.Router,
    storage: Storage,
    subscriptions: Subscriptions,
    twilsock: typings.twilsock.mod.Twilsock
  ): Services = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], twilsock = twilsock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Services]
  }
  @scala.inline
  implicit class ServicesOps[Self <: Services] (val x: Self) extends AnyVal {
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
    def setConfig(value: Configuration): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetwork(value: Network): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifications(value: Notifications): Self = this.set("notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouter(value: typings.twilioSync.routerMod.Router): Self = this.set("router", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorage(value: Storage): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptions(value: Subscriptions): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwilsock(value: typings.twilsock.mod.Twilsock): Self = this.set("twilsock", value.asInstanceOf[js.Any])
  }
  
}

