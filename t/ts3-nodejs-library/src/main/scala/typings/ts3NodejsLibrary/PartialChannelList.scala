package typings.ts3NodejsLibrary

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
    channel_banner_mode: Int | Double = null,
    channel_codec: Int | Double = null,
    channel_codec_quality: Int | Double = null,
    channel_flag_default: Int | Double = null,
    channel_flag_password: Int | Double = null,
    channel_flag_permanent: Int | Double = null,
    channel_flag_semi_permanent: Int | Double = null,
    channel_icon_id: Int | Double = null,
    channel_maxclients: Int | Double = null,
    channel_maxfamilyclients: Int | Double = null,
    channel_name: String = null,
    channel_needed_subscribe_power: Int | Double = null,
    channel_needed_talk_power: Int | Double = null,
    channel_order: Int | Double = null,
    channel_topic: String = null,
    cid: Int | Double = null,
    pid: Int | Double = null,
    seconds_empty: Int | Double = null,
    total_clients: Int | Double = null,
    total_clients_family: Int | Double = null
  ): PartialChannelList = {
    val __obj = js.Dynamic.literal()
    if (channel_banner_gfx_url != null) __obj.updateDynamic("channel_banner_gfx_url")(channel_banner_gfx_url.asInstanceOf[js.Any])
    if (channel_banner_mode != null) __obj.updateDynamic("channel_banner_mode")(channel_banner_mode.asInstanceOf[js.Any])
    if (channel_codec != null) __obj.updateDynamic("channel_codec")(channel_codec.asInstanceOf[js.Any])
    if (channel_codec_quality != null) __obj.updateDynamic("channel_codec_quality")(channel_codec_quality.asInstanceOf[js.Any])
    if (channel_flag_default != null) __obj.updateDynamic("channel_flag_default")(channel_flag_default.asInstanceOf[js.Any])
    if (channel_flag_password != null) __obj.updateDynamic("channel_flag_password")(channel_flag_password.asInstanceOf[js.Any])
    if (channel_flag_permanent != null) __obj.updateDynamic("channel_flag_permanent")(channel_flag_permanent.asInstanceOf[js.Any])
    if (channel_flag_semi_permanent != null) __obj.updateDynamic("channel_flag_semi_permanent")(channel_flag_semi_permanent.asInstanceOf[js.Any])
    if (channel_icon_id != null) __obj.updateDynamic("channel_icon_id")(channel_icon_id.asInstanceOf[js.Any])
    if (channel_maxclients != null) __obj.updateDynamic("channel_maxclients")(channel_maxclients.asInstanceOf[js.Any])
    if (channel_maxfamilyclients != null) __obj.updateDynamic("channel_maxfamilyclients")(channel_maxfamilyclients.asInstanceOf[js.Any])
    if (channel_name != null) __obj.updateDynamic("channel_name")(channel_name.asInstanceOf[js.Any])
    if (channel_needed_subscribe_power != null) __obj.updateDynamic("channel_needed_subscribe_power")(channel_needed_subscribe_power.asInstanceOf[js.Any])
    if (channel_needed_talk_power != null) __obj.updateDynamic("channel_needed_talk_power")(channel_needed_talk_power.asInstanceOf[js.Any])
    if (channel_order != null) __obj.updateDynamic("channel_order")(channel_order.asInstanceOf[js.Any])
    if (channel_topic != null) __obj.updateDynamic("channel_topic")(channel_topic.asInstanceOf[js.Any])
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (pid != null) __obj.updateDynamic("pid")(pid.asInstanceOf[js.Any])
    if (seconds_empty != null) __obj.updateDynamic("seconds_empty")(seconds_empty.asInstanceOf[js.Any])
    if (total_clients != null) __obj.updateDynamic("total_clients")(total_clients.asInstanceOf[js.Any])
    if (total_clients_family != null) __obj.updateDynamic("total_clients_family")(total_clients_family.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialChannelList]
  }
}

