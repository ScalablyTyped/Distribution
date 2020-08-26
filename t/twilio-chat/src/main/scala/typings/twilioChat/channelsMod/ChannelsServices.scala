package typings.twilioChat.channelsMod

import typings.twilioChat.consumptionhorizonMod.ConsumptionHorizon
import typings.twilioChat.networkMod.Network
import typings.twilioChat.sessionMod.Session
import typings.twilioChat.synclistMod.SyncList
import typings.twilioChat.typingindicatorMod.TypingIndicator
import typings.twilioChat.usersMod.Users
import typings.twilioMcsClient.mod.McsClient
import typings.twilioSync.mod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelsServices extends js.Object {
  var consumptionHorizon: ConsumptionHorizon = js.native
  var mcsClient: McsClient = js.native
  var network: Network = js.native
  var session: Session = js.native
  var syncClient: SyncClient = js.native
  var syncList: SyncList = js.native
  var typingIndicator: TypingIndicator = js.native
  var users: Users = js.native
}

object ChannelsServices {
  @scala.inline
  def apply(
    consumptionHorizon: ConsumptionHorizon,
    mcsClient: McsClient,
    network: Network,
    session: Session,
    syncClient: SyncClient,
    syncList: SyncList,
    typingIndicator: TypingIndicator,
    users: Users
  ): ChannelsServices = {
    val __obj = js.Dynamic.literal(consumptionHorizon = consumptionHorizon.asInstanceOf[js.Any], mcsClient = mcsClient.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], syncClient = syncClient.asInstanceOf[js.Any], syncList = syncList.asInstanceOf[js.Any], typingIndicator = typingIndicator.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelsServices]
  }
  @scala.inline
  implicit class ChannelsServicesOps[Self <: ChannelsServices] (val x: Self) extends AnyVal {
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
    def setConsumptionHorizon(value: ConsumptionHorizon): Self = this.set("consumptionHorizon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMcsClient(value: McsClient): Self = this.set("mcsClient", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetwork(value: Network): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: Session): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyncClient(value: SyncClient): Self = this.set("syncClient", value.asInstanceOf[js.Any])
    @scala.inline
    def setSyncList(value: SyncList): Self = this.set("syncList", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypingIndicator(value: TypingIndicator): Self = this.set("typingIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsers(value: Users): Self = this.set("users", value.asInstanceOf[js.Any])
  }
  
}

