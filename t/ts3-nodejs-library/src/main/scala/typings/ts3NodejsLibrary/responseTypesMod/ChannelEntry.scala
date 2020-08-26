package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.enumMod.Codec
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ChannelEntryOps[Self <: ChannelEntry] (val x: Self) extends AnyVal {
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
    def setChannelCodec(value: Codec): Self = this.set("channelCodec", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelCodecQuality(value: Double): Self = this.set("channelCodecQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelFlagDefault(value: Boolean): Self = this.set("channelFlagDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelFlagPassword(value: Boolean): Self = this.set("channelFlagPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelFlagPermanent(value: Boolean): Self = this.set("channelFlagPermanent", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelFlagSemiPermanent(value: Boolean): Self = this.set("channelFlagSemiPermanent", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelIconId(value: String): Self = this.set("channelIconId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelMaxclients(value: Double): Self = this.set("channelMaxclients", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelMaxfamilyclients(value: Double): Self = this.set("channelMaxfamilyclients", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelName(value: String): Self = this.set("channelName", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelNeededSubscribePower(value: Double): Self = this.set("channelNeededSubscribePower", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelNeededTalkPower(value: Double): Self = this.set("channelNeededTalkPower", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelOrder(value: Double): Self = this.set("channelOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelTopic(value: String): Self = this.set("channelTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: String): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondsEmpty(value: Double): Self = this.set("secondsEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalClients(value: Double): Self = this.set("totalClients", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalClientsFamily(value: Double): Self = this.set("totalClientsFamily", value.asInstanceOf[js.Any])
  }
  
}

