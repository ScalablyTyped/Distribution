package typings.ts3NodejsLibrary.propertyTypesMod

import typings.ts3NodejsLibrary.enumMod.Codec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelEdit extends js.Object {
  var channel_codec: js.UndefOr[Codec] = js.undefined
  var channel_codec_is_unencrypted: js.UndefOr[Double] = js.undefined
  var channel_codec_quality: js.UndefOr[Double] = js.undefined
  var channel_description: js.UndefOr[String] = js.undefined
  var channel_flag_default: js.UndefOr[Double] = js.undefined
  var channel_flag_maxclients_unlimited: js.UndefOr[Double] = js.undefined
  var channel_flag_maxfamilyclients_inherited: js.UndefOr[Double] = js.undefined
  var channel_flag_permanent: js.UndefOr[Double] = js.undefined
  var channel_flag_semi_permanent: js.UndefOr[Double] = js.undefined
  var channel_flag_temporary: js.UndefOr[Double] = js.undefined
  var channel_maxclients: js.UndefOr[Double] = js.undefined
  var channel_maxfamilyclients: js.UndefOr[Double] = js.undefined
  var channel_name: js.UndefOr[String] = js.undefined
  var channel_name_phonetic: js.UndefOr[String] = js.undefined
  var channel_needed_talk_power: js.UndefOr[Double] = js.undefined
  var channel_order: js.UndefOr[Double] = js.undefined
  var channel_password: js.UndefOr[String] = js.undefined
  var channel_topic: js.UndefOr[String] = js.undefined
  var cid: js.UndefOr[Double] = js.undefined
  var cpid: js.UndefOr[Double] = js.undefined
}

object ChannelEdit {
  @scala.inline
  def apply(
    channel_codec: Codec = null,
    channel_codec_is_unencrypted: js.UndefOr[Double] = js.undefined,
    channel_codec_quality: js.UndefOr[Double] = js.undefined,
    channel_description: String = null,
    channel_flag_default: js.UndefOr[Double] = js.undefined,
    channel_flag_maxclients_unlimited: js.UndefOr[Double] = js.undefined,
    channel_flag_maxfamilyclients_inherited: js.UndefOr[Double] = js.undefined,
    channel_flag_permanent: js.UndefOr[Double] = js.undefined,
    channel_flag_semi_permanent: js.UndefOr[Double] = js.undefined,
    channel_flag_temporary: js.UndefOr[Double] = js.undefined,
    channel_maxclients: js.UndefOr[Double] = js.undefined,
    channel_maxfamilyclients: js.UndefOr[Double] = js.undefined,
    channel_name: String = null,
    channel_name_phonetic: String = null,
    channel_needed_talk_power: js.UndefOr[Double] = js.undefined,
    channel_order: js.UndefOr[Double] = js.undefined,
    channel_password: String = null,
    channel_topic: String = null,
    cid: js.UndefOr[Double] = js.undefined,
    cpid: js.UndefOr[Double] = js.undefined
  ): ChannelEdit = {
    val __obj = js.Dynamic.literal()
    if (channel_codec != null) __obj.updateDynamic("channel_codec")(channel_codec.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_codec_is_unencrypted)) __obj.updateDynamic("channel_codec_is_unencrypted")(channel_codec_is_unencrypted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_codec_quality)) __obj.updateDynamic("channel_codec_quality")(channel_codec_quality.get.asInstanceOf[js.Any])
    if (channel_description != null) __obj.updateDynamic("channel_description")(channel_description.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_default)) __obj.updateDynamic("channel_flag_default")(channel_flag_default.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_maxclients_unlimited)) __obj.updateDynamic("channel_flag_maxclients_unlimited")(channel_flag_maxclients_unlimited.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_maxfamilyclients_inherited)) __obj.updateDynamic("channel_flag_maxfamilyclients_inherited")(channel_flag_maxfamilyclients_inherited.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_permanent)) __obj.updateDynamic("channel_flag_permanent")(channel_flag_permanent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_semi_permanent)) __obj.updateDynamic("channel_flag_semi_permanent")(channel_flag_semi_permanent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_flag_temporary)) __obj.updateDynamic("channel_flag_temporary")(channel_flag_temporary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_maxclients)) __obj.updateDynamic("channel_maxclients")(channel_maxclients.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_maxfamilyclients)) __obj.updateDynamic("channel_maxfamilyclients")(channel_maxfamilyclients.get.asInstanceOf[js.Any])
    if (channel_name != null) __obj.updateDynamic("channel_name")(channel_name.asInstanceOf[js.Any])
    if (channel_name_phonetic != null) __obj.updateDynamic("channel_name_phonetic")(channel_name_phonetic.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_needed_talk_power)) __obj.updateDynamic("channel_needed_talk_power")(channel_needed_talk_power.get.asInstanceOf[js.Any])
    if (!js.isUndefined(channel_order)) __obj.updateDynamic("channel_order")(channel_order.get.asInstanceOf[js.Any])
    if (channel_password != null) __obj.updateDynamic("channel_password")(channel_password.asInstanceOf[js.Any])
    if (channel_topic != null) __obj.updateDynamic("channel_topic")(channel_topic.asInstanceOf[js.Any])
    if (!js.isUndefined(cid)) __obj.updateDynamic("cid")(cid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cpid)) __obj.updateDynamic("cpid")(cpid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelEdit]
  }
}

