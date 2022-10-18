package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelInfo
  extends StObject
     with ResponseEntry {
  
  var channelBannerGfxUrl: String
  
  var channelBannerMode: Double
  
  var channelCodec: Double
  
  var channelCodecIsUnencrypted: Double
  
  var channelCodecLatencyFactor: Double
  
  var channelCodecQuality: Double
  
  var channelDeleteDelay: Double
  
  var channelDescription: String
  
  var channelFilepath: String
  
  var channelFlagDefault: Boolean
  
  var channelFlagMaxclientsUnlimited: Boolean
  
  var channelFlagMaxfamilyclientsInherited: Boolean
  
  var channelFlagMaxfamilyclientsUnlimited: Boolean
  
  var channelFlagPassword: Boolean
  
  var channelFlagPermanent: Boolean
  
  var channelFlagSemiPermanent: Boolean
  
  var channelForcedSilence: Double
  
  var channelIconId: String
  
  var channelMaxclients: Double
  
  var channelMaxfamilyclients: Double
  
  var channelName: String
  
  var channelNamePhonetic: String
  
  var channelNeededTalkPower: Double
  
  var channelOrder: Double
  
  var channelPassword: String
  
  var channelSecuritySalt: String
  
  var channelTopic: String
  
  var pid: String
  
  var secondsEmpty: Double
}
object ChannelInfo {
  
  inline def apply(
    channelBannerGfxUrl: String,
    channelBannerMode: Double,
    channelCodec: Double,
    channelCodecIsUnencrypted: Double,
    channelCodecLatencyFactor: Double,
    channelCodecQuality: Double,
    channelDeleteDelay: Double,
    channelDescription: String,
    channelFilepath: String,
    channelFlagDefault: Boolean,
    channelFlagMaxclientsUnlimited: Boolean,
    channelFlagMaxfamilyclientsInherited: Boolean,
    channelFlagMaxfamilyclientsUnlimited: Boolean,
    channelFlagPassword: Boolean,
    channelFlagPermanent: Boolean,
    channelFlagSemiPermanent: Boolean,
    channelForcedSilence: Double,
    channelIconId: String,
    channelMaxclients: Double,
    channelMaxfamilyclients: Double,
    channelName: String,
    channelNamePhonetic: String,
    channelNeededTalkPower: Double,
    channelOrder: Double,
    channelPassword: String,
    channelSecuritySalt: String,
    channelTopic: String,
    pid: String,
    secondsEmpty: Double
  ): ChannelInfo = {
    val __obj = js.Dynamic.literal(channelBannerGfxUrl = channelBannerGfxUrl.asInstanceOf[js.Any], channelBannerMode = channelBannerMode.asInstanceOf[js.Any], channelCodec = channelCodec.asInstanceOf[js.Any], channelCodecIsUnencrypted = channelCodecIsUnencrypted.asInstanceOf[js.Any], channelCodecLatencyFactor = channelCodecLatencyFactor.asInstanceOf[js.Any], channelCodecQuality = channelCodecQuality.asInstanceOf[js.Any], channelDeleteDelay = channelDeleteDelay.asInstanceOf[js.Any], channelDescription = channelDescription.asInstanceOf[js.Any], channelFilepath = channelFilepath.asInstanceOf[js.Any], channelFlagDefault = channelFlagDefault.asInstanceOf[js.Any], channelFlagMaxclientsUnlimited = channelFlagMaxclientsUnlimited.asInstanceOf[js.Any], channelFlagMaxfamilyclientsInherited = channelFlagMaxfamilyclientsInherited.asInstanceOf[js.Any], channelFlagMaxfamilyclientsUnlimited = channelFlagMaxfamilyclientsUnlimited.asInstanceOf[js.Any], channelFlagPassword = channelFlagPassword.asInstanceOf[js.Any], channelFlagPermanent = channelFlagPermanent.asInstanceOf[js.Any], channelFlagSemiPermanent = channelFlagSemiPermanent.asInstanceOf[js.Any], channelForcedSilence = channelForcedSilence.asInstanceOf[js.Any], channelIconId = channelIconId.asInstanceOf[js.Any], channelMaxclients = channelMaxclients.asInstanceOf[js.Any], channelMaxfamilyclients = channelMaxfamilyclients.asInstanceOf[js.Any], channelName = channelName.asInstanceOf[js.Any], channelNamePhonetic = channelNamePhonetic.asInstanceOf[js.Any], channelNeededTalkPower = channelNeededTalkPower.asInstanceOf[js.Any], channelOrder = channelOrder.asInstanceOf[js.Any], channelPassword = channelPassword.asInstanceOf[js.Any], channelSecuritySalt = channelSecuritySalt.asInstanceOf[js.Any], channelTopic = channelTopic.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], secondsEmpty = secondsEmpty.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelInfo]
  }
  
  extension [Self <: ChannelInfo](x: Self) {
    
    inline def setChannelBannerGfxUrl(value: String): Self = StObject.set(x, "channelBannerGfxUrl", value.asInstanceOf[js.Any])
    
    inline def setChannelBannerMode(value: Double): Self = StObject.set(x, "channelBannerMode", value.asInstanceOf[js.Any])
    
    inline def setChannelCodec(value: Double): Self = StObject.set(x, "channelCodec", value.asInstanceOf[js.Any])
    
    inline def setChannelCodecIsUnencrypted(value: Double): Self = StObject.set(x, "channelCodecIsUnencrypted", value.asInstanceOf[js.Any])
    
    inline def setChannelCodecLatencyFactor(value: Double): Self = StObject.set(x, "channelCodecLatencyFactor", value.asInstanceOf[js.Any])
    
    inline def setChannelCodecQuality(value: Double): Self = StObject.set(x, "channelCodecQuality", value.asInstanceOf[js.Any])
    
    inline def setChannelDeleteDelay(value: Double): Self = StObject.set(x, "channelDeleteDelay", value.asInstanceOf[js.Any])
    
    inline def setChannelDescription(value: String): Self = StObject.set(x, "channelDescription", value.asInstanceOf[js.Any])
    
    inline def setChannelFilepath(value: String): Self = StObject.set(x, "channelFilepath", value.asInstanceOf[js.Any])
    
    inline def setChannelFlagDefault(value: Boolean): Self = StObject.set(x, "channelFlagDefault", value.asInstanceOf[js.Any])
    
    inline def setChannelFlagMaxclientsUnlimited(value: Boolean): Self = StObject.set(x, "channelFlagMaxclientsUnlimited", value.asInstanceOf[js.Any])
    
    inline def setChannelFlagMaxfamilyclientsInherited(value: Boolean): Self = StObject.set(x, "channelFlagMaxfamilyclientsInherited", value.asInstanceOf[js.Any])
    
    inline def setChannelFlagMaxfamilyclientsUnlimited(value: Boolean): Self = StObject.set(x, "channelFlagMaxfamilyclientsUnlimited", value.asInstanceOf[js.Any])
    
    inline def setChannelFlagPassword(value: Boolean): Self = StObject.set(x, "channelFlagPassword", value.asInstanceOf[js.Any])
    
    inline def setChannelFlagPermanent(value: Boolean): Self = StObject.set(x, "channelFlagPermanent", value.asInstanceOf[js.Any])
    
    inline def setChannelFlagSemiPermanent(value: Boolean): Self = StObject.set(x, "channelFlagSemiPermanent", value.asInstanceOf[js.Any])
    
    inline def setChannelForcedSilence(value: Double): Self = StObject.set(x, "channelForcedSilence", value.asInstanceOf[js.Any])
    
    inline def setChannelIconId(value: String): Self = StObject.set(x, "channelIconId", value.asInstanceOf[js.Any])
    
    inline def setChannelMaxclients(value: Double): Self = StObject.set(x, "channelMaxclients", value.asInstanceOf[js.Any])
    
    inline def setChannelMaxfamilyclients(value: Double): Self = StObject.set(x, "channelMaxfamilyclients", value.asInstanceOf[js.Any])
    
    inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNamePhonetic(value: String): Self = StObject.set(x, "channelNamePhonetic", value.asInstanceOf[js.Any])
    
    inline def setChannelNeededTalkPower(value: Double): Self = StObject.set(x, "channelNeededTalkPower", value.asInstanceOf[js.Any])
    
    inline def setChannelOrder(value: Double): Self = StObject.set(x, "channelOrder", value.asInstanceOf[js.Any])
    
    inline def setChannelPassword(value: String): Self = StObject.set(x, "channelPassword", value.asInstanceOf[js.Any])
    
    inline def setChannelSecuritySalt(value: String): Self = StObject.set(x, "channelSecuritySalt", value.asInstanceOf[js.Any])
    
    inline def setChannelTopic(value: String): Self = StObject.set(x, "channelTopic", value.asInstanceOf[js.Any])
    
    inline def setPid(value: String): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setSecondsEmpty(value: Double): Self = StObject.set(x, "secondsEmpty", value.asInstanceOf[js.Any])
  }
}
