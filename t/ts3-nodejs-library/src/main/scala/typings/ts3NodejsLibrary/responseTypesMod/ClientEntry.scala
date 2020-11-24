package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientEntry extends ResponseEntry {
  
  var cid: String = js.native
  
  var clid: String = js.native
  
  var clientAway: Double = js.native
  
  var clientAwayMessage: String = js.native
  
  var clientBadges: String = js.native
  
  var clientChannelGroupId: String = js.native
  
  var clientChannelGroupInheritedChannelId: Double = js.native
  
  var clientCountry: js.UndefOr[String] = js.native
  
  var clientCreated: Double = js.native
  
  var clientDatabaseId: String = js.native
  
  var clientEstimatedLocation: js.UndefOr[String] = js.native
  
  var clientFlagTalking: Boolean = js.native
  
  var clientIdleTime: Double = js.native
  
  var clientInputHardware: Boolean = js.native
  
  var clientInputMuted: Boolean = js.native
  
  var clientIsChannelCommander: Double = js.native
  
  var clientIsPrioritySpeaker: Boolean = js.native
  
  var clientIsRecording: Boolean = js.native
  
  var clientIsTalker: Boolean = js.native
  
  var clientLastconnected: Double = js.native
  
  var clientNickname: String = js.native
  
  var clientOutputHardware: Boolean = js.native
  
  var clientOutputMuted: Boolean = js.native
  
  var clientPlatform: String = js.native
  
  var clientServergroups: js.Array[String] = js.native
  
  var clientTalkPower: Double = js.native
  
  var clientType: Double = js.native
  
  var clientUniqueIdentifier: String = js.native
  
  var clientVersion: String = js.native
  
  var connectionClientIp: String = js.native
}
object ClientEntry {
  
  @scala.inline
  def apply(
    cid: String,
    clid: String,
    clientAway: Double,
    clientAwayMessage: String,
    clientBadges: String,
    clientChannelGroupId: String,
    clientChannelGroupInheritedChannelId: Double,
    clientCreated: Double,
    clientDatabaseId: String,
    clientFlagTalking: Boolean,
    clientIdleTime: Double,
    clientInputHardware: Boolean,
    clientInputMuted: Boolean,
    clientIsChannelCommander: Double,
    clientIsPrioritySpeaker: Boolean,
    clientIsRecording: Boolean,
    clientIsTalker: Boolean,
    clientLastconnected: Double,
    clientNickname: String,
    clientOutputHardware: Boolean,
    clientOutputMuted: Boolean,
    clientPlatform: String,
    clientServergroups: js.Array[String],
    clientTalkPower: Double,
    clientType: Double,
    clientUniqueIdentifier: String,
    clientVersion: String,
    connectionClientIp: String
  ): ClientEntry = {
    val __obj = js.Dynamic.literal(cid = cid.asInstanceOf[js.Any], clid = clid.asInstanceOf[js.Any], clientAway = clientAway.asInstanceOf[js.Any], clientAwayMessage = clientAwayMessage.asInstanceOf[js.Any], clientBadges = clientBadges.asInstanceOf[js.Any], clientChannelGroupId = clientChannelGroupId.asInstanceOf[js.Any], clientChannelGroupInheritedChannelId = clientChannelGroupInheritedChannelId.asInstanceOf[js.Any], clientCreated = clientCreated.asInstanceOf[js.Any], clientDatabaseId = clientDatabaseId.asInstanceOf[js.Any], clientFlagTalking = clientFlagTalking.asInstanceOf[js.Any], clientIdleTime = clientIdleTime.asInstanceOf[js.Any], clientInputHardware = clientInputHardware.asInstanceOf[js.Any], clientInputMuted = clientInputMuted.asInstanceOf[js.Any], clientIsChannelCommander = clientIsChannelCommander.asInstanceOf[js.Any], clientIsPrioritySpeaker = clientIsPrioritySpeaker.asInstanceOf[js.Any], clientIsRecording = clientIsRecording.asInstanceOf[js.Any], clientIsTalker = clientIsTalker.asInstanceOf[js.Any], clientLastconnected = clientLastconnected.asInstanceOf[js.Any], clientNickname = clientNickname.asInstanceOf[js.Any], clientOutputHardware = clientOutputHardware.asInstanceOf[js.Any], clientOutputMuted = clientOutputMuted.asInstanceOf[js.Any], clientPlatform = clientPlatform.asInstanceOf[js.Any], clientServergroups = clientServergroups.asInstanceOf[js.Any], clientTalkPower = clientTalkPower.asInstanceOf[js.Any], clientType = clientType.asInstanceOf[js.Any], clientUniqueIdentifier = clientUniqueIdentifier.asInstanceOf[js.Any], clientVersion = clientVersion.asInstanceOf[js.Any], connectionClientIp = connectionClientIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientEntry]
  }
  
  @scala.inline
  implicit class ClientEntryOps[Self <: ClientEntry] (val x: Self) extends AnyVal {
    
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
    def setClid(value: String): Self = this.set("clid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAway(value: Double): Self = this.set("clientAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientAwayMessage(value: String): Self = this.set("clientAwayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientBadges(value: String): Self = this.set("clientBadges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientChannelGroupId(value: String): Self = this.set("clientChannelGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientChannelGroupInheritedChannelId(value: Double): Self = this.set("clientChannelGroupInheritedChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCreated(value: Double): Self = this.set("clientCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientDatabaseId(value: String): Self = this.set("clientDatabaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientFlagTalking(value: Boolean): Self = this.set("clientFlagTalking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdleTime(value: Double): Self = this.set("clientIdleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInputHardware(value: Boolean): Self = this.set("clientInputHardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientInputMuted(value: Boolean): Self = this.set("clientInputMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIsChannelCommander(value: Double): Self = this.set("clientIsChannelCommander", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIsPrioritySpeaker(value: Boolean): Self = this.set("clientIsPrioritySpeaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIsRecording(value: Boolean): Self = this.set("clientIsRecording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIsTalker(value: Boolean): Self = this.set("clientIsTalker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientLastconnected(value: Double): Self = this.set("clientLastconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientNickname(value: String): Self = this.set("clientNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOutputHardware(value: Boolean): Self = this.set("clientOutputHardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOutputMuted(value: Boolean): Self = this.set("clientOutputMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientPlatform(value: String): Self = this.set("clientPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientServergroupsVarargs(value: String*): Self = this.set("clientServergroups", js.Array(value :_*))
    
    @scala.inline
    def setClientServergroups(value: js.Array[String]): Self = this.set("clientServergroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTalkPower(value: Double): Self = this.set("clientTalkPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientType(value: Double): Self = this.set("clientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUniqueIdentifier(value: String): Self = this.set("clientUniqueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersion(value: String): Self = this.set("clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionClientIp(value: String): Self = this.set("connectionClientIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCountry(value: String): Self = this.set("clientCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCountry: Self = this.set("clientCountry", js.undefined)
    
    @scala.inline
    def setClientEstimatedLocation(value: String): Self = this.set("clientEstimatedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientEstimatedLocation: Self = this.set("clientEstimatedLocation", js.undefined)
  }
}
