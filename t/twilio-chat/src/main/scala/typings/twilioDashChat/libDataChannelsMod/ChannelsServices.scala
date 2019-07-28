package typings.twilioDashChat.libDataChannelsMod

import typings.twilioDashChat.libDataUsersMod.Users
import typings.twilioDashChat.libServicesConsumptionhorizonMod.ConsumptionHorizon
import typings.twilioDashChat.libServicesNetworkMod.Network
import typings.twilioDashChat.libServicesTypingindicatorMod.TypingIndicator
import typings.twilioDashChat.libSessionMod.Session
import typings.twilioDashChat.libSynclistMod.SyncList
import typings.twilioDashMcsDashClient.twilioDashMcsDashClientMod.McsClient
import typings.twilioDashSync.twilioDashSyncMod.SyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsServices extends js.Object {
  var consumptionHorizon: ConsumptionHorizon
  var mcsClient: McsClient
  var network: Network
  var session: Session
  var syncClient: SyncClient
  var syncList: SyncList
  var typingIndicator: TypingIndicator
  var users: Users
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
    val __obj = js.Dynamic.literal(consumptionHorizon = consumptionHorizon, mcsClient = mcsClient, network = network, session = session, syncClient = syncClient, syncList = syncList, typingIndicator = typingIndicator, users = users)
  
    __obj.asInstanceOf[ChannelsServices]
  }
}

