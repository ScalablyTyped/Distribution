package typings.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ClientEntry> */
@js.native
trait PartialClientEntry extends js.Object {
  
  var cid: js.UndefOr[String] = js.native
  
  var clid: js.UndefOr[String] = js.native
  
  var clientAway: js.UndefOr[Double] = js.native
  
  var clientAwayMessage: js.UndefOr[String] = js.native
  
  var clientBadges: js.UndefOr[String] = js.native
  
  var clientChannelGroupId: js.UndefOr[String] = js.native
  
  var clientChannelGroupInheritedChannelId: js.UndefOr[Double] = js.native
  
  var clientCountry: js.UndefOr[String] = js.native
  
  var clientCreated: js.UndefOr[Double] = js.native
  
  var clientDatabaseId: js.UndefOr[String] = js.native
  
  var clientEstimatedLocation: js.UndefOr[String] = js.native
  
  var clientFlagTalking: js.UndefOr[Boolean] = js.native
  
  var clientIdleTime: js.UndefOr[Double] = js.native
  
  var clientInputHardware: js.UndefOr[Boolean] = js.native
  
  var clientInputMuted: js.UndefOr[Boolean] = js.native
  
  var clientIsChannelCommander: js.UndefOr[Double] = js.native
  
  var clientIsPrioritySpeaker: js.UndefOr[Boolean] = js.native
  
  var clientIsRecording: js.UndefOr[Boolean] = js.native
  
  var clientIsTalker: js.UndefOr[Boolean] = js.native
  
  var clientLastconnected: js.UndefOr[Double] = js.native
  
  var clientNickname: js.UndefOr[String] = js.native
  
  var clientOutputHardware: js.UndefOr[Boolean] = js.native
  
  var clientOutputMuted: js.UndefOr[Boolean] = js.native
  
  var clientPlatform: js.UndefOr[String] = js.native
  
  var clientServergroups: js.UndefOr[js.Array[String]] = js.native
  
  var clientTalkPower: js.UndefOr[Double] = js.native
  
  var clientType: js.UndefOr[Double] = js.native
  
  var clientUniqueIdentifier: js.UndefOr[String] = js.native
  
  var clientVersion: js.UndefOr[String] = js.native
  
  var connectionClientIp: js.UndefOr[String] = js.native
}
object PartialClientEntry {
  
  @scala.inline
  def apply(): PartialClientEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClientEntry]
  }
  
  @scala.inline
  implicit class PartialClientEntryOps[Self <: PartialClientEntry] (val x: Self) extends AnyVal {
    
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
    def deleteCid: Self = this.set("cid", js.undefined)
    
    @scala.inline
    def setClid(value: String): Self = this.set("clid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClid: Self = this.set("clid", js.undefined)
    
    @scala.inline
    def setClientAway(value: Double): Self = this.set("clientAway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAway: Self = this.set("clientAway", js.undefined)
    
    @scala.inline
    def setClientAwayMessage(value: String): Self = this.set("clientAwayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientAwayMessage: Self = this.set("clientAwayMessage", js.undefined)
    
    @scala.inline
    def setClientBadges(value: String): Self = this.set("clientBadges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientBadges: Self = this.set("clientBadges", js.undefined)
    
    @scala.inline
    def setClientChannelGroupId(value: String): Self = this.set("clientChannelGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientChannelGroupId: Self = this.set("clientChannelGroupId", js.undefined)
    
    @scala.inline
    def setClientChannelGroupInheritedChannelId(value: Double): Self = this.set("clientChannelGroupInheritedChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientChannelGroupInheritedChannelId: Self = this.set("clientChannelGroupInheritedChannelId", js.undefined)
    
    @scala.inline
    def setClientCountry(value: String): Self = this.set("clientCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCountry: Self = this.set("clientCountry", js.undefined)
    
    @scala.inline
    def setClientCreated(value: Double): Self = this.set("clientCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCreated: Self = this.set("clientCreated", js.undefined)
    
    @scala.inline
    def setClientDatabaseId(value: String): Self = this.set("clientDatabaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientDatabaseId: Self = this.set("clientDatabaseId", js.undefined)
    
    @scala.inline
    def setClientEstimatedLocation(value: String): Self = this.set("clientEstimatedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientEstimatedLocation: Self = this.set("clientEstimatedLocation", js.undefined)
    
    @scala.inline
    def setClientFlagTalking(value: Boolean): Self = this.set("clientFlagTalking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientFlagTalking: Self = this.set("clientFlagTalking", js.undefined)
    
    @scala.inline
    def setClientIdleTime(value: Double): Self = this.set("clientIdleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIdleTime: Self = this.set("clientIdleTime", js.undefined)
    
    @scala.inline
    def setClientInputHardware(value: Boolean): Self = this.set("clientInputHardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInputHardware: Self = this.set("clientInputHardware", js.undefined)
    
    @scala.inline
    def setClientInputMuted(value: Boolean): Self = this.set("clientInputMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInputMuted: Self = this.set("clientInputMuted", js.undefined)
    
    @scala.inline
    def setClientIsChannelCommander(value: Double): Self = this.set("clientIsChannelCommander", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIsChannelCommander: Self = this.set("clientIsChannelCommander", js.undefined)
    
    @scala.inline
    def setClientIsPrioritySpeaker(value: Boolean): Self = this.set("clientIsPrioritySpeaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIsPrioritySpeaker: Self = this.set("clientIsPrioritySpeaker", js.undefined)
    
    @scala.inline
    def setClientIsRecording(value: Boolean): Self = this.set("clientIsRecording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIsRecording: Self = this.set("clientIsRecording", js.undefined)
    
    @scala.inline
    def setClientIsTalker(value: Boolean): Self = this.set("clientIsTalker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIsTalker: Self = this.set("clientIsTalker", js.undefined)
    
    @scala.inline
    def setClientLastconnected(value: Double): Self = this.set("clientLastconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientLastconnected: Self = this.set("clientLastconnected", js.undefined)
    
    @scala.inline
    def setClientNickname(value: String): Self = this.set("clientNickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientNickname: Self = this.set("clientNickname", js.undefined)
    
    @scala.inline
    def setClientOutputHardware(value: Boolean): Self = this.set("clientOutputHardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientOutputHardware: Self = this.set("clientOutputHardware", js.undefined)
    
    @scala.inline
    def setClientOutputMuted(value: Boolean): Self = this.set("clientOutputMuted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientOutputMuted: Self = this.set("clientOutputMuted", js.undefined)
    
    @scala.inline
    def setClientPlatform(value: String): Self = this.set("clientPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientPlatform: Self = this.set("clientPlatform", js.undefined)
    
    @scala.inline
    def setClientServergroupsVarargs(value: String*): Self = this.set("clientServergroups", js.Array(value :_*))
    
    @scala.inline
    def setClientServergroups(value: js.Array[String]): Self = this.set("clientServergroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientServergroups: Self = this.set("clientServergroups", js.undefined)
    
    @scala.inline
    def setClientTalkPower(value: Double): Self = this.set("clientTalkPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientTalkPower: Self = this.set("clientTalkPower", js.undefined)
    
    @scala.inline
    def setClientType(value: Double): Self = this.set("clientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientType: Self = this.set("clientType", js.undefined)
    
    @scala.inline
    def setClientUniqueIdentifier(value: String): Self = this.set("clientUniqueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientUniqueIdentifier: Self = this.set("clientUniqueIdentifier", js.undefined)
    
    @scala.inline
    def setClientVersion(value: String): Self = this.set("clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientVersion: Self = this.set("clientVersion", js.undefined)
    
    @scala.inline
    def setConnectionClientIp(value: String): Self = this.set("connectionClientIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionClientIp: Self = this.set("connectionClientIp", js.undefined)
  }
}
