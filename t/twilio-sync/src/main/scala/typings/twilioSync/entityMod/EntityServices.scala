package typings.twilioSync.entityMod

import typings.twilioSync.servicesMod.Network
import typings.twilioSync.servicesMod.Router
import typings.twilioSync.servicesMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityServices extends js.Object {
  var network: Network = js.native
  var router: Router = js.native
  var storage: Storage = js.native
}

object EntityServices {
  @scala.inline
  def apply(network: Network, router: Router, storage: Storage): EntityServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityServices]
  }
  @scala.inline
  implicit class EntityServicesOps[Self <: EntityServices] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setRouter(value: Router): Self = this.set("router", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorage(value: Storage): Self = this.set("storage", value.asInstanceOf[js.Any])
  }
  
}

