package typings
package twilioDashChatLib.libDataChannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsServices extends js.Object {
  var consumptionHorizon: twilioDashChatLib.libServicesConsumptionhorizonMod.ConsumptionHorizon
  var mcsClient: twilioDashMcsDashClientLib.twilioDashMcsDashClientMod.McsClient
  var network: twilioDashChatLib.libServicesNetworkMod.Network
  var session: twilioDashChatLib.libSessionMod.Session
  var syncClient: twilioDashSyncLib.twilioDashSyncMod.SyncClient
  var syncList: twilioDashChatLib.libSynclistMod.SyncList
  var typingIndicator: twilioDashChatLib.libServicesTypingindicatorMod.TypingIndicator
  var users: twilioDashChatLib.libDataUsersMod.Users
}

object ChannelsServices {
  @scala.inline
  def apply(
    consumptionHorizon: twilioDashChatLib.libServicesConsumptionhorizonMod.ConsumptionHorizon,
    mcsClient: twilioDashMcsDashClientLib.twilioDashMcsDashClientMod.McsClient,
    network: twilioDashChatLib.libServicesNetworkMod.Network,
    session: twilioDashChatLib.libSessionMod.Session,
    syncClient: twilioDashSyncLib.twilioDashSyncMod.SyncClient,
    syncList: twilioDashChatLib.libSynclistMod.SyncList,
    typingIndicator: twilioDashChatLib.libServicesTypingindicatorMod.TypingIndicator,
    users: twilioDashChatLib.libDataUsersMod.Users
  ): ChannelsServices = {
    val __obj = js.Dynamic.literal(consumptionHorizon = consumptionHorizon, mcsClient = mcsClient, network = network, session = session, syncClient = syncClient, syncList = syncList, typingIndicator = typingIndicator, users = users)
  
    __obj.asInstanceOf[ChannelsServices]
  }
}

