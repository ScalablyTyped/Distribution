package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import typings.ts3NodejsLibrary.libTypesEnumMod.ClientType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientInfo
  extends StObject
     with ResponseEntry {
  
  var cid: String
  
  var clientAway: Boolean
  
  var clientAwayMessage: js.UndefOr[String] = js.undefined
  
  var clientBadges: String
  
  var clientBase64HashClientUID: String
  
  var clientChannelGroupId: String
  
  var clientChannelGroupInheritedChannelId: String
  
  var clientCountry: String
  
  var clientCreated: Double
  
  var clientDatabaseId: Double
  
  var clientDefaultChannel: String
  
  var clientDefaultToken: String
  
  var clientDescription: String
  
  var clientFlagAvatar: String
  
  var clientIconId: String
  
  var clientIdleTime: Double
  
  var clientInputHardware: Double
  
  var clientInputMuted: Double
  
  var clientIntegrations: String
  
  var clientIsChannelCommander: Boolean
  
  var clientIsPrioritySpeaker: Boolean
  
  var clientIsRecording: Boolean
  
  var clientIsTalker: Boolean
  
  var clientLastconnected: Double
  
  var clientLoginName: String
  
  var clientMetaData: String
  
  var clientMonthBytesDownloaded: Double
  
  var clientMonthBytesUploaded: Double
  
  var clientMyteamspeakAvatar: String
  
  var clientMyteamspeakId: String
  
  var clientNeededServerqueryViewPower: Double
  
  var clientNickname: String
  
  var clientNicknamePhonetic: String
  
  var clientOutputHardware: Double
  
  var clientOutputMuted: Double
  
  var clientOutputonlyMuted: Double
  
  var clientPlatform: String
  
  var clientSecurityHash: String
  
  var clientServergroups: js.Array[String]
  
  var clientSignedBadges: String
  
  var clientTalkPower: Double
  
  var clientTalkRequest: Boolean
  
  var clientTalkRequestMsg: String
  
  var clientTotalBytesDownloaded: Double
  
  var clientTotalBytesUploaded: Double
  
  var clientTotalconnections: Double
  
  var clientType: ClientType
  
  var clientUniqueIdentifier: String
  
  var clientVersion: String
  
  var clientVersionSign: String
  
  var connectionBandwidthReceivedLastMinuteTotal: Double
  
  var connectionBandwidthReceivedLastSecondTotal: Double
  
  var connectionBandwidthSentLastMinuteTotal: Double
  
  var connectionBandwidthSentLastSecondTotal: Double
  
  var connectionBytesReceivedTotal: Double
  
  var connectionBytesSentTotal: Double
  
  var connectionClientIp: String
  
  var connectionConnectedTime: Double
  
  var connectionFiletransferBandwidthReceived: Double
  
  var connectionFiletransferBandwidthSent: Double
  
  var connectionPacketsReceivedTotal: Double
  
  var connectionPacketsSentTotal: Double
}
object ClientInfo {
  
  inline def apply(
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
  
  extension [Self <: ClientInfo](x: Self) {
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setClientAway(value: Boolean): Self = StObject.set(x, "clientAway", value.asInstanceOf[js.Any])
    
    inline def setClientAwayMessage(value: String): Self = StObject.set(x, "clientAwayMessage", value.asInstanceOf[js.Any])
    
    inline def setClientAwayMessageUndefined: Self = StObject.set(x, "clientAwayMessage", js.undefined)
    
    inline def setClientBadges(value: String): Self = StObject.set(x, "clientBadges", value.asInstanceOf[js.Any])
    
    inline def setClientBase64HashClientUID(value: String): Self = StObject.set(x, "clientBase64HashClientUID", value.asInstanceOf[js.Any])
    
    inline def setClientChannelGroupId(value: String): Self = StObject.set(x, "clientChannelGroupId", value.asInstanceOf[js.Any])
    
    inline def setClientChannelGroupInheritedChannelId(value: String): Self = StObject.set(x, "clientChannelGroupInheritedChannelId", value.asInstanceOf[js.Any])
    
    inline def setClientCountry(value: String): Self = StObject.set(x, "clientCountry", value.asInstanceOf[js.Any])
    
    inline def setClientCreated(value: Double): Self = StObject.set(x, "clientCreated", value.asInstanceOf[js.Any])
    
    inline def setClientDatabaseId(value: Double): Self = StObject.set(x, "clientDatabaseId", value.asInstanceOf[js.Any])
    
    inline def setClientDefaultChannel(value: String): Self = StObject.set(x, "clientDefaultChannel", value.asInstanceOf[js.Any])
    
    inline def setClientDefaultToken(value: String): Self = StObject.set(x, "clientDefaultToken", value.asInstanceOf[js.Any])
    
    inline def setClientDescription(value: String): Self = StObject.set(x, "clientDescription", value.asInstanceOf[js.Any])
    
    inline def setClientFlagAvatar(value: String): Self = StObject.set(x, "clientFlagAvatar", value.asInstanceOf[js.Any])
    
    inline def setClientIconId(value: String): Self = StObject.set(x, "clientIconId", value.asInstanceOf[js.Any])
    
    inline def setClientIdleTime(value: Double): Self = StObject.set(x, "clientIdleTime", value.asInstanceOf[js.Any])
    
    inline def setClientInputHardware(value: Double): Self = StObject.set(x, "clientInputHardware", value.asInstanceOf[js.Any])
    
    inline def setClientInputMuted(value: Double): Self = StObject.set(x, "clientInputMuted", value.asInstanceOf[js.Any])
    
    inline def setClientIntegrations(value: String): Self = StObject.set(x, "clientIntegrations", value.asInstanceOf[js.Any])
    
    inline def setClientIsChannelCommander(value: Boolean): Self = StObject.set(x, "clientIsChannelCommander", value.asInstanceOf[js.Any])
    
    inline def setClientIsPrioritySpeaker(value: Boolean): Self = StObject.set(x, "clientIsPrioritySpeaker", value.asInstanceOf[js.Any])
    
    inline def setClientIsRecording(value: Boolean): Self = StObject.set(x, "clientIsRecording", value.asInstanceOf[js.Any])
    
    inline def setClientIsTalker(value: Boolean): Self = StObject.set(x, "clientIsTalker", value.asInstanceOf[js.Any])
    
    inline def setClientLastconnected(value: Double): Self = StObject.set(x, "clientLastconnected", value.asInstanceOf[js.Any])
    
    inline def setClientLoginName(value: String): Self = StObject.set(x, "clientLoginName", value.asInstanceOf[js.Any])
    
    inline def setClientMetaData(value: String): Self = StObject.set(x, "clientMetaData", value.asInstanceOf[js.Any])
    
    inline def setClientMonthBytesDownloaded(value: Double): Self = StObject.set(x, "clientMonthBytesDownloaded", value.asInstanceOf[js.Any])
    
    inline def setClientMonthBytesUploaded(value: Double): Self = StObject.set(x, "clientMonthBytesUploaded", value.asInstanceOf[js.Any])
    
    inline def setClientMyteamspeakAvatar(value: String): Self = StObject.set(x, "clientMyteamspeakAvatar", value.asInstanceOf[js.Any])
    
    inline def setClientMyteamspeakId(value: String): Self = StObject.set(x, "clientMyteamspeakId", value.asInstanceOf[js.Any])
    
    inline def setClientNeededServerqueryViewPower(value: Double): Self = StObject.set(x, "clientNeededServerqueryViewPower", value.asInstanceOf[js.Any])
    
    inline def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    
    inline def setClientNicknamePhonetic(value: String): Self = StObject.set(x, "clientNicknamePhonetic", value.asInstanceOf[js.Any])
    
    inline def setClientOutputHardware(value: Double): Self = StObject.set(x, "clientOutputHardware", value.asInstanceOf[js.Any])
    
    inline def setClientOutputMuted(value: Double): Self = StObject.set(x, "clientOutputMuted", value.asInstanceOf[js.Any])
    
    inline def setClientOutputonlyMuted(value: Double): Self = StObject.set(x, "clientOutputonlyMuted", value.asInstanceOf[js.Any])
    
    inline def setClientPlatform(value: String): Self = StObject.set(x, "clientPlatform", value.asInstanceOf[js.Any])
    
    inline def setClientSecurityHash(value: String): Self = StObject.set(x, "clientSecurityHash", value.asInstanceOf[js.Any])
    
    inline def setClientServergroups(value: js.Array[String]): Self = StObject.set(x, "clientServergroups", value.asInstanceOf[js.Any])
    
    inline def setClientServergroupsVarargs(value: String*): Self = StObject.set(x, "clientServergroups", js.Array(value*))
    
    inline def setClientSignedBadges(value: String): Self = StObject.set(x, "clientSignedBadges", value.asInstanceOf[js.Any])
    
    inline def setClientTalkPower(value: Double): Self = StObject.set(x, "clientTalkPower", value.asInstanceOf[js.Any])
    
    inline def setClientTalkRequest(value: Boolean): Self = StObject.set(x, "clientTalkRequest", value.asInstanceOf[js.Any])
    
    inline def setClientTalkRequestMsg(value: String): Self = StObject.set(x, "clientTalkRequestMsg", value.asInstanceOf[js.Any])
    
    inline def setClientTotalBytesDownloaded(value: Double): Self = StObject.set(x, "clientTotalBytesDownloaded", value.asInstanceOf[js.Any])
    
    inline def setClientTotalBytesUploaded(value: Double): Self = StObject.set(x, "clientTotalBytesUploaded", value.asInstanceOf[js.Any])
    
    inline def setClientTotalconnections(value: Double): Self = StObject.set(x, "clientTotalconnections", value.asInstanceOf[js.Any])
    
    inline def setClientType(value: ClientType): Self = StObject.set(x, "clientType", value.asInstanceOf[js.Any])
    
    inline def setClientUniqueIdentifier(value: String): Self = StObject.set(x, "clientUniqueIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setClientVersionSign(value: String): Self = StObject.set(x, "clientVersionSign", value.asInstanceOf[js.Any])
    
    inline def setConnectionBandwidthReceivedLastMinuteTotal(value: Double): Self = StObject.set(x, "connectionBandwidthReceivedLastMinuteTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionBandwidthReceivedLastSecondTotal(value: Double): Self = StObject.set(x, "connectionBandwidthReceivedLastSecondTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionBandwidthSentLastMinuteTotal(value: Double): Self = StObject.set(x, "connectionBandwidthSentLastMinuteTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionBandwidthSentLastSecondTotal(value: Double): Self = StObject.set(x, "connectionBandwidthSentLastSecondTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionBytesReceivedTotal(value: Double): Self = StObject.set(x, "connectionBytesReceivedTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionBytesSentTotal(value: Double): Self = StObject.set(x, "connectionBytesSentTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionClientIp(value: String): Self = StObject.set(x, "connectionClientIp", value.asInstanceOf[js.Any])
    
    inline def setConnectionConnectedTime(value: Double): Self = StObject.set(x, "connectionConnectedTime", value.asInstanceOf[js.Any])
    
    inline def setConnectionFiletransferBandwidthReceived(value: Double): Self = StObject.set(x, "connectionFiletransferBandwidthReceived", value.asInstanceOf[js.Any])
    
    inline def setConnectionFiletransferBandwidthSent(value: Double): Self = StObject.set(x, "connectionFiletransferBandwidthSent", value.asInstanceOf[js.Any])
    
    inline def setConnectionPacketsReceivedTotal(value: Double): Self = StObject.set(x, "connectionPacketsReceivedTotal", value.asInstanceOf[js.Any])
    
    inline def setConnectionPacketsSentTotal(value: Double): Self = StObject.set(x, "connectionPacketsSentTotal", value.asInstanceOf[js.Any])
  }
}
