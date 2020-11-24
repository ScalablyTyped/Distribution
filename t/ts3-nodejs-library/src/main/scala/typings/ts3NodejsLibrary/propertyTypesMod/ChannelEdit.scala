package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.enumMod.Codec
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelEdit extends ResponseEntry {
  
  var channelCodec: js.UndefOr[Codec] = js.native
  
  var channelCodecIsUnencrypted: js.UndefOr[Boolean] = js.native
  
  var channelCodecQuality: js.UndefOr[Double] = js.native
  
  var channelDescription: js.UndefOr[String] = js.native
  
  var channelFlagDefault: js.UndefOr[Boolean] = js.native
  
  var channelFlagMaxclientsUnlimited: js.UndefOr[Boolean] = js.native
  
  var channelFlagMaxfamilyclientsInherited: js.UndefOr[Boolean] = js.native
  
  var channelFlagPermanent: js.UndefOr[Boolean] = js.native
  
  var channelFlagSemiPermanent: js.UndefOr[Boolean] = js.native
  
  var channelFlagTemporary: js.UndefOr[Boolean] = js.native
  
  var channelMaxclients: js.UndefOr[Double] = js.native
  
  var channelMaxfamilyclients: js.UndefOr[Double] = js.native
  
  var channelName: js.UndefOr[String] = js.native
  
  var channelNamePhonetic: js.UndefOr[String] = js.native
  
  var channelNeededTalkPower: js.UndefOr[Double] = js.native
  
  var channelOrder: js.UndefOr[Double] = js.native
  
  var channelPassword: js.UndefOr[String] = js.native
  
  var channelTopic: js.UndefOr[String] = js.native
  
  var cid: js.UndefOr[String] = js.native
  
  var cpid: js.UndefOr[String] = js.native
}
object ChannelEdit {
  
  @scala.inline
  def apply(): ChannelEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelEdit]
  }
  
  @scala.inline
  implicit class ChannelEditOps[Self <: ChannelEdit] (val x: Self) extends AnyVal {
    
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
    def setChannelCodec(value: Codec): Self = this.set("channelCodec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelCodec: Self = this.set("channelCodec", js.undefined)
    
    @scala.inline
    def setChannelCodecIsUnencrypted(value: Boolean): Self = this.set("channelCodecIsUnencrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelCodecIsUnencrypted: Self = this.set("channelCodecIsUnencrypted", js.undefined)
    
    @scala.inline
    def setChannelCodecQuality(value: Double): Self = this.set("channelCodecQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelCodecQuality: Self = this.set("channelCodecQuality", js.undefined)
    
    @scala.inline
    def setChannelDescription(value: String): Self = this.set("channelDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelDescription: Self = this.set("channelDescription", js.undefined)
    
    @scala.inline
    def setChannelFlagDefault(value: Boolean): Self = this.set("channelFlagDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelFlagDefault: Self = this.set("channelFlagDefault", js.undefined)
    
    @scala.inline
    def setChannelFlagMaxclientsUnlimited(value: Boolean): Self = this.set("channelFlagMaxclientsUnlimited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelFlagMaxclientsUnlimited: Self = this.set("channelFlagMaxclientsUnlimited", js.undefined)
    
    @scala.inline
    def setChannelFlagMaxfamilyclientsInherited(value: Boolean): Self = this.set("channelFlagMaxfamilyclientsInherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelFlagMaxfamilyclientsInherited: Self = this.set("channelFlagMaxfamilyclientsInherited", js.undefined)
    
    @scala.inline
    def setChannelFlagPermanent(value: Boolean): Self = this.set("channelFlagPermanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelFlagPermanent: Self = this.set("channelFlagPermanent", js.undefined)
    
    @scala.inline
    def setChannelFlagSemiPermanent(value: Boolean): Self = this.set("channelFlagSemiPermanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelFlagSemiPermanent: Self = this.set("channelFlagSemiPermanent", js.undefined)
    
    @scala.inline
    def setChannelFlagTemporary(value: Boolean): Self = this.set("channelFlagTemporary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelFlagTemporary: Self = this.set("channelFlagTemporary", js.undefined)
    
    @scala.inline
    def setChannelMaxclients(value: Double): Self = this.set("channelMaxclients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelMaxclients: Self = this.set("channelMaxclients", js.undefined)
    
    @scala.inline
    def setChannelMaxfamilyclients(value: Double): Self = this.set("channelMaxfamilyclients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelMaxfamilyclients: Self = this.set("channelMaxfamilyclients", js.undefined)
    
    @scala.inline
    def setChannelName(value: String): Self = this.set("channelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelName: Self = this.set("channelName", js.undefined)
    
    @scala.inline
    def setChannelNamePhonetic(value: String): Self = this.set("channelNamePhonetic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelNamePhonetic: Self = this.set("channelNamePhonetic", js.undefined)
    
    @scala.inline
    def setChannelNeededTalkPower(value: Double): Self = this.set("channelNeededTalkPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelNeededTalkPower: Self = this.set("channelNeededTalkPower", js.undefined)
    
    @scala.inline
    def setChannelOrder(value: Double): Self = this.set("channelOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelOrder: Self = this.set("channelOrder", js.undefined)
    
    @scala.inline
    def setChannelPassword(value: String): Self = this.set("channelPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelPassword: Self = this.set("channelPassword", js.undefined)
    
    @scala.inline
    def setChannelTopic(value: String): Self = this.set("channelTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelTopic: Self = this.set("channelTopic", js.undefined)
    
    @scala.inline
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    
    @scala.inline
    def setCpid(value: String): Self = this.set("cpid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpid: Self = this.set("cpid", js.undefined)
  }
}
