package typings
package twilioDashChatLib.libChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelServices extends js.Object {
  var consumptionHorizon: twilioDashChatLib.libServicesConsumptionhorizonMod.ConsumptionHorizon
  var mcsClient: twilioDashMcsDashClientLib.twilioDashMcsDashClientMod.McsClient
  var network: twilioDashChatLib.libServicesNetworkMod.Network
  var session: twilioDashChatLib.libSessionMod.Session
  var syncClient: twilioDashSyncLib.twilioDashSyncMod.SyncClient
  var typingIndicator: twilioDashChatLib.libServicesTypingindicatorMod.TypingIndicator
  var users: twilioDashChatLib.libDataUsersMod.Users
}

object ChannelServices {
  @scala.inline
  def apply(
    consumptionHorizon: twilioDashChatLib.libServicesConsumptionhorizonMod.ConsumptionHorizon,
    mcsClient: twilioDashMcsDashClientLib.twilioDashMcsDashClientMod.McsClient,
    network: twilioDashChatLib.libServicesNetworkMod.Network,
    session: twilioDashChatLib.libSessionMod.Session,
    syncClient: twilioDashSyncLib.twilioDashSyncMod.SyncClient,
    typingIndicator: twilioDashChatLib.libServicesTypingindicatorMod.TypingIndicator,
    users: twilioDashChatLib.libDataUsersMod.Users
  ): ChannelServices = {
    val __obj = js.Dynamic.literal(consumptionHorizon = consumptionHorizon, mcsClient = mcsClient, network = network, session = session, syncClient = syncClient, typingIndicator = typingIndicator, users = users)
  
    __obj.asInstanceOf[ChannelServices]
  }
}

