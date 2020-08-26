package typings.twilioChat.usersMod

import typings.twilioChat.networkMod.Network
import typings.twilioChat.sessionMod.Session
import typings.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersServices extends js.Object {
  var network: Network = js.native
  var session: Session = js.native
  var syncClient: SyncClient = js.native
}

object UsersServices {
  @scala.inline
  def apply(network: Network, session: Session, syncClient: SyncClient): UsersServices = {
    val __obj = js.Dynamic.literal(network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersServices]
  }
  @scala.inline
  implicit class UsersServicesOps[Self <: UsersServices] (val x: Self) extends AnyVal {
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
    def setSession(value: Session): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyncClient(value: SyncClient): Self = this.set("syncClient", value.asInstanceOf[js.Any])
  }
  
}

