package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import typings.ts3NodejsLibrary.libTypesEnumMod.Codec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelEntry
  extends StObject
     with ResponseEntry {
  
  /** only in server version >= 3.11.x */
  var channelBannerGfxUrl: String
  
  /** only in server version >= 3.11.x */
  var channelBannerMode: Double
  
  var channelCodec: Codec
  
  var channelCodecQuality: Double
  
  var channelFlagDefault: Boolean
  
  var channelFlagPassword: Boolean
  
  var channelFlagPermanent: Boolean
  
  var channelFlagSemiPermanent: Boolean
  
  var channelIconId: String
  
  var channelMaxclients: Double
  
  var channelMaxfamilyclients: Double
  
  var channelName: String
  
  var channelNeededSubscribePower: Double
  
  var channelNeededTalkPower: Double
  
  var channelOrder: Double
  
  var channelTopic: String
  
  var cid: String
  
  var pid: String
  
  var secondsEmpty: Double
  
  var totalClients: Double
  
  var totalClientsFamily: Double
}
object ChannelEntry {
  
  inline def apply(
    channelBannerGfxUrl: String,
    channelBannerMode: Double,
    channelCodec: Codec,
    channelCodecQuality: Double,
    channelFlagDefault: Boolean,
    channelFlagPassword: Boolean,
    channelFlagPermanent: Boolean,
    channelFlagSemiPermanent: Boolean,
    channelIconId: String,
    channelMaxclients: Double,
    channelMaxfamilyclients: Double,
    channelName: String,
    channelNeededSubscribePower: Double,
    channelNeededTalkPower: Double,
    channelOrder: Double,
    channelTopic: String,
    cid: String,
    pid: String,
    secondsEmpty: Double,
    totalClients: Double,
    totalClientsFamily: Double
  ): ChannelEntry = {
    val __obj = js.Dynamic.literal(channelBannerGfxUrl = channelBannerGfxUrl.asInstanceOf[js.Any], channelBannerMode = channelBannerMode.asInstanceOf[js.Any], channelCodec = channelCodec.asInstanceOf[js.Any], channelCodecQuality = channelCodecQuality.asInstanceOf[js.Any], channelFlagDefault = channelFlagDefault.asInstanceOf[js.Any], channelFlagPassword = channelFlagPassword.asInstanceOf[js.Any], channelFlagPermanent = channelFlagPermanent.asInstanceOf[js.Any], channelFlagSemiPermanent = channelFlagSemiPermanent.asInstanceOf[js.Any], channelIconId = channelIconId.asInstanceOf[js.Any], channelMaxclients = channelMaxclients.asInstanceOf[js.Any], channelMaxfamilyclients = channelMaxfamilyclients.asInstanceOf[js.Any], channelName = channelName.asInstanceOf[js.Any], channelNeededSubscribePower = channelNeededSubscribePower.asInstanceOf[js.Any], channelNeededTalkPower = channelNeededTalkPower.asInstanceOf[js.Any], channelOrder = channelOrder.asInstanceOf[js.Any], channelTopic = channelTopic.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], secondsEmpty = secondsEmpty.asInstanceOf[js.Any], totalClients = totalClients.asInstanceOf[js.Any], totalClientsFamily = totalClientsFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelEntry]
  }
  
  extension [Self <: ChannelEntry](x: Self) {
    
    inline def setChannelBannerGfxUrl(value: String): Self = StObject.set(x, "channelBannerGfxUrl", value.asInstanceOf[js.Any])
    
    inline def setChannelBannerMode(value: Double): Self = StObject.set(x, "channelBannerMode", value.asInstanceOf[js.Any])
    
    inline def setChannelCodec(value: Codec): Self = StObject.set(x, "channelCodec", value.asInstanceOf[js.Any])
    
    inline def setChannelCodecQuality(value: Double): Self = StObject.set(x, "channelCodecQuality", value.asInstanceOf[js.Any])
    
    inline def setChannelFlagDefault(value: Boolean): Self = StObject.set(x, "channelFlagDefault", value.asInstanceOf[js.Any])
    
    inline def setChannelFlagPassword(value: Boolean): Self = StObject.set(x, "channelFlagPassword", value.asInstanceOf[js.Any])
    
    inline def setChannelFlagPermanent(value: Boolean): Self = StObject.set(x, "channelFlagPermanent", value.asInstanceOf[js.Any])
    
    inline def setChannelFlagSemiPermanent(value: Boolean): Self = StObject.set(x, "channelFlagSemiPermanent", value.asInstanceOf[js.Any])
    
    inline def setChannelIconId(value: String): Self = StObject.set(x, "channelIconId", value.asInstanceOf[js.Any])
    
    inline def setChannelMaxclients(value: Double): Self = StObject.set(x, "channelMaxclients", value.asInstanceOf[js.Any])
    
    inline def setChannelMaxfamilyclients(value: Double): Self = StObject.set(x, "channelMaxfamilyclients", value.asInstanceOf[js.Any])
    
    inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNeededSubscribePower(value: Double): Self = StObject.set(x, "channelNeededSubscribePower", value.asInstanceOf[js.Any])
    
    inline def setChannelNeededTalkPower(value: Double): Self = StObject.set(x, "channelNeededTalkPower", value.asInstanceOf[js.Any])
    
    inline def setChannelOrder(value: Double): Self = StObject.set(x, "channelOrder", value.asInstanceOf[js.Any])
    
    inline def setChannelTopic(value: String): Self = StObject.set(x, "channelTopic", value.asInstanceOf[js.Any])
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setPid(value: String): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setSecondsEmpty(value: Double): Self = StObject.set(x, "secondsEmpty", value.asInstanceOf[js.Any])
    
    inline def setTotalClients(value: Double): Self = StObject.set(x, "totalClients", value.asInstanceOf[js.Any])
    
    inline def setTotalClientsFamily(value: Double): Self = StObject.set(x, "totalClientsFamily", value.asInstanceOf[js.Any])
  }
}
