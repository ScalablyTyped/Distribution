package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.enumMod.Codec
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelEntry extends ResponseEntry {
  
  /** only in server version >= 3.11.x */
  var channelBannerGfxUrl: String = js.native
  
  /** only in server version >= 3.11.x */
  var channelBannerMode: Double = js.native
  
  var channelCodec: Codec = js.native
  
  var channelCodecQuality: Double = js.native
  
  var channelFlagDefault: Boolean = js.native
  
  var channelFlagPassword: Boolean = js.native
  
  var channelFlagPermanent: Boolean = js.native
  
  var channelFlagSemiPermanent: Boolean = js.native
  
  var channelIconId: String = js.native
  
  var channelMaxclients: Double = js.native
  
  var channelMaxfamilyclients: Double = js.native
  
  var channelName: String = js.native
  
  var channelNeededSubscribePower: Double = js.native
  
  var channelNeededTalkPower: Double = js.native
  
  var channelOrder: Double = js.native
  
  var channelTopic: String = js.native
  
  var cid: String = js.native
  
  var pid: String = js.native
  
  var secondsEmpty: Double = js.native
  
  var totalClients: Double = js.native
  
  var totalClientsFamily: Double = js.native
}
object ChannelEntry {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ChannelEntryMutableBuilder[Self <: ChannelEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelBannerGfxUrl(value: String): Self = StObject.set(x, "channelBannerGfxUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelBannerMode(value: Double): Self = StObject.set(x, "channelBannerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCodec(value: Codec): Self = StObject.set(x, "channelCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCodecQuality(value: Double): Self = StObject.set(x, "channelCodecQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelFlagDefault(value: Boolean): Self = StObject.set(x, "channelFlagDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelFlagPassword(value: Boolean): Self = StObject.set(x, "channelFlagPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelFlagPermanent(value: Boolean): Self = StObject.set(x, "channelFlagPermanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelFlagSemiPermanent(value: Boolean): Self = StObject.set(x, "channelFlagSemiPermanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIconId(value: String): Self = StObject.set(x, "channelIconId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMaxclients(value: Double): Self = StObject.set(x, "channelMaxclients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMaxfamilyclients(value: Double): Self = StObject.set(x, "channelMaxfamilyclients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelNeededSubscribePower(value: Double): Self = StObject.set(x, "channelNeededSubscribePower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelNeededTalkPower(value: Double): Self = StObject.set(x, "channelNeededTalkPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelOrder(value: Double): Self = StObject.set(x, "channelOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTopic(value: String): Self = StObject.set(x, "channelTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: String): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsEmpty(value: Double): Self = StObject.set(x, "secondsEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalClients(value: Double): Self = StObject.set(x, "totalClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalClientsFamily(value: Double): Self = StObject.set(x, "totalClientsFamily", value.asInstanceOf[js.Any])
  }
}
