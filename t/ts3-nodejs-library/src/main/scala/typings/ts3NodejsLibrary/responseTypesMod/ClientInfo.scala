package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.enumMod.ClientType
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientInfo extends ResponseEntry {
  
  var cid: String = js.native
  
  var clientAway: Boolean = js.native
  
  var clientAwayMessage: js.UndefOr[String] = js.native
  
  var clientBadges: String = js.native
  
  var clientBase64HashClientUID: String = js.native
  
  var clientChannelGroupId: String = js.native
  
  var clientChannelGroupInheritedChannelId: String = js.native
  
  var clientCountry: String = js.native
  
  var clientCreated: Double = js.native
  
  var clientDatabaseId: Double = js.native
  
  var clientDefaultChannel: String = js.native
  
  var clientDefaultToken: String = js.native
  
  var clientDescription: String = js.native
  
  var clientFlagAvatar: String = js.native
  
  var clientIconId: String = js.native
  
  var clientIdleTime: Double = js.native
  
  var clientInputHardware: Double = js.native
  
  var clientInputMuted: Double = js.native
  
  var clientIntegrations: String = js.native
  
  var clientIsChannelCommander: Boolean = js.native
  
  var clientIsPrioritySpeaker: Boolean = js.native
  
  var clientIsRecording: Boolean = js.native
  
  var clientIsTalker: Boolean = js.native
  
  var clientLastconnected: Double = js.native
  
  var clientLoginName: String = js.native
  
  var clientMetaData: String = js.native
  
  var clientMonthBytesDownloaded: Double = js.native
  
  var clientMonthBytesUploaded: Double = js.native
  
  var clientMyteamspeakAvatar: String = js.native
  
  var clientMyteamspeakId: String = js.native
  
  var clientNeededServerqueryViewPower: Double = js.native
  
  var clientNickname: String = js.native
  
  var clientNicknamePhonetic: String = js.native
  
  var clientOutputHardware: Double = js.native
  
  var clientOutputMuted: Double = js.native
  
  var clientOutputonlyMuted: Double = js.native
  
  var clientPlatform: String = js.native
  
  var clientSecurityHash: String = js.native
  
  var clientServergroups: js.Array[String] = js.native
  
  var clientSignedBadges: String = js.native
  
  var clientTalkPower: Double = js.native
  
  var clientTalkRequest: Boolean = js.native
  
  var clientTalkRequestMsg: String = js.native
  
  var clientTotalBytesDownloaded: Double = js.native
  
  var clientTotalBytesUploaded: Double = js.native
  
  var clientTotalconnections: Double = js.native
  
  var clientType: ClientType = js.native
  
  var clientUniqueIdentifier: String = js.native
  
  var clientVersion: String = js.native
  
  var clientVersionSign: String = js.native
  
  var connectionBandwidthReceivedLastMinuteTotal: Double = js.native
  
  var connectionBandwidthReceivedLastSecondTotal: Double = js.native
  
  var connectionBandwidthSentLastMinuteTotal: Double = js.native
  
  var connectionBandwidthSentLastSecondTotal: Double = js.native
  
  var connectionBytesReceivedTotal: Double = js.native
  
  var connectionBytesSentTotal: Double = js.native
  
  var connectionClientIp: String = js.native
  
  var connectionConnectedTime: Double = js.native
  
  var connectionFiletransferBandwidthReceived: Double = js.native
  
  var connectionFiletransferBandwidthSent: Double = js.native
  
  var connectionPacketsReceivedTotal: Double = js.native
  
  var connectionPacketsSentTotal: Double = js.native
}
object ClientInfo {
  
  @scala.inline
  def apply(
    cid: String,
    clientAway: Boolean,
    clientBadges: String,
    clientBase64HashClientUID: String,
    clientChannelGroupId: String,
    clientChannelGroupInheritedChannelId: String,
    clientCountry: String,
    clientCreated: Double,
    clientDatabaseId: Double,
    clientDefaultChannel: String,
    clientDefaultToken: String,
    clientDescription: String,
    clientFlagAvatar: String,
    clientIconId: String,
    clientIdleTime: Double,
    clientInputHardware: Double,
    clientInputMuted: Double,
    clientIntegrations: String,
    clientIsChannelCommander: Boolean,
    clientIsPrioritySpeaker: Boolean,
    clientIsRecording: Boolean,
    clientIsTalker: Boolean,
    clientLastconnected: Double,
    clientLoginName: String,
    clientMetaData: String,
    clientMonthBytesDownloaded: Double,
    clientMonthBytesUploaded: Double,
    clientMyteamspeakAvatar: String,
    clientMyteamspeakId: String,
    clientNeededServerqueryViewPower: Double,
    clientNickname: String,
    clientNicknamePhonetic: String,
    clientOutputHardware: Double,
    clientOutputMuted: Double,
    clientOutputonlyMuted: Double,
    clientPlatform: String,
    clientSecurityHash: String,
    clientServergroups: js.Array[String],
    clientSignedBadges: String,
    clientTalkPower: Double,
    clientTalkRequest: Boolean,
    clientTalkRequestMsg: String,
    clientTotalBytesDownloaded: Double,
    clientTotalBytesUploaded: Double,
    clientTotalconnections: Double,
    clientType: ClientType,
    clientUniqueIdentifier: String,
    clientVersion: String,
    clientVersionSign: String,
    connectionBandwidthReceivedLastMinuteTotal: Double,
    connectionBandwidthReceivedLastSecondTotal: Double,
    connectionBandwidthSentLastMinuteTotal: Double,
    connectionBandwidthSentLastSecondTotal: Double,
    connectionBytesReceivedTotal: Double,
    connectionBytesSentTotal: Double,
    connectionClientIp: String,
    connectionConnectedTime: Double,
    connectionFiletransferBandwidthReceived: Double,
    connectionFiletransferBandwidthSent: Double,
    connectionPacketsReceivedTotal: Double,
    connectionPacketsSentTotal: Double
  ): ClientInfo = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], clientAway = clientAway.asInstanceOf[js.Any], clientBadges = clientBadges.asInstanceOf[js.Any], clientBase64HashClientUID = clientBase64HashClientUID.asInstanceOf[js.Any], clientChannelGroupId = clientChannelGroupId.asInstanceOf[js.Any], clientChannelGroupInheritedChannelId = clientChannelGroupInheritedChannelId.asInstanceOf[js.Any], clientCountry = clientCountry.asInstanceOf[js.Any], clientCreated = clientCreated.asInstanceOf[js.Any], clientDatabaseId = clientDatabaseId.asInstanceOf[js.Any], clientDefaultChannel = clientDefaultChannel.asInstanceOf[js.Any], clientDefaultToken = clientDefaultToken.asInstanceOf[js.Any], clientDescription = clientDescription.asInstanceOf[js.Any], clientFlagAvatar = clientFlagAvatar.asInstanceOf[js.Any], clientIconId = clientIconId.asInstanceOf[js.Any], clientIdleTime = clientIdleTime.asInstanceOf[js.Any], clientInputHardware = clientInputHardware.asInstanceOf[js.Any], clientInputMuted = clientInputMuted.asInstanceOf[js.Any], clientIntegrations = clientIntegrations.asInstanceOf[js.Any], clientIsChannelCommander = clientIsChannelCommander.asInstanceOf[js.Any], clientIsPrioritySpeaker = clientIsPrioritySpeaker.asInstanceOf[js.Any], clientIsRecording = clientIsRecording.asInstanceOf[js.Any], clientIsTalker = clientIsTalker.asInstanceOf[js.Any], clientLastconnected = clientLastconnected.asInstanceOf[js.Any], clientLoginName = clientLoginName.asInstanceOf[js.Any], clientMetaData = clientMetaData.asInstanceOf[js.Any], clientMonthBytesDownloaded = clientMonthBytesDownloaded.asInstanceOf[js.Any], clientMonthBytesUploaded = clientMonthBytesUploaded.asInstanceOf[js.Any], clientMyteamspeakAvatar = clientMyteamspeakAvatar.asInstanceOf[js.Any], clientMyteamspeakId = clientMyteamspeakId.asInstanceOf[js.Any], clientNeededServerqueryViewPower = clientNeededServerqueryViewPower.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any], clientNicknamePhonetic = clientNicknamePhonetic.asInstanceOf[js.Any], clientOutputHardware = clientOutputHardware.asInstanceOf[js.Any], clientOutputMuted = clientOutputMuted.asInstanceOf[js.Any], clientOutputonlyMuted = clientOutputonlyMuted.asInstanceOf[js.Any], clientPlatform = clientPlatform.asInstanceOf[js.Any], clientSecurityHash = clientSecurityHash.asInstanceOf[js.Any], clientServergroups = clientServergroups.asInstanceOf[js.Any], clientSignedBadges = clientSignedBadges.asInstanceOf[js.Any], clientTalkPower = clientTalkPower.asInstanceOf[js.Any], clientTalkRequest = clientTalkRequest.asInstanceOf[js.Any], clientTalkRequestMsg = clientTalkRequestMsg.asInstanceOf[js.Any], clientTotalBytesDownloaded = clientTotalBytesDownloaded.asInstanceOf[js.Any], clientTotalBytesUploaded = clientTotalBytesUploaded.asInstanceOf[js.Any], clientTotalconnections = clientTotalconnections.asInstanceOf[js.Any], clientType = clientType.asInstanceOf[js.Any], clientUniqueIdentifier = clientUniqueIdentifier.asInstanceOf[js.Any], clientVersion = clientVersion.asInstanceOf[js.Any], clientVersionSign = clientVersionSign.asInstanceOf[js.Any], connectionBandwidthReceivedLastMinuteTotal = connectionBandwidthReceivedLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthReceivedLastSecondTotal = connectionBandwidthReceivedLastSecondTotal.asInstanceOf[js.Any], connectionBandwidthSentLastMinuteTotal = connectionBandwidthSentLastMinuteTotal.asInstanceOf[js.Any], connectionBandwidthSentLastSecondTotal = connectionBandwidthSentLastSecondTotal.asInstanceOf[js.Any], connectionBytesReceivedTotal = connectionBytesReceivedTotal.asInstanceOf[js.Any], connectionBytesSentTotal = connectionBytesSentTotal.asInstanceOf[js.Any], connectionClientIp = connectionClientIp.asInstanceOf[js.Any], connectionConnectedTime = connectionConnectedTime.asInstanceOf[js.Any], connectionFiletransferBandwidthReceived = connectionFiletransferBandwidthReceived.asInstanceOf[js.Any], connectionFiletransferBandwidthSent = connectionFiletransferBandwidthSent.asInstanceOf[js.Any], connectionPacketsReceivedTotal = connectionPacketsReceivedTotal.asInstanceOf[js.Any], connectionPacketsSentTotal = connectionPacketsSentTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientInfo]
  }
  
  @scala.inline
  implicit class ClientInfoOps[Self <: ClientInfo] (val x: Self) extends AnyVal {
    
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
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAway(value: Boolean): Self = this.set("clientAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientBadges(value: String): Self = this.set("clientBadges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientBase64HashClientUID(value: String): Self = this.set("clientBase64HashClientUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientChannelGroupId(value: String): Self = this.set("clientChannelGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientChannelGroupInheritedChannelId(value: String): Self = this.set("clientChannelGroupInheritedChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCountry(value: String): Self = this.set("clientCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCreated(value: Double): Self = this.set("clientCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDatabaseId(value: Double): Self = this.set("clientDatabaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDefaultChannel(value: String): Self = this.set("clientDefaultChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDefaultToken(value: String): Self = this.set("clientDefaultToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDescription(value: String): Self = this.set("clientDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientFlagAvatar(value: String): Self = this.set("clientFlagAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIconId(value: String): Self = this.set("clientIconId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdleTime(value: Double): Self = this.set("clientIdleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInputHardware(value: Double): Self = this.set("clientInputHardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInputMuted(value: Double): Self = this.set("clientInputMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIntegrations(value: String): Self = this.set("clientIntegrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIsChannelCommander(value: Boolean): Self = this.set("clientIsChannelCommander", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIsPrioritySpeaker(value: Boolean): Self = this.set("clientIsPrioritySpeaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIsRecording(value: Boolean): Self = this.set("clientIsRecording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIsTalker(value: Boolean): Self = this.set("clientIsTalker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLastconnected(value: Double): Self = this.set("clientLastconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLoginName(value: String): Self = this.set("clientLoginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMetaData(value: String): Self = this.set("clientMetaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMonthBytesDownloaded(value: Double): Self = this.set("clientMonthBytesDownloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMonthBytesUploaded(value: Double): Self = this.set("clientMonthBytesUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMyteamspeakAvatar(value: String): Self = this.set("clientMyteamspeakAvatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientMyteamspeakId(value: String): Self = this.set("clientMyteamspeakId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNeededServerqueryViewPower(value: Double): Self = this.set("clientNeededServerqueryViewPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNickname(value: String): Self = this.set("clientNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNicknamePhonetic(value: String): Self = this.set("clientNicknamePhonetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOutputHardware(value: Double): Self = this.set("clientOutputHardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOutputMuted(value: Double): Self = this.set("clientOutputMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOutputonlyMuted(value: Double): Self = this.set("clientOutputonlyMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientPlatform(value: String): Self = this.set("clientPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSecurityHash(value: String): Self = this.set("clientSecurityHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientServergroupsVarargs(value: String*): Self = this.set("clientServergroups", js.Array(value :_*))
    
    @scala.inline
    def setClientServergroups(value: js.Array[String]): Self = this.set("clientServergroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientSignedBadges(value: String): Self = this.set("clientSignedBadges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTalkPower(value: Double): Self = this.set("clientTalkPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTalkRequest(value: Boolean): Self = this.set("clientTalkRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTalkRequestMsg(value: String): Self = this.set("clientTalkRequestMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTotalBytesDownloaded(value: Double): Self = this.set("clientTotalBytesDownloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTotalBytesUploaded(value: Double): Self = this.set("clientTotalBytesUploaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTotalconnections(value: Double): Self = this.set("clientTotalconnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientType(value: ClientType): Self = this.set("clientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUniqueIdentifier(value: String): Self = this.set("clientUniqueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersion(value: String): Self = this.set("clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersionSign(value: String): Self = this.set("clientVersionSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthReceivedLastMinuteTotal(value: Double): Self = this.set("connectionBandwidthReceivedLastMinuteTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthReceivedLastSecondTotal(value: Double): Self = this.set("connectionBandwidthReceivedLastSecondTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthSentLastMinuteTotal(value: Double): Self = this.set("connectionBandwidthSentLastMinuteTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBandwidthSentLastSecondTotal(value: Double): Self = this.set("connectionBandwidthSentLastSecondTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesReceivedTotal(value: Double): Self = this.set("connectionBytesReceivedTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionBytesSentTotal(value: Double): Self = this.set("connectionBytesSentTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionClientIp(value: String): Self = this.set("connectionClientIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionConnectedTime(value: Double): Self = this.set("connectionConnectedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBandwidthReceived(value: Double): Self = this.set("connectionFiletransferBandwidthReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionFiletransferBandwidthSent(value: Double): Self = this.set("connectionFiletransferBandwidthSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsReceivedTotal(value: Double): Self = this.set("connectionPacketsReceivedTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPacketsSentTotal(value: Double): Self = this.set("connectionPacketsSentTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAwayMessage(value: String): Self = this.set("clientAwayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAwayMessage: Self = this.set("clientAwayMessage", js.undefined)
  }
}
