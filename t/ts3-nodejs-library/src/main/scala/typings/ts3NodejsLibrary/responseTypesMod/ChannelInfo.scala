package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelInfo extends ResponseEntry {
  
  var channelBannerGfxUrl: String = js.native
  
  var channelBannerMode: Double = js.native
  
  var channelCodec: Double = js.native
  
  var channelCodecIsUnencrypted: Double = js.native
  
  var channelCodecLatencyFactor: Double = js.native
  
  var channelCodecQuality: Double = js.native
  
  var channelDeleteDelay: Double = js.native
  
  var channelDescription: String = js.native
  
  var channelFilepath: String = js.native
  
  var channelFlagDefault: Boolean = js.native
  
  var channelFlagMaxclientsUnlimited: Boolean = js.native
  
  var channelFlagMaxfamilyclientsInherited: Boolean = js.native
  
  var channelFlagMaxfamilyclientsUnlimited: Boolean = js.native
  
  var channelFlagPassword: Boolean = js.native
  
  var channelFlagPermanent: Boolean = js.native
  
  var channelFlagSemiPermanent: Boolean = js.native
  
  var channelForcedSilence: Double = js.native
  
  var channelIconId: String = js.native
  
  var channelMaxclients: Double = js.native
  
  var channelMaxfamilyclients: Double = js.native
  
  var channelName: String = js.native
  
  var channelNamePhonetic: String = js.native
  
  var channelNeededTalkPower: Double = js.native
  
  var channelOrder: Double = js.native
  
  var channelPassword: String = js.native
  
  var channelSecuritySalt: String = js.native
  
  var channelTopic: String = js.native
  
  var pid: String = js.native
  
  var secondsEmpty: Double = js.native
}
object ChannelInfo {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ChannelInfoOps[Self <: ChannelInfo] (val x: Self) extends AnyVal {
    
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
    def setChannelBannerGfxUrl(value: String): Self = this.set("channelBannerGfxUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelBannerMode(value: Double): Self = this.set("channelBannerMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCodec(value: Double): Self = this.set("channelCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCodecIsUnencrypted(value: Double): Self = this.set("channelCodecIsUnencrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCodecLatencyFactor(value: Double): Self = this.set("channelCodecLatencyFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCodecQuality(value: Double): Self = this.set("channelCodecQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelDeleteDelay(value: Double): Self = this.set("channelDeleteDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelDescription(value: String): Self = this.set("channelDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelFilepath(value: String): Self = this.set("channelFilepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelFlagDefault(value: Boolean): Self = this.set("channelFlagDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelFlagMaxclientsUnlimited(value: Boolean): Self = this.set("channelFlagMaxclientsUnlimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelFlagMaxfamilyclientsInherited(value: Boolean): Self = this.set("channelFlagMaxfamilyclientsInherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelFlagMaxfamilyclientsUnlimited(value: Boolean): Self = this.set("channelFlagMaxfamilyclientsUnlimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelFlagPassword(value: Boolean): Self = this.set("channelFlagPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelFlagPermanent(value: Boolean): Self = this.set("channelFlagPermanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelFlagSemiPermanent(value: Boolean): Self = this.set("channelFlagSemiPermanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelForcedSilence(value: Double): Self = this.set("channelForcedSilence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelIconId(value: String): Self = this.set("channelIconId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMaxclients(value: Double): Self = this.set("channelMaxclients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelMaxfamilyclients(value: Double): Self = this.set("channelMaxfamilyclients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelName(value: String): Self = this.set("channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelNamePhonetic(value: String): Self = this.set("channelNamePhonetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelNeededTalkPower(value: Double): Self = this.set("channelNeededTalkPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelOrder(value: Double): Self = this.set("channelOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelPassword(value: String): Self = this.set("channelPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelSecuritySalt(value: String): Self = this.set("channelSecuritySalt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelTopic(value: String): Self = this.set("channelTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPid(value: String): Self = this.set("pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsEmpty(value: Double): Self = this.set("secondsEmpty", value.asInstanceOf[js.Any])
  }
}
