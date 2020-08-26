package typings.ts3NodejsLibrary.anon

import typings.ts3NodejsLibrary.enumMod.Codec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ChannelEntry> */
@js.native
trait PartialChannelEntry extends js.Object {
  var channelBannerGfxUrl: js.UndefOr[String] = js.native
  var channelBannerMode: js.UndefOr[Double] = js.native
  var channelCodec: js.UndefOr[Codec] = js.native
  var channelCodecQuality: js.UndefOr[Double] = js.native
  var channelFlagDefault: js.UndefOr[Boolean] = js.native
  var channelFlagPassword: js.UndefOr[Boolean] = js.native
  var channelFlagPermanent: js.UndefOr[Boolean] = js.native
  var channelFlagSemiPermanent: js.UndefOr[Boolean] = js.native
  var channelIconId: js.UndefOr[String] = js.native
  var channelMaxclients: js.UndefOr[Double] = js.native
  var channelMaxfamilyclients: js.UndefOr[Double] = js.native
  var channelName: js.UndefOr[String] = js.native
  var channelNeededSubscribePower: js.UndefOr[Double] = js.native
  var channelNeededTalkPower: js.UndefOr[Double] = js.native
  var channelOrder: js.UndefOr[Double] = js.native
  var channelTopic: js.UndefOr[String] = js.native
  var cid: js.UndefOr[String] = js.native
  var pid: js.UndefOr[String] = js.native
  var secondsEmpty: js.UndefOr[Double] = js.native
  var totalClients: js.UndefOr[Double] = js.native
  var totalClientsFamily: js.UndefOr[Double] = js.native
}

object PartialChannelEntry {
  @scala.inline
  def apply(): PartialChannelEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChannelEntry]
  }
  @scala.inline
  implicit class PartialChannelEntryOps[Self <: PartialChannelEntry] (val x: Self) extends AnyVal {
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
    def deleteChannelBannerGfxUrl: Self = this.set("channelBannerGfxUrl", js.undefined)
    @scala.inline
    def setChannelBannerMode(value: Double): Self = this.set("channelBannerMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelBannerMode: Self = this.set("channelBannerMode", js.undefined)
    @scala.inline
    def setChannelCodec(value: Codec): Self = this.set("channelCodec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelCodec: Self = this.set("channelCodec", js.undefined)
    @scala.inline
    def setChannelCodecQuality(value: Double): Self = this.set("channelCodecQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelCodecQuality: Self = this.set("channelCodecQuality", js.undefined)
    @scala.inline
    def setChannelFlagDefault(value: Boolean): Self = this.set("channelFlagDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelFlagDefault: Self = this.set("channelFlagDefault", js.undefined)
    @scala.inline
    def setChannelFlagPassword(value: Boolean): Self = this.set("channelFlagPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelFlagPassword: Self = this.set("channelFlagPassword", js.undefined)
    @scala.inline
    def setChannelFlagPermanent(value: Boolean): Self = this.set("channelFlagPermanent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelFlagPermanent: Self = this.set("channelFlagPermanent", js.undefined)
    @scala.inline
    def setChannelFlagSemiPermanent(value: Boolean): Self = this.set("channelFlagSemiPermanent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelFlagSemiPermanent: Self = this.set("channelFlagSemiPermanent", js.undefined)
    @scala.inline
    def setChannelIconId(value: String): Self = this.set("channelIconId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelIconId: Self = this.set("channelIconId", js.undefined)
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
    def setChannelNeededSubscribePower(value: Double): Self = this.set("channelNeededSubscribePower", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelNeededSubscribePower: Self = this.set("channelNeededSubscribePower", js.undefined)
    @scala.inline
    def setChannelNeededTalkPower(value: Double): Self = this.set("channelNeededTalkPower", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelNeededTalkPower: Self = this.set("channelNeededTalkPower", js.undefined)
    @scala.inline
    def setChannelOrder(value: Double): Self = this.set("channelOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelOrder: Self = this.set("channelOrder", js.undefined)
    @scala.inline
    def setChannelTopic(value: String): Self = this.set("channelTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelTopic: Self = this.set("channelTopic", js.undefined)
    @scala.inline
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    @scala.inline
    def setPid(value: String): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePid: Self = this.set("pid", js.undefined)
    @scala.inline
    def setSecondsEmpty(value: Double): Self = this.set("secondsEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondsEmpty: Self = this.set("secondsEmpty", js.undefined)
    @scala.inline
    def setTotalClients(value: Double): Self = this.set("totalClients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalClients: Self = this.set("totalClients", js.undefined)
    @scala.inline
    def setTotalClientsFamily(value: Double): Self = this.set("totalClientsFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalClientsFamily: Self = this.set("totalClientsFamily", js.undefined)
  }
  
}

