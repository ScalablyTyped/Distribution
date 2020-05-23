package typings.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ChannelList> */
trait PartialChannelList extends js.Object {
  var channel_banner_gfx_url: js.UndefOr[String] = js.undefined
  var channel_banner_mode: js.UndefOr[Double] = js.undefined
  var channel_codec: js.UndefOr[Double] = js.undefined
  var channel_codec_quality: js.UndefOr[Double] = js.undefined
  var channel_flag_default: js.UndefOr[Double] = js.undefined
  var channel_flag_password: js.UndefOr[Double] = js.undefined
  var channel_flag_permanent: js.UndefOr[Double] = js.undefined
  var channel_flag_semi_permanent: js.UndefOr[Double] = js.undefined
  var channel_icon_id: js.UndefOr[Double] = js.undefined
  var channel_maxclients: js.UndefOr[Double] = js.undefined
  var channel_maxfamilyclients: js.UndefOr[Double] = js.undefined
  var channel_name: js.UndefOr[String] = js.undefined
  var channel_needed_subscribe_power: js.UndefOr[Double] = js.undefined
  var channel_needed_talk_power: js.UndefOr[Double] = js.undefined
  var channel_order: js.UndefOr[Double] = js.undefined
  var channel_topic: js.UndefOr[String] = js.undefined
  var cid: js.UndefOr[Double] = js.undefined
  var pid: js.UndefOr[Double] = js.undefined
  var seconds_empty: js.UndefOr[Double] = js.undefined
  var total_clients: js.UndefOr[Double] = js.undefined
  var total_clients_family: js.UndefOr[Double] = js.undefined
}

object PartialChannelList {
  @scala.inline
  def apply(
    channel_banner_gfx_url: String = null,
    channel_banner_mode: js.UndefOr[Double] = js.undefined,
    channel_codec: js.UndefOr[Double] = js.undefined,
    channel_codec_quality: js.UndefOr[Double] = js.undefined,
    channel_flag_default: js.UndefOr[Double] = js.undefined,
    channel_flag_password: js.UndefOr[Double] = js.undefined,
    channel_flag_permanent: js.UndefOr[Double] = js.undefined,
    channel_flag_semi_permanent: js.UndefOr[Double] = js.undefined,
    channel_icon_id: js.UndefOr[Double] = js.undefined,
    channel_maxclients: js.UndefOr[Double] = js.undefined,
    channel_maxfamilyclients: js.UndefOr[Double] = js.undefined,
    channel_name: String = null,
    channel_needed_subscribe_power: js.UndefOr[Double] = js.undefined,
    channel_needed_talk_power: js.UndefOr[Double] = js.undefined,
    channel_order: js.UndefOr[Double] = js.undefined,
    channel_topic: String = null,
    cid: js.UndefOr[Double] = js.undefined,
    pid: js.UndefOr[Double] = js.undefined,
    seconds_empty: js.UndefOr[Double] = js.undefined,
    total_clients: js.UndefOr[Double] = js.undefined,
    total_clients_family: js.UndefOr[Double] = js.undefined
  ): PartialChannelList = {
    val __obj = js.Dynamic.literal()
    if (channel_banner_gfx_url != null) __obj.updateDynamic("channel_banner_gfx_url")(channel_banner_gfx_url.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_banner_mode)) __obj.updateDynamic("channel_banner_mode")(channel_banner_mode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_codec)) __obj.updateDynamic("channel_codec")(channel_codec.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_codec_quality)) __obj.updateDynamic("channel_codec_quality")(channel_codec_quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_default)) __obj.updateDynamic("channel_flag_default")(channel_flag_default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_password)) __obj.updateDynamic("channel_flag_password")(channel_flag_password.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_permanent)) __obj.updateDynamic("channel_flag_permanent")(channel_flag_permanent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_semi_permanent)) __obj.updateDynamic("channel_flag_semi_permanent")(channel_flag_semi_permanent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_icon_id)) __obj.updateDynamic("channel_icon_id")(channel_icon_id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_maxclients)) __obj.updateDynamic("channel_maxclients")(channel_maxclients.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_maxfamilyclients)) __obj.updateDynamic("channel_maxfamilyclients")(channel_maxfamilyclients.get.asInstanceOf[js.Any])
    if (channel_name != null) __obj.updateDynamic("channel_name")(channel_name.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_needed_subscribe_power)) __obj.updateDynamic("channel_needed_subscribe_power")(channel_needed_subscribe_power.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_needed_talk_power)) __obj.updateDynamic("channel_needed_talk_power")(channel_needed_talk_power.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_order)) __obj.updateDynamic("channel_order")(channel_order.get.asInstanceOf[js.Any])
    if (channel_topic != null) __obj.updateDynamic("channel_topic")(channel_topic.asInstanceOf[js.Any])
    if (!js.isUndefined(cid)) __obj.updateDynamic("cid")(cid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pid)) __obj.updateDynamic("pid")(pid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(seconds_empty)) __obj.updateDynamic("seconds_empty")(seconds_empty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total_clients)) __obj.updateDynamic("total_clients")(total_clients.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total_clients_family)) __obj.updateDynamic("total_clients_family")(total_clients_family.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialChannelList]
  }
}

