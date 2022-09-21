package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientEntry
  extends StObject
     with ResponseEntry {
  
  var cid: String
  
  var clid: String
  
  var clientAway: Double
  
  var clientAwayMessage: String
  
  var clientBadges: String
  
  var clientChannelGroupId: String
  
  var clientChannelGroupInheritedChannelId: Double
  
  var clientCountry: js.UndefOr[String] = js.undefined
  
  var clientCreated: Double
  
  var clientDatabaseId: String
  
  var clientEstimatedLocation: js.UndefOr[String] = js.undefined
  
  var clientFlagTalking: Boolean
  
  var clientIdleTime: Double
  
  var clientInputHardware: Boolean
  
  var clientInputMuted: Boolean
  
  var clientIsChannelCommander: Double
  
  var clientIsPrioritySpeaker: Boolean
  
  var clientIsRecording: Boolean
  
  var clientIsTalker: Boolean
  
  var clientLastconnected: Double
  
  var clientNickname: String
  
  var clientOutputHardware: Boolean
  
  var clientOutputMuted: Boolean
  
  var clientPlatform: String
  
  var clientServergroups: js.Array[String]
  
  var clientTalkPower: Double
  
  var clientType: Double
  
  var clientUniqueIdentifier: String
  
  var clientVersion: String
  
  var connectionClientIp: String
}
object ClientEntry {
  
  inline def apply(
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
  
  extension [Self <: ClientEntry](x: Self) {
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setClid(value: String): Self = StObject.set(x, "clid", value.asInstanceOf[js.Any])
    
    inline def setClientAway(value: Double): Self = StObject.set(x, "clientAway", value.asInstanceOf[js.Any])
    
    inline def setClientAwayMessage(value: String): Self = StObject.set(x, "clientAwayMessage", value.asInstanceOf[js.Any])
    
    inline def setClientBadges(value: String): Self = StObject.set(x, "clientBadges", value.asInstanceOf[js.Any])
    
    inline def setClientChannelGroupId(value: String): Self = StObject.set(x, "clientChannelGroupId", value.asInstanceOf[js.Any])
    
    inline def setClientChannelGroupInheritedChannelId(value: Double): Self = StObject.set(x, "clientChannelGroupInheritedChannelId", value.asInstanceOf[js.Any])
    
    inline def setClientCountry(value: String): Self = StObject.set(x, "clientCountry", value.asInstanceOf[js.Any])
    
    inline def setClientCountryUndefined: Self = StObject.set(x, "clientCountry", js.undefined)
    
    inline def setClientCreated(value: Double): Self = StObject.set(x, "clientCreated", value.asInstanceOf[js.Any])
    
    inline def setClientDatabaseId(value: String): Self = StObject.set(x, "clientDatabaseId", value.asInstanceOf[js.Any])
    
    inline def setClientEstimatedLocation(value: String): Self = StObject.set(x, "clientEstimatedLocation", value.asInstanceOf[js.Any])
    
    inline def setClientEstimatedLocationUndefined: Self = StObject.set(x, "clientEstimatedLocation", js.undefined)
    
    inline def setClientFlagTalking(value: Boolean): Self = StObject.set(x, "clientFlagTalking", value.asInstanceOf[js.Any])
    
    inline def setClientIdleTime(value: Double): Self = StObject.set(x, "clientIdleTime", value.asInstanceOf[js.Any])
    
    inline def setClientInputHardware(value: Boolean): Self = StObject.set(x, "clientInputHardware", value.asInstanceOf[js.Any])
    
    inline def setClientInputMuted(value: Boolean): Self = StObject.set(x, "clientInputMuted", value.asInstanceOf[js.Any])
    
    inline def setClientIsChannelCommander(value: Double): Self = StObject.set(x, "clientIsChannelCommander", value.asInstanceOf[js.Any])
    
    inline def setClientIsPrioritySpeaker(value: Boolean): Self = StObject.set(x, "clientIsPrioritySpeaker", value.asInstanceOf[js.Any])
    
    inline def setClientIsRecording(value: Boolean): Self = StObject.set(x, "clientIsRecording", value.asInstanceOf[js.Any])
    
    inline def setClientIsTalker(value: Boolean): Self = StObject.set(x, "clientIsTalker", value.asInstanceOf[js.Any])
    
    inline def setClientLastconnected(value: Double): Self = StObject.set(x, "clientLastconnected", value.asInstanceOf[js.Any])
    
    inline def setClientNickname(value: String): Self = StObject.set(x, "clientNickname", value.asInstanceOf[js.Any])
    
    inline def setClientOutputHardware(value: Boolean): Self = StObject.set(x, "clientOutputHardware", value.asInstanceOf[js.Any])
    
    inline def setClientOutputMuted(value: Boolean): Self = StObject.set(x, "clientOutputMuted", value.asInstanceOf[js.Any])
    
    inline def setClientPlatform(value: String): Self = StObject.set(x, "clientPlatform", value.asInstanceOf[js.Any])
    
    inline def setClientServergroups(value: js.Array[String]): Self = StObject.set(x, "clientServergroups", value.asInstanceOf[js.Any])
    
    inline def setClientServergroupsVarargs(value: String*): Self = StObject.set(x, "clientServergroups", js.Array(value*))
    
    inline def setClientTalkPower(value: Double): Self = StObject.set(x, "clientTalkPower", value.asInstanceOf[js.Any])
    
    inline def setClientType(value: Double): Self = StObject.set(x, "clientType", value.asInstanceOf[js.Any])
    
    inline def setClientUniqueIdentifier(value: String): Self = StObject.set(x, "clientUniqueIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setConnectionClientIp(value: String): Self = StObject.set(x, "connectionClientIp", value.asInstanceOf[js.Any])
  }
}
